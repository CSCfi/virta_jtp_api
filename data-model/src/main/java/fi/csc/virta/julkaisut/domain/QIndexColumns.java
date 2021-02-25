package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIndexColumns is a Querydsl query type for QIndexColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIndexColumns extends com.querydsl.sql.RelationalPathBase<QIndexColumns> {

    private static final long serialVersionUID = -1624113400;

    public static final QIndexColumns indexColumns = new QIndexColumns("index_columns");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> indexColumnId = createNumber("indexColumnId", Integer.class);

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final BooleanPath isDescendingKey = createBoolean("isDescendingKey");

    public final BooleanPath isIncludedColumn = createBoolean("isIncludedColumn");

    public final NumberPath<Byte> keyOrdinal = createNumber("keyOrdinal", Byte.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Byte> partitionOrdinal = createNumber("partitionOrdinal", Byte.class);

    public QIndexColumns(String variable) {
        super(QIndexColumns.class, forVariable(variable), "sys", "index_columns");
        addMetadata();
    }

    public QIndexColumns(String variable, String schema, String table) {
        super(QIndexColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIndexColumns(Path<? extends QIndexColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "index_columns");
        addMetadata();
    }

    public QIndexColumns(PathMetadata metadata) {
        super(QIndexColumns.class, metadata, "sys", "index_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indexColumnId, ColumnMetadata.named("index_column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDescendingKey, ColumnMetadata.named("is_descending_key").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isIncludedColumn, ColumnMetadata.named("is_included_column").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(keyOrdinal, ColumnMetadata.named("key_ordinal").withIndex(5).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionOrdinal, ColumnMetadata.named("partition_ordinal").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

