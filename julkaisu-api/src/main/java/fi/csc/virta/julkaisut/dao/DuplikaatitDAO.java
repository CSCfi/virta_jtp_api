package fi.csc.virta.julkaisut.dao;

import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.Duplikaatit;
import static fi.csc.virta.julkaisut.domain.Qduplikaatit.duplikaatit;

public class DuplikaatitDAO extends AbstractDAO<Duplikaatit> {

    public DuplikaatitDAO(AppConfig config) {
        super(config);
    }

    public void getDuplikaatit(ObjectResultSetConverter<Duplikaatit> converter, String orgId) {
        selectWithOrganizationId(converter, duplikaatit, duplikaatit.organisaatiotunnus, orgId);
    }

}
