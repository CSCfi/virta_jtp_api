package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryAllocations is a Querydsl query type for QDmOsMemoryAllocations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryAllocations extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryAllocations> {

    private static final long serialVersionUID = 909989704;

    public static final QDmOsMemoryAllocations dmOsMemoryAllocations = new QDmOsMemoryAllocations("dm_os_memory_allocations");

    public final SimplePath<byte[]> allocatorStackAddress = createSimple("allocatorStackAddress", byte[].class);

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creationTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> lineNum = createNumber("lineNum", Integer.class);

    public final SimplePath<byte[]> memoryAllocationAddress = createSimple("memoryAllocationAddress", byte[].class);

    public final NumberPath<Short> memoryNodeId = createNumber("memoryNodeId", Short.class);

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final NumberPath<Integer> sequenceNum = createNumber("sequenceNum", Integer.class);

    public final NumberPath<Long> sizeInBytes = createNumber("sizeInBytes", Long.class);

    public final StringPath sourceFile = createString("sourceFile");

    public final NumberPath<Integer> tag = createNumber("tag", Integer.class);

    public QDmOsMemoryAllocations(String variable) {
        super(QDmOsMemoryAllocations.class, forVariable(variable), "sys", "dm_os_memory_allocations");
        addMetadata();
    }

    public QDmOsMemoryAllocations(String variable, String schema, String table) {
        super(QDmOsMemoryAllocations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryAllocations(Path<? extends QDmOsMemoryAllocations> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_allocations");
        addMetadata();
    }

    public QDmOsMemoryAllocations(PathMetadata metadata) {
        super(QDmOsMemoryAllocations.class, metadata, "sys", "dm_os_memory_allocations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocatorStackAddress, ColumnMetadata.named("allocator_stack_address").withIndex(6).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lineNum, ColumnMetadata.named("line_num").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(memoryAllocationAddress, ColumnMetadata.named("memory_allocation_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(memoryNodeId, ColumnMetadata.named("memory_node_id").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(4).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(sequenceNum, ColumnMetadata.named("sequence_num").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sizeInBytes, ColumnMetadata.named("size_in_bytes").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(sourceFile, ColumnMetadata.named("source_file").withIndex(7).ofType(Types.VARCHAR).withSize(256));
        addMetadata(tag, ColumnMetadata.named("tag").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

