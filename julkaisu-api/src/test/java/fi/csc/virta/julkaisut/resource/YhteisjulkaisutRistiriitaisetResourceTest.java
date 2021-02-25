

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.dao.YhteisjulkaisutRistiriitaisetDAO;
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
 * Test class for {@link YhteisjulkaisutRistiriitaisetResource}.
 */


public class YhteisjulkaisutRistiriitaisetResourceTest extends ResourceTest {

    private static final String ROOT_PATH = "Yhteisjulkaisut/Ristiriitaiset";

    private YhteisjulkaisutRistiriitaisetDAO yhteisjulkaisutRistiriitaisetDAO = mock(YhteisjulkaisutRistiriitaisetDAO.class);

    @Override
    protected Application configure() {
        return createApplication(YhteisjulkaisutRistiriitaisetResource.class,
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        bindFactory(new MockInstanceFactory<>(yhteisjulkaisutRistiriitaisetDAO))
                                .to(YhteisjulkaisutRistiriitaisetDAO.class);
                    }
                });
    }

    @Test
    public void testGet() throws Exception {
        doNothing().when(yhteisjulkaisutRistiriitaisetDAO).getYhteisjulkaisutRistiriitaiset(any(), eq(ORG_ID));
        doGet(OK, ContentTypes.JSON_UTF8, ROOT_PATH);
        verify(yhteisjulkaisutRistiriitaisetDAO, times(1)).getYhteisjulkaisutRistiriitaiset(any(), eq(ORG_ID));
    }

    @Test
    public void testGetWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, ROOT_PATH, null);
        verify(yhteisjulkaisutRistiriitaisetDAO, never()).getYhteisjulkaisutRistiriitaiset(any(), any());
    }

}
