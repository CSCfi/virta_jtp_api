package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryClerks is a Querydsl query type for QDmOsMemoryClerks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryClerks extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryClerks> {

    private static final long serialVersionUID = -1272542743;

    public static final QDmOsMemoryClerks dmOsMemoryClerks = new QDmOsMemoryClerks("dm_os_memory_clerks");

    public final NumberPath<Long> aweAllocatedKb = createNumber("aweAllocatedKb", Long.class);

    public final SimplePath<byte[]> hostAddress = createSimple("hostAddress", byte[].class);

    public final SimplePath<byte[]> memoryClerkAddress = createSimple("memoryClerkAddress", byte[].class);

    public final NumberPath<Short> memoryNodeId = createNumber("memoryNodeId", Short.class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> pageAllocatorAddress = createSimple("pageAllocatorAddress", byte[].class);

    public final NumberPath<Long> pageSizeInBytes = createNumber("pageSizeInBytes", Long.class);

    public final NumberPath<Long> pagesKb = createNumber("pagesKb", Long.class);

    public final NumberPath<Long> sharedMemoryCommittedKb = createNumber("sharedMemoryCommittedKb", Long.class);

    public final NumberPath<Long> sharedMemoryReservedKb = createNumber("sharedMemoryReservedKb", Long.class);

    public final StringPath type = createString("type");

    public final NumberPath<Long> virtualMemoryCommittedKb = createNumber("virtualMemoryCommittedKb", Long.class);

    public final NumberPath<Long> virtualMemoryReservedKb = createNumber("virtualMemoryReservedKb", Long.class);

    public QDmOsMemoryClerks(String variable) {
        super(QDmOsMemoryClerks.class, forVariable(variable), "sys", "dm_os_memory_clerks");
        addMetadata();
    }

    public QDmOsMemoryClerks(String variable, String schema, String table) {
        super(QDmOsMemoryClerks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryClerks(Path<? extends QDmOsMemoryClerks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_clerks");
        addMetadata();
    }

    public QDmOsMemoryClerks(PathMetadata metadata) {
        super(QDmOsMemoryClerks.class, metadata, "sys", "dm_os_memory_clerks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(aweAllocatedKb, ColumnMetadata.named("awe_allocated_kb").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hostAddress, ColumnMetadata.named("host_address").withIndex(13).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(memoryClerkAddress, ColumnMetadata.named("memory_clerk_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(memoryNodeId, ColumnMetadata.named("memory_node_id").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(pageAllocatorAddress, ColumnMetadata.named("page_allocator_address").withIndex(12).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(pageSizeInBytes, ColumnMetadata.named("page_size_in_bytes").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pagesKb, ColumnMetadata.named("pages_kb").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sharedMemoryCommittedKb, ColumnMetadata.named("shared_memory_committed_kb").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sharedMemoryReservedKb, ColumnMetadata.named("shared_memory_reserved_kb").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(virtualMemoryCommittedKb, ColumnMetadata.named("virtual_memory_committed_kb").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(virtualMemoryReservedKb, ColumnMetadata.named("virtual_memory_reserved_kb").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

