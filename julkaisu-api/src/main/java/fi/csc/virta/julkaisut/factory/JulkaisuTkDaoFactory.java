package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.JulkaisuTkDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Factory class for create instance of {@link JulkaisuTkDAO}.
 */
public class JulkaisuTkDaoFactory implements Factory<JulkaisuTkDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public JulkaisuTkDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public JulkaisuTkDAO provide() {
        log.debug("Provide new instance");
        return new JulkaisuTkDAO(appConfig);
    }

    @Override
    public void dispose(JulkaisuTkDAO julkaisuTkDAO) {
        log.debug("Disposing...");
    }
}
