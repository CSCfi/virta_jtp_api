package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.HankeDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

/**
 * Factory class for create instance of {@link HankeDAO}.
 */
public class HankeDaoFactory implements Factory<HankeDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public HankeDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public HankeDAO provide() {
        log.debug("Provide new instance");
        return new HankeDAO(appConfig);
    }

    @Override
    public void dispose(HankeDAO hankeDAO) {
        log.debug("Disposing...");
    }
}
