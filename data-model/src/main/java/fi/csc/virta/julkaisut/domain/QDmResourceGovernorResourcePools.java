package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmResourceGovernorResourcePools is a Querydsl query type for QDmResourceGovernorResourcePools
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmResourceGovernorResourcePools extends com.querydsl.sql.RelationalPathBase<QDmResourceGovernorResourcePools> {

    private static final long serialVersionUID = -1898053153;

    public static final QDmResourceGovernorResourcePools dmResourceGovernorResourcePools = new QDmResourceGovernorResourcePools("dm_resource_governor_resource_pools");

    public final NumberPath<Integer> activeMemgrantCount = createNumber("activeMemgrantCount", Integer.class);

    public final NumberPath<Long> activeMemgrantKb = createNumber("activeMemgrantKb", Long.class);

    public final NumberPath<Long> cacheMemoryKb = createNumber("cacheMemoryKb", Long.class);

    public final NumberPath<Integer> capCpuPercent = createNumber("capCpuPercent", Integer.class);

    public final NumberPath<Long> compileMemoryKb = createNumber("compileMemoryKb", Long.class);

    public final NumberPath<Integer> maxCpuPercent = createNumber("maxCpuPercent", Integer.class);

    public final NumberPath<Long> maxMemoryKb = createNumber("maxMemoryKb", Long.class);

    public final NumberPath<Integer> maxMemoryPercent = createNumber("maxMemoryPercent", Integer.class);

    public final NumberPath<Integer> memgrantWaiterCount = createNumber("memgrantWaiterCount", Integer.class);

    public final NumberPath<Integer> minCpuPercent = createNumber("minCpuPercent", Integer.class);

    public final NumberPath<Integer> minMemoryPercent = createNumber("minMemoryPercent", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> outOfMemoryCount = createNumber("outOfMemoryCount", Long.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> statisticsStartTime = createDateTime("statisticsStartTime", java.sql.Timestamp.class);

    public final NumberPath<Long> targetMemoryKb = createNumber("targetMemoryKb", Long.class);

    public final NumberPath<Long> totalCpuUsageMs = createNumber("totalCpuUsageMs", Long.class);

    public final NumberPath<Long> totalMemgrantCount = createNumber("totalMemgrantCount", Long.class);

    public final NumberPath<Long> totalMemgrantTimeoutCount = createNumber("totalMemgrantTimeoutCount", Long.class);

    public final NumberPath<Long> usedMemgrantKb = createNumber("usedMemgrantKb", Long.class);

    public final NumberPath<Long> usedMemoryKb = createNumber("usedMemoryKb", Long.class);

    public QDmResourceGovernorResourcePools(String variable) {
        super(QDmResourceGovernorResourcePools.class, forVariable(variable), "sys", "dm_resource_governor_resource_pools");
        addMetadata();
    }

    public QDmResourceGovernorResourcePools(String variable, String schema, String table) {
        super(QDmResourceGovernorResourcePools.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmResourceGovernorResourcePools(Path<? extends QDmResourceGovernorResourcePools> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_resource_governor_resource_pools");
        addMetadata();
    }

    public QDmResourceGovernorResourcePools(PathMetadata metadata) {
        super(QDmResourceGovernorResourcePools.class, metadata, "sys", "dm_resource_governor_resource_pools");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeMemgrantCount, ColumnMetadata.named("active_memgrant_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(activeMemgrantKb, ColumnMetadata.named("active_memgrant_kb").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(cacheMemoryKb, ColumnMetadata.named("cache_memory_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(capCpuPercent, ColumnMetadata.named("cap_cpu_percent").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(compileMemoryKb, ColumnMetadata.named("compile_memory_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxCpuPercent, ColumnMetadata.named("max_cpu_percent").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxMemoryKb, ColumnMetadata.named("max_memory_kb").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxMemoryPercent, ColumnMetadata.named("max_memory_percent").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memgrantWaiterCount, ColumnMetadata.named("memgrant_waiter_count").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minCpuPercent, ColumnMetadata.named("min_cpu_percent").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minMemoryPercent, ColumnMetadata.named("min_memory_percent").withIndex(19).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(outOfMemoryCount, ColumnMetadata.named("out_of_memory_count").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statisticsStartTime, ColumnMetadata.named("statistics_start_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(targetMemoryKb, ColumnMetadata.named("target_memory_kb").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalCpuUsageMs, ColumnMetadata.named("total_cpu_usage_ms").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalMemgrantCount, ColumnMetadata.named("total_memgrant_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalMemgrantTimeoutCount, ColumnMetadata.named("total_memgrant_timeout_count").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(usedMemgrantKb, ColumnMetadata.named("used_memgrant_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(usedMemoryKb, ColumnMetadata.named("used_memory_kb").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

