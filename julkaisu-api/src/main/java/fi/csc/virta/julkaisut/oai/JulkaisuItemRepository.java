package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.ListItemIdentifiersResult;
import com.lyncode.xoai.dataprovider.core.ListItemsResults;
import com.lyncode.xoai.dataprovider.data.Item;
import com.lyncode.xoai.dataprovider.data.ItemIdentifier;
import com.lyncode.xoai.dataprovider.exceptions.IdDoesNotExistException;
import com.lyncode.xoai.dataprovider.exceptions.OAIException;
import com.lyncode.xoai.dataprovider.filter.ScopedFilter;
import com.lyncode.xoai.dataprovider.services.api.ItemRepository;
import com.querydsl.core.Tuple;
import fi.csc.virta.julkaisut.dao.JulkaisuDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class JulkaisuItemRepository implements ItemRepository {

    private JulkaisuDAO dao;
    private String metaDataPrefix;

    public JulkaisuItemRepository(JulkaisuDAO dao, String metaDataPrefix) {
        this.dao = dao;
        this.metaDataPrefix = metaDataPrefix;
    }

    @Override
    public Item getItem(String identifier) throws IdDoesNotExistException, OAIException {
        Tuple tuple = dao.getJulkaisuByIdentifier(identifier, metaDataPrefix);
        if (tuple == null) {
            throw new IdDoesNotExistException("Could not find item with identifier " + identifier);
        }
        return new JulkaisuItem(tuple.get(0, Date.class), tuple.get(1, String.class), tuple.get(2, String.class));
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length) throws OAIException {       
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, null, null, null, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, null, null, null);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length, Date from) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, from, null, null, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, from, null, null);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiersUntil(List<ScopedFilter> filters, int offset, int length, Date until) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, null, until, null, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, null, until, null);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length, Date from, Date until) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, from, until, null, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, from, until, null);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length, String setSpec) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, null, null, setSpec, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, null, null, setSpec);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length, String setSpec, Date from) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, from, null, setSpec, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, from, null, setSpec);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiersUntil(List<ScopedFilter> filters, int offset, int length, String setSpec, Date until) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, null, until, setSpec, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, null, until, setSpec);
    }

    @Override
    public ListItemIdentifiersResult getItemIdentifiers(List<ScopedFilter> filters, int offset, int length, String setSpec, Date from, Date until) throws OAIException {
        List<Tuple> tuples = dao.getJulkaisuIdentifiers(offset, length, from, until, setSpec, metaDataPrefix);
        return createItemIdentifiersResult(tuples, offset, length, from, until, setSpec);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, null, null, null, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, null, null, null);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length, Date from) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, from, null, null, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, from, null, null);
    }

    @Override
    public ListItemsResults getItemsUntil(List<ScopedFilter> filters, int offset, int length, Date until) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, null, until, null, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, null, until, null);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length, Date from, Date until) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, from, until, null, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, from, until, null);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length, String setSpec) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, null, null, setSpec, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, null, null, setSpec);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length, String setSpec, Date from) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, from, null, setSpec, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, from, null, setSpec);
    }

    @Override
    public ListItemsResults getItemsUntil(List<ScopedFilter> filters, int offset, int length, String setSpec, Date until) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, null, until, setSpec, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, null, until, setSpec);
    }

    @Override
    public ListItemsResults getItems(List<ScopedFilter> filters, int offset, int length, String setSpec, Date from, Date until) throws OAIException {
        List<Tuple> julkaisut = dao.getJulkaisut(offset, length, from, until, setSpec, metaDataPrefix);
        return createListItemsResults(julkaisut, offset, length, from, until, setSpec);
    }

    private ListItemIdentifiersResult createItemIdentifiersResult(List<Tuple> julkaisuIdentifiers,
                                                                  int offset, int length, Date from, Date until, String setSpec) {       
        List<ItemIdentifier> items = new ArrayList<>();
        for (Tuple tuple : julkaisuIdentifiers) {
            items.add(new JulkaisuItemIdentifier(tuple.get(0, Date.class), tuple.get(1, String.class)));
        }
        int total = dao.getJulkaisutXmlCount(from, until, setSpec, metaDataPrefix).intValue();
        return new ListItemIdentifiersResult(total > (offset + length), items, total);
    }

    private ListItemsResults createListItemsResults(List<Tuple> julkaisut,
                                                    int offset, int length, Date from, Date until, String setSpec) {
        List<Item> items = new ArrayList<>();
        for (Tuple tuple : julkaisut) {
            items.add(new JulkaisuItem(tuple.get(0, Date.class),
                    tuple.get(1, String.class), tuple.get(2, String.class)));
        }

        int total = dao.getJulkaisutXmlCount(from, until, setSpec, metaDataPrefix).intValue();
        return new ListItemsResults(total > (offset + length), items, total);
    }
}
