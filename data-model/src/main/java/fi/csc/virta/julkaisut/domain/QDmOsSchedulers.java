package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsSchedulers is a Querydsl query type for QDmOsSchedulers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsSchedulers extends com.querydsl.sql.RelationalPathBase<QDmOsSchedulers> {

    private static final long serialVersionUID = -1716546462;

    public static final QDmOsSchedulers dmOsSchedulers = new QDmOsSchedulers("dm_os_schedulers");

    public final SimplePath<byte[]> activeWorkerAddress = createSimple("activeWorkerAddress", byte[].class);

    public final NumberPath<Integer> activeWorkersCount = createNumber("activeWorkersCount", Integer.class);

    public final NumberPath<Integer> contextSwitchesCount = createNumber("contextSwitchesCount", Integer.class);

    public final NumberPath<Integer> cpuId = createNumber("cpuId", Integer.class);

    public final NumberPath<Integer> currentTasksCount = createNumber("currentTasksCount", Integer.class);

    public final NumberPath<Integer> currentWorkersCount = createNumber("currentWorkersCount", Integer.class);

    public final BooleanPath failedToCreateWorker = createBoolean("failedToCreateWorker");

    public final NumberPath<Integer> idleSwitchesCount = createNumber("idleSwitchesCount", Integer.class);

    public final BooleanPath isIdle = createBoolean("isIdle");

    public final BooleanPath isOnline = createBoolean("isOnline");

    public final NumberPath<Long> lastTimerActivity = createNumber("lastTimerActivity", Long.class);

    public final NumberPath<Integer> loadFactor = createNumber("loadFactor", Integer.class);

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final NumberPath<Integer> parentNodeId = createNumber("parentNodeId", Integer.class);

    public final NumberPath<Integer> pendingDiskIoCount = createNumber("pendingDiskIoCount", Integer.class);

    public final NumberPath<Integer> preemptiveSwitchesCount = createNumber("preemptiveSwitchesCount", Integer.class);

    public final NumberPath<Long> quantumLengthUs = createNumber("quantumLengthUs", Long.class);

    public final NumberPath<Integer> runnableTasksCount = createNumber("runnableTasksCount", Integer.class);

    public final SimplePath<byte[]> schedulerAddress = createSimple("schedulerAddress", byte[].class);

    public final NumberPath<Integer> schedulerId = createNumber("schedulerId", Integer.class);

    public final StringPath status = createString("status");

    public final SimplePath<byte[]> taskMemoryObjectAddress = createSimple("taskMemoryObjectAddress", byte[].class);

    public final NumberPath<Long> workQueueCount = createNumber("workQueueCount", Long.class);

    public final NumberPath<Integer> yieldCount = createNumber("yieldCount", Integer.class);

    public QDmOsSchedulers(String variable) {
        super(QDmOsSchedulers.class, forVariable(variable), "sys", "dm_os_schedulers");
        addMetadata();
    }

    public QDmOsSchedulers(String variable, String schema, String table) {
        super(QDmOsSchedulers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsSchedulers(Path<? extends QDmOsSchedulers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_schedulers");
        addMetadata();
    }

    public QDmOsSchedulers(PathMetadata metadata) {
        super(QDmOsSchedulers.class, metadata, "sys", "dm_os_schedulers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeWorkerAddress, ColumnMetadata.named("active_worker_address").withIndex(21).ofType(Types.VARBINARY).withSize(8));
        addMetadata(activeWorkersCount, ColumnMetadata.named("active_workers_count").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(contextSwitchesCount, ColumnMetadata.named("context_switches_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cpuId, ColumnMetadata.named("cpu_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(currentTasksCount, ColumnMetadata.named("current_tasks_count").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(currentWorkersCount, ColumnMetadata.named("current_workers_count").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(failedToCreateWorker, ColumnMetadata.named("failed_to_create_worker").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(idleSwitchesCount, ColumnMetadata.named("idle_switches_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isIdle, ColumnMetadata.named("is_idle").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isOnline, ColumnMetadata.named("is_online").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(lastTimerActivity, ColumnMetadata.named("last_timer_activity").withIndex(19).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(loadFactor, ColumnMetadata.named("load_factor").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(22).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(parentNodeId, ColumnMetadata.named("parent_node_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pendingDiskIoCount, ColumnMetadata.named("pending_disk_io_count").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(preemptiveSwitchesCount, ColumnMetadata.named("preemptive_switches_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(quantumLengthUs, ColumnMetadata.named("quantum_length_us").withIndex(24).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(runnableTasksCount, ColumnMetadata.named("runnable_tasks_count").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(schedulerAddress, ColumnMetadata.named("scheduler_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(schedulerId, ColumnMetadata.named("scheduler_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(taskMemoryObjectAddress, ColumnMetadata.named("task_memory_object_address").withIndex(23).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(workQueueCount, ColumnMetadata.named("work_queue_count").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(yieldCount, ColumnMetadata.named("yield_count").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

