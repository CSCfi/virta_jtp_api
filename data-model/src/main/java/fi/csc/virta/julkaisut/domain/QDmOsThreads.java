package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsThreads is a Querydsl query type for QDmOsThreads
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsThreads extends com.querydsl.sql.RelationalPathBase<QDmOsThreads> {

    private static final long serialVersionUID = -690648417;

    public static final QDmOsThreads dmOsThreads = new QDmOsThreads("dm_os_threads");

    public final NumberPath<Long> affinity = createNumber("affinity", Long.class);

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creationTime", java.sql.Timestamp.class);

    public final SimplePath<byte[]> eventHandle = createSimple("eventHandle", byte[].class);

    public final SimplePath<byte[]> fiberContextAddress = createSimple("fiberContextAddress", byte[].class);

    public final SimplePath<byte[]> fiberData = createSimple("fiberData", byte[].class);

    public final SimplePath<byte[]> instructionAddress = createSimple("instructionAddress", byte[].class);

    public final NumberPath<Integer> isImpersonating = createNumber("isImpersonating", Integer.class);

    public final NumberPath<Integer> isWaitingOnLoaderLock = createNumber("isWaitingOnLoaderLock", Integer.class);

    public final NumberPath<Long> kernelTime = createNumber("kernelTime", Long.class);

    public final NumberPath<Integer> locale = createNumber("locale", Integer.class);

    public final NumberPath<Integer> osThreadId = createNumber("osThreadId", Integer.class);

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final SimplePath<byte[]> schedulerAddress = createSimple("schedulerAddress", byte[].class);

    public final SimplePath<byte[]> selfAddress = createSimple("selfAddress", byte[].class);

    public final SimplePath<byte[]> stackBaseAddress = createSimple("stackBaseAddress", byte[].class);

    public final NumberPath<Integer> stackBytesCommitted = createNumber("stackBytesCommitted", Integer.class);

    public final NumberPath<Integer> stackBytesUsed = createNumber("stackBytesUsed", Integer.class);

    public final SimplePath<byte[]> stackEndAddress = createSimple("stackEndAddress", byte[].class);

    public final BooleanPath startedBySqlservr = createBoolean("startedBySqlservr");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final SimplePath<byte[]> threadAddress = createSimple("threadAddress", byte[].class);

    public final SimplePath<byte[]> threadHandle = createSimple("threadHandle", byte[].class);

    public final SimplePath<byte[]> token = createSimple("token", byte[].class);

    public final NumberPath<Long> usermodeTime = createNumber("usermodeTime", Long.class);

    public final SimplePath<byte[]> workerAddress = createSimple("workerAddress", byte[].class);

    public QDmOsThreads(String variable) {
        super(QDmOsThreads.class, forVariable(variable), "sys", "dm_os_threads");
        addMetadata();
    }

    public QDmOsThreads(String variable, String schema, String table) {
        super(QDmOsThreads.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsThreads(Path<? extends QDmOsThreads> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_threads");
        addMetadata();
    }

    public QDmOsThreads(PathMetadata metadata) {
        super(QDmOsThreads.class, metadata, "sys", "dm_os_threads");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affinity, ColumnMetadata.named("affinity").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(eventHandle, ColumnMetadata.named("event_handle").withIndex(21).ofType(Types.VARBINARY).withSize(8));
        addMetadata(fiberContextAddress, ColumnMetadata.named("fiber_context_address").withIndex(24).ofType(Types.VARBINARY).withSize(8));
        addMetadata(fiberData, ColumnMetadata.named("fiber_data").withIndex(19).ofType(Types.VARBINARY).withSize(8));
        addMetadata(instructionAddress, ColumnMetadata.named("instruction_address").withIndex(5).ofType(Types.VARBINARY).withSize(8));
        addMetadata(isImpersonating, ColumnMetadata.named("is_impersonating").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isWaitingOnLoaderLock, ColumnMetadata.named("is_waiting_on_loader_lock").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(kernelTime, ColumnMetadata.named("kernel_time").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(locale, ColumnMetadata.named("locale").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(osThreadId, ColumnMetadata.named("os_thread_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(26).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(schedulerAddress, ColumnMetadata.named("scheduler_address").withIndex(22).ofType(Types.VARBINARY).withSize(8));
        addMetadata(selfAddress, ColumnMetadata.named("self_address").withIndex(25).ofType(Types.VARBINARY).withSize(8));
        addMetadata(stackBaseAddress, ColumnMetadata.named("stack_base_address").withIndex(9).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(stackBytesCommitted, ColumnMetadata.named("stack_bytes_committed").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stackBytesUsed, ColumnMetadata.named("stack_bytes_used").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(stackEndAddress, ColumnMetadata.named("stack_end_address").withIndex(10).ofType(Types.VARBINARY).withSize(8));
        addMetadata(startedBySqlservr, ColumnMetadata.named("started_by_sqlservr").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(threadAddress, ColumnMetadata.named("thread_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(threadHandle, ColumnMetadata.named("thread_handle").withIndex(20).ofType(Types.VARBINARY).withSize(8));
        addMetadata(token, ColumnMetadata.named("token").withIndex(16).ofType(Types.VARBINARY).withSize(8));
        addMetadata(usermodeTime, ColumnMetadata.named("usermode_time").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(workerAddress, ColumnMetadata.named("worker_address").withIndex(23).ofType(Types.VARBINARY).withSize(8));
    }

}

