package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemInternalsPartitionColumns is a Querydsl query type for QSystemInternalsPartitionColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemInternalsPartitionColumns extends com.querydsl.sql.RelationalPathBase<QSystemInternalsPartitionColumns> {

    private static final long serialVersionUID = 296809501;

    public static final QSystemInternalsPartitionColumns systemInternalsPartitionColumns = new QSystemInternalsPartitionColumns("system_internals_partition_columns");

    public final StringPath collationName = createString("collationName");

    public final SimplePath<Object> defaultValue = createSimple("defaultValue", Object.class);

    public final BooleanPath hasDefault = createBoolean("hasDefault");

    public final NumberPath<Byte> internalBitPosition = createNumber("internalBitPosition", Byte.class);

    public final NumberPath<Short> internalNullBit = createNumber("internalNullBit", Short.class);

    public final NumberPath<Short> internalOffset = createNumber("internalOffset", Short.class);

    public final BooleanPath isAntiMatter = createBoolean("isAntiMatter");

    public final BooleanPath isDescendingKey = createBoolean("isDescendingKey");

    public final BooleanPath isDropped = createBoolean("isDropped");

    public final BooleanPath isFilestream = createBoolean("isFilestream");

    public final BooleanPath isLoggedForReplication = createBoolean("isLoggedForReplication");

    public final BooleanPath isNullable = createBoolean("isNullable");

    public final BooleanPath isReplicated = createBoolean("isReplicated");

    public final BooleanPath isSparse = createBoolean("isSparse");

    public final BooleanPath isUniqueifier = createBoolean("isUniqueifier");

    public final NumberPath<Short> keyOrdinal = createNumber("keyOrdinal", Short.class);

    public final NumberPath<Byte> leafBitPosition = createNumber("leafBitPosition", Byte.class);

    public final NumberPath<Short> leafNullBit = createNumber("leafNullBit", Short.class);

    public final NumberPath<Short> leafOffset = createNumber("leafOffset", Short.class);

    public final NumberPath<Short> maxInrowLength = createNumber("maxInrowLength", Short.class);

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final NumberPath<Long> modifiedCount = createNumber("modifiedCount", Long.class);

    public final StringPath partitionColumnGuid = createString("partitionColumnGuid");

    public final NumberPath<Integer> partitionColumnId = createNumber("partitionColumnId", Integer.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public QSystemInternalsPartitionColumns(String variable) {
        super(QSystemInternalsPartitionColumns.class, forVariable(variable), "sys", "system_internals_partition_columns");
        addMetadata();
    }

    public QSystemInternalsPartitionColumns(String variable, String schema, String table) {
        super(QSystemInternalsPartitionColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemInternalsPartitionColumns(Path<? extends QSystemInternalsPartitionColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_internals_partition_columns");
        addMetadata();
    }

    public QSystemInternalsPartitionColumns(PathMetadata metadata) {
        super(QSystemInternalsPartitionColumns.class, metadata, "sys", "system_internals_partition_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultValue, ColumnMetadata.named("default_value").withIndex(28).ofType(-150).withSize(2147483647));
        addMetadata(hasDefault, ColumnMetadata.named("has_default").withIndex(27).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(internalBitPosition, ColumnMetadata.named("internal_bit_position").withIndex(21).ofType(Types.TINYINT).withSize(3));
        addMetadata(internalNullBit, ColumnMetadata.named("internal_null_bit").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(internalOffset, ColumnMetadata.named("internal_offset").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(isAntiMatter, ColumnMetadata.named("is_anti_matter").withIndex(24).ofType(Types.BIT).withSize(1));
        addMetadata(isDescendingKey, ColumnMetadata.named("is_descending_key").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(isDropped, ColumnMetadata.named("is_dropped").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isFilestream, ColumnMetadata.named("is_filestream").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isLoggedForReplication, ColumnMetadata.named("is_logged_for_replication").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isNullable, ColumnMetadata.named("is_nullable").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(isReplicated, ColumnMetadata.named("is_replicated").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(isSparse, ColumnMetadata.named("is_sparse").withIndex(26).ofType(Types.BIT).withSize(1));
        addMetadata(isUniqueifier, ColumnMetadata.named("is_uniqueifier").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(keyOrdinal, ColumnMetadata.named("key_ordinal").withIndex(14).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(leafBitPosition, ColumnMetadata.named("leaf_bit_position").withIndex(20).ofType(Types.TINYINT).withSize(3));
        addMetadata(leafNullBit, ColumnMetadata.named("leaf_null_bit").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(leafOffset, ColumnMetadata.named("leaf_offset").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(maxInrowLength, ColumnMetadata.named("max_inrow_length").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(modifiedCount, ColumnMetadata.named("modified_count").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionColumnGuid, ColumnMetadata.named("partition_column_guid").withIndex(25).ofType(Types.CHAR).withSize(36));
        addMetadata(partitionColumnId, ColumnMetadata.named("partition_column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(10).ofType(Types.TINYINT).withSize(3));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(8).ofType(Types.TINYINT).withSize(3));
    }

}

