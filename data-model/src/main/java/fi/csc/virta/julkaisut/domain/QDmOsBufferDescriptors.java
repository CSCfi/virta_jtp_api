package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsBufferDescriptors is a Querydsl query type for QDmOsBufferDescriptors
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsBufferDescriptors extends com.querydsl.sql.RelationalPathBase<QDmOsBufferDescriptors> {

    private static final long serialVersionUID = -2035441158;

    public static final QDmOsBufferDescriptors dmOsBufferDescriptors = new QDmOsBufferDescriptors("dm_os_buffer_descriptors");

    public final NumberPath<Long> allocationUnitId = createNumber("allocationUnitId", Long.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> fileId = createNumber("fileId", Integer.class);

    public final NumberPath<Integer> freeSpaceInBytes = createNumber("freeSpaceInBytes", Integer.class);

    public final BooleanPath isModified = createBoolean("isModified");

    public final NumberPath<Integer> numaNode = createNumber("numaNode", Integer.class);

    public final NumberPath<Integer> pageId = createNumber("pageId", Integer.class);

    public final NumberPath<Integer> pageLevel = createNumber("pageLevel", Integer.class);

    public final StringPath pageType = createString("pageType");

    public final NumberPath<Long> readMicrosec = createNumber("readMicrosec", Long.class);

    public final NumberPath<Integer> rowCount = createNumber("rowCount", Integer.class);

    public QDmOsBufferDescriptors(String variable) {
        super(QDmOsBufferDescriptors.class, forVariable(variable), "sys", "dm_os_buffer_descriptors");
        addMetadata();
    }

    public QDmOsBufferDescriptors(String variable, String schema, String table) {
        super(QDmOsBufferDescriptors.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsBufferDescriptors(Path<? extends QDmOsBufferDescriptors> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_buffer_descriptors");
        addMetadata();
    }

    public QDmOsBufferDescriptors(PathMetadata metadata) {
        super(QDmOsBufferDescriptors.class, metadata, "sys", "dm_os_buffer_descriptors");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocationUnitId, ColumnMetadata.named("allocation_unit_id").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(freeSpaceInBytes, ColumnMetadata.named("free_space_in_bytes").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(isModified, ColumnMetadata.named("is_modified").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(numaNode, ColumnMetadata.named("numa_node").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(pageId, ColumnMetadata.named("page_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(pageLevel, ColumnMetadata.named("page_level").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(pageType, ColumnMetadata.named("page_type").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(readMicrosec, ColumnMetadata.named("read_microsec").withIndex(11).ofType(Types.BIGINT).withSize(19));
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(7).ofType(Types.INTEGER).withSize(10));
    }

}

