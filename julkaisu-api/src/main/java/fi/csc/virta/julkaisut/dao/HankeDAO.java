package fi.csc.virta.julkaisut.dao;

import com.querydsl.core.Tuple;
import com.querydsl.sql.SQLBindings;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.dml.SQLInsertClause;
import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.Hanke;
import static fi.csc.virta.julkaisut.domain.QHankeTemp.HankeTemp;

import javax.ws.rs.NotFoundException;
import java.sql.SQLException;
import java.sql.Timestamp;

public class HankeDAO extends AbstractDAO<Hanke> {

    public HankeDAO(AppConfig config) {
        super(config);
    }

    public void getHankeById(Long id, ObjectResultSetConverter<Hanke> converter, String julkaisunTunnus, String orgId) {
        checkJulkaisu(julkaisunTunnus, orgId);
        final SQLQuery<Tuple> query = queryFactory.select(HankeTemp.all())
                .from(HankeTemp).where(HankeTemp.id.eq(id));
        addOrganizationCondition(query, HankeTemp.organisaatioTunnus, orgId);
        select(query.getSQL(), converter);
    }

    public void getHankes(String julkaisunTunnus, ObjectResultSetConverter<Hanke> converter, String orgId) {
        checkJulkaisu(julkaisunTunnus, orgId);
        SQLBindings sql = queryFactory.select(HankeTemp.all())
                .from(HankeTemp)
                .where(HankeTemp.julkaisunTunnus.eq(julkaisunTunnus))
                .getSQL();
        select(sql, converter);
    }

    public Long createHanke(Hanke hanke, String orgId) throws SQLException {
        checkJulkaisu(hanke.getJulkaisunTunnus(), orgId);

        KeyListener listener = new KeyListener();
        SQLInsertClause insert = queryFactory.insert(HankeTemp);
        insert.addListener(listener);
        insert.columns(HankeTemp.julkaisunTunnus,
                HankeTemp.hankenumero, HankeTemp.organisaatioTunnus, HankeTemp.luontipaivamaara)
                .values(hanke.getJulkaisunTunnus(), hanke.getHankenumero(), hanke.getOrganisaatioTunnus(),
                        new Timestamp(System.currentTimeMillis()))
                .executeWithKeys();
        Long key = listener.getKey();
        log.info("Created Hankenumero with id {}", key);
        return key;
    }

    public void updateHanke(Hanke hanke, String orgId) {
        checkJulkaisu(hanke.getJulkaisunTunnus(), orgId);
        checkHanke(hanke.getId());
        Timestamp muutospvm = new Timestamp(System.currentTimeMillis());
        hanke.setMuutospvm(muutospvm);
        queryFactory.update(HankeTemp)
                .where(HankeTemp.id.eq(hanke.getId()))
                .set(HankeTemp.hankenumero, hanke.getHankenumero())
                .set(HankeTemp.paivityspaivamaara, muutospvm)
                .execute();
    }

    public void deleteHanke(Long hankeId, String julkaisunTunnus, String orgId) {
        if (!julkaisuExists(julkaisunTunnus, orgId)) {
            return;
        }
        queryFactory.delete(HankeTemp)
                .where(HankeTemp.id.eq(hankeId),
                        HankeTemp.julkaisunTunnus.eq(julkaisunTunnus))
                .execute();
    }

    private void checkHanke(Long id) {
        if (!exists(id)) {
            throw new NotFoundException("Can not find hanke with id " + id);
        }
    }

    private boolean exists(Long id) {
        long count = queryFactory.select(HankeTemp.id)
                .from(HankeTemp)
                .where(HankeTemp.id.eq(id))
                .fetchCount();
        return count > 0;
    }
}
