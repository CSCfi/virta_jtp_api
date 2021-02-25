package fi.csc.virta.julkaisut.resource;


import fi.csc.virta.julkaisut.Util.ContentTypes;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withBeanJsonArrayGenerator;
import fi.csc.virta.julkaisut.annotation.OrganizationRestricted;
import fi.csc.virta.julkaisut.dao.TilanneraporttiDAO;
import fi.csc.virta.julkaisut.dao.VirheraporttiDAO;
import fi.csc.virta.julkaisut.domain.Headers;
import fi.csc.virta.julkaisut.domain.Tilanneraportti;
import fi.csc.virta.julkaisut.domain.Virheraportti;
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
 * Tilanneraportti resource
 */

@Path("Latausraportit")
@Api
public class TilanneraporttiResource {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private TilanneraporttiDAO tilanneraporttiDAO;

    @Inject
    private VirheraporttiDAO virheraporttiDAO;


    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/Tilanne")
    @ApiOperation(value = "Get situation report as json array", response = Tilanneraportti.class)
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean getTilanne(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonArrayGenerator(os, Tilanneraportti.class,
                        converter -> tilanneraporttiDAO.getTilanneraportti(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/Virheet")
    @ApiOperation(value = "Get error report as json array", response = Virheraportti.class)
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean getVirheet(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonArrayGenerator(os, Virheraportti.class,
                        converter -> virheraporttiDAO.getVirheraportti(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }
}
