package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraceEventBindings is a Querydsl query type for QTraceEventBindings
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraceEventBindings extends com.querydsl.sql.RelationalPathBase<QTraceEventBindings> {

    private static final long serialVersionUID = -2115656544;

    public static final QTraceEventBindings traceEventBindings = new QTraceEventBindings("trace_event_bindings");

    public final NumberPath<Short> traceColumnId = createNumber("traceColumnId", Short.class);

    public final NumberPath<Short> traceEventId = createNumber("traceEventId", Short.class);

    public QTraceEventBindings(String variable) {
        super(QTraceEventBindings.class, forVariable(variable), "sys", "trace_event_bindings");
        addMetadata();
    }

    public QTraceEventBindings(String variable, String schema, String table) {
        super(QTraceEventBindings.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraceEventBindings(Path<? extends QTraceEventBindings> path) {
        super(path.getType(), path.getMetadata(), "sys", "trace_event_bindings");
        addMetadata();
    }

    public QTraceEventBindings(PathMetadata metadata) {
        super(QTraceEventBindings.class, metadata, "sys", "trace_event_bindings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(traceColumnId, ColumnMetadata.named("trace_column_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(traceEventId, ColumnMetadata.named("trace_event_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

