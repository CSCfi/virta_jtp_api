package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEventNotifications is a Querydsl query type for QEventNotifications
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEventNotifications extends com.querydsl.sql.RelationalPathBase<QEventNotifications> {

    private static final long serialVersionUID = 1682475787;

    public static final QEventNotifications eventNotifications = new QEventNotifications("event_notifications");

    public final StringPath brokerInstance = createString("brokerInstance");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final SimplePath<byte[]> creatorSid = createSimple("creatorSid", byte[].class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Byte> parentClass = createNumber("parentClass", Byte.class);

    public final StringPath parentClassDesc = createString("parentClassDesc");

    public final NumberPath<Integer> parentId = createNumber("parentId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath serviceName = createString("serviceName");

    public QEventNotifications(String variable) {
        super(QEventNotifications.class, forVariable(variable), "sys", "event_notifications");
        addMetadata();
    }

    public QEventNotifications(String variable, String schema, String table) {
        super(QEventNotifications.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEventNotifications(Path<? extends QEventNotifications> path) {
        super(path.getType(), path.getMetadata(), "sys", "event_notifications");
        addMetadata();
    }

    public QEventNotifications(PathMetadata metadata) {
        super(QEventNotifications.class, metadata, "sys", "event_notifications");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(brokerInstance, ColumnMetadata.named("broker_instance").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(creatorSid, ColumnMetadata.named("creator_sid").withIndex(10).ofType(Types.VARBINARY).withSize(85));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentClass, ColumnMetadata.named("parent_class").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(parentClassDesc, ColumnMetadata.named("parent_class_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(parentId, ColumnMetadata.named("parent_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(serviceName, ColumnMetadata.named("service_name").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
    }

}

