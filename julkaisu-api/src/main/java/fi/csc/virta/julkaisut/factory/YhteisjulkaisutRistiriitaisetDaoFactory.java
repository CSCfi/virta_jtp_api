package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.YhteisjulkaisutRistiriitaisetDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class YhteisjulkaisutRistiriitaisetDaoFactory implements Factory<YhteisjulkaisutRistiriitaisetDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public YhteisjulkaisutRistiriitaisetDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public YhteisjulkaisutRistiriitaisetDAO provide() {
        log.debug("Provide new instance");
        return new YhteisjulkaisutRistiriitaisetDAO(appConfig);
    }

    @Override
    public void dispose(YhteisjulkaisutRistiriitaisetDAO YhteisjulkaisutRistiriitaisetDAO) {
        log.debug("Disposing...");
    }

}
