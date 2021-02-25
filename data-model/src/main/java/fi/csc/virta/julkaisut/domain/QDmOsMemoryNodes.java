package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryNodes is a Querydsl query type for QDmOsMemoryNodes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryNodes extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryNodes> {

    private static final long serialVersionUID = -446445018;

    public static final QDmOsMemoryNodes dmOsMemoryNodes = new QDmOsMemoryNodes("dm_os_memory_nodes");

    public final NumberPath<Long> cpuAffinityMask = createNumber("cpuAffinityMask", Long.class);

    public final NumberPath<Long> foreignCommittedKb = createNumber("foreignCommittedKb", Long.class);

    public final NumberPath<Long> lockedPageAllocationsKb = createNumber("lockedPageAllocationsKb", Long.class);

    public final NumberPath<Short> memoryNodeId = createNumber("memoryNodeId", Short.class);

    public final NumberPath<Long> onlineSchedulerMask = createNumber("onlineSchedulerMask", Long.class);

    public final NumberPath<Long> pagesKb = createNumber("pagesKb", Long.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final NumberPath<Long> sharedMemoryCommittedKb = createNumber("sharedMemoryCommittedKb", Long.class);

    public final NumberPath<Long> sharedMemoryReservedKb = createNumber("sharedMemoryReservedKb", Long.class);

    public final NumberPath<Long> virtualAddressSpaceCommittedKb = createNumber("virtualAddressSpaceCommittedKb", Long.class);

    public final NumberPath<Long> virtualAddressSpaceReservedKb = createNumber("virtualAddressSpaceReservedKb", Long.class);

    public QDmOsMemoryNodes(String variable) {
        super(QDmOsMemoryNodes.class, forVariable(variable), "sys", "dm_os_memory_nodes");
        addMetadata();
    }

    public QDmOsMemoryNodes(String variable, String schema, String table) {
        super(QDmOsMemoryNodes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryNodes(Path<? extends QDmOsMemoryNodes> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_nodes");
        addMetadata();
    }

    public QDmOsMemoryNodes(PathMetadata metadata) {
        super(QDmOsMemoryNodes.class, metadata, "sys", "dm_os_memory_nodes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cpuAffinityMask, ColumnMetadata.named("cpu_affinity_mask").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(foreignCommittedKb, ColumnMetadata.named("foreign_committed_kb").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lockedPageAllocationsKb, ColumnMetadata.named("locked_page_allocations_kb").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(memoryNodeId, ColumnMetadata.named("memory_node_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(onlineSchedulerMask, ColumnMetadata.named("online_scheduler_mask").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pagesKb, ColumnMetadata.named("pages_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sharedMemoryCommittedKb, ColumnMetadata.named("shared_memory_committed_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sharedMemoryReservedKb, ColumnMetadata.named("shared_memory_reserved_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualAddressSpaceCommittedKb, ColumnMetadata.named("virtual_address_space_committed_kb").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualAddressSpaceReservedKb, ColumnMetadata.named("virtual_address_space_reserved_kb").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

