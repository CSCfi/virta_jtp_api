package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraceSubclassValues is a Querydsl query type for QTraceSubclassValues
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraceSubclassValues extends com.querydsl.sql.RelationalPathBase<QTraceSubclassValues> {

    private static final long serialVersionUID = -92809182;

    public static final QTraceSubclassValues traceSubclassValues = new QTraceSubclassValues("trace_subclass_values");

    public final StringPath subclassName = createString("subclassName");

    public final NumberPath<Short> subclassValue = createNumber("subclassValue", Short.class);

    public final NumberPath<Short> traceColumnId = createNumber("traceColumnId", Short.class);

    public final NumberPath<Short> traceEventId = createNumber("traceEventId", Short.class);

    public QTraceSubclassValues(String variable) {
        super(QTraceSubclassValues.class, forVariable(variable), "sys", "trace_subclass_values");
        addMetadata();
    }

    public QTraceSubclassValues(String variable, String schema, String table) {
        super(QTraceSubclassValues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraceSubclassValues(Path<? extends QTraceSubclassValues> path) {
        super(path.getType(), path.getMetadata(), "sys", "trace_subclass_values");
        addMetadata();
    }

    public QTraceSubclassValues(PathMetadata metadata) {
        super(QTraceSubclassValues.class, metadata, "sys", "trace_subclass_values");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(subclassName, ColumnMetadata.named("subclass_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(subclassValue, ColumnMetadata.named("subclass_value").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(traceColumnId, ColumnMetadata.named("trace_column_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(traceEventId, ColumnMetadata.named("trace_event_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

