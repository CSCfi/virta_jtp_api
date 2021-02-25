package fi.csc.virta.julkaisut.factory;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.DuplikaatitDAO;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class DuplikaatitDaoFactory implements Factory<DuplikaatitDAO> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    public DuplikaatitDaoFactory() {
        log.debug("Constructing...");
    }

    @Inject
    private AppConfig appConfig;

    @Override
    public DuplikaatitDAO provide() {
        log.debug("Provide new instance");
        return new DuplikaatitDAO(appConfig);
    }

    @Override
    public void dispose(DuplikaatitDAO duplikaatitDAO) {
        log.debug("Disposing...");
    }

}
