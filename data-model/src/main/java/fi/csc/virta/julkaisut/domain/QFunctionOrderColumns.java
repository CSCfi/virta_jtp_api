package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFunctionOrderColumns is a Querydsl query type for QFunctionOrderColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFunctionOrderColumns extends com.querydsl.sql.RelationalPathBase<QFunctionOrderColumns> {

    private static final long serialVersionUID = 1223668740;

    public static final QFunctionOrderColumns functionOrderColumns = new QFunctionOrderColumns("function_order_columns");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final BooleanPath isDescending = createBoolean("isDescending");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> orderColumnId = createNumber("orderColumnId", Integer.class);

    public QFunctionOrderColumns(String variable) {
        super(QFunctionOrderColumns.class, forVariable(variable), "sys", "function_order_columns");
        addMetadata();
    }

    public QFunctionOrderColumns(String variable, String schema, String table) {
        super(QFunctionOrderColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFunctionOrderColumns(Path<? extends QFunctionOrderColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "function_order_columns");
        addMetadata();
    }

    public QFunctionOrderColumns(PathMetadata metadata) {
        super(QFunctionOrderColumns.class, metadata, "sys", "function_order_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDescending, ColumnMetadata.named("is_descending").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(orderColumnId, ColumnMetadata.named("order_column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

