package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerEventSessionActions is a Querydsl query type for QServerEventSessionActions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerEventSessionActions extends com.querydsl.sql.RelationalPathBase<QServerEventSessionActions> {

    private static final long serialVersionUID = -1982169791;

    public static final QServerEventSessionActions serverEventSessionActions = new QServerEventSessionActions("server_event_session_actions");

    public final NumberPath<Integer> eventId = createNumber("eventId", Integer.class);

    public final NumberPath<Integer> eventSessionId = createNumber("eventSessionId", Integer.class);

    public final StringPath module = createString("module");

    public final StringPath name = createString("name");

    public final StringPath packageCol = createString("packageCol");

    public QServerEventSessionActions(String variable) {
        super(QServerEventSessionActions.class, forVariable(variable), "sys", "server_event_session_actions");
        addMetadata();
    }

    public QServerEventSessionActions(String variable, String schema, String table) {
        super(QServerEventSessionActions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerEventSessionActions(Path<? extends QServerEventSessionActions> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_event_session_actions");
        addMetadata();
    }

    public QServerEventSessionActions(PathMetadata metadata) {
        super(QServerEventSessionActions.class, metadata, "sys", "server_event_session_actions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventId, ColumnMetadata.named("event_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(eventSessionId, ColumnMetadata.named("event_session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(module, ColumnMetadata.named("module").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(packageCol, ColumnMetadata.named("package").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
    }

}

