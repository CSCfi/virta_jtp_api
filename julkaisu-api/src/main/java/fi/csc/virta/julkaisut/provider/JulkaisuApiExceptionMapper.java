package fi.csc.virta.julkaisut.provider;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.exceptions.Exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Exception mapper for mapping all {@link Throwable} to corresponding http errors.
 */
@Provider
public class JulkaisuApiExceptionMapper implements ExceptionMapper<Throwable> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public Response toResponse(Throwable ex) {
        if (ex instanceof WebApplicationException) {
            // Pass through standard web application exceptions.
            return buildResponse((WebApplicationException) ex);
        }
        Response.Status status = INTERNAL_SERVER_ERROR;
        Throwable finalCause = Exceptions.getFinalCause(ex);
        if (finalCause instanceof WebApplicationException) {
            // Pass through standard web application exceptions.
            return buildResponse((WebApplicationException) finalCause);
        } else if (!(finalCause instanceof RuntimeException)) {
            //TODO: Handle checked exceptions and map them to corresponding http status codes.
            status = BAD_REQUEST;
        }
        log.error("Error", ex);
        log.info("Mapping exception to status code {}. Message: {}", status, ex.getMessage());
        return Response.status(status)
                .build();
    }

    private Response buildResponse(WebApplicationException ex) {
        return ex.getResponse();
    }
}
