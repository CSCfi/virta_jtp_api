package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraceEvents is a Querydsl query type for QTraceEvents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraceEvents extends com.querydsl.sql.RelationalPathBase<QTraceEvents> {

    private static final long serialVersionUID = 555077313;

    public static final QTraceEvents traceEvents = new QTraceEvents("trace_events");

    public final NumberPath<Short> categoryId = createNumber("categoryId", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> traceEventId = createNumber("traceEventId", Short.class);

    public QTraceEvents(String variable) {
        super(QTraceEvents.class, forVariable(variable), "sys", "trace_events");
        addMetadata();
    }

    public QTraceEvents(String variable, String schema, String table) {
        super(QTraceEvents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraceEvents(Path<? extends QTraceEvents> path) {
        super(path.getType(), path.getMetadata(), "sys", "trace_events");
        addMetadata();
    }

    public QTraceEvents(PathMetadata metadata) {
        super(QTraceEvents.class, metadata, "sys", "trace_events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(categoryId, ColumnMetadata.named("category_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(traceEventId, ColumnMetadata.named("trace_event_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
    }

}

