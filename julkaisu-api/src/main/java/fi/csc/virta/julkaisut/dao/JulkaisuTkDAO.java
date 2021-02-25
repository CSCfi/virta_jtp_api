package fi.csc.virta.julkaisut.dao;

import com.github.davidmoten.rx.jdbc.Database;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.sql.SQLBindings;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLTemplates;
import fi.csc.virta.julkaisut.Util.CounterUtil;
import fi.csc.virta.julkaisut.Util.ObjectConverter;
import fi.csc.virta.julkaisut.Util.TKBeanProcessor;
import fi.csc.virta.julkaisut.annotation.TKRelation;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.AvainsanaTK;
import fi.csc.virta.julkaisut.domain.BaseTK;
import fi.csc.virta.julkaisut.domain.HankeTK;
import fi.csc.virta.julkaisut.domain.IsbnTK;
import fi.csc.virta.julkaisut.domain.IssnTK;
import fi.csc.virta.julkaisut.domain.JulkaisuTK;
import fi.csc.virta.julkaisut.domain.KoulutusalaTK;
import fi.csc.virta.julkaisut.domain.OrgYksikkoTK;
import fi.csc.virta.julkaisut.domain.TekijaTK;
import fi.csc.virta.julkaisut.domain.TieteenalaTK;
import fi.csc.virta.julkaisut.domain.TaiteenalaTK;
import static fi.csc.virta.julkaisut.domain.QTKAvainsanat.TKAvainsanat;
import static fi.csc.virta.julkaisut.domain.QTKHanke.TKHanke;
import static fi.csc.virta.julkaisut.domain.QTKJulkaisut.TKJulkaisut;
import static fi.csc.virta.julkaisut.domain.QTKKoulutusalat.TKKoulutusalat;
import static fi.csc.virta.julkaisut.domain.QTKOrgYksikko.TKOrgYksikko;
import static fi.csc.virta.julkaisut.domain.QTKTekijat.TKTekijat;
import static fi.csc.virta.julkaisut.domain.QTKTieteenalat.TKTieteenalat;
import static fi.csc.virta.julkaisut.domain.QTKTaiteenalat.TKTaiteenalat;
import static fi.csc.virta.julkaisut.domain.QTkIsbn.tkIsbn;
import static fi.csc.virta.julkaisut.domain.QTkIssn.tkIssn;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.lang3.reflect.MethodUtils;
import rx.Observable;
import rx.exceptions.Exceptions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Data access class for {@link JulkaisuTK} objects.
 */
public class JulkaisuTkDAO extends AbstractDAO<JulkaisuTK> {

    public JulkaisuTkDAO(AppConfig config) {
        super(config);
    }

    public JulkaisuTkDAO(SQLTemplates templates, AppConfig config) {
        super(templates, config);
    }

    public void getAll(ObjectConverter<JulkaisuTK> converter, String orgId) {

        Map<Class<?>, List<Path<?>>> pathMap = new LinkedHashMap<>();
        pathMap.put(JulkaisuTK.class, Arrays.asList(TKJulkaisut.all()));
        pathMap.put(HankeTK.class, Arrays.asList(TKHanke.all()));
        pathMap.put(AvainsanaTK.class, Arrays.asList(TKAvainsanat.all()));
        pathMap.put(IsbnTK.class, Arrays.asList(tkIsbn.all()));
        pathMap.put(IssnTK.class, Arrays.asList(tkIssn.all()));
        pathMap.put(KoulutusalaTK.class, Arrays.asList(TKKoulutusalat.all()));
        pathMap.put(OrgYksikkoTK.class, Arrays.asList(TKOrgYksikko.all()));
        pathMap.put(TekijaTK.class, Arrays.asList(TKTekijat.all()));
        pathMap.put(TieteenalaTK.class, Arrays.asList(TKTieteenalat.all()));
        pathMap.put(TaiteenalaTK.class, Arrays.asList(TKTaiteenalat.all()));

        final Expression[] paths = pathMap.values()
                .stream()
                .flatMap(Collection::stream)
                .map(path -> Expressions.as(path, path.toString()))
                .toArray(Expression[]::new);

        final SQLQuery<Tuple> query = queryFactory.select(paths)
                .from(TKJulkaisut)
                .leftJoin(TKHanke).on(TKJulkaisut.julkaisunTunnus.eq(TKHanke.julkaisunTunnus))
                .leftJoin(TKAvainsanat).on(TKJulkaisut.julkaisunTunnus.eq(TKAvainsanat.julkaisunTunnus))
                .leftJoin(tkIsbn).on(TKJulkaisut.julkaisunTunnus.eq(tkIsbn.julkaisunTunnus))
                .leftJoin(tkIssn).on(TKJulkaisut.julkaisunTunnus.eq(tkIssn.julkaisunTunnus))
                .leftJoin(TKKoulutusalat).on(TKJulkaisut.julkaisunTunnus.eq(TKKoulutusalat.julkaisunTunnus))
                .leftJoin(TKOrgYksikko).on(TKJulkaisut.julkaisunTunnus.eq(TKOrgYksikko.julkaisunTunnus))
                .leftJoin(TKTekijat).on(TKJulkaisut.julkaisunTunnus.eq(TKTekijat.julkaisunTunnus))
                .leftJoin(TKTieteenalat).on(TKJulkaisut.julkaisunTunnus.eq(TKTieteenalat.julkaisunTunnus))
                .leftJoin(TKTaiteenalat).on(TKJulkaisut.julkaisunTunnus.eq(TKTaiteenalat.julkaisunTunnus))
                .orderBy(TKJulkaisut.julkaisunTunnus.asc());
        addOrganizationCondition(query, TKJulkaisut.organisaatioTunnus, orgId);
        select(query.getSQL(), converter, pathMap);
    }

