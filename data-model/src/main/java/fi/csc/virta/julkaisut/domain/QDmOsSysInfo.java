package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsSysInfo is a Querydsl query type for QDmOsSysInfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsSysInfo extends com.querydsl.sql.RelationalPathBase<QDmOsSysInfo> {

    private static final long serialVersionUID = -1091354607;

    public static final QDmOsSysInfo dmOsSysInfo = new QDmOsSysInfo("dm_os_sys_info");

    public final NumberPath<Integer> affinityType = createNumber("affinityType", Integer.class);

    public final StringPath affinityTypeDesc = createString("affinityTypeDesc");

    public final NumberPath<Long> committedKb = createNumber("committedKb", Long.class);

    public final NumberPath<Long> committedTargetKb = createNumber("committedTargetKb", Long.class);

    public final NumberPath<Integer> cpuCount = createNumber("cpuCount", Integer.class);

    public final NumberPath<Long> cpuTicks = createNumber("cpuTicks", Long.class);

    public final NumberPath<Integer> deadlockMonitorSerialNumber = createNumber("deadlockMonitorSerialNumber", Integer.class);

    public final NumberPath<Integer> hyperthreadRatio = createNumber("hyperthreadRatio", Integer.class);

    public final NumberPath<Integer> maxWorkersCount = createNumber("maxWorkersCount", Integer.class);

    public final NumberPath<Long> msTicks = createNumber("msTicks", Long.class);

    public final NumberPath<Integer> osErrorMode = createNumber("osErrorMode", Integer.class);

    public final NumberPath<Integer> osPriorityClass = createNumber("osPriorityClass", Integer.class);

    public final NumberPath<Long> osQuantum = createNumber("osQuantum", Long.class);

    public final NumberPath<Long> physicalMemoryKb = createNumber("physicalMemoryKb", Long.class);

    public final NumberPath<Long> processKernelTimeMs = createNumber("processKernelTimeMs", Long.class);

    public final NumberPath<Long> processUserTimeMs = createNumber("processUserTimeMs", Long.class);

    public final NumberPath<Integer> schedulerCount = createNumber("schedulerCount", Integer.class);

    public final NumberPath<Integer> schedulerTotalCount = createNumber("schedulerTotalCount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> sqlserverStartTime = createDateTime("sqlserverStartTime", java.sql.Timestamp.class);

    public final NumberPath<Long> sqlserverStartTimeMsTicks = createNumber("sqlserverStartTimeMsTicks", Long.class);

    public final NumberPath<Integer> stackSizeInBytes = createNumber("stackSizeInBytes", Integer.class);

    public final NumberPath<Integer> timeSource = createNumber("timeSource", Integer.class);

    public final StringPath timeSourceDesc = createString("timeSourceDesc");

    public final NumberPath<Integer> virtualMachineType = createNumber("virtualMachineType", Integer.class);

    public final StringPath virtualMachineTypeDesc = createString("virtualMachineTypeDesc");

    public final NumberPath<Long> virtualMemoryKb = createNumber("virtualMemoryKb", Long.class);

    public final NumberPath<Long> visibleTargetKb = createNumber("visibleTargetKb", Long.class);

    public QDmOsSysInfo(String variable) {
        super(QDmOsSysInfo.class, forVariable(variable), "sys", "dm_os_sys_info");
        addMetadata();
    }

    public QDmOsSysInfo(String variable, String schema, String table) {
        super(QDmOsSysInfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsSysInfo(Path<? extends QDmOsSysInfo> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_sys_info");
        addMetadata();
    }

    public QDmOsSysInfo(PathMetadata metadata) {
        super(QDmOsSysInfo.class, metadata, "sys", "dm_os_sys_info");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affinityType, ColumnMetadata.named("affinity_type").withIndex(20).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(affinityTypeDesc, ColumnMetadata.named("affinity_type_desc").withIndex(21).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(committedKb, ColumnMetadata.named("committed_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(committedTargetKb, ColumnMetadata.named("committed_target_kb").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(cpuCount, ColumnMetadata.named("cpu_count").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cpuTicks, ColumnMetadata.named("cpu_ticks").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(deadlockMonitorSerialNumber, ColumnMetadata.named("deadlock_monitor_serial_number").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(hyperthreadRatio, ColumnMetadata.named("hyperthread_ratio").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxWorkersCount, ColumnMetadata.named("max_workers_count").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(msTicks, ColumnMetadata.named("ms_ticks").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(osErrorMode, ColumnMetadata.named("os_error_mode").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(osPriorityClass, ColumnMetadata.named("os_priority_class").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(osQuantum, ColumnMetadata.named("os_quantum").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(physicalMemoryKb, ColumnMetadata.named("physical_memory_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(processKernelTimeMs, ColumnMetadata.named("process_kernel_time_ms").withIndex(22).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(processUserTimeMs, ColumnMetadata.named("process_user_time_ms").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(schedulerCount, ColumnMetadata.named("scheduler_count").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(schedulerTotalCount, ColumnMetadata.named("scheduler_total_count").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sqlserverStartTime, ColumnMetadata.named("sqlserver_start_time").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(sqlserverStartTimeMsTicks, ColumnMetadata.named("sqlserver_start_time_ms_ticks").withIndex(18).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(stackSizeInBytes, ColumnMetadata.named("stack_size_in_bytes").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(timeSource, ColumnMetadata.named("time_source").withIndex(24).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(timeSourceDesc, ColumnMetadata.named("time_source_desc").withIndex(25).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(virtualMachineType, ColumnMetadata.named("virtual_machine_type").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(virtualMachineTypeDesc, ColumnMetadata.named("virtual_machine_type_desc").withIndex(27).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(virtualMemoryKb, ColumnMetadata.named("virtual_memory_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(visibleTargetKb, ColumnMetadata.named("visible_target_kb").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

