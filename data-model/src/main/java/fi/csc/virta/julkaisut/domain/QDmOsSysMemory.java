package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsSysMemory is a Querydsl query type for QDmOsSysMemory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsSysMemory extends com.querydsl.sql.RelationalPathBase<QDmOsSysMemory> {

    private static final long serialVersionUID = -713339996;

    public static final QDmOsSysMemory dmOsSysMemory = new QDmOsSysMemory("dm_os_sys_memory");

    public final NumberPath<Long> availablePageFileKb = createNumber("availablePageFileKb", Long.class);

    public final NumberPath<Long> availablePhysicalMemoryKb = createNumber("availablePhysicalMemoryKb", Long.class);

    public final NumberPath<Long> kernelNonpagedPoolKb = createNumber("kernelNonpagedPoolKb", Long.class);

    public final NumberPath<Long> kernelPagedPoolKb = createNumber("kernelPagedPoolKb", Long.class);

    public final NumberPath<Long> systemCacheKb = createNumber("systemCacheKb", Long.class);

    public final BooleanPath systemHighMemorySignalState = createBoolean("systemHighMemorySignalState");

    public final BooleanPath systemLowMemorySignalState = createBoolean("systemLowMemorySignalState");

    public final StringPath systemMemoryStateDesc = createString("systemMemoryStateDesc");

    public final NumberPath<Long> totalPageFileKb = createNumber("totalPageFileKb", Long.class);

    public final NumberPath<Long> totalPhysicalMemoryKb = createNumber("totalPhysicalMemoryKb", Long.class);

    public QDmOsSysMemory(String variable) {
        super(QDmOsSysMemory.class, forVariable(variable), "sys", "dm_os_sys_memory");
        addMetadata();
    }

    public QDmOsSysMemory(String variable, String schema, String table) {
        super(QDmOsSysMemory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsSysMemory(Path<? extends QDmOsSysMemory> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_sys_memory");
        addMetadata();
    }

    public QDmOsSysMemory(PathMetadata metadata) {
        super(QDmOsSysMemory.class, metadata, "sys", "dm_os_sys_memory");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(availablePageFileKb, ColumnMetadata.named("available_page_file_kb").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(availablePhysicalMemoryKb, ColumnMetadata.named("available_physical_memory_kb").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(kernelNonpagedPoolKb, ColumnMetadata.named("kernel_nonpaged_pool_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(kernelPagedPoolKb, ColumnMetadata.named("kernel_paged_pool_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemCacheKb, ColumnMetadata.named("system_cache_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemHighMemorySignalState, ColumnMetadata.named("system_high_memory_signal_state").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(systemLowMemorySignalState, ColumnMetadata.named("system_low_memory_signal_state").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(systemMemoryStateDesc, ColumnMetadata.named("system_memory_state_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(totalPageFileKb, ColumnMetadata.named("total_page_file_kb").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalPhysicalMemoryKb, ColumnMetadata.named("total_physical_memory_kb").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

