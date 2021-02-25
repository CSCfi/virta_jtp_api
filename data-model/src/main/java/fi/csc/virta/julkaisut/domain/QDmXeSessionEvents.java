package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeSessionEvents is a Querydsl query type for QDmXeSessionEvents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeSessionEvents extends com.querydsl.sql.RelationalPathBase<QDmXeSessionEvents> {

    private static final long serialVersionUID = -525761700;

    public static final QDmXeSessionEvents dmXeSessionEvents = new QDmXeSessionEvents("dm_xe_session_events");

    public final StringPath eventName = createString("eventName");

    public final StringPath eventPackageGuid = createString("eventPackageGuid");

    public final StringPath eventPredicate = createString("eventPredicate");

    public final SimplePath<byte[]> eventSessionAddress = createSimple("eventSessionAddress", byte[].class);

    public QDmXeSessionEvents(String variable) {
        super(QDmXeSessionEvents.class, forVariable(variable), "sys", "dm_xe_session_events");
        addMetadata();
    }

    public QDmXeSessionEvents(String variable, String schema, String table) {
        super(QDmXeSessionEvents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeSessionEvents(Path<? extends QDmXeSessionEvents> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_session_events");
        addMetadata();
    }

    public QDmXeSessionEvents(PathMetadata metadata) {
        super(QDmXeSessionEvents.class, metadata, "sys", "dm_xe_session_events");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventName, ColumnMetadata.named("event_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(eventPackageGuid, ColumnMetadata.named("event_package_guid").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(eventPredicate, ColumnMetadata.named("event_predicate").withIndex(4).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(eventSessionAddress, ColumnMetadata.named("event_session_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

