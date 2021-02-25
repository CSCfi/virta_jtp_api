package fi.csc.virta.julkaisut.filter;

import fi.csc.virta.julkaisut.domain.Headers;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;

/**
 * Checks organization id from request headers. If there is none forbidden response is returned to client.
 */
public class OrganizationRestrictedFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) {
        final String orgId = requestContext.getHeaderString(Headers.X_ORG_ID);
        if (StringUtils.isEmpty(orgId)) {
            requestContext.abortWith(Response.status(Response.Status.FORBIDDEN).build());
        }

    }
}
