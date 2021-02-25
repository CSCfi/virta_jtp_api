package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnStoreSegments is a Querydsl query type for QColumnStoreSegments
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnStoreSegments extends com.querydsl.sql.RelationalPathBase<QColumnStoreSegments> {

    private static final long serialVersionUID = 415518958;

    public static final QColumnStoreSegments columnStoreSegments = new QColumnStoreSegments("column_store_segments");

    public final NumberPath<Long> baseId = createNumber("baseId", Long.class);

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> encodingType = createNumber("encodingType", Integer.class);

    public final BooleanPath hasNulls = createBoolean("hasNulls");

    public final NumberPath<Long> hobtId = createNumber("hobtId", Long.class);

    public final NumberPath<Double> magnitude = createNumber("magnitude", Double.class);

    public final NumberPath<Long> maxDataId = createNumber("maxDataId", Long.class);

    public final NumberPath<Long> minDataId = createNumber("minDataId", Long.class);

    public final NumberPath<Long> nullValue = createNumber("nullValue", Long.class);

    public final NumberPath<Long> onDiskSize = createNumber("onDiskSize", Long.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Integer> primaryDictionaryId = createNumber("primaryDictionaryId", Integer.class);

    public final NumberPath<Integer> rowCount = createNumber("rowCount", Integer.class);

    public final NumberPath<Integer> secondaryDictionaryId = createNumber("secondaryDictionaryId", Integer.class);

    public final NumberPath<Integer> segmentId = createNumber("segmentId", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QColumnStoreSegments(String variable) {
        super(QColumnStoreSegments.class, forVariable(variable), "sys", "column_store_segments");
        addMetadata();
    }

    public QColumnStoreSegments(String variable, String schema, String table) {
        super(QColumnStoreSegments.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnStoreSegments(Path<? extends QColumnStoreSegments> path) {
        super(path.getType(), path.getMetadata(), "sys", "column_store_segments");
        addMetadata();
    }

    public QColumnStoreSegments(PathMetadata metadata) {
        super(QColumnStoreSegments.class, metadata, "sys", "column_store_segments");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseId, ColumnMetadata.named("base_id").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(encodingType, ColumnMetadata.named("encoding_type").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(hasNulls, ColumnMetadata.named("has_nulls").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(hobtId, ColumnMetadata.named("hobt_id").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(magnitude, ColumnMetadata.named("magnitude").withIndex(10).ofType(Types.DOUBLE).withSize(53));
        addMetadata(maxDataId, ColumnMetadata.named("max_data_id").withIndex(14).ofType(Types.BIGINT).withSize(19));
        addMetadata(minDataId, ColumnMetadata.named("min_data_id").withIndex(13).ofType(Types.BIGINT).withSize(19));
        addMetadata(nullValue, ColumnMetadata.named("null_value").withIndex(15).ofType(Types.BIGINT).withSize(19));
        addMetadata(onDiskSize, ColumnMetadata.named("on_disk_size").withIndex(16).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(primaryDictionaryId, ColumnMetadata.named("primary_dictionary_id").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(secondaryDictionaryId, ColumnMetadata.named("secondary_dictionary_id").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(segmentId, ColumnMetadata.named("segment_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(version, ColumnMetadata.named("version").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

