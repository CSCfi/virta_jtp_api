

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.dao.HankeDAO;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import fi.csc.virta.julkaisut.exception.DataAccessException;
import fi.csc.virta.julkaisut.factory.MockInstanceFactory;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.FORBIDDEN;
import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static javax.ws.rs.core.Response.Status.OK;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.doNothing;
import static org.powermock.api.mockito.PowerMockito.mock;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * API test class for {@link JulkaisuResource} class.
 */


public class JulkaisuResourceTest extends ResourceTest {

    private static final String ROOT_PATH = "julkaisut/";

    private JulkaisuDAO julkaisuDAO = mock(JulkaisuDAO.class);
    private HankeDAO hankeDAO = mock(HankeDAO.class);
    private AppConfig appConfig = mock(AppConfig.class);

    @Override
    protected Application configure() {
        return createApplication(JulkaisuResource.class,
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        bindFactory(new MockInstanceFactory<>(julkaisuDAO)).to(JulkaisuDAO.class);
                        bindFactory(new MockInstanceFactory<>(hankeDAO)).to(HankeDAO.class);
                        bindFactory(new MockInstanceFactory<>(appConfig)).to(AppConfig.class);
                    }
                });
    }

    @Test
    public void testGetWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, ROOT_PATH, null);
    }

    @Test
    public void testGet() throws Exception {
        doNothing().when(julkaisuDAO).getAll(any(), any());
        doGet(OK, ContentTypes.JSON_UTF8, ROOT_PATH);
        verify(julkaisuDAO, times(1))
                .getAll(any(), eq(ORG_ID));
    }

    @Test
    public void testGetWithDataAccessException() throws Exception {
        doAnswer(invocation -> {
            throw new DataAccessException("Testing");
        }).when(julkaisuDAO).getAll(any(), any());
        doGet(INTERNAL_SERVER_ERROR, null, ROOT_PATH);
    }

    @Test
    public void testGetWithApplicationException() throws Exception {
        doAnswer(invocation -> {
            throw new Exception("Testing");
        }).when(julkaisuDAO).getAll(any(), any());
        doGet(BAD_REQUEST, null, ROOT_PATH);
    }

    @Test
    public void testGetByJulkaisunTunnus() throws Exception {
        final String tunnus = "11122";
        doNothing().when(julkaisuDAO).getByJulkaisunTunnus(any(), eq(tunnus), any());
        doGet(OK, ContentTypes.JSON_UTF8, ROOT_PATH + tunnus);
        verify(julkaisuDAO, times(1)).getByJulkaisunTunnus(any(), eq(tunnus), any());
    }

    @Test
    public void testGetByJulkaisuTunnusNotFound() throws Exception {
        doAnswer(invocation -> {
            throw new NotFoundException("not found");
        }).when(julkaisuDAO).getByJulkaisunTunnus(any(), any(), any());
        doGet(NOT_FOUND, null, ROOT_PATH + "notfound");
    }

    @Test
    public void testGetXml() throws Exception {
        doGet(Response.Status.OK, ContentTypes.XML_UTF8, ROOT_PATH + "xml");
        verify(julkaisuDAO, times(1)).getAllXml(any(), eq(ORG_ID));
    }

}

