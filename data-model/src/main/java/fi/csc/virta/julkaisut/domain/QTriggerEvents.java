package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTriggerEvents is a Querydsl query type for QTriggerEvents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTriggerEvents extends com.querydsl.sql.RelationalPathBase<QTriggerEvents> {

    private static final long serialVersionUID = -972235724;

    public static final QTriggerEvents triggerEvents = new QTriggerEvents("trigger_events");

    public final NumberPath<Integer> eventGroupType = createNumber("eventGroupType", Integer.class);

    public final StringPath eventGroupTypeDesc = createString("eventGroupTypeDesc");

    public final BooleanPath isFirst = createBoolean("isFirst");

    public final BooleanPath isLast = createBoolean("isLast");

    public final BooleanPath isTriggerEvent = createBoolean("isTriggerEvent");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QTriggerEvents(String variable) {
        super(QTriggerEvents.class, forVariable(variable), "sys", "trigger_events");
        addMetadata();
    }

    public QTriggerEvents(String variable, String schema, String table) {
        super(QTriggerEvents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTriggerEvents(Path<? extends QTriggerEvents> path) {
        super(path.getType(), path.getMetadata(), "sys", "trigger_events");
        addMetadata();
    }

    public QTriggerEvents(PathMetadata metadata) {
        super(QTriggerEvents.class, metadata, "sys", "trigger_events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventGroupType, ColumnMetadata.named("event_group_type").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(eventGroupTypeDesc, ColumnMetadata.named("event_group_type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isFirst, ColumnMetadata.named("is_first").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(isLast, ColumnMetadata.named("is_last").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(isTriggerEvent, ColumnMetadata.named("is_trigger_event").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

