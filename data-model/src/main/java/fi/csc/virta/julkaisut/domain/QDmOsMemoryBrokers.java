package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryBrokers is a Querydsl query type for QDmOsMemoryBrokers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryBrokers extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryBrokers> {

    private static final long serialVersionUID = -1500827153;

    public static final QDmOsMemoryBrokers dmOsMemoryBrokers = new QDmOsMemoryBrokers("dm_os_memory_brokers");

    public final NumberPath<Long> allocationsKb = createNumber("allocationsKb", Long.class);

    public final NumberPath<Long> allocationsKbPerSec = createNumber("allocationsKbPerSec", Long.class);

    public final NumberPath<Long> futureAllocationsKb = createNumber("futureAllocationsKb", Long.class);

    public final StringPath lastNotification = createString("lastNotification");

    public final StringPath memoryBrokerType = createString("memoryBrokerType");

    public final NumberPath<Long> overallLimitKb = createNumber("overallLimitKb", Long.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Long> predictedAllocationsKb = createNumber("predictedAllocationsKb", Long.class);

    public final NumberPath<Long> targetAllocationsKb = createNumber("targetAllocationsKb", Long.class);

    public QDmOsMemoryBrokers(String variable) {
        super(QDmOsMemoryBrokers.class, forVariable(variable), "sys", "dm_os_memory_brokers");
        addMetadata();
    }

    public QDmOsMemoryBrokers(String variable, String schema, String table) {
        super(QDmOsMemoryBrokers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryBrokers(Path<? extends QDmOsMemoryBrokers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_brokers");
        addMetadata();
    }

    public QDmOsMemoryBrokers(PathMetadata metadata) {
        super(QDmOsMemoryBrokers.class, metadata, "sys", "dm_os_memory_brokers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocationsKb, ColumnMetadata.named("allocations_kb").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(allocationsKbPerSec, ColumnMetadata.named("allocations_kb_per_sec").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(futureAllocationsKb, ColumnMetadata.named("future_allocations_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastNotification, ColumnMetadata.named("last_notification").withIndex(9).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(memoryBrokerType, ColumnMetadata.named("memory_broker_type").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(overallLimitKb, ColumnMetadata.named("overall_limit_kb").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(predictedAllocationsKb, ColumnMetadata.named("predicted_allocations_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(targetAllocationsKb, ColumnMetadata.named("target_allocations_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

