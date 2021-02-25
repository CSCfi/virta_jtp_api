package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbFileSpaceUsage is a Querydsl query type for QDmDbFileSpaceUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbFileSpaceUsage extends com.querydsl.sql.RelationalPathBase<QDmDbFileSpaceUsage> {

    private static final long serialVersionUID = -744921029;

    public static final QDmDbFileSpaceUsage dmDbFileSpaceUsage = new QDmDbFileSpaceUsage("dm_db_file_space_usage");

    public final NumberPath<Long> allocatedExtentPageCount = createNumber("allocatedExtentPageCount", Long.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Short> filegroupId = createNumber("filegroupId", Short.class);

    public final NumberPath<Short> fileId = createNumber("fileId", Short.class);

    public final NumberPath<Long> internalObjectReservedPageCount = createNumber("internalObjectReservedPageCount", Long.class);

    public final NumberPath<Long> mixedExtentPageCount = createNumber("mixedExtentPageCount", Long.class);

    public final NumberPath<Long> totalPageCount = createNumber("totalPageCount", Long.class);

    public final NumberPath<Long> unallocatedExtentPageCount = createNumber("unallocatedExtentPageCount", Long.class);

    public final NumberPath<Long> userObjectReservedPageCount = createNumber("userObjectReservedPageCount", Long.class);

    public final NumberPath<Long> versionStoreReservedPageCount = createNumber("versionStoreReservedPageCount", Long.class);

    public QDmDbFileSpaceUsage(String variable) {
        super(QDmDbFileSpaceUsage.class, forVariable(variable), "sys", "dm_db_file_space_usage");
        addMetadata();
    }

    public QDmDbFileSpaceUsage(String variable, String schema, String table) {
        super(QDmDbFileSpaceUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbFileSpaceUsage(Path<? extends QDmDbFileSpaceUsage> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_file_space_usage");
        addMetadata();
    }

    public QDmDbFileSpaceUsage(PathMetadata metadata) {
        super(QDmDbFileSpaceUsage.class, metadata, "sys", "dm_db_file_space_usage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allocatedExtentPageCount, ColumnMetadata.named("allocated_extent_page_count").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(filegroupId, ColumnMetadata.named("filegroup_id").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fileId, ColumnMetadata.named("file_id").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(internalObjectReservedPageCount, ColumnMetadata.named("internal_object_reserved_page_count").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(mixedExtentPageCount, ColumnMetadata.named("mixed_extent_page_count").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalPageCount, ColumnMetadata.named("total_page_count").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(unallocatedExtentPageCount, ColumnMetadata.named("unallocated_extent_page_count").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(userObjectReservedPageCount, ColumnMetadata.named("user_object_reserved_page_count").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(versionStoreReservedPageCount, ColumnMetadata.named("version_store_reserved_page_count").withIndex(7).ofType(Types.BIGINT).withSize(19));
    }

}

