package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.ListSetsResult;
import com.lyncode.xoai.dataprovider.core.Set;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

import java.util.ArrayList;
import java.util.List;

public class JulkaisuSetRepositoryTest {

    public static final String SET_SPEC = "setSpec:";
    private JulkaisuSetRepository repo;
    private JulkaisuDAO dao;

    @Before
    public void setUp() {
        dao = mock(JulkaisuDAO.class);
        repo = new JulkaisuSetRepository(dao);
    }

    @Test
    public void testRetrieveSets() throws Exception {
        int size = 5;
        initializeSets(size);
        // Get all
        ListSetsResult result = repo.retrieveSets(0, Integer.MAX_VALUE);
        assertResult(size, result, createSet(0), createSet(1), createSet(2), createSet(3), createSet(4));
        assertFalse(result.hasMore());

        // Get when length 2
        // First page
        result = repo.retrieveSets(0, 2);
        assertResult(size, result, createSet(0), createSet(1));
        assertTrue(result.hasMore());

        // Second page
        result = repo.retrieveSets(2, 2);
        assertResult(size, result, createSet(2), createSet(3));
        assertTrue(result.hasMore());

        // Third page
        result = repo.retrieveSets(4, 2);
        assertResult(size, result, createSet(4));
        assertFalse(result.hasMore());
    }

    private void assertResult(int size, ListSetsResult result, Set... expectedSets) {
        assertNotNull(result);
        assertEquals(size, result.getTotalResults());
        List<Set> results = result.getResults();
        assertEquals(expectedSets.length, results.size());
        for (int i = 0; i < expectedSets.length; i++) {
            Set set = results.get(i);
            assertEquals(expectedSets[i].getSetName(), set.getSetName());
            assertEquals(expectedSets[i].getSetSpec(), set.getSetSpec());
        }
    }

    @Test
    public void testExists() throws Exception {
        initializeSets(5);
        assertTrue(repo.exists(SET_SPEC + 3));
        assertFalse(repo.exists(SET_SPEC + 6));
    }

    private void initializeSets(int size) {
        List<Set> sets = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            sets.add(createSet(i));
        }
        when(dao.getSets()).thenReturn(sets);
    }

    private Set createSet(int i) {
        return new Set(SET_SPEC + i, "" + i);
    }
}