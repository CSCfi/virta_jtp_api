package fi.csc.virta.julkaisut;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Main bootstrap of application.
 */
public class Main {

    private static String appHome;
    private static PropertiesConfiguration config;
    private static String configBase;

    public static void main(String[] args) throws Exception {
        appHome = System.getProperty("app.home");
        configBase = appHome + "/config";
        loadConfig();
        start();
    }

    public static Tomcat start() throws ServletException, LifecycleException,
            IOException, ConfigurationException {

        // Define a folder to hold web application contents.
        String webappDirLocation = appHome + "/webapp";

        Tomcat tomcat = new Tomcat();
        initLogger(appHome);

        // Set tomcat base directory
        tomcat.setBaseDir(appHome);

        tomcat.enableNaming();

        // Define port number for the web application
        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
        // Bind the port to Tomcat server
        tomcat.setPort(Integer.valueOf(webPort));
        // Configure default connector
        configureConnector(tomcat.getConnector(), config.subset("http"));

        // Enable native APR
        StandardServer server = (StandardServer) tomcat.getServer();
        AprLifecycleListener listener = new AprLifecycleListener();
        server.addLifecycleListener(listener);

        // Add AJP connector
        Connector ajpConnector = createAjpConnector();

        tomcat.getService().addConnector(ajpConnector);


        // Define a web application context.
        Context context = tomcat.addWebapp("", new File(
                webappDirLocation).getAbsolutePath());
        // Welcome file
        context.addWelcomeFile("/api-doc/api-doc.html");

        // Add servlet that will register Jersey REST resources
        Wrapper wrapper = Tomcat.addServlet(context, "jersey-container-servlet", resourceConfig());
        wrapper.setAsyncSupported(true);
        context.addServletMapping("/api/*", "jersey-container-servlet");

        StandardHost host = (StandardHost) tomcat.getHost();
        host.setErrorReportValveClass("fi.csc.virta.julkaisut.JulkaisuApiErrorValve");

        tomcat.start();
        tomcat.getServer().await();

        return tomcat;
    }

    private static void loadConfig() throws ConfigurationException {
        String configuration = System.getProperty("server.properties", configBase + "/server.properties");
        config = new PropertiesConfiguration(configuration);
    }

    private static Connector createAjpConnector() {
        Connector ajpConnector = new Connector("AJP/1.3");
        Configuration ajpConfig = config.subset("ajp");
        ajpConnector.setPort(ajpConfig.getInt("port", 8009));
        configureConnector(ajpConnector, ajpConfig);
        return ajpConnector;
    }

    private static void configureConnector(Connector connector, Configuration config) {
        Iterator<String> keys = config.getKeys();
        while (keys.hasNext()) {
            String property = keys.next();
            String value = config.getString(property);
            if (StringUtils.isEmpty(value)) {
                continue;
            }
            connector.setProperty(property, value);
        }
    }

    private static void initLogger(String logDir) throws IOException {
        Logger logger = Logger.getLogger("");
        Handler fileHandler = new FileHandler(logDir + "/catalina.out", true);
        fileHandler.setFormatter(new SimpleFormatter());
        fileHandler.setLevel(Level.INFO);
        fileHandler.setEncoding("UTF-8");
        logger.addHandler(fileHandler);
    }

    private static ServletContainer resourceConfig() {
        return new ServletContainer(new App(configBase));
    }
}
