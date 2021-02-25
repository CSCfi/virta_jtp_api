package fi.csc.virta.julkaisut.dao;

import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import static fi.csc.virta.julkaisut.domain.QVirheraportti.Virheraportti;

import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.Virheraportti;

/**
 * Data access class for {@link fi.csc.virta.julkaisut.domain.Virheraportti} objects.
 */
public class VirheraporttiDAO extends AbstractDAO<Virheraportti> {

    public VirheraporttiDAO(AppConfig config) {
        super(config);
    }

    public void getVirheraportti(ObjectResultSetConverter<Virheraportti> converter, String orgId) {
        selectWithOrganizationId(converter, Virheraportti, Virheraportti.organisaatioTunnus, orgId);
    }
}


