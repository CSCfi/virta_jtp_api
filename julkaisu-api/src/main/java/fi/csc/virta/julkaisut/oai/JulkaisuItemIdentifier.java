package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.core.ReferenceSet;
import com.lyncode.xoai.dataprovider.data.ItemIdentifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JulkaisuItemIdentifier implements ItemIdentifier {

    private String identifier;
    private Date datestamp = new Date();

    public JulkaisuItemIdentifier(Date datestamp, String identifier) {
        this.identifier = identifier;
        if (datestamp != null) {
            this.datestamp = datestamp;
        }
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Date getDatestamp() {
        return datestamp;
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
