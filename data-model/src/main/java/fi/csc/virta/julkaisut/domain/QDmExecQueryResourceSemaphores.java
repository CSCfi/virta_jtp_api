package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecQueryResourceSemaphores is a Querydsl query type for QDmExecQueryResourceSemaphores
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecQueryResourceSemaphores extends com.querydsl.sql.RelationalPathBase<QDmExecQueryResourceSemaphores> {

    private static final long serialVersionUID = 1787992942;

    public static final QDmExecQueryResourceSemaphores dmExecQueryResourceSemaphores = new QDmExecQueryResourceSemaphores("dm_exec_query_resource_semaphores");

    public final NumberPath<Long> availableMemoryKb = createNumber("availableMemoryKb", Long.class);

    public final NumberPath<Long> forcedGrantCount = createNumber("forcedGrantCount", Long.class);

    public final NumberPath<Long> grantedMemoryKb = createNumber("grantedMemoryKb", Long.class);

    public final NumberPath<Integer> granteeCount = createNumber("granteeCount", Integer.class);

    public final NumberPath<Long> maxTargetMemoryKb = createNumber("maxTargetMemoryKb", Long.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Short> resourceSemaphoreId = createNumber("resourceSemaphoreId", Short.class);

    public final NumberPath<Long> targetMemoryKb = createNumber("targetMemoryKb", Long.class);

    public final NumberPath<Long> timeoutErrorCount = createNumber("timeoutErrorCount", Long.class);

    public final NumberPath<Long> totalMemoryKb = createNumber("totalMemoryKb", Long.class);

    public final NumberPath<Long> usedMemoryKb = createNumber("usedMemoryKb", Long.class);

    public final NumberPath<Integer> waiterCount = createNumber("waiterCount", Integer.class);

    public QDmExecQueryResourceSemaphores(String variable) {
        super(QDmExecQueryResourceSemaphores.class, forVariable(variable), "sys", "dm_exec_query_resource_semaphores");
        addMetadata();
    }

    public QDmExecQueryResourceSemaphores(String variable, String schema, String table) {
        super(QDmExecQueryResourceSemaphores.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecQueryResourceSemaphores(Path<? extends QDmExecQueryResourceSemaphores> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_query_resource_semaphores");
        addMetadata();
    }

    public QDmExecQueryResourceSemaphores(PathMetadata metadata) {
        super(QDmExecQueryResourceSemaphores.class, metadata, "sys", "dm_exec_query_resource_semaphores");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(availableMemoryKb, ColumnMetadata.named("available_memory_kb").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(forcedGrantCount, ColumnMetadata.named("forced_grant_count").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(grantedMemoryKb, ColumnMetadata.named("granted_memory_kb").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(granteeCount, ColumnMetadata.named("grantee_count").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxTargetMemoryKb, ColumnMetadata.named("max_target_memory_kb").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(resourceSemaphoreId, ColumnMetadata.named("resource_semaphore_id").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(targetMemoryKb, ColumnMetadata.named("target_memory_kb").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(timeoutErrorCount, ColumnMetadata.named("timeout_error_count").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalMemoryKb, ColumnMetadata.named("total_memory_kb").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(usedMemoryKb, ColumnMetadata.named("used_memory_kb").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(waiterCount, ColumnMetadata.named("waiter_count").withIndex(9).ofType(Types.INTEGER).withSize(10));
    }

}

