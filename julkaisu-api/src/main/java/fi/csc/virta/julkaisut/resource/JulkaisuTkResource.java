package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withBeanJsonArrayGenerator;
import fi.csc.virta.julkaisut.annotation.OrganizationRestricted;
import fi.csc.virta.julkaisut.dao.JulkaisuTkDAO;
import fi.csc.virta.julkaisut.domain.Headers;
import fi.csc.virta.julkaisut.domain.JulkaisuTK;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import org.glassfish.jersey.server.ManagedAsync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

/**
 * TK Julkaisut resource
 */
@Path("TKjulkaisut")
@Api
public class JulkaisuTkResource {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private JulkaisuTkDAO julkaisuTKDAO;

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @ApiOperation(value = "Get all TK Julkaisu objects as json array", response = JulkaisuTK.class)
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean get(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonArrayGenerator(os, JulkaisuTK.class,
                        converter -> julkaisuTKDAO.getAll(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }
}
