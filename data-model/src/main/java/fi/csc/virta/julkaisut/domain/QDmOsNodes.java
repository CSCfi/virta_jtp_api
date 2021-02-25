package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsNodes is a Querydsl query type for QDmOsNodes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsNodes extends com.querydsl.sql.RelationalPathBase<QDmOsNodes> {

    private static final long serialVersionUID = -1360253145;

    public static final QDmOsNodes dmOsNodes = new QDmOsNodes("dm_os_nodes");

    public final NumberPath<Integer> activeWorkerCount = createNumber("activeWorkerCount", Integer.class);

    public final NumberPath<Integer> avgLoadBalance = createNumber("avgLoadBalance", Integer.class);

    public final NumberPath<Long> cpuAffinityMask = createNumber("cpuAffinityMask", Long.class);

    public final NumberPath<Short> idleSchedulerCount = createNumber("idleSchedulerCount", Short.class);

    public final SimplePath<byte[]> ioCompletionWorkerAddress = createSimple("ioCompletionWorkerAddress", byte[].class);

    public final SimplePath<byte[]> memoryClerkAddress = createSimple("memoryClerkAddress", byte[].class);

    public final NumberPath<Short> memoryNodeId = createNumber("memoryNodeId", Short.class);

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final NumberPath<Short> nodeId = createNumber("nodeId", Short.class);

    public final StringPath nodeStateDesc = createString("nodeStateDesc");

    public final NumberPath<Short> onlineSchedulerCount = createNumber("onlineSchedulerCount", Short.class);

    public final NumberPath<Long> onlineSchedulerMask = createNumber("onlineSchedulerMask", Long.class);

    public final NumberPath<Long> permanentTaskAffinityMask = createNumber("permanentTaskAffinityMask", Long.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final BooleanPath resourceMonitorState = createBoolean("resourceMonitorState");

    public final NumberPath<Long> timerTaskAffinityMask = createNumber("timerTaskAffinityMask", Long.class);

    public QDmOsNodes(String variable) {
        super(QDmOsNodes.class, forVariable(variable), "sys", "dm_os_nodes");
        addMetadata();
    }

    public QDmOsNodes(String variable, String schema, String table) {
        super(QDmOsNodes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsNodes(Path<? extends QDmOsNodes> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_nodes");
        addMetadata();
    }

    public QDmOsNodes(PathMetadata metadata) {
        super(QDmOsNodes.class, metadata, "sys", "dm_os_nodes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeWorkerCount, ColumnMetadata.named("active_worker_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(avgLoadBalance, ColumnMetadata.named("avg_load_balance").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cpuAffinityMask, ColumnMetadata.named("cpu_affinity_mask").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(idleSchedulerCount, ColumnMetadata.named("idle_scheduler_count").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(ioCompletionWorkerAddress, ColumnMetadata.named("io_completion_worker_address").withIndex(5).ofType(Types.VARBINARY).withSize(8));
        addMetadata(memoryClerkAddress, ColumnMetadata.named("memory_clerk_address").withIndex(4).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(memoryNodeId, ColumnMetadata.named("memory_node_id").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(3).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(nodeId, ColumnMetadata.named("node_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(nodeStateDesc, ColumnMetadata.named("node_state_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(onlineSchedulerCount, ColumnMetadata.named("online_scheduler_count").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(onlineSchedulerMask, ColumnMetadata.named("online_scheduler_mask").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(permanentTaskAffinityMask, ColumnMetadata.named("permanent_task_affinity_mask").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(resourceMonitorState, ColumnMetadata.named("resource_monitor_state").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(timerTaskAffinityMask, ColumnMetadata.named("timer_task_affinity_mask").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

