

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.domain.Headers;
import fi.csc.virta.julkaisut.provider.JulkaisuApiExceptionMapper;
import fi.csc.virta.julkaisut.provider.OrganizationRestrictedFeature;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import static org.junit.Assert.assertEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Base class for resources tests.
 */


class ResourceTest extends JerseyTest {

    static final String ORG_ID = "123";
    final Logger log = LoggerFactory.getLogger(getClass());

    Application createApplication(Class resourceClass, AbstractBinder binder) {
        ResourceConfig config = new ResourceConfig();
        config.register(binder);
        config.registerClasses(resourceClass,
                JulkaisuApiExceptionMapper.class,
                OrganizationRestrictedFeature.class);
        return config;
    }

    private void assertHeaders(Response response, Response.Status status, String contentType) {
        log.info("Headers -- {}", response.getHeaders());
        assertEquals("Status code should match!", status.getStatusCode(), response.getStatus());
        assertEquals("Content-Type should match!", contentType, response.getHeaderString(Header.ContentType.toString()));
    }

    Response doGet(Response.Status status, String contentType, String path) {
        return doGet(status, contentType, path, ORG_ID);
    }

    Response doGet(Response.Status status, String contentType, String path, String orgId) {
        final Optional<String> o = Optional.ofNullable(path);
        Response response = target(o.orElse("")).request()
                .header(Headers.X_ORG_ID, orgId).get(Response.class);
        assertHeaders(response, status, contentType);
        return response;
    }
}


