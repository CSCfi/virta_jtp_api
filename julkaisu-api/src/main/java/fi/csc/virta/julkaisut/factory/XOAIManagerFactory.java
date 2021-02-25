package fi.csc.virta.julkaisut.factory;

import com.lyncode.xoai.dataprovider.core.XOAIManager;
import com.lyncode.xoai.dataprovider.exceptions.ConfigurationException;
import com.lyncode.xoai.dataprovider.services.impl.FileResourceResolver;
import com.lyncode.xoai.dataprovider.xml.xoaiconfig.Configuration;
import fi.csc.virta.julkaisut.oai.JulkaisutFilterResolver;
import org.glassfish.hk2.api.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.InternalServerErrorException;
import java.io.IOException;

public class XOAIManagerFactory implements Factory<XOAIManager> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public XOAIManager provide() {
        log.info("Creating XOAI manager");
        try {
            FileResourceResolver resourceResolver = new FileResourceResolver(System.getProperty("app.home") + "/config");
            Configuration configuration = Configuration.readConfiguration(resourceResolver.getResource("xoai.xml"));
            return new XOAIManager(new JulkaisutFilterResolver(),
                    resourceResolver,
                    configuration);
        } catch (ConfigurationException | IOException e) {
            throw new InternalServerErrorException("Could not create XOAI manager!", e);
        }
    }

    @Override
    public void dispose(XOAIManager manager) {

    }
}