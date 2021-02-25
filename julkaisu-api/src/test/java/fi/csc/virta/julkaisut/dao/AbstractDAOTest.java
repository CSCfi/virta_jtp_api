package fi.csc.virta.julkaisut.dao;

import com.zaxxer.hikari.HikariDataSource;
import fi.csc.virta.julkaisut.config.AppConfig;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.h2.tools.RunScript;
import org.h2.util.JdbcUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Abstract super class for DAO test classes.
 */
public abstract class AbstractDAOTest {

    protected static HikariDataSource ds;
    private static InitialContext ic;

    protected static void bindDataSource() throws NamingException {
        // Construct DataSource
        ds = new HikariDataSource();
        ds.setMaximumPoolSize(1);
        ds.setDriverClassName("org.h2.Driver");
        ds.setJdbcUrl("jdbc:h2:mem:test;MODE=MSSQLServer");

        ic.bind("java:comp/env/jdbc/mssqlDS", ds);
    }

    protected static void createInitialContext() throws NamingException {
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
                "org.apache.naming.java.javaURLContextFactory");
        System.setProperty(Context.URL_PKG_PREFIXES,
                "org.apache.naming");
        ic = new InitialContext();
        ic.createSubcontext("java:");
        ic.createSubcontext("java:comp");
        ic.createSubcontext("java:comp/env");
        ic.createSubcontext("java:comp/env/jdbc");
    }

    protected void insertData(String filename) throws Exception {
        runScript(filename);
    }

    protected void runScript(String filename) throws Exception {
        URL resource = getClass().getResource(filename);
        if (resource == null) {
            throw new Exception("Can not find resource " + filename);
        }
        ResultSet resultSet = null;
        try (Connection connection = ds.getConnection(); FileReader reader = new FileReader(resource.getFile())) {
            resultSet = RunScript.execute(connection, reader);
        } finally {
            JdbcUtils.closeSilently(resultSet);
        }
    }

    protected void clearData() throws Exception {
        runScript("/sql/clear.sql");
    }

    protected AppConfig getConfig() throws ConfigurationException {
        return new AppConfig(new PropertiesConfiguration("test-api.properties"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createInitialContext();
        bindDataSource();

        InputStream schema = AbstractDAOTest.class.getResourceAsStream("/sql/test_schema.sql");
        Connection connection = ds.getConnection();
        RunScript.execute(connection, new InputStreamReader(schema));
        connection.close();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        ds.close();
        ic.destroySubcontext("java:");
        ic.destroySubcontext("java:comp");
    }
}
