package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsTasks is a Querydsl query type for QDmOsTasks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsTasks extends com.querydsl.sql.RelationalPathBase<QDmOsTasks> {

    private static final long serialVersionUID = -1355114492;

    public static final QDmOsTasks dmOsTasks = new QDmOsTasks("dm_os_tasks");

    public final NumberPath<Integer> contextSwitchesCount = createNumber("contextSwitchesCount", Integer.class);

    public final NumberPath<Integer> execContextId = createNumber("execContextId", Integer.class);

    public final SimplePath<byte[]> hostAddress = createSimple("hostAddress", byte[].class);

    public final SimplePath<byte[]> parentTaskAddress = createSimple("parentTaskAddress", byte[].class);

    public final NumberPath<Integer> pendingIoByteAverage = createNumber("pendingIoByteAverage", Integer.class);

    public final NumberPath<Long> pendingIoByteCount = createNumber("pendingIoByteCount", Long.class);

    public final NumberPath<Integer> pendingIoCount = createNumber("pendingIoCount", Integer.class);

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final NumberPath<Integer> schedulerId = createNumber("schedulerId", Integer.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final StringPath taskState = createString("taskState");

    public final SimplePath<byte[]> workerAddress = createSimple("workerAddress", byte[].class);

    public QDmOsTasks(String variable) {
        super(QDmOsTasks.class, forVariable(variable), "sys", "dm_os_tasks");
        addMetadata();
    }

    public QDmOsTasks(String variable, String schema, String table) {
        super(QDmOsTasks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsTasks(Path<? extends QDmOsTasks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_tasks");
        addMetadata();
    }

    public QDmOsTasks(PathMetadata metadata) {
        super(QDmOsTasks.class, metadata, "sys", "dm_os_tasks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(contextSwitchesCount, ColumnMetadata.named("context_switches_count").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(execContextId, ColumnMetadata.named("exec_context_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(hostAddress, ColumnMetadata.named("host_address").withIndex(12).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(parentTaskAddress, ColumnMetadata.named("parent_task_address").withIndex(13).ofType(Types.VARBINARY).withSize(8));
        addMetadata(pendingIoByteAverage, ColumnMetadata.named("pending_io_byte_average").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(pendingIoByteCount, ColumnMetadata.named("pending_io_byte_count").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(pendingIoCount, ColumnMetadata.named("pending_io_count").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(schedulerId, ColumnMetadata.named("scheduler_id").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(taskState, ColumnMetadata.named("task_state").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(workerAddress, ColumnMetadata.named("worker_address").withIndex(11).ofType(Types.VARBINARY).withSize(8));
    }

}

