package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecProcedureStats is a Querydsl query type for QDmExecProcedureStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecProcedureStats extends com.querydsl.sql.RelationalPathBase<QDmExecProcedureStats> {

    private static final long serialVersionUID = -1263180733;

    public static final QDmExecProcedureStats dmExecProcedureStats = new QDmExecProcedureStats("dm_exec_procedure_stats");

    public final DateTimePath<java.sql.Timestamp> cachedTime = createDateTime("cachedTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> executionCount = createNumber("executionCount", Long.class);

    public final NumberPath<Long> lastElapsedTime = createNumber("lastElapsedTime", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastExecutionTime = createDateTime("lastExecutionTime", java.sql.Timestamp.class);

    public final NumberPath<Long> lastLogicalReads = createNumber("lastLogicalReads", Long.class);

    public final NumberPath<Long> lastLogicalWrites = createNumber("lastLogicalWrites", Long.class);

    public final NumberPath<Long> lastPhysicalReads = createNumber("lastPhysicalReads", Long.class);

    public final NumberPath<Long> lastWorkerTime = createNumber("lastWorkerTime", Long.class);

    public final NumberPath<Long> maxElapsedTime = createNumber("maxElapsedTime", Long.class);

    public final NumberPath<Long> maxLogicalReads = createNumber("maxLogicalReads", Long.class);

    public final NumberPath<Long> maxLogicalWrites = createNumber("maxLogicalWrites", Long.class);

    public final NumberPath<Long> maxPhysicalReads = createNumber("maxPhysicalReads", Long.class);

    public final NumberPath<Long> maxWorkerTime = createNumber("maxWorkerTime", Long.class);

    public final NumberPath<Long> minElapsedTime = createNumber("minElapsedTime", Long.class);

    public final NumberPath<Long> minLogicalReads = createNumber("minLogicalReads", Long.class);

    public final NumberPath<Long> minLogicalWrites = createNumber("minLogicalWrites", Long.class);

    public final NumberPath<Long> minPhysicalReads = createNumber("minPhysicalReads", Long.class);

    public final NumberPath<Long> minWorkerTime = createNumber("minWorkerTime", Long.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final SimplePath<byte[]> planHandle = createSimple("planHandle", byte[].class);

    public final SimplePath<byte[]> sqlHandle = createSimple("sqlHandle", byte[].class);

    public final NumberPath<Long> totalElapsedTime = createNumber("totalElapsedTime", Long.class);

    public final NumberPath<Long> totalLogicalReads = createNumber("totalLogicalReads", Long.class);

    public final NumberPath<Long> totalLogicalWrites = createNumber("totalLogicalWrites", Long.class);

    public final NumberPath<Long> totalPhysicalReads = createNumber("totalPhysicalReads", Long.class);

    public final NumberPath<Long> totalWorkerTime = createNumber("totalWorkerTime", Long.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QDmExecProcedureStats(String variable) {
        super(QDmExecProcedureStats.class, forVariable(variable), "sys", "dm_exec_procedure_stats");
        addMetadata();
    }

    public QDmExecProcedureStats(String variable, String schema, String table) {
        super(QDmExecProcedureStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecProcedureStats(Path<? extends QDmExecProcedureStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_procedure_stats");
        addMetadata();
    }

    public QDmExecProcedureStats(PathMetadata metadata) {
        super(QDmExecProcedureStats.class, metadata, "sys", "dm_exec_procedure_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cachedTime, ColumnMetadata.named("cached_time").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(executionCount, ColumnMetadata.named("execution_count").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastElapsedTime, ColumnMetadata.named("last_elapsed_time").withIndex(27).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastExecutionTime, ColumnMetadata.named("last_execution_time").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastLogicalReads, ColumnMetadata.named("last_logical_reads").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastLogicalWrites, ColumnMetadata.named("last_logical_writes").withIndex(19).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastPhysicalReads, ColumnMetadata.named("last_physical_reads").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastWorkerTime, ColumnMetadata.named("last_worker_time").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxElapsedTime, ColumnMetadata.named("max_elapsed_time").withIndex(29).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxLogicalReads, ColumnMetadata.named("max_logical_reads").withIndex(25).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxLogicalWrites, ColumnMetadata.named("max_logical_writes").withIndex(21).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxPhysicalReads, ColumnMetadata.named("max_physical_reads").withIndex(17).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxWorkerTime, ColumnMetadata.named("max_worker_time").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minElapsedTime, ColumnMetadata.named("min_elapsed_time").withIndex(28).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minLogicalReads, ColumnMetadata.named("min_logical_reads").withIndex(24).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minLogicalWrites, ColumnMetadata.named("min_logical_writes").withIndex(20).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minPhysicalReads, ColumnMetadata.named("min_physical_reads").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minWorkerTime, ColumnMetadata.named("min_worker_time").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(planHandle, ColumnMetadata.named("plan_handle").withIndex(6).ofType(Types.VARBINARY).withSize(64).notNull());
        addMetadata(sqlHandle, ColumnMetadata.named("sql_handle").withIndex(5).ofType(Types.VARBINARY).withSize(64).notNull());
        addMetadata(totalElapsedTime, ColumnMetadata.named("total_elapsed_time").withIndex(26).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLogicalReads, ColumnMetadata.named("total_logical_reads").withIndex(22).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLogicalWrites, ColumnMetadata.named("total_logical_writes").withIndex(18).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalPhysicalReads, ColumnMetadata.named("total_physical_reads").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalWorkerTime, ColumnMetadata.named("total_worker_time").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

