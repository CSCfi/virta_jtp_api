package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranLocks is a Querydsl query type for QDmTranLocks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranLocks extends com.querydsl.sql.RelationalPathBase<QDmTranLocks> {

    private static final long serialVersionUID = 203797943;

    public static final QDmTranLocks dmTranLocks = new QDmTranLocks("dm_tran_locks");

    public final SimplePath<byte[]> lockOwnerAddress = createSimple("lockOwnerAddress", byte[].class);

    public final NumberPath<Integer> requestExecContextId = createNumber("requestExecContextId", Integer.class);

    public final NumberPath<Integer> requestLifetime = createNumber("requestLifetime", Integer.class);

    public final StringPath requestMode = createString("requestMode");

    public final StringPath requestOwnerGuid = createString("requestOwnerGuid");

    public final NumberPath<Long> requestOwnerId = createNumber("requestOwnerId", Long.class);

    public final StringPath requestOwnerLockspaceId = createString("requestOwnerLockspaceId");

    public final StringPath requestOwnerType = createString("requestOwnerType");

    public final NumberPath<Short> requestReferenceCount = createNumber("requestReferenceCount", Short.class);

    public final NumberPath<Integer> requestRequestId = createNumber("requestRequestId", Integer.class);

    public final NumberPath<Integer> requestSessionId = createNumber("requestSessionId", Integer.class);

    public final StringPath requestStatus = createString("requestStatus");

    public final StringPath requestType = createString("requestType");

    public final NumberPath<Long> resourceAssociatedEntityId = createNumber("resourceAssociatedEntityId", Long.class);

    public final NumberPath<Integer> resourceDatabaseId = createNumber("resourceDatabaseId", Integer.class);

    public final StringPath resourceDescription = createString("resourceDescription");

    public final NumberPath<Integer> resourceLockPartition = createNumber("resourceLockPartition", Integer.class);

    public final StringPath resourceSubtype = createString("resourceSubtype");

    public final StringPath resourceType = createString("resourceType");

    public QDmTranLocks(String variable) {
        super(QDmTranLocks.class, forVariable(variable), "sys", "dm_tran_locks");
        addMetadata();
    }

    public QDmTranLocks(String variable, String schema, String table) {
        super(QDmTranLocks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranLocks(Path<? extends QDmTranLocks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_locks");
        addMetadata();
    }

    public QDmTranLocks(PathMetadata metadata) {
        super(QDmTranLocks.class, metadata, "sys", "dm_tran_locks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lockOwnerAddress, ColumnMetadata.named("lock_owner_address").withIndex(19).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(requestExecContextId, ColumnMetadata.named("request_exec_context_id").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestLifetime, ColumnMetadata.named("request_lifetime").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMode, ColumnMetadata.named("request_mode").withIndex(7).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(requestOwnerGuid, ColumnMetadata.named("request_owner_guid").withIndex(17).ofType(Types.CHAR).withSize(36));
        addMetadata(requestOwnerId, ColumnMetadata.named("request_owner_id").withIndex(16).ofType(Types.BIGINT).withSize(19));
        addMetadata(requestOwnerLockspaceId, ColumnMetadata.named("request_owner_lockspace_id").withIndex(18).ofType(Types.NVARCHAR).withSize(32).notNull());
        addMetadata(requestOwnerType, ColumnMetadata.named("request_owner_type").withIndex(15).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(requestReferenceCount, ColumnMetadata.named("request_reference_count").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(requestRequestId, ColumnMetadata.named("request_request_id").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestSessionId, ColumnMetadata.named("request_session_id").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestStatus, ColumnMetadata.named("request_status").withIndex(9).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(requestType, ColumnMetadata.named("request_type").withIndex(8).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(resourceAssociatedEntityId, ColumnMetadata.named("resource_associated_entity_id").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(resourceDatabaseId, ColumnMetadata.named("resource_database_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(resourceDescription, ColumnMetadata.named("resource_description").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(resourceLockPartition, ColumnMetadata.named("resource_lock_partition").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(resourceSubtype, ColumnMetadata.named("resource_subtype").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(resourceType, ColumnMetadata.named("resource_type").withIndex(1).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

