package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmResourceGovernorWorkloadGroups is a Querydsl query type for QDmResourceGovernorWorkloadGroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmResourceGovernorWorkloadGroups extends com.querydsl.sql.RelationalPathBase<QDmResourceGovernorWorkloadGroups> {

    private static final long serialVersionUID = 1154804085;

    public static final QDmResourceGovernorWorkloadGroups dmResourceGovernorWorkloadGroups = new QDmResourceGovernorWorkloadGroups("dm_resource_governor_workload_groups");

    public final NumberPath<Long> activeParallelThreadCount = createNumber("activeParallelThreadCount", Long.class);

    public final NumberPath<Integer> activeRequestCount = createNumber("activeRequestCount", Integer.class);

    public final NumberPath<Integer> blockedTaskCount = createNumber("blockedTaskCount", Integer.class);

    public final NumberPath<Integer> effectiveMaxDop = createNumber("effectiveMaxDop", Integer.class);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final NumberPath<Integer> groupMaxRequests = createNumber("groupMaxRequests", Integer.class);

    public final StringPath importance = createString("importance");

    public final NumberPath<Integer> maxDop = createNumber("maxDop", Integer.class);

    public final NumberPath<Long> maxRequestCpuTimeMs = createNumber("maxRequestCpuTimeMs", Long.class);

    public final NumberPath<Long> maxRequestGrantMemoryKb = createNumber("maxRequestGrantMemoryKb", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Integer> queuedRequestCount = createNumber("queuedRequestCount", Integer.class);

    public final NumberPath<Integer> requestMaxCpuTimeSec = createNumber("requestMaxCpuTimeSec", Integer.class);

    public final NumberPath<Integer> requestMaxMemoryGrantPercent = createNumber("requestMaxMemoryGrantPercent", Integer.class);

    public final NumberPath<Integer> requestMemoryGrantTimeoutSec = createNumber("requestMemoryGrantTimeoutSec", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statisticsStartTime = createDateTime("statisticsStartTime", java.sql.Timestamp.class);

    public final NumberPath<Long> totalCpuLimitViolationCount = createNumber("totalCpuLimitViolationCount", Long.class);

    public final NumberPath<Long> totalCpuUsageMs = createNumber("totalCpuUsageMs", Long.class);

    public final NumberPath<Long> totalLockWaitCount = createNumber("totalLockWaitCount", Long.class);

    public final NumberPath<Long> totalLockWaitTimeMs = createNumber("totalLockWaitTimeMs", Long.class);

    public final NumberPath<Long> totalQueryOptimizationCount = createNumber("totalQueryOptimizationCount", Long.class);

    public final NumberPath<Long> totalQueuedRequestCount = createNumber("totalQueuedRequestCount", Long.class);

    public final NumberPath<Long> totalReducedMemgrantCount = createNumber("totalReducedMemgrantCount", Long.class);

    public final NumberPath<Long> totalRequestCount = createNumber("totalRequestCount", Long.class);

    public final NumberPath<Long> totalSuboptimalPlanGenerationCount = createNumber("totalSuboptimalPlanGenerationCount", Long.class);

    public QDmResourceGovernorWorkloadGroups(String variable) {
        super(QDmResourceGovernorWorkloadGroups.class, forVariable(variable), "sys", "dm_resource_governor_workload_groups");
        addMetadata();
    }

    public QDmResourceGovernorWorkloadGroups(String variable, String schema, String table) {
        super(QDmResourceGovernorWorkloadGroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmResourceGovernorWorkloadGroups(Path<? extends QDmResourceGovernorWorkloadGroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_resource_governor_workload_groups");
        addMetadata();
    }

    public QDmResourceGovernorWorkloadGroups(PathMetadata metadata) {
        super(QDmResourceGovernorWorkloadGroups.class, metadata, "sys", "dm_resource_governor_workload_groups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeParallelThreadCount, ColumnMetadata.named("active_parallel_thread_count").withIndex(19).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(activeRequestCount, ColumnMetadata.named("active_request_count").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(blockedTaskCount, ColumnMetadata.named("blocked_task_count").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(effectiveMaxDop, ColumnMetadata.named("effective_max_dop").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupMaxRequests, ColumnMetadata.named("group_max_requests").withIndex(24).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(importance, ColumnMetadata.named("importance").withIndex(20).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(maxDop, ColumnMetadata.named("max_dop").withIndex(25).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxRequestCpuTimeMs, ColumnMetadata.named("max_request_cpu_time_ms").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxRequestGrantMemoryKb, ColumnMetadata.named("max_request_grant_memory_kb").withIndex(18).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(queuedRequestCount, ColumnMetadata.named("queued_request_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMaxCpuTimeSec, ColumnMetadata.named("request_max_cpu_time_sec").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMaxMemoryGrantPercent, ColumnMetadata.named("request_max_memory_grant_percent").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMemoryGrantTimeoutSec, ColumnMetadata.named("request_memory_grant_timeout_sec").withIndex(23).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statisticsStartTime, ColumnMetadata.named("statistics_start_time").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(totalCpuLimitViolationCount, ColumnMetadata.named("total_cpu_limit_violation_count").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalCpuUsageMs, ColumnMetadata.named("total_cpu_usage_ms").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLockWaitCount, ColumnMetadata.named("total_lock_wait_count").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLockWaitTimeMs, ColumnMetadata.named("total_lock_wait_time_ms").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalQueryOptimizationCount, ColumnMetadata.named("total_query_optimization_count").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalQueuedRequestCount, ColumnMetadata.named("total_queued_request_count").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalReducedMemgrantCount, ColumnMetadata.named("total_reduced_memgrant_count").withIndex(17).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalRequestCount, ColumnMetadata.named("total_request_count").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalSuboptimalPlanGenerationCount, ColumnMetadata.named("total_suboptimal_plan_generation_count").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

