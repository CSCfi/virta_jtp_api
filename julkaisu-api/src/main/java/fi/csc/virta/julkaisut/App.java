package fi.csc.virta.julkaisut;

import com.lyncode.xoai.dataprovider.core.XOAIManager;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.DuplikaatitDAO;
import fi.csc.virta.julkaisut.dao.HankeDAO;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import fi.csc.virta.julkaisut.dao.JulkaisuTkDAO;
import fi.csc.virta.julkaisut.dao.TilanneraporttiDAO;
import fi.csc.virta.julkaisut.dao.VirheraporttiDAO;
import fi.csc.virta.julkaisut.dao.YhteisjulkaisutRistiriitaisetDAO;
import fi.csc.virta.julkaisut.factory.AppConfigFactory;
import fi.csc.virta.julkaisut.factory.DuplikaatitDaoFactory;
import fi.csc.virta.julkaisut.factory.HankeDaoFactory;
import fi.csc.virta.julkaisut.factory.JulkaisuDaoFactory;
import fi.csc.virta.julkaisut.factory.JulkaisuTkDaoFactory;
import fi.csc.virta.julkaisut.factory.TilanneraporttiDaoFactory;
import fi.csc.virta.julkaisut.factory.VirheraporttiDaoFactory;
import fi.csc.virta.julkaisut.factory.XOAIManagerFactory;
import fi.csc.virta.julkaisut.factory.YhteisjulkaisutRistiriitaisetDaoFactory;
import fi.csc.virta.julkaisut.filter.LogFilter;
import fi.csc.virta.julkaisut.provider.JulkaisuApiExceptionMapper;
import fi.csc.virta.julkaisut.provider.JulkaisuDateParamProvider;
import fi.csc.virta.julkaisut.provider.ObjectMapperProvider;
import fi.csc.virta.julkaisut.provider.OrganizationRestrictedFeature;
import fi.csc.virta.julkaisut.resource.DuplikaatitResource;
import fi.csc.virta.julkaisut.resource.JulkaisuResource;
import fi.csc.virta.julkaisut.resource.JulkaisuTkResource;
import fi.csc.virta.julkaisut.resource.OaiResource;
import fi.csc.virta.julkaisut.resource.OaiJulkaisuCERIFResource;
import fi.csc.virta.julkaisut.resource.Root;
import fi.csc.virta.julkaisut.resource.TilanneraporttiResource;
import fi.csc.virta.julkaisut.resource.YhteisjulkaisutRistiriitaisetResource;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;

public class App extends ResourceConfig {

    public App(String configBase) {
        super(
                Root.class,
                ObjectMapperProvider.class,
                JulkaisuResource.class,
                JulkaisuTkResource.class,
                DuplikaatitResource.class,
                TilanneraporttiResource.class,
                YhteisjulkaisutRistiriitaisetResource.class,
                OaiResource.class,
                OaiJulkaisuCERIFResource.class,
                JacksonFeature.class,
                JulkaisuApiExceptionMapper.class,
                LogFilter.class,
                JulkaisuDateParamProvider.class,
                OrganizationRestrictedFeature.class
        );
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindFactory(JulkaisuDaoFactory.class).to(JulkaisuDAO.class).in(Singleton.class);
                bindFactory(JulkaisuTkDaoFactory.class).to(JulkaisuTkDAO.class).in(Singleton.class);
                bindFactory(HankeDaoFactory.class).to(HankeDAO.class).in(Singleton.class);
                bindFactory(DuplikaatitDaoFactory.class).to(DuplikaatitDAO.class).in(Singleton.class);
                bindFactory(TilanneraporttiDaoFactory.class).to(TilanneraporttiDAO.class).in(Singleton.class);
                bindFactory(VirheraporttiDaoFactory.class).to(VirheraporttiDAO.class).in(Singleton.class);
                bindFactory(YhteisjulkaisutRistiriitaisetDaoFactory.class).to(YhteisjulkaisutRistiriitaisetDAO.class).in(Singleton.class);
                bindFactory(XOAIManagerFactory.class).to(XOAIManager.class).in(Singleton.class);
                bindFactory(new AppConfigFactory(configBase)).to(AppConfig.class).in(Singleton.class);
            }
        });
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }
}
