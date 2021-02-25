package fi.csc.virta.julkaisut.dao;

import com.github.davidmoten.rx.jdbc.Database;
import com.github.davidmoten.rx.jdbc.tuple.Tuple2;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.BooleanTemplate;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.RelationalPathBase;
import com.querydsl.sql.SQLBindings;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLServer2012Templates;
import com.querydsl.sql.SQLTemplates;
import fi.csc.virta.julkaisut.Util.CounterUtil;
import fi.csc.virta.julkaisut.Util.ObjectConverter;
import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import fi.csc.virta.julkaisut.Util.RawConverter;
import fi.csc.virta.julkaisut.config.AppConfig;
import fi.csc.virta.julkaisut.domain.DTO;
import static fi.csc.virta.julkaisut.domain.QJulkaisutF.julkaisutF;
import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.exceptions.Exceptions;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.NotFoundException;
import java.util.Arrays;
import java.util.Date;

/**
 * Abstract super class for DAO classes.
 */
public abstract class AbstractDAO<T extends DTO> {

    protected Logger log = LoggerFactory.getLogger(getClass());

    final DataSource dataSource;
    final SQLQueryFactory queryFactory;
    final AppConfig config;

    AbstractDAO(AppConfig config) {
        this.config = config;
        dataSource = dataSource();
        queryFactory = queryFactory(SQLServer2012Templates.builder()
                .printSchema()
                .build());
    }

    AbstractDAO(SQLTemplates templates, AppConfig config) {
        this.dataSource = dataSource();
        this.queryFactory = queryFactory(templates);
        this.config = config;
    }

    private DataSource dataSource() {
        try {
            InitialContext ic = new InitialContext();
            return (DataSource) ic.lookup("java:comp/env/jdbc/mssqlDS");
        } catch (NamingException e) {
            log.error("Could not find datasource.", e);
        }
        return null;
    }

    private SQLQueryFactory queryFactory(SQLTemplates templates) {
        Configuration configuration = getConfiguration(templates);
        return new SQLQueryFactory(configuration, dataSource);
    }

    private Configuration getConfiguration(SQLTemplates templates) {
        Configuration configuration = new Configuration(templates);
        configuration.setUseLiterals(true);
        return configuration;
    }

    void handleError(String message, Throwable throwable) {
        log.error(message, throwable);
        throw new DataAccessException(message, throwable);
    }

    protected void select(SQLBindings sql, ObjectConverter<T> converter) {
        Database db = Database.fromDataSource(dataSource);
        if (log.isDebugEnabled()) {
            log.debug("SELECT QUERY: {}", sql.getSQL());
        }
        db.close();
        db.select(sql.getSQL())
                .get(converter::toObject)
                .distinct(DTO::keySelector)
                .doOnError(throwable -> handleError("Executing sql failed!", throwable))
                .doOnCompleted(() -> CounterUtil.checkCount(converter))
                .subscribe(converter::toJson, Exceptions::propagate);
    }

    protected void select(SQLBindings sql, RawConverter converter) {
        Database db = Database.fromDataSource(dataSource);
        if (log.isDebugEnabled()) {
            log.debug("SELECT QUERY: {}", sql.getSQL());
        }
        db.select(sql.getSQL())
                .getAs(Long.class, String.class)
                .distinct(Tuple2::value1)
                .doOnError(throwable -> handleError("Executing sql failed!", throwable))
                .doOnCompleted(() -> CounterUtil.checkCount(converter))
                .subscribe(tuple2 -> {
                    converter.convert(tuple2.value2());
                }, Exceptions::propagate);
    }

    void checkJulkaisu(String julkaisunTunnus, String orgId) {
        if (!julkaisuExists(julkaisunTunnus, orgId)) {
            throw new NotFoundException("Can not find julkaisu with julkaisunTunnus " + julkaisunTunnus + " and orgTunnus " + orgId);
        }
    }

    boolean julkaisuExists(String julkaisunTunnus, String orgId) {
        final SQLQuery<String> query = queryFactory.select(julkaisutF.julkaisunTunnus)
                .from(julkaisutF).where(julkaisutF.julkaisunTunnus.eq(julkaisunTunnus));
        addOrganizationCondition(query, julkaisutF.orgTunnus, orgId);
        final long count = query.fetchCount();
        return count > 0;
    }

    void addOrganizationCondition(SQLQuery query, StringPath stringPath, String orgId) {
        final String separator = config.getConfig().getString("organisation.header.separator", ",");
        final String[] ids = orgId.split(separator);
        if (!Arrays.asList(ids).contains("*")) {
            query.where(stringPath.in(ids));
        }
    }

    void selectWithOrganizationId(ObjectResultSetConverter<T> converter, RelationalPathBase q, StringPath organizationPath, String orgId) {
        final SQLQuery<Tuple> query = queryFactory.select(q.all())
                .from(q);
        addOrganizationCondition(query, organizationPath, orgId);
        select(query.getSQL(), converter);
    }

    BooleanExpression createBetween(DateTimePath<Date> date, Date from, Date until) {
        if (from == null && until == null) {
            return null;
        }
        return date.between(from, until);
    }

    BooleanExpression createEquals(StringPath column, String value) {
        if (value == null) {
            return null;
        }
        return column.eq(value);
    }

    BooleanExpression createEquals(NumberPath<Integer> column, Integer value) {
        if (value == null) {
            return null;
        }
        return column.eq(value);
    }

    BooleanTemplate createContains(StringPath column, String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        return Expressions.booleanTemplate("CONTAINS({0}, {1})", column, "\"" + value + "*\"");
    }
}
