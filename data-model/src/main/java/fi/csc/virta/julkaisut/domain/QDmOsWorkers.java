package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsWorkers is a Querydsl query type for QDmOsWorkers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsWorkers extends com.querydsl.sql.RelationalPathBase<QDmOsWorkers> {

    private static final long serialVersionUID = -2122517589;

    public static final QDmOsWorkers dmOsWorkers = new QDmOsWorkers("dm_os_workers");

    public final NumberPath<Long> affinity = createNumber("affinity", Long.class);

    public final NumberPath<Integer> boostCount = createNumber("boostCount", Integer.class);

    public final NumberPath<Integer> contextSwitchCount = createNumber("contextSwitchCount", Integer.class);

    public final NumberPath<Long> endQuantum = createNumber("endQuantum", Long.class);

    public final SimplePath<byte[]> exceptionAddress = createSimple("exceptionAddress", byte[].class);

    public final NumberPath<Integer> exceptionNum = createNumber("exceptionNum", Integer.class);

    public final NumberPath<Integer> exceptionSeverity = createNumber("exceptionSeverity", Integer.class);

    public final SimplePath<byte[]> fiberAddress = createSimple("fiberAddress", byte[].class);

    public final BooleanPath isFatalException = createBoolean("isFatalException");

    public final BooleanPath isFiber = createBoolean("isFiber");

    public final BooleanPath isInCcException = createBoolean("isInCcException");

    public final BooleanPath isInPollingIoCompletionRoutine = createBoolean("isInPollingIoCompletionRoutine");

    public final BooleanPath isInsideCatch = createBoolean("isInsideCatch");

    public final BooleanPath isPreemptive = createBoolean("isPreemptive");

    public final BooleanPath isSick = createBoolean("isSick");

    public final StringPath lastWaitType = createString("lastWaitType");

    public final NumberPath<Long> maxQuantum = createNumber("maxQuantum", Long.class);

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final NumberPath<Integer> pendingIoByteAverage = createNumber("pendingIoByteAverage", Integer.class);

    public final NumberPath<Long> pendingIoByteCount = createNumber("pendingIoByteCount", Long.class);

    public final NumberPath<Integer> pendingIoCount = createNumber("pendingIoCount", Integer.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final NumberPath<Long> quantumUsed = createNumber("quantumUsed", Long.class);

    public final NumberPath<Integer> returnCode = createNumber("returnCode", Integer.class);

    public final SimplePath<byte[]> schedulerAddress = createSimple("schedulerAddress", byte[].class);

    public final SimplePath<byte[]> signalWorkerAddress = createSimple("signalWorkerAddress", byte[].class);

    public final NumberPath<Long> startQuantum = createNumber("startQuantum", Long.class);

    public final StringPath state = createString("state");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final NumberPath<Long> taskBoundMsTicks = createNumber("taskBoundMsTicks", Long.class);

    public final NumberPath<Integer> tasksProcessedCount = createNumber("tasksProcessedCount", Integer.class);

    public final SimplePath<byte[]> threadAddress = createSimple("threadAddress", byte[].class);

    public final NumberPath<Long> waitResumedMsTicks = createNumber("waitResumedMsTicks", Long.class);

    public final NumberPath<Long> waitStartedMsTicks = createNumber("waitStartedMsTicks", Long.class);

    public final SimplePath<byte[]> workerAddress = createSimple("workerAddress", byte[].class);

    public final NumberPath<Long> workerCreatedMsTicks = createNumber("workerCreatedMsTicks", Long.class);

    public QDmOsWorkers(String variable) {
        super(QDmOsWorkers.class, forVariable(variable), "sys", "dm_os_workers");
        addMetadata();
    }

    public QDmOsWorkers(String variable, String schema, String table) {
        super(QDmOsWorkers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsWorkers(Path<? extends QDmOsWorkers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_workers");
        addMetadata();
    }

    public QDmOsWorkers(PathMetadata metadata) {
        super(QDmOsWorkers.class, metadata, "sys", "dm_os_workers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affinity, ColumnMetadata.named("affinity").withIndex(21).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(boostCount, ColumnMetadata.named("boost_count").withIndex(29).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(contextSwitchCount, ColumnMetadata.named("context_switch_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(endQuantum, ColumnMetadata.named("end_quantum").withIndex(24).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(exceptionAddress, ColumnMetadata.named("exception_address").withIndex(20).ofType(Types.VARBINARY).withSize(8));
        addMetadata(exceptionNum, ColumnMetadata.named("exception_num").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(exceptionSeverity, ColumnMetadata.named("exception_severity").withIndex(19).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fiberAddress, ColumnMetadata.named("fiber_address").withIndex(31).ofType(Types.VARBINARY).withSize(8));
        addMetadata(isFatalException, ColumnMetadata.named("is_fatal_exception").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isFiber, ColumnMetadata.named("is_fiber").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(isInCcException, ColumnMetadata.named("is_in_cc_exception").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isInPollingIoCompletionRoutine, ColumnMetadata.named("is_in_polling_io_completion_routine").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(isInsideCatch, ColumnMetadata.named("is_inside_catch").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(isPreemptive, ColumnMetadata.named("is_preemptive").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(isSick, ColumnMetadata.named("is_sick").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(lastWaitType, ColumnMetadata.named("last_wait_type").withIndex(25).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(maxQuantum, ColumnMetadata.named("max_quantum").withIndex(28).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(33).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(pendingIoByteAverage, ColumnMetadata.named("pending_io_byte_average").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pendingIoByteCount, ColumnMetadata.named("pending_io_byte_count").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pendingIoCount, ColumnMetadata.named("pending_io_count").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(37).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(quantumUsed, ColumnMetadata.named("quantum_used").withIndex(27).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(returnCode, ColumnMetadata.named("return_code").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(schedulerAddress, ColumnMetadata.named("scheduler_address").withIndex(36).ofType(Types.VARBINARY).withSize(8));
        addMetadata(signalWorkerAddress, ColumnMetadata.named("signal_worker_address").withIndex(35).ofType(Types.VARBINARY).withSize(8));
        addMetadata(startQuantum, ColumnMetadata.named("start_quantum").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(22).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(32).ofType(Types.VARBINARY).withSize(8));
        addMetadata(taskBoundMsTicks, ColumnMetadata.named("task_bound_ms_ticks").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(tasksProcessedCount, ColumnMetadata.named("tasks_processed_count").withIndex(30).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(threadAddress, ColumnMetadata.named("thread_address").withIndex(34).ofType(Types.VARBINARY).withSize(8));
        addMetadata(waitResumedMsTicks, ColumnMetadata.named("wait_resumed_ms_ticks").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(waitStartedMsTicks, ColumnMetadata.named("wait_started_ms_ticks").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(workerAddress, ColumnMetadata.named("worker_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(workerCreatedMsTicks, ColumnMetadata.named("worker_created_ms_ticks").withIndex(17).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

