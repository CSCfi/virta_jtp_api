package fi.csc.virta.julkaisut.config;

import org.apache.commons.configuration.Configuration;

public class AppConfig {

    private final Configuration config;

    public AppConfig(Configuration config) {
        this.config = config;
    }

    public Configuration getConfig() {
        return config;
    }

    public Configuration getSearchConfig() {
        return config.subset("search");
    }

    public Configuration getOaiConfig() {
        return config.subset("oai");
    }
    
    public Configuration getCerifConfig() {
        return config.subset("cerif");
    }
    
}
