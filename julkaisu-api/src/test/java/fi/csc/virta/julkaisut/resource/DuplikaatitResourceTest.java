

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.dao.DuplikaatitDAO;
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
 * Test class for {@link DuplikaatitResource}.
 */




public class DuplikaatitResourceTest extends ResourceTest {

    private static final String ROOT_PATH = "Latausraportit/Duplikaatit";

    private DuplikaatitDAO duplikaatitDAO = mock(DuplikaatitDAO.class);

    @Override
    protected Application configure() {
        return createApplication(DuplikaatitResource.class,
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        bindFactory(new MockInstanceFactory<>(duplikaatitDAO))
                                .to(DuplikaatitDAO.class);
                    }
                });
    }

    @Test
    public void testGet() throws Exception {
        doNothing().when(duplikaatitDAO).getDuplikaatit(any(), eq(ORG_ID));
        doGet(OK, ContentTypes.JSON_UTF8, ROOT_PATH);
        verify(duplikaatitDAO, times(1)).getDuplikaatit(any(), eq(ORG_ID));
    }

    @Test
    public void testGetWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, ROOT_PATH, null);
        verify(duplikaatitDAO, never()).getDuplikaatit(any(), any());
    }
}

