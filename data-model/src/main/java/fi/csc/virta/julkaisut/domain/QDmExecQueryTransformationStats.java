package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecQueryTransformationStats is a Querydsl query type for QDmExecQueryTransformationStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecQueryTransformationStats extends com.querydsl.sql.RelationalPathBase<QDmExecQueryTransformationStats> {

    private static final long serialVersionUID = -1479411931;

    public static final QDmExecQueryTransformationStats dmExecQueryTransformationStats = new QDmExecQueryTransformationStats("dm_exec_query_transformation_stats");

    public final NumberPath<Long> builtSubstitute = createNumber("builtSubstitute", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> promiseAvg = createNumber("promiseAvg", Double.class);

    public final NumberPath<Long> promised = createNumber("promised", Long.class);

    public final NumberPath<Long> promiseTotal = createNumber("promiseTotal", Long.class);

    public final NumberPath<Long> succeeded = createNumber("succeeded", Long.class);

    public QDmExecQueryTransformationStats(String variable) {
        super(QDmExecQueryTransformationStats.class, forVariable(variable), "sys", "dm_exec_query_transformation_stats");
        addMetadata();
    }

    public QDmExecQueryTransformationStats(String variable, String schema, String table) {
        super(QDmExecQueryTransformationStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecQueryTransformationStats(Path<? extends QDmExecQueryTransformationStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_query_transformation_stats");
        addMetadata();
    }

    public QDmExecQueryTransformationStats(PathMetadata metadata) {
        super(QDmExecQueryTransformationStats.class, metadata, "sys", "dm_exec_query_transformation_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(builtSubstitute, ColumnMetadata.named("built_substitute").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.VARCHAR).withSize(8000).notNull());
        addMetadata(promiseAvg, ColumnMetadata.named("promise_avg").withIndex(3).ofType(Types.DOUBLE).withSize(53).notNull());
        addMetadata(promised, ColumnMetadata.named("promised").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(promiseTotal, ColumnMetadata.named("promise_total").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(succeeded, ColumnMetadata.named("succeeded").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

