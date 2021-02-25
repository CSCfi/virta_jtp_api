package fi.csc.virta.julkaisut.filter;

import fi.csc.virta.julkaisut.domain.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;

public class LogFilter implements ContainerResponseFilter {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Context
    private HttpServletRequest request;

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        UriInfo uriInfo = requestContext.getUriInfo();
        String path = uriInfo.getRequestUri().getPath();
        String query = uriInfo.getRequestUri().getQuery();
        String address = requestContext.getHeaderString(Headers.X_FORWARDED_FOR);
        if (address == null) {
            address = request.getRemoteAddr();
        }
        StringBuilder sb = new StringBuilder("Request from ").append(address);
        sb.append(" ").append(requestContext.getMethod());
        sb.append(" ").append(path);
        if (query != null) {
            sb.append("?").append(query);
        }

        Response.StatusType statusInfo = responseContext.getStatusInfo();
        sb.append(" - ").append(statusInfo.getStatusCode()).append(" ")
                .append(statusInfo.getReasonPhrase());

        log.info(sb.toString());
    }
}
