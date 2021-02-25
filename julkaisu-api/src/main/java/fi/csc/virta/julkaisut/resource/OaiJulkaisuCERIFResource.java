package fi.csc.virta.julkaisut.resource;

import com.lyncode.xoai.dataprovider.OAIDataProvider;
import com.lyncode.xoai.dataprovider.OAIRequestParameters;
import com.lyncode.xoai.dataprovider.core.XOAIManager;
import com.lyncode.xoai.dataprovider.exceptions.DuplicateDefinitionException;
import com.lyncode.xoai.dataprovider.exceptions.IllegalVerbException;
import com.lyncode.xoai.dataprovider.exceptions.InvalidContextException;
import com.lyncode.xoai.dataprovider.exceptions.OAIException;
import com.lyncode.xoai.dataprovider.exceptions.UnknownParameterException;
import com.lyncode.xoai.dataprovider.exceptions.WritingXmlException;
import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import fi.csc.virta.julkaisut.oai.JulkaisuCERIFItemRepository;
import fi.csc.virta.julkaisut.oai.JulkaisuOAIDataProvider;
import fi.csc.virta.julkaisut.oai.JulkaisuRepositoryConfiguration;
import fi.csc.virta.julkaisut.oai.JulkaisuSetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriInfo;
import javax.xml.stream.XMLStreamException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Julkaisut OAI-PMH resource.
 */
@Path("cerif")
public class OaiJulkaisuCERIFResource {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private JulkaisuDAO julkaisuDAO;
    @Inject
    private XOAIManager xoaiManager;
    @Inject
    private AppConfig config;

    @GET
    @Produces(ContentTypes.XML_UTF8)
    public Response handleOAI(@Context UriInfo uriInfo) {
        String contextUrl = "/";
        return handleOAI(uriInfo, contextUrl);
    }

    @GET
    @Path("/{context}")
    @Produces(ContentTypes.XML_UTF8)
    public Response handleOAI(@Context UriInfo uriInfo, @PathParam("context") String contextUrl) {
        try {
            OAIRequestParameters parameters = new OAIRequestParameters(buildParametersMap(uriInfo));
            String metaDataPrefix = getMetaDataPrefix(parameters);
            final OAIDataProvider provider = new JulkaisuOAIDataProvider(xoaiManager, contextUrl,
                    new JulkaisuRepositoryConfiguration(uriInfo.getRequestUri().getPath(), config.getCerifConfig()), new JulkaisuSetRepository(julkaisuDAO),
                    new JulkaisuCERIFItemRepository(julkaisuDAO, metaDataPrefix));

            StreamingOutput os = output -> {
                try {
                    provider.handle(parameters, output);
                } catch (OAIException | XMLStreamException | WritingXmlException e) {
                    log.error("Handling oai-pmh request failed!", e);
                }
            };
            return Response.ok(os).build();
        } catch (InvalidContextException e) {
            log.error("Invalid context!", e);
            throw new WebApplicationException("Context not found!", Response.Status.NOT_FOUND);
        }
    }

    private String getMetaDataPrefix(OAIRequestParameters parameters) {
        try {
            return parameters.getMetadataPrefix();
        } catch (DuplicateDefinitionException | UnknownParameterException | IllegalVerbException ignored) {
        }
        return null;
    }

    private Map<String, List<String>> buildParametersMap(UriInfo uriInfo) {
        Map<String, List<String>> map = new HashMap<>();
        MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
        Set<Map.Entry<String, List<String>>> entries = queryParameters.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
