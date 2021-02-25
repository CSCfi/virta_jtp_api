package fi.csc.virta.julkaisut.dao;

import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import static fi.csc.virta.julkaisut.domain.QYhteisjulkaisutRistiriitaiset.YhteisjulkaisutRistiriitaiset;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.YhteisjulkaisutRistiriitaiset;

public class YhteisjulkaisutRistiriitaisetDAO extends AbstractDAO<YhteisjulkaisutRistiriitaiset> {

    public YhteisjulkaisutRistiriitaisetDAO(AppConfig config) {
        super(config);
    }

    public void getYhteisjulkaisutRistiriitaiset(ObjectResultSetConverter<YhteisjulkaisutRistiriitaiset> converter, String orgId) {
        selectWithOrganizationId(converter, YhteisjulkaisutRistiriitaiset, YhteisjulkaisutRistiriitaiset.organisaatioTunnus, orgId);
    }
}
