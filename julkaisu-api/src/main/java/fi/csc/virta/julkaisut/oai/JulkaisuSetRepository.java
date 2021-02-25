package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.ListSetsResult;
import com.lyncode.xoai.dataprovider.core.Set;
import com.lyncode.xoai.dataprovider.services.api.SetRepository;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;

import java.util.List;

public class JulkaisuSetRepository implements SetRepository {

    private JulkaisuDAO dao;

    public JulkaisuSetRepository(JulkaisuDAO dao) {
        this.dao = dao;
    }

    @Override
    public boolean supportSets() {
        return true;
    }

    @Override
    public ListSetsResult retrieveSets(int offset, int length) {
        List<Set> allSets = dao.getSets();
        int lastIndex = offset + length;
        if (lastIndex >= allSets.size()) {
            lastIndex = allSets.size();
        }
        return new ListSetsResult(lastIndex < allSets.size(), allSets.subList(offset, lastIndex), allSets.size());
    }

    @Override
    public boolean exists(String setSpec) {
        ListSetsResult setsResult = retrieveSets(0, Integer.MAX_VALUE);
        for (Set set : setsResult.getResults()) {
            if (set.getSetSpec().equals(setSpec)) {
                return true;
            }
        }
        return false;
    }
}
