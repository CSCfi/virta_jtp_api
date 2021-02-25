package fi.csc.virta.julkaisut.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

@Path("/")
public class Root {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getRoot() throws URISyntaxException {
        return Response.temporaryRedirect(new URI("/api-doc/api-doc.html")).build();
    }

}
