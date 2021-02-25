package fi.csc.virta.julkaisut;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ErrorReportValve;

/**
 * No Report implementation of {@link ErrorReportValve}.
 * With this valve tomcat will not generate default error report body to response.
 */
public class JulkaisuApiErrorValve extends ErrorReportValve {
    @Override
    protected void report(Request request, Response response, Throwable throwable) {
    }
}
