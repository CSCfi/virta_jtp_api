package fi.csc.virta.julkaisut.dao;

import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import static fi.csc.virta.julkaisut.domain.QTilanneraportti.Tilanneraportti;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.Tilanneraportti;

/**
 * Data access class for {@link fi.csc.virta.julkaisut.domain.Tilanneraportti} objects.
 */


public class TilanneraporttiDAO extends AbstractDAO<Tilanneraportti> {

    public TilanneraporttiDAO(AppConfig config) {
        super(config);
    }

    public void getTilanneraportti(ObjectResultSetConverter<Tilanneraportti> converter, String orgId) {
        selectWithOrganizationId(converter, Tilanneraportti, Tilanneraportti.organisaatioTunnus, orgId);
    }
}
