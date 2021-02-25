package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsWaitingTasks is a Querydsl query type for QDmOsWaitingTasks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsWaitingTasks extends com.querydsl.sql.RelationalPathBase<QDmOsWaitingTasks> {

    private static final long serialVersionUID = 285208587;

    public static final QDmOsWaitingTasks dmOsWaitingTasks = new QDmOsWaitingTasks("dm_os_waiting_tasks");

    public final NumberPath<Integer> blockingExecContextId = createNumber("blockingExecContextId", Integer.class);

    public final NumberPath<Short> blockingSessionId = createNumber("blockingSessionId", Short.class);

    public final SimplePath<byte[]> blockingTaskAddress = createSimple("blockingTaskAddress", byte[].class);

    public final NumberPath<Integer> execContextId = createNumber("execContextId", Integer.class);

    public final SimplePath<byte[]> resourceAddress = createSimple("resourceAddress", byte[].class);

    public final StringPath resourceDescription = createString("resourceDescription");

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final NumberPath<Long> waitDurationMs = createNumber("waitDurationMs", Long.class);

    public final SimplePath<byte[]> waitingTaskAddress = createSimple("waitingTaskAddress", byte[].class);

    public final StringPath waitType = createString("waitType");

    public QDmOsWaitingTasks(String variable) {
        super(QDmOsWaitingTasks.class, forVariable(variable), "sys", "dm_os_waiting_tasks");
        addMetadata();
    }

    public QDmOsWaitingTasks(String variable, String schema, String table) {
        super(QDmOsWaitingTasks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsWaitingTasks(Path<? extends QDmOsWaitingTasks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_waiting_tasks");
        addMetadata();
    }

    public QDmOsWaitingTasks(PathMetadata metadata) {
        super(QDmOsWaitingTasks.class, metadata, "sys", "dm_os_waiting_tasks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blockingExecContextId, ColumnMetadata.named("blocking_exec_context_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(blockingSessionId, ColumnMetadata.named("blocking_session_id").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(blockingTaskAddress, ColumnMetadata.named("blocking_task_address").withIndex(7).ofType(Types.VARBINARY).withSize(8));
        addMetadata(execContextId, ColumnMetadata.named("exec_context_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(resourceAddress, ColumnMetadata.named("resource_address").withIndex(6).ofType(Types.VARBINARY).withSize(8));
        addMetadata(resourceDescription, ColumnMetadata.named("resource_description").withIndex(10).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(waitDurationMs, ColumnMetadata.named("wait_duration_ms").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(waitingTaskAddress, ColumnMetadata.named("waiting_task_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(waitType, ColumnMetadata.named("wait_type").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
    }

}

