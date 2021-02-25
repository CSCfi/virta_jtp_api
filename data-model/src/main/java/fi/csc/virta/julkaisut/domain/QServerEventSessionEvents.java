package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerEventSessionEvents is a Querydsl query type for QServerEventSessionEvents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerEventSessionEvents extends com.querydsl.sql.RelationalPathBase<QServerEventSessionEvents> {

    private static final long serialVersionUID = -1317792683;

    public static final QServerEventSessionEvents serverEventSessionEvents = new QServerEventSessionEvents("server_event_session_events");

    public final NumberPath<Integer> eventId = createNumber("eventId", Integer.class);

    public final NumberPath<Integer> eventSessionId = createNumber("eventSessionId", Integer.class);

    public final StringPath module = createString("module");

    public final StringPath name = createString("name");

    public final StringPath packageCol = createString("packageCol");

    public final StringPath predicate = createString("predicate");

    public final StringPath predicateXml = createString("predicateXml");

    public QServerEventSessionEvents(String variable) {
        super(QServerEventSessionEvents.class, forVariable(variable), "sys", "server_event_session_events");
        addMetadata();
    }

    public QServerEventSessionEvents(String variable, String schema, String table) {
        super(QServerEventSessionEvents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerEventSessionEvents(Path<? extends QServerEventSessionEvents> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_event_session_events");
        addMetadata();
    }

    public QServerEventSessionEvents(PathMetadata metadata) {
        super(QServerEventSessionEvents.class, metadata, "sys", "server_event_session_events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventId, ColumnMetadata.named("event_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(eventSessionId, ColumnMetadata.named("event_session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(module, ColumnMetadata.named("module").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(packageCol, ColumnMetadata.named("package").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(predicate, ColumnMetadata.named("predicate").withIndex(6).ofType(Types.NVARCHAR).withSize(3000));
        addMetadata(predicateXml, ColumnMetadata.named("predicate_xml").withIndex(7).ofType(Types.NVARCHAR).withSize(2147483647));
    }

}

