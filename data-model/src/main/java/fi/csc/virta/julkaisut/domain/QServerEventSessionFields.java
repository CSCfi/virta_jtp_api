package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerEventSessionFields is a Querydsl query type for QServerEventSessionFields
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerEventSessionFields extends com.querydsl.sql.RelationalPathBase<QServerEventSessionFields> {

    private static final long serialVersionUID = -1301171723;

    public static final QServerEventSessionFields serverEventSessionFields = new QServerEventSessionFields("server_event_session_fields");

    public final NumberPath<Integer> eventSessionId = createNumber("eventSessionId", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final SimplePath<Object> value = createSimple("value", Object.class);

    public QServerEventSessionFields(String variable) {
        super(QServerEventSessionFields.class, forVariable(variable), "sys", "server_event_session_fields");
        addMetadata();
    }

    public QServerEventSessionFields(String variable, String schema, String table) {
        super(QServerEventSessionFields.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerEventSessionFields(Path<? extends QServerEventSessionFields> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_event_session_fields");
        addMetadata();
    }

    public QServerEventSessionFields(PathMetadata metadata) {
        super(QServerEventSessionFields.class, metadata, "sys", "server_event_session_fields");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventSessionId, ColumnMetadata.named("event_session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(-150).withSize(2147483647));
    }

}

