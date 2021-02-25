package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmAuditActions is a Querydsl query type for QDmAuditActions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmAuditActions extends com.querydsl.sql.RelationalPathBase<QDmAuditActions> {

    private static final long serialVersionUID = 1990633704;

    public static final QDmAuditActions dmAuditActions = new QDmAuditActions("dm_audit_actions");

    public final StringPath actionId = createString("actionId");

    public final BooleanPath actionInLog = createBoolean("actionInLog");

    public final StringPath classDesc = createString("classDesc");

    public final StringPath configurationLevel = createString("configurationLevel");

    public final StringPath containingGroupName = createString("containingGroupName");

    public final StringPath coveringActionName = createString("coveringActionName");

    public final StringPath coveringParentActionName = createString("coveringParentActionName");

    public final StringPath name = createString("name");

    public final StringPath parentClassDesc = createString("parentClassDesc");

    public QDmAuditActions(String variable) {
        super(QDmAuditActions.class, forVariable(variable), "sys", "dm_audit_actions");
        addMetadata();
    }

    public QDmAuditActions(String variable, String schema, String table) {
        super(QDmAuditActions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmAuditActions(Path<? extends QDmAuditActions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_audit_actions");
        addMetadata();
    }

    public QDmAuditActions(PathMetadata metadata) {
        super(QDmAuditActions.class, metadata, "sys", "dm_audit_actions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(1).ofType(Types.VARCHAR).withSize(4));
        addMetadata(actionInLog, ColumnMetadata.named("action_in_log").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(35));
        addMetadata(configurationLevel, ColumnMetadata.named("configuration_level").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(containingGroupName, ColumnMetadata.named("containing_group_name").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(coveringActionName, ColumnMetadata.named("covering_action_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(coveringParentActionName, ColumnMetadata.named("covering_parent_action_name").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(parentClassDesc, ColumnMetadata.named("parent_class_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(35));
    }

}

