package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory class for providing application configuration.
 */
public class AppConfigFactory implements Factory<AppConfig> {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final Configuration conf;

    public AppConfigFactory(String configBase) {
        log.debug("Constructing...");
        String configuration = System.getProperty("api.properties", configBase + "/api.properties");
        try {
            log.info("Loading application configuration from {}", configuration);
            conf = new PropertiesConfiguration(configuration);
        } catch (ConfigurationException e) {
            throw new RuntimeException("Could not load application configuration!", e);
        }
    }

    @Override
    public AppConfig provide() {
        log.debug("Provide new instance");
        return new AppConfig(conf);
    }

    @Override
    public void dispose(AppConfig appConfig) {
        log.debug("Disposing...");
    }
}
