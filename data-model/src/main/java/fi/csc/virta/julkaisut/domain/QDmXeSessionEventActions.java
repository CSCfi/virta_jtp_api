package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeSessionEventActions is a Querydsl query type for QDmXeSessionEventActions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeSessionEventActions extends com.querydsl.sql.RelationalPathBase<QDmXeSessionEventActions> {

    private static final long serialVersionUID = 730124550;

    public static final QDmXeSessionEventActions dmXeSessionEventActions = new QDmXeSessionEventActions("dm_xe_session_event_actions");

    public final StringPath actionName = createString("actionName");

    public final StringPath actionPackageGuid = createString("actionPackageGuid");

    public final StringPath eventName = createString("eventName");

    public final StringPath eventPackageGuid = createString("eventPackageGuid");

    public final SimplePath<byte[]> eventSessionAddress = createSimple("eventSessionAddress", byte[].class);

    public QDmXeSessionEventActions(String variable) {
        super(QDmXeSessionEventActions.class, forVariable(variable), "sys", "dm_xe_session_event_actions");
        addMetadata();
    }

    public QDmXeSessionEventActions(String variable, String schema, String table) {
        super(QDmXeSessionEventActions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeSessionEventActions(Path<? extends QDmXeSessionEventActions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_session_event_actions");
        addMetadata();
    }

    public QDmXeSessionEventActions(PathMetadata metadata) {
        super(QDmXeSessionEventActions.class, metadata, "sys", "dm_xe_session_event_actions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionName, ColumnMetadata.named("action_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(actionPackageGuid, ColumnMetadata.named("action_package_guid").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(eventName, ColumnMetadata.named("event_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(eventPackageGuid, ColumnMetadata.named("event_package_guid").withIndex(5).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(eventSessionAddress, ColumnMetadata.named("event_session_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