    protected void select(SQLBindings sql, ObjectConverter<JulkaisuTK> converter, Map<Class<?>, List<Path<?>>> pathMap) {
        Database db = Database.fromDataSource(dataSource);
        if (log.isDebugEnabled()) {
            log.debug("SELECT QUERY: {}", sql.getSQL());
        }
        db.close();
        Map<String, String> propOverrides = getPropertyOverrides(pathMap);
        BasicRowProcessor rowProcessor = new BasicRowProcessor(new TKBeanProcessor(propOverrides));
        db.select(sql.getSQL())
                .get(rs -> transform(rowProcessor, rs))
                .reduce((j1, j2) -> {
                    if (!j1.getJulkaisunTunnus().equals(j2.getJulkaisunTunnus())) {
                        Observable.just(j1).subscribe(converter::toJson, Exceptions::propagate);
                        return j2;
                    }
                    j1.getHankeTKs().addAll(j2.getHankeTKs());
                    j1.getAvainsanaTKs().addAll(j2.getAvainsanaTKs());
                    j1.getIsbnTKs().addAll(j2.getIsbnTKs());
                    j1.getIssnTKs().addAll(j2.getIssnTKs());
                    j1.getKoulutusalaTKs().addAll(j2.getKoulutusalaTKs());
                    j1.getOrgYksikkoTKs().addAll(j2.getOrgYksikkoTKs());
                    j1.getTekijaTKs().addAll(j2.getTekijaTKs());
                    j1.getTieteenalaTKs().addAll(j2.getTieteenalaTKs());
                    j1.getTaiteenalaTKs().addAll(j2.getTaiteenalaTKs());
                    return j1;
                })
                .doOnCompleted(() -> CounterUtil.checkCount(converter))
                .doOnError(throwable -> handleError("Executing sql failed!", throwable))
                .subscribe(converter::toJson, Exceptions::propagate);
    }

    private Map<String, String> getPropertyOverrides(Map<Class<?>, List<Path<?>>> pathMap) {
        final Map<String, String> propOverrides = new HashMap<>();
        pathMap.forEach((clazz, paths) ->
                paths.forEach(path -> {
                    final String[] split = path.toString().split("\\.");
                    propOverrides.put(split[0] + "." + split[1], clazz.getTypeName() + "." + split[1]);
                }));
        return propOverrides;
    }

    private JulkaisuTK transform(BasicRowProcessor rowProcessor, ResultSet rs) throws java.sql.SQLException {
        JulkaisuTK j = rowProcessor.toBean(rs, JulkaisuTK.class);

        for (Method method : MethodUtils.getMethodsListWithAnnotation(j.getClass(), TKRelation.class)) {
            TKRelation annotation = method.getDeclaredAnnotation(TKRelation.class);
            BaseTK tk = rowProcessor.toBean(rs, annotation.type());
            if (tk.getJulkaisunTunnus() != null) {
                try {
                    if (method.getReturnType().isAssignableFrom(Set.class)) {
                        Set<BaseTK> set = (Set<BaseTK>) MethodUtils.invokeMethod(j, method.getName());
                        set.add(tk);
                    }
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    throw new SQLException("Could not process result set!", e);
                }
            }
        }
        return j;
    }
}
