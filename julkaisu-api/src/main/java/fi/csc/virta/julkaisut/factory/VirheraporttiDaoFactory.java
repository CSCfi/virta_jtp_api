package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.VirheraporttiDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Factory class for create instance of {@link VirheraporttiDAO}.
 */
public class VirheraporttiDaoFactory implements Factory<VirheraporttiDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public VirheraporttiDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public VirheraporttiDAO provide() {
        log.debug("Provide new instance");
        return new VirheraporttiDAO(appConfig);
    }

    @Override
    public void dispose(VirheraporttiDAO VirheraporttiDAO) {
        log.debug("Disposing...");
    }
}
