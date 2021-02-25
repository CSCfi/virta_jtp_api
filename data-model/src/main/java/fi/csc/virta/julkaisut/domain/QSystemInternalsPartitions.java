package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemInternalsPartitions is a Querydsl query type for QSystemInternalsPartitions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemInternalsPartitions extends com.querydsl.sql.RelationalPathBase<QSystemInternalsPartitions> {

    private static final long serialVersionUID = 979340499;

    public static final QSystemInternalsPartitions systemInternalsPartitions = new QSystemInternalsPartitions("system_internals_partitions");

    public final BooleanPath allowPageLocks = createBoolean("allowPageLocks");

    public final BooleanPath allowRowLocks = createBoolean("allowRowLocks");

    public final BooleanPath allowsNullableKeys = createBoolean("allowsNullableKeys");

    public final NumberPath<Byte> droppedLobColumnState = createNumber("droppedLobColumnState", Byte.class);

    public final NumberPath<Short> filestreamFilegroupId = createNumber("filestreamFilegroupId", Short.class);

    public final StringPath filestreamGuid = createString("filestreamGuid");

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final BooleanPath isDataRowFormat = createBoolean("isDataRowFormat");

    public final BooleanPath isLoggedForReplication = createBoolean("isLoggedForReplication");

    public final BooleanPath isNotVersioned = createBoolean("isNotVersioned");

    public final BooleanPath isOrphaned = createBoolean("isOrphaned");

    public final BooleanPath isReplicated = createBoolean("isReplicated");

    public final BooleanPath isSereplicated = createBoolean("isSereplicated");

    public final BooleanPath isUnique = createBoolean("isUnique");

    public final NumberPath<Short> maxInternalLength = createNumber("maxInternalLength", Short.class);

    public final NumberPath<Integer> maxLeafLength = createNumber("maxLeafLength", Integer.class);

    public final NumberPath<Short> maxNullBitUsed = createNumber("maxNullBitUsed", Short.class);

    public final NumberPath<Short> minInternalLength = createNumber("minInternalLength", Short.class);

    public final NumberPath<Short> minLeafLength = createNumber("minLeafLength", Short.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Integer> partitionNumber = createNumber("partitionNumber", Integer.class);

    public final NumberPath<Long> rows = createNumber("rows", Long.class);

    public QSystemInternalsPartitions(String variable) {
        super(QSystemInternalsPartitions.class, forVariable(variable), "sys", "system_internals_partitions");
        addMetadata();
    }

    public QSystemInternalsPartitions(String variable, String schema, String table) {
        super(QSystemInternalsPartitions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemInternalsPartitions(Path<? extends QSystemInternalsPartitions> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_internals_partitions");
        addMetadata();
    }

    public QSystemInternalsPartitions(PathMetadata metadata) {
        super(QSystemInternalsPartitions.class, metadata, "sys", "system_internals_partitions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowPageLocks, ColumnMetadata.named("allow_page_locks").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(allowRowLocks, ColumnMetadata.named("allow_row_locks").withIndex(19).ofType(Types.BIT).withSize(1));
        addMetadata(allowsNullableKeys, ColumnMetadata.named("allows_nullable_keys").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(droppedLobColumnState, ColumnMetadata.named("dropped_lob_column_state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(filestreamFilegroupId, ColumnMetadata.named("filestream_filegroup_id").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(filestreamGuid, ColumnMetadata.named("filestream_guid").withIndex(23).ofType(Types.CHAR).withSize(36));
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDataRowFormat, ColumnMetadata.named("is_data_row_format").withIndex(21).ofType(Types.BIT).withSize(1));
        addMetadata(isLoggedForReplication, ColumnMetadata.named("is_logged_for_replication").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(isNotVersioned, ColumnMetadata.named("is_not_versioned").withIndex(22).ofType(Types.BIT).withSize(1));
        addMetadata(isOrphaned, ColumnMetadata.named("is_orphaned").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isReplicated, ColumnMetadata.named("is_replicated").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isSereplicated, ColumnMetadata.named("is_sereplicated").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isUnique, ColumnMetadata.named("is_unique").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(maxInternalLength, ColumnMetadata.named("max_internal_length").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(maxLeafLength, ColumnMetadata.named("max_leaf_length").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxNullBitUsed, ColumnMetadata.named("max_null_bit_used").withIndex(13).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(minInternalLength, ColumnMetadata.named("min_internal_length").withIndex(17).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(minLeafLength, ColumnMetadata.named("min_leaf_length").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionNumber, ColumnMetadata.named("partition_number").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rows, ColumnMetadata.named("rows").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

