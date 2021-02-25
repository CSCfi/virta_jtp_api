package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withBeanJsonArrayGenerator;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withBeanJsonGenerator;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withJSONRawConverter;
import static fi.csc.virta.julkaisut.Util.JsonUtil.withJsonArrayGenerator;
import static fi.csc.virta.julkaisut.Util.XmlUtil.withXmlGenerator;
import fi.csc.virta.julkaisut.annotation.OrganizationRestricted;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.HankeDAO;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import fi.csc.virta.julkaisut.domain.ApiError;
import fi.csc.virta.julkaisut.domain.Hanke;
import fi.csc.virta.julkaisut.domain.Headers;
import fi.csc.virta.julkaisut.domain.Julkaisu;
import fi.csc.virta.julkaisut.domain.Juuli;
import fi.csc.virta.julkaisut.domain.SearchQuery;
import fi.csc.virta.julkaisut.exception.ApiException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.glassfish.jersey.server.ManagedAsync;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.lang.reflect.Field;
import java.net.URI;
import java.sql.SQLException;

/**
 * Julkaisut resource
 */
@Path("julkaisut")
@Api
public class JulkaisuResource {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    private JulkaisuDAO julkaisuDAO;
    @Inject
    private HankeDAO hankeDAO;
    @Inject
    private AppConfig conf;

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @ApiOperation(value = "Get all Julkaisu objects as json array", response = Julkaisu.class)
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean get(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withJsonArrayGenerator(os, Julkaisu.class,
                        converter -> julkaisuDAO.getAll(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.XML_UTF8)
    @Path("/xml")
    @ApiOperation(value = "Get all Julkaisu objects as Julkaisut-XML")
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean getXml(@Suspended final AsyncResponse response, @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withXmlGenerator(os,
                        converter -> julkaisuDAO.getAllXml(converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/{julkaisunTunnus}")
    @ApiOperation(value = "Get one Julkaisu object by julkaisunTunnus")
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean getByJulkaisunTunnus(@Suspended final AsyncResponse response,
                                        @PathParam("julkaisunTunnus") String julkaisunTunnus,
                                        @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os -> withJSONRawConverter(os,
                converter -> julkaisuDAO.getByJulkaisunTunnus(converter, julkaisunTunnus, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.XML_UTF8)
    @Path("/xml/{julkaisunTunnus}")
    @ApiOperation(value = "Get one Julkaisu object by julkaisunTunnus as Julkaisut-XML")
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean getXmlByJulkaisunTunnus(@Suspended final AsyncResponse response,
                                           @PathParam("julkaisunTunnus") String julkaisunTunnus,
                                           @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os -> withXmlGenerator(os,
                converter -> julkaisuDAO.getByJulkaisunTunnus(converter, julkaisunTunnus, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/haku")
    @ApiOperation(value = "Search Julkaisu objects as JSON")
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean search(@Suspended final AsyncResponse response,
                          @Valid @BeanParam SearchQuery searchQuery,
                          @Context UriInfo uriInfo,
                          @HeaderParam(Headers.X_ORG_ID) String orgId) {
        checkSearchParameters(uriInfo);
        StreamingOutput stream = os ->
                withJsonArrayGenerator(os, Julkaisu.class,
                        converter -> julkaisuDAO.search(searchQuery, converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @ManagedAsync
    @Produces(ContentTypes.XML_UTF8)
    @Path("/haku/xml")
    @ApiOperation(value = "Search Julkaisu objects as Julkaisut-XML")
    @ApiResponses(value = {})
    @OrganizationRestricted
    public boolean searchXml(@Suspended final AsyncResponse response,
                             @Valid @BeanParam SearchQuery searchQuery,
                             @Context UriInfo uriInfo,
                             @HeaderParam(Headers.X_ORG_ID) String orgId) {
        checkSearchParameters(uriInfo);
        StreamingOutput stream = os ->
                withXmlGenerator(os,
                        xmlWriter -> julkaisuDAO.search(searchQuery, xmlWriter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @POST
    @Consumes(ContentTypes.JSON_UTF8)
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/{julkaisunTunnus}/juuli")
    @ApiOperation(value = "Create or update JUULI URL to Julkaisu")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Creating or updating success"),
            @ApiResponse(code = 400, message = "Juuli JSON is not valid"),
            @ApiResponse(code = 404, message = "Julkaisu not found with given julkaisunTunnus")})
    @OrganizationRestricted
    public Response createJuuliUrl(@PathParam("julkaisunTunnus") String julkaisunTunnus,
                                   @ApiParam(value = "Juuli JSON object", required = true)
                                   @NotNull @Valid Juuli juuli,
                                   @HeaderParam(Headers.X_ORG_ID) String orgId) throws SQLException {
        juuli.setJulkaisunTunnus(julkaisunTunnus);
        log.info("Create juuli {} with julkaisunTunnus {}", juuli.getJuuliURL(), juuli.getJulkaisunTunnus());
        julkaisuDAO.createJuuliUrl(juuli, orgId);
        return Response.status(Response.Status.OK).build();
    }

    @GET
    @Path("/{julkaisunTunnus}/hanke")
    @ApiOperation(value = "Get all Hankenumeros for Julkaisu", response = Hanke.class)
    @ApiResponses({@ApiResponse(code = 404, message = "Julkaisu not found with given julkaisunTunnus")})
    @OrganizationRestricted
    public boolean getHankenumeros(@Suspended final AsyncResponse response,
                                   @PathParam("julkaisunTunnus") String julkaisunTunnus,
                                   @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonArrayGenerator(os, Hanke.class,
                        converter -> hankeDAO.getHankes(julkaisunTunnus, converter, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @GET
    @Path("/{julkaisunTunnus}/hanke/{hankeId}")
    @ApiOperation(value = "Get Hankenumero by id for Julkaisu", response = Hanke.class)
    @ApiResponses({@ApiResponse(code = 404, message = "Julkaisu not found with given julkaisunTunnus and hankeId")})
    @OrganizationRestricted
    public boolean getHanke(@Suspended final AsyncResponse response,
                            @PathParam("julkaisunTunnus") String julkaisunTunnus,
                            @PathParam("hankeId") Long hankeId,
                            @HeaderParam(Headers.X_ORG_ID) String orgId) {
        StreamingOutput stream = os ->
                withBeanJsonGenerator(os, Hanke.class,
                        converter -> hankeDAO.getHankeById(hankeId, converter, julkaisunTunnus, orgId));

        return response.resume(Response.ok()
                .entity(stream)
                .build());
    }

    @POST
    @Consumes(ContentTypes.JSON_UTF8)
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/{julkaisunTunnus}/hanke")
    @ApiOperation(value = "Create Hankenumero to Julkaisu")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Creating Hankenumero success"),
            @ApiResponse(code = 400, message = "Hanke JSON is not valid"),
            @ApiResponse(code = 404, message = "Julkaisu not found with given julkaisunTunnus")})
    @OrganizationRestricted
    public Response createHankenumero(@PathParam("julkaisunTunnus") String julkaisunTunnus,
                                      @ApiParam(value = "Hanke JSON object", required = true)
                                      @NotNull @Valid Hanke hanke,
                                      @Context UriInfo uriInfo,
                                      @HeaderParam(Headers.X_ORG_ID) String orgId) throws SQLException {
        hanke.setJulkaisunTunnus(julkaisunTunnus);
        log.info("Create Hankenumero {} with julkaisunTunnus {} and organisaatioTunnus {}",
                new Object[]{hanke.getHankenumero(), hanke.getJulkaisunTunnus(), hanke.getOrganisaatioTunnus()});
        Long id = hankeDAO.createHanke(hanke, orgId);
        return Response.created(createURI(id, uriInfo)).build();
    }

    @PUT
    @Consumes(ContentTypes.JSON_UTF8)
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/{julkaisunTunnus}/hanke/{hankeId}")
    @ApiOperation(value = "Update Hankenumero")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Updating Hankenumero success"),
            @ApiResponse(code = 400, message = "Hanke JSON is not valid"),
            @ApiResponse(code = 404, message = "Requested Hankenumero not found")})
    @OrganizationRestricted
    public Response updateHankenumero(@PathParam("julkaisunTunnus") String julkaisunTunnus,
                                      @PathParam("hankeId") Long hankeId,
                                      @ApiParam(value = "Hanke JSON object", required = true)
                                      @NotNull @Valid Hanke hanke,
                                      @HeaderParam(Headers.X_ORG_ID) String orgId) throws SQLException {
        hanke.setId(hankeId);
        hanke.setJulkaisunTunnus(julkaisunTunnus);
        log.info("Update id {} Hankenumero {} with julkaisunTunnus {} and organisaatioTunnus {}",
                new Object[]{hanke.getId(), hanke.getHankenumero(), hanke.getJulkaisunTunnus(), hanke.getOrganisaatioTunnus()});
        hankeDAO.updateHanke(hanke, orgId);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Produces(ContentTypes.JSON_UTF8)
    @Path("/{julkaisunTunnus}/hanke/{hankeId}")
    @ApiOperation(value = "Delete Hankenumero from julkaisu by id")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Deleting Hankenumero success")})
    @OrganizationRestricted
    public Response deleteHankenumero(@PathParam("julkaisunTunnus") String julkaisunTunnus,
                                      @PathParam("hankeId") Long hankeId,
                                      @HeaderParam(Headers.X_ORG_ID) String orgId) {
        hankeDAO.deleteHanke(hankeId, julkaisunTunnus, orgId);
        return Response.status(Response.Status.OK).build();
    }

    private void checkSearchParameters(UriInfo uriInfo) {
        Configuration searchConfig = conf.getSearchConfig();
        MultivaluedMap<String, String> params = uriInfo.getQueryParameters();
        for (String key : params.keySet()) {
            Field field = FieldUtils.getField(SearchQuery.class, key);
            if (field == null) {
                throw new ApiException(Response.Status.BAD_REQUEST,
                        new ApiError(ApiError.Code.UNKNOWN_PARAMETER,
                                "Unknown search parameter [" + key + "]"));
            }
            Configuration paramConf = searchConfig.subset(key);
            if (paramConf.getBoolean("disabled", false)) {
                throw new ApiException(Response.Status.BAD_REQUEST,
                        new ApiError(ApiError.Code.PARAMETER_DISABLED,
                                "Search parameter is disabled [" + key + "]"));
            }
            int min = paramConf.getInt("min", -1);
            if (min > -1 && params.getFirst(key).length() < min) {
                throw new ApiException(Response.Status.BAD_REQUEST,
                        new ApiError(ApiError.Code.PARAMETER_MIN,
                                "Search parameter [" + key + "] min length is " + min));
            }
        }
    }

    private URI createURI(Long id, UriInfo uriInfo) {
        UriBuilder ub = uriInfo.getAbsolutePathBuilder();
        return ub.path(id.toString()).build();
    }
}
