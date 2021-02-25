package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Factory class for create instance of {@link JulkaisuDAO}.
 */
public class JulkaisuDaoFactory implements Factory<JulkaisuDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public JulkaisuDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig config;

    @Override
    public JulkaisuDAO provide() {
        log.debug("Provide new instance");
        return new JulkaisuDAO(config);
    }

    @Override
    public void dispose(JulkaisuDAO julkaisuDAO) {
        log.debug("Disposing...");
    }
}
