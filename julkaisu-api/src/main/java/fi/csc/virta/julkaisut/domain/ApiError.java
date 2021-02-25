package fi.csc.virta.julkaisut.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiError {

    public enum Code {
        UNKNOWN_PARAMETER,
        PARAMETER_MIN,
        PARAMETER_DISABLED
    }

    private Code error;
    private String message;

    public ApiError(Code error, String message) {
        this.error = error;
        this.message = message;
    }

    public Code getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}
