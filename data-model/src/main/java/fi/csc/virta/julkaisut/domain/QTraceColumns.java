package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraceColumns is a Querydsl query type for QTraceColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraceColumns extends com.querydsl.sql.RelationalPathBase<QTraceColumns> {

    private static final long serialVersionUID = -1941217483;

    public static final QTraceColumns traceColumns = new QTraceColumns("trace_columns");

    public final BooleanPath isFilterable = createBoolean("isFilterable");

    public final BooleanPath isRepeatable = createBoolean("isRepeatable");

    public final BooleanPath isRepeatedBase = createBoolean("isRepeatedBase");

    public final NumberPath<Integer> maxSize = createNumber("maxSize", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> traceColumnId = createNumber("traceColumnId", Short.class);

    public final StringPath typeName = createString("typeName");

    public QTraceColumns(String variable) {
        super(QTraceColumns.class, forVariable(variable), "sys", "trace_columns");
        addMetadata();
    }

    public QTraceColumns(String variable, String schema, String table) {
        super(QTraceColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraceColumns(Path<? extends QTraceColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "trace_columns");
        addMetadata();
    }

    public QTraceColumns(PathMetadata metadata) {
        super(QTraceColumns.class, metadata, "sys", "trace_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isFilterable, ColumnMetadata.named("is_filterable").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRepeatable, ColumnMetadata.named("is_repeatable").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRepeatedBase, ColumnMetadata.named("is_repeated_base").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxSize, ColumnMetadata.named("max_size").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(traceColumnId, ColumnMetadata.named("trace_column_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(typeName, ColumnMetadata.named("type_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
    }

}

