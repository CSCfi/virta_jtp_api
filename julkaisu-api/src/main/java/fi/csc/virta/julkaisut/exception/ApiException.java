package fi.csc.virta.julkaisut.exception;

import fi.csc.virta.julkaisut.domain.ApiError;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ApiException extends WebApplicationException {

    private final ApiError error;

    public ApiException(Response.Status status, ApiError error) {
        super(status);
        this.error = error;
    }

    @Override
    public String getMessage() {
        return error.getError() + ":" + error.getMessage();
    }

    @Override
    public Response getResponse() {
        return Response.fromResponse(super.getResponse())
                .entity(getMessage())
                .type(MediaType.TEXT_PLAIN_TYPE)
                .build();
    }

    public ApiError getError() {
        return error;
    }
}
