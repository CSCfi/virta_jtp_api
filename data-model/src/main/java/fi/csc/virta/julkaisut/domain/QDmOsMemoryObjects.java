package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryObjects is a Querydsl query type for QDmOsMemoryObjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryObjects extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryObjects> {

    private static final long serialVersionUID = 983921481;

    public static final QDmOsMemoryObjects dmOsMemoryObjects = new QDmOsMemoryObjects("dm_os_memory_objects");

    public final NumberPath<Long> bytesUsed = createNumber("bytesUsed", Long.class);

    public final NumberPath<Integer> creationOptions = createNumber("creationOptions", Integer.class);

    public final SimplePath<byte[]> creationStackAddress = createSimple("creationStackAddress", byte[].class);

    public final DateTimePath<java.sql.Timestamp> creationTime = createDateTime("creationTime", java.sql.Timestamp.class);

    public final NumberPath<Long> maxPagesInBytes = createNumber("maxPagesInBytes", Long.class);

    public final NumberPath<Short> memoryNodeId = createNumber("memoryNodeId", Short.class);

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> pageAllocatorAddress = createSimple("pageAllocatorAddress", byte[].class);

    public final NumberPath<Long> pagesInBytes = createNumber("pagesInBytes", Long.class);

    public final NumberPath<Integer> pageSizeInBytes = createNumber("pageSizeInBytes", Integer.class);

    public final SimplePath<byte[]> parentAddress = createSimple("parentAddress", byte[].class);

    public final NumberPath<Integer> sequenceNum = createNumber("sequenceNum", Integer.class);

    public final StringPath type = createString("type");

    public QDmOsMemoryObjects(String variable) {
        super(QDmOsMemoryObjects.class, forVariable(variable), "sys", "dm_os_memory_objects");
        addMetadata();
    }

    public QDmOsMemoryObjects(String variable, String schema, String table) {
        super(QDmOsMemoryObjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryObjects(Path<? extends QDmOsMemoryObjects> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_objects");
        addMetadata();
    }

    public QDmOsMemoryObjects(PathMetadata metadata) {
        super(QDmOsMemoryObjects.class, metadata, "sys", "dm_os_memory_objects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bytesUsed, ColumnMetadata.named("bytes_used").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(creationOptions, ColumnMetadata.named("creation_options").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(creationStackAddress, ColumnMetadata.named("creation_stack_address").withIndex(13).ofType(Types.VARBINARY).withSize(8));
        addMetadata(creationTime, ColumnMetadata.named("creation_time").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(maxPagesInBytes, ColumnMetadata.named("max_pages_in_bytes").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(memoryNodeId, ColumnMetadata.named("memory_node_id").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(7).ofType(Types.VARCHAR).withSize(256));
        addMetadata(pageAllocatorAddress, ColumnMetadata.named("page_allocator_address").withIndex(12).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(pagesInBytes, ColumnMetadata.named("pages_in_bytes").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(pageSizeInBytes, ColumnMetadata.named("page_size_in_bytes").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentAddress, ColumnMetadata.named("parent_address").withIndex(2).ofType(Types.VARBINARY).withSize(8));
        addMetadata(sequenceNum, ColumnMetadata.named("sequence_num").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

