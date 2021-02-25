

package fi.csc.virta.julkaisut.resource;

import fi.csc.virta.julkaisut.Util.ContentTypes;
import fi.csc.virta.julkaisut.dao.TilanneraporttiDAO;
import fi.csc.virta.julkaisut.dao.VirheraporttiDAO;
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
 * Test class for {@link TilanneraporttiResource}.
 */


public class TilanneraporttiResourceTest extends ResourceTest {

    private static final String ROOT_PATH = "Latausraportit/";
    private static final String TILANNE_PATH = ROOT_PATH + "Tilanne";
    private static final String VIRHEET_PATH = ROOT_PATH + "Virheet";

    private VirheraporttiDAO virheraporttiDAO = mock(VirheraporttiDAO.class);
    private TilanneraporttiDAO tilanneraporttiDAO = mock(TilanneraporttiDAO.class);

    @Override
    protected Application configure() {
        return createApplication(TilanneraporttiResource.class,
                new AbstractBinder() {
                    @Override
                    protected void configure() {
                        bindFactory(new MockInstanceFactory<>(virheraporttiDAO))
                                .to(VirheraporttiDAO.class);
                        bindFactory(new MockInstanceFactory<>(tilanneraporttiDAO))
                                .to(TilanneraporttiDAO.class);
                    }
                });
    }

    @Test
    public void testGetTilanne() throws Exception {
        doNothing().when(tilanneraporttiDAO).getTilanneraportti(any(), eq(ORG_ID));
        doGet(OK, ContentTypes.JSON_UTF8, TILANNE_PATH);
        verify(tilanneraporttiDAO, times(1)).getTilanneraportti(any(), eq(ORG_ID));
    }

    @Test
    public void testGetTilanneWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, TILANNE_PATH, null);
        verify(tilanneraporttiDAO, never()).getTilanneraportti(any(), any());
    }

    @Test
    public void testGetVirheet() throws Exception {
        doNothing().when(virheraporttiDAO).getVirheraportti(any(), eq(ORG_ID));
        doGet(OK, ContentTypes.JSON_UTF8, VIRHEET_PATH);
        verify(virheraporttiDAO, times(1)).getVirheraportti(any(), eq(ORG_ID));
    }

    @Test
    public void testGetVirheetWithoutOrgId() throws Exception {
        doGet(FORBIDDEN, null, VIRHEET_PATH, null);
        verify(virheraporttiDAO, never()).getVirheraportti(any(), any());
    }
}

