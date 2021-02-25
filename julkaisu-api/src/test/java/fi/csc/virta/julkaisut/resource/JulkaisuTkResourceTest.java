

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.dao.JulkaisuTkDAO;
import fi.csc.virta.julkaisut.factory.MockInstanceFactory;
import static javax.ws.rs.core.Response.Status.FORBIDDEN;
import static javax.ws.rs.core.Response.Status.OK;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import javax.ws.rs.core.Application;

/**
 * Test class for {@link JulkaisuTkResource}.
 */


public class JulkaisuTkResourceTest extends ResourceTest {

    private static final String ROOT_PATH = "TKjulkaisut/";

    private JulkaisuTkDAO julkaisuTkDAO = mock(JulkaisuTkDAO.class);

    @Override
    protected Application configure() {
        return createApplication(JulkaisuTkResource.class,
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        bindFactory(new MockInstanceFactory<>(julkaisuTkDAO))
                                .to(JulkaisuTkDAO.class);
                    }
                });
    }

    @Test
    public void testGet() throws Exception {
        doNothing().when(julkaisuTkDAO).getAll(any(), eq(ORG_ID));
        doGet(OK, ContentTypes.JSON_UTF8, ROOT_PATH);
        verify(julkaisuTkDAO, times(1)).getAll(any(), eq(ORG_ID));
    }

    @Test
    public void testGetWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, ROOT_PATH, null);
        verify(julkaisuTkDAO, never()).getAll(any(), any());
    }
}

