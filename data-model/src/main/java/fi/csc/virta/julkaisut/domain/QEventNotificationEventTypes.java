package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEventNotificationEventTypes is a Querydsl query type for QEventNotificationEventTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEventNotificationEventTypes extends com.querydsl.sql.RelationalPathBase<QEventNotificationEventTypes> {

    private static final long serialVersionUID = 1077101191;

    public static final QEventNotificationEventTypes eventNotificationEventTypes = new QEventNotificationEventTypes("event_notification_event_types");

    public final NumberPath<Integer> parentType = createNumber("parentType", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath typeName = createString("typeName");

    public QEventNotificationEventTypes(String variable) {
        super(QEventNotificationEventTypes.class, forVariable(variable), "sys", "event_notification_event_types");
        addMetadata();
    }

    public QEventNotificationEventTypes(String variable, String schema, String table) {
        super(QEventNotificationEventTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEventNotificationEventTypes(Path<? extends QEventNotificationEventTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "event_notification_event_types");
        addMetadata();
    }

    public QEventNotificationEventTypes(PathMetadata metadata) {
        super(QEventNotificationEventTypes.class, metadata, "sys", "event_notification_event_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(parentType, ColumnMetadata.named("parent_type").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(type, ColumnMetadata.named("type").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(typeName, ColumnMetadata.named("type_name").withIndex(2).ofType(Types.NVARCHAR).withSize(64));
    }

}

