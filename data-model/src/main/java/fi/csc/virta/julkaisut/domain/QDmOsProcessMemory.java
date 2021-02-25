package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsProcessMemory is a Querydsl query type for QDmOsProcessMemory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsProcessMemory extends com.querydsl.sql.RelationalPathBase<QDmOsProcessMemory> {

    private static final long serialVersionUID = 1980972742;

    public static final QDmOsProcessMemory dmOsProcessMemory = new QDmOsProcessMemory("dm_os_process_memory");

    public final NumberPath<Long> availableCommitLimitKb = createNumber("availableCommitLimitKb", Long.class);

    public final NumberPath<Long> largePageAllocationsKb = createNumber("largePageAllocationsKb", Long.class);

    public final NumberPath<Long> lockedPageAllocationsKb = createNumber("lockedPageAllocationsKb", Long.class);

    public final NumberPath<Integer> memoryUtilizationPercentage = createNumber("memoryUtilizationPercentage", Integer.class);

    public final NumberPath<Long> pageFaultCount = createNumber("pageFaultCount", Long.class);

    public final NumberPath<Long> physicalMemoryInUseKb = createNumber("physicalMemoryInUseKb", Long.class);

    public final BooleanPath processPhysicalMemoryLow = createBoolean("processPhysicalMemoryLow");

    public final BooleanPath processVirtualMemoryLow = createBoolean("processVirtualMemoryLow");

    public final NumberPath<Long> totalVirtualAddressSpaceKb = createNumber("totalVirtualAddressSpaceKb", Long.class);

    public final NumberPath<Long> virtualAddressSpaceAvailableKb = createNumber("virtualAddressSpaceAvailableKb", Long.class);

    public final NumberPath<Long> virtualAddressSpaceCommittedKb = createNumber("virtualAddressSpaceCommittedKb", Long.class);

    public final NumberPath<Long> virtualAddressSpaceReservedKb = createNumber("virtualAddressSpaceReservedKb", Long.class);

    public QDmOsProcessMemory(String variable) {
        super(QDmOsProcessMemory.class, forVariable(variable), "sys", "dm_os_process_memory");
        addMetadata();
    }

    public QDmOsProcessMemory(String variable, String schema, String table) {
        super(QDmOsProcessMemory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsProcessMemory(Path<? extends QDmOsProcessMemory> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_process_memory");
        addMetadata();
    }

    public QDmOsProcessMemory(PathMetadata metadata) {
        super(QDmOsProcessMemory.class, metadata, "sys", "dm_os_process_memory");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(availableCommitLimitKb, ColumnMetadata.named("available_commit_limit_kb").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(largePageAllocationsKb, ColumnMetadata.named("large_page_allocations_kb").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lockedPageAllocationsKb, ColumnMetadata.named("locked_page_allocations_kb").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(memoryUtilizationPercentage, ColumnMetadata.named("memory_utilization_percentage").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pageFaultCount, ColumnMetadata.named("page_fault_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(physicalMemoryInUseKb, ColumnMetadata.named("physical_memory_in_use_kb").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(processPhysicalMemoryLow, ColumnMetadata.named("process_physical_memory_low").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(processVirtualMemoryLow, ColumnMetadata.named("process_virtual_memory_low").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(totalVirtualAddressSpaceKb, ColumnMetadata.named("total_virtual_address_space_kb").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualAddressSpaceAvailableKb, ColumnMetadata.named("virtual_address_space_available_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualAddressSpaceCommittedKb, ColumnMetadata.named("virtual_address_space_committed_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualAddressSpaceReservedKb, ColumnMetadata.named("virtual_address_space_reserved_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

