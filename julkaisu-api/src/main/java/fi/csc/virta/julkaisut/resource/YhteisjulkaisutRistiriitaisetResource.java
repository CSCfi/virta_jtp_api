package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withBeanJsonArrayGenerator;
import fi.csc.virta.julkaisut.annotation.OrganizationRestricted;
import fi.csc.virta.julkaisut.dao.YhteisjulkaisutRistiriitaisetDAO;
import fi.csc.virta.julkaisut.domain.Headers;
import fi.csc.virta.julkaisut.domain.YhteisjulkaisutRistiriitaiset;
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

@Path("Yhteisjulkaisut")
@Api
public class YhteisjulkaisutRistiriitaisetResource {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private YhteisjulkaisutRistiriitaisetDAO yhteisjulkaisutRistiriitaisetDAO;

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/Ristiriitaiset")
    @ApiOperation(value = "Get situation report as json array", response = YhteisjulkaisutRistiriitaiset.class)
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean get(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonArrayGenerator(os, YhteisjulkaisutRistiriitaiset.class,
                        converter -> yhteisjulkaisutRistiriitaisetDAO.getYhteisjulkaisutRistiriitaiset(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }
}
