package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecQueryMemoryGrants is a Querydsl query type for QDmExecQueryMemoryGrants
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecQueryMemoryGrants extends com.querydsl.sql.RelationalPathBase<QDmExecQueryMemoryGrants> {

    private static final long serialVersionUID = 134623753;

    public static final QDmExecQueryMemoryGrants dmExecQueryMemoryGrants = new QDmExecQueryMemoryGrants("dm_exec_query_memory_grants");

    public final NumberPath<Short> dop = createNumber("dop", Short.class);

    public final NumberPath<Long> grantedMemoryKb = createNumber("grantedMemoryKb", Long.class);

    public final DateTimePath<java.sql.Timestamp> grantTime = createDateTime("grantTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final NumberPath<Long> idealMemoryKb = createNumber("idealMemoryKb", Long.class);

    public final BooleanPath isNextCandidate = createBoolean("isNextCandidate");

    public final BooleanPath isSmall = createBoolean("isSmall");

    public final NumberPath<Long> maxUsedMemoryKb = createNumber("maxUsedMemoryKb", Long.class);

    public final SimplePath<byte[]> planHandle = createSimple("planHandle", byte[].class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Double> queryCost = createNumber("queryCost", Double.class);

    public final NumberPath<Short> queueId = createNumber("queueId", Short.class);

    public final NumberPath<Long> requestedMemoryKb = createNumber("requestedMemoryKb", Long.class);

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> requestTime = createDateTime("requestTime", java.sql.Timestamp.class);

    public final NumberPath<Long> requiredMemoryKb = createNumber("requiredMemoryKb", Long.class);

    public final NumberPath<Short> resourceSemaphoreId = createNumber("resourceSemaphoreId", Short.class);

    public final NumberPath<Integer> schedulerId = createNumber("schedulerId", Integer.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final SimplePath<byte[]> sqlHandle = createSimple("sqlHandle", byte[].class);

    public final NumberPath<Integer> timeoutSec = createNumber("timeoutSec", Integer.class);

    public final NumberPath<Long> usedMemoryKb = createNumber("usedMemoryKb", Long.class);

    public final NumberPath<Integer> waitOrder = createNumber("waitOrder", Integer.class);

    public final NumberPath<Long> waitTimeMs = createNumber("waitTimeMs", Long.class);

    public QDmExecQueryMemoryGrants(String variable) {
        super(QDmExecQueryMemoryGrants.class, forVariable(variable), "sys", "dm_exec_query_memory_grants");
        addMetadata();
    }

    public QDmExecQueryMemoryGrants(String variable, String schema, String table) {
        super(QDmExecQueryMemoryGrants.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecQueryMemoryGrants(Path<? extends QDmExecQueryMemoryGrants> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_query_memory_grants");
        addMetadata();
    }

    public QDmExecQueryMemoryGrants(PathMetadata metadata) {
        super(QDmExecQueryMemoryGrants.class, metadata, "sys", "dm_exec_query_memory_grants");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dop, ColumnMetadata.named("dop").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(grantedMemoryKb, ColumnMetadata.named("granted_memory_kb").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(grantTime, ColumnMetadata.named("grant_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(idealMemoryKb, ColumnMetadata.named("ideal_memory_kb").withIndex(24).ofType(Types.BIGINT).withSize(19));
        addMetadata(isNextCandidate, ColumnMetadata.named("is_next_candidate").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(isSmall, ColumnMetadata.named("is_small").withIndex(23).ofType(Types.BIT).withSize(1));
        addMetadata(maxUsedMemoryKb, ColumnMetadata.named("max_used_memory_kb").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(planHandle, ColumnMetadata.named("plan_handle").withIndex(19).ofType(Types.VARBINARY).withSize(64));
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(22).ofType(Types.INTEGER).withSize(10));
        addMetadata(queryCost, ColumnMetadata.named("query_cost").withIndex(12).ofType(Types.DOUBLE).withSize(53));
        addMetadata(queueId, ColumnMetadata.named("queue_id").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(requestedMemoryKb, ColumnMetadata.named("requested_memory_kb").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(requestTime, ColumnMetadata.named("request_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(requiredMemoryKb, ColumnMetadata.named("required_memory_kb").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(resourceSemaphoreId, ColumnMetadata.named("resource_semaphore_id").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(schedulerId, ColumnMetadata.named("scheduler_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(sqlHandle, ColumnMetadata.named("sql_handle").withIndex(20).ofType(Types.VARBINARY).withSize(64));
        addMetadata(timeoutSec, ColumnMetadata.named("timeout_sec").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(usedMemoryKb, ColumnMetadata.named("used_memory_kb").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(waitOrder, ColumnMetadata.named("wait_order").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(waitTimeMs, ColumnMetadata.named("wait_time_ms").withIndex(18).ofType(Types.BIGINT).withSize(19));
    }

}

