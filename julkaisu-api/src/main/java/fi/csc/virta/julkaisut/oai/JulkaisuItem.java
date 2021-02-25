package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.ItemMetadata;
import com.lyncode.xoai.dataprovider.core.ReferenceSet;
import com.lyncode.xoai.dataprovider.data.About;
import com.lyncode.xoai.dataprovider.data.Item;
import com.lyncode.xoai.dataprovider.xml.xoai.Metadata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JulkaisuItem implements Item {

    private Date muutospvm = new Date();
    private String xml;
    private String identifier;

    public JulkaisuItem(Date muutospvm, String xml, String identifier) {
        if (muutospvm != null) {
            this.muutospvm = muutospvm;
        }
        this.xml = xml;
        this.identifier = identifier;
    }

    @Override
    public List<About> getAbout() {
        return new ArrayList<>();
    }

    @Override
    public ItemMetadata getMetadata() {
        return new ItemMetadata(createMetaData());
    }

    private Metadata createMetaData() {
        Metadata meta = new Metadata();
        JulkaisuElement e = new JulkaisuElement();
        e.setValue(xml);
        meta.getElement().add(e);
        return meta;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Date getDatestamp() {
        return muutospvm;
    }

    @Override
    public List<ReferenceSet> getSets() {
        return new ArrayList<>();
    }

    @Override
    public boolean isDeleted() {
        return false;
    }
}
