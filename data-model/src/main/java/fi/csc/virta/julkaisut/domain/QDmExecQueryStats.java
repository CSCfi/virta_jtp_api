package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecQueryStats is a Querydsl query type for QDmExecQueryStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecQueryStats extends com.querydsl.sql.RelationalPathBase<QDmExecQueryStats> {

    private static final long serialVersionUID = 2089628398;

    public static final QDmExecQueryStats dmExecQueryStats = new QDmExecQueryStats("dm_exec_query_stats");

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creationTime", java.sql.Timestamp.class);

    public final NumberPath<Long> executionCount = createNumber("executionCount", Long.class);

    public final NumberPath<Long> lastClrTime = createNumber("lastClrTime", Long.class);

    public final NumberPath<Long> lastDop = createNumber("lastDop", Long.class);

    public final NumberPath<Long> lastElapsedTime = createNumber("lastElapsedTime", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastExecutionTime = createDateTime("lastExecutionTime", java.sql.Timestamp.class);

    public final NumberPath<Long> lastGrantKb = createNumber("lastGrantKb", Long.class);

    public final NumberPath<Long> lastIdealGrantKb = createNumber("lastIdealGrantKb", Long.class);

    public final NumberPath<Long> lastLogicalReads = createNumber("lastLogicalReads", Long.class);

    public final NumberPath<Long> lastLogicalWrites = createNumber("lastLogicalWrites", Long.class);

    public final NumberPath<Long> lastPhysicalReads = createNumber("lastPhysicalReads", Long.class);

    public final NumberPath<Long> lastReservedThreads = createNumber("lastReservedThreads", Long.class);

    public final NumberPath<Long> lastRows = createNumber("lastRows", Long.class);

    public final NumberPath<Long> lastUsedGrantKb = createNumber("lastUsedGrantKb", Long.class);

    public final NumberPath<Long> lastUsedThreads = createNumber("lastUsedThreads", Long.class);

    public final NumberPath<Long> lastWorkerTime = createNumber("lastWorkerTime", Long.class);

    public final NumberPath<Long> maxClrTime = createNumber("maxClrTime", Long.class);

    public final NumberPath<Long> maxDop = createNumber("maxDop", Long.class);

    public final NumberPath<Long> maxElapsedTime = createNumber("maxElapsedTime", Long.class);

    public final NumberPath<Long> maxGrantKb = createNumber("maxGrantKb", Long.class);

    public final NumberPath<Long> maxIdealGrantKb = createNumber("maxIdealGrantKb", Long.class);

    public final NumberPath<Long> maxLogicalReads = createNumber("maxLogicalReads", Long.class);

    public final NumberPath<Long> maxLogicalWrites = createNumber("maxLogicalWrites", Long.class);

    public final NumberPath<Long> maxPhysicalReads = createNumber("maxPhysicalReads", Long.class);

    public final NumberPath<Long> maxReservedThreads = createNumber("maxReservedThreads", Long.class);

    public final NumberPath<Long> maxRows = createNumber("maxRows", Long.class);

    public final NumberPath<Long> maxUsedGrantKb = createNumber("maxUsedGrantKb", Long.class);

    public final NumberPath<Long> maxUsedThreads = createNumber("maxUsedThreads", Long.class);

    public final NumberPath<Long> maxWorkerTime = createNumber("maxWorkerTime", Long.class);

    public final NumberPath<Long> minClrTime = createNumber("minClrTime", Long.class);

    public final NumberPath<Long> minDop = createNumber("minDop", Long.class);

    public final NumberPath<Long> minElapsedTime = createNumber("minElapsedTime", Long.class);

    public final NumberPath<Long> minGrantKb = createNumber("minGrantKb", Long.class);

    public final NumberPath<Long> minIdealGrantKb = createNumber("minIdealGrantKb", Long.class);

    public final NumberPath<Long> minLogicalReads = createNumber("minLogicalReads", Long.class);

    public final NumberPath<Long> minLogicalWrites = createNumber("minLogicalWrites", Long.class);

    public final NumberPath<Long> minPhysicalReads = createNumber("minPhysicalReads", Long.class);

    public final NumberPath<Long> minReservedThreads = createNumber("minReservedThreads", Long.class);

    public final NumberPath<Long> minRows = createNumber("minRows", Long.class);

    public final NumberPath<Long> minUsedGrantKb = createNumber("minUsedGrantKb", Long.class);

    public final NumberPath<Long> minUsedThreads = createNumber("minUsedThreads", Long.class);

    public final NumberPath<Long> minWorkerTime = createNumber("minWorkerTime", Long.class);

    public final NumberPath<Long> planGenerationNum = createNumber("planGenerationNum", Long.class);

    public final SimplePath<byte[]> planHandle = createSimple("planHandle", byte[].class);

    public final SimplePath<byte[]> queryHash = createSimple("queryHash", byte[].class);

    public final SimplePath<byte[]> queryPlanHash = createSimple("queryPlanHash", byte[].class);

    public final SimplePath<byte[]> sqlHandle = createSimple("sqlHandle", byte[].class);

    public final NumberPath<Integer> statementEndOffset = createNumber("statementEndOffset", Integer.class);

    public final NumberPath<Integer> statementStartOffset = createNumber("statementStartOffset", Integer.class);

    public final NumberPath<Long> totalClrTime = createNumber("totalClrTime", Long.class);

    public final NumberPath<Long> totalDop = createNumber("totalDop", Long.class);

    public final NumberPath<Long> totalElapsedTime = createNumber("totalElapsedTime", Long.class);

    public final NumberPath<Long> totalGrantKb = createNumber("totalGrantKb", Long.class);

    public final NumberPath<Long> totalIdealGrantKb = createNumber("totalIdealGrantKb", Long.class);

    public final NumberPath<Long> totalLogicalReads = createNumber("totalLogicalReads", Long.class);

    public final NumberPath<Long> totalLogicalWrites = createNumber("totalLogicalWrites", Long.class);

    public final NumberPath<Long> totalPhysicalReads = createNumber("totalPhysicalReads", Long.class);

    public final NumberPath<Long> totalReservedThreads = createNumber("totalReservedThreads", Long.class);

    public final NumberPath<Long> totalRows = createNumber("totalRows", Long.class);

    public final NumberPath<Long> totalUsedGrantKb = createNumber("totalUsedGrantKb", Long.class);

    public final NumberPath<Long> totalUsedThreads = createNumber("totalUsedThreads", Long.class);

    public final NumberPath<Long> totalWorkerTime = createNumber("totalWorkerTime", Long.class);

    public QDmExecQueryStats(String variable) {
        super(QDmExecQueryStats.class, forVariable(variable), "sys", "dm_exec_query_stats");
        addMetadata();
    }

    public QDmExecQueryStats(String variable, String schema, String table) {
        super(QDmExecQueryStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecQueryStats(Path<? extends QDmExecQueryStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_query_stats");
        addMetadata();
    }

    public QDmExecQueryStats(PathMetadata metadata) {
        super(QDmExecQueryStats.class, metadata, "sys", "dm_exec_query_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(executionCount, ColumnMetadata.named("execution_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastClrTime, ColumnMetadata.named("last_clr_time").withIndex(26).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastDop, ColumnMetadata.named("last_dop").withIndex(40).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastElapsedTime, ColumnMetadata.named("last_elapsed_time").withIndex(30).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastExecutionTime, ColumnMetadata.named("last_execution_time").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastGrantKb, ColumnMetadata.named("last_grant_kb").withIndex(44).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastIdealGrantKb, ColumnMetadata.named("last_ideal_grant_kb").withIndex(52).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastLogicalReads, ColumnMetadata.named("last_logical_reads").withIndex(22).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastLogicalWrites, ColumnMetadata.named("last_logical_writes").withIndex(18).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastPhysicalReads, ColumnMetadata.named("last_physical_reads").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastReservedThreads, ColumnMetadata.named("last_reserved_threads").withIndex(56).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastRows, ColumnMetadata.named("last_rows").withIndex(36).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastUsedGrantKb, ColumnMetadata.named("last_used_grant_kb").withIndex(48).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastUsedThreads, ColumnMetadata.named("last_used_threads").withIndex(60).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastWorkerTime, ColumnMetadata.named("last_worker_time").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxClrTime, ColumnMetadata.named("max_clr_time").withIndex(28).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxDop, ColumnMetadata.named("max_dop").withIndex(42).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxElapsedTime, ColumnMetadata.named("max_elapsed_time").withIndex(32).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxGrantKb, ColumnMetadata.named("max_grant_kb").withIndex(46).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxIdealGrantKb, ColumnMetadata.named("max_ideal_grant_kb").withIndex(54).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxLogicalReads, ColumnMetadata.named("max_logical_reads").withIndex(24).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxLogicalWrites, ColumnMetadata.named("max_logical_writes").withIndex(20).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxPhysicalReads, ColumnMetadata.named("max_physical_reads").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxReservedThreads, ColumnMetadata.named("max_reserved_threads").withIndex(58).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxRows, ColumnMetadata.named("max_rows").withIndex(38).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxUsedGrantKb, ColumnMetadata.named("max_used_grant_kb").withIndex(50).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxUsedThreads, ColumnMetadata.named("max_used_threads").withIndex(62).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxWorkerTime, ColumnMetadata.named("max_worker_time").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minClrTime, ColumnMetadata.named("min_clr_time").withIndex(27).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minDop, ColumnMetadata.named("min_dop").withIndex(41).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minElapsedTime, ColumnMetadata.named("min_elapsed_time").withIndex(31).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minGrantKb, ColumnMetadata.named("min_grant_kb").withIndex(45).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minIdealGrantKb, ColumnMetadata.named("min_ideal_grant_kb").withIndex(53).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minLogicalReads, ColumnMetadata.named("min_logical_reads").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minLogicalWrites, ColumnMetadata.named("min_logical_writes").withIndex(19).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minPhysicalReads, ColumnMetadata.named("min_physical_reads").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minReservedThreads, ColumnMetadata.named("min_reserved_threads").withIndex(57).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minRows, ColumnMetadata.named("min_rows").withIndex(37).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minUsedGrantKb, ColumnMetadata.named("min_used_grant_kb").withIndex(49).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minUsedThreads, ColumnMetadata.named("min_used_threads").withIndex(61).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(minWorkerTime, ColumnMetadata.named("min_worker_time").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(planGenerationNum, ColumnMetadata.named("plan_generation_num").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(planHandle, ColumnMetadata.named("plan_handle").withIndex(5).ofType(Types.VARBINARY).withSize(64).notNull());
        addMetadata(queryHash, ColumnMetadata.named("query_hash").withIndex(33).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(queryPlanHash, ColumnMetadata.named("query_plan_hash").withIndex(34).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(sqlHandle, ColumnMetadata.named("sql_handle").withIndex(1).ofType(Types.VARBINARY).withSize(64).notNull());
        addMetadata(statementEndOffset, ColumnMetadata.named("statement_end_offset").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statementStartOffset, ColumnMetadata.named("statement_start_offset").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(totalClrTime, ColumnMetadata.named("total_clr_time").withIndex(25).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalDop, ColumnMetadata.named("total_dop").withIndex(39).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalElapsedTime, ColumnMetadata.named("total_elapsed_time").withIndex(29).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalGrantKb, ColumnMetadata.named("total_grant_kb").withIndex(43).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalIdealGrantKb, ColumnMetadata.named("total_ideal_grant_kb").withIndex(51).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLogicalReads, ColumnMetadata.named("total_logical_reads").withIndex(21).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLogicalWrites, ColumnMetadata.named("total_logical_writes").withIndex(17).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalPhysicalReads, ColumnMetadata.named("total_physical_reads").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalReservedThreads, ColumnMetadata.named("total_reserved_threads").withIndex(55).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalRows, ColumnMetadata.named("total_rows").withIndex(35).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalUsedGrantKb, ColumnMetadata.named("total_used_grant_kb").withIndex(47).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalUsedThreads, ColumnMetadata.named("total_used_threads").withIndex(59).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalWorkerTime, ColumnMetadata.named("total_worker_time").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

