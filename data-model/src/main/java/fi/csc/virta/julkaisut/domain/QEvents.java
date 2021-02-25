package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEvents is a Querydsl query type for QEvents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEvents extends com.querydsl.sql.RelationalPathBase<QEvents> {

    private static final long serialVersionUID = -1909468362;

    public static final QEvents events = new QEvents("events");

    public final NumberPath<Integer> eventGroupType = createNumber("eventGroupType", Integer.class);

    public final StringPath eventGroupTypeDesc = createString("eventGroupTypeDesc");

    public final BooleanPath isTriggerEvent = createBoolean("isTriggerEvent");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QEvents(String variable) {
        super(QEvents.class, forVariable(variable), "sys", "events");
        addMetadata();
    }

    public QEvents(String variable, String schema, String table) {
        super(QEvents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEvents(Path<? extends QEvents> path) {
        super(path.getType(), path.getMetadata(), "sys", "events");
        addMetadata();
    }

    public QEvents(PathMetadata metadata) {
        super(QEvents.class, metadata, "sys", "events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventGroupType, ColumnMetadata.named("event_group_type").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(eventGroupTypeDesc, ColumnMetadata.named("event_group_type_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isTriggerEvent, ColumnMetadata.named("is_trigger_event").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

