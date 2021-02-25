package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.TilanneraporttiDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Factory class for create instance of {@link TilanneraporttiDAO}.
 */
public class TilanneraporttiDaoFactory implements Factory<TilanneraporttiDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public TilanneraporttiDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public TilanneraporttiDAO provide() {
        log.debug("Provide new instance");
        return new TilanneraporttiDAO(appConfig);
    }

    @Override
    public void dispose(TilanneraporttiDAO TilanneraporttiDAO) {
        log.debug("Disposing...");
    }
}
