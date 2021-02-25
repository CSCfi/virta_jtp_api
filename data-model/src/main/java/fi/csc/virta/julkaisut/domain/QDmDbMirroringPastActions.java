package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMirroringPastActions is a Querydsl query type for QDmDbMirroringPastActions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMirroringPastActions extends com.querydsl.sql.RelationalPathBase<QDmDbMirroringPastActions> {

    private static final long serialVersionUID = 1506974508;

    public static final QDmDbMirroringPastActions dmDbMirroringPastActions = new QDmDbMirroringPastActions("dm_db_mirroring_past_actions");

    public final NumberPath<Integer> actionSequence = createNumber("actionSequence", Integer.class);

    public final StringPath actionType = createString("actionType");

    public final StringPath currentState = createString("currentState");

    public final StringPath mirroringGuid = createString("mirroringGuid");

    public final StringPath name = createString("name");

    public final StringPath stateMachineName = createString("stateMachineName");

    public QDmDbMirroringPastActions(String variable) {
        super(QDmDbMirroringPastActions.class, forVariable(variable), "sys", "dm_db_mirroring_past_actions");
        addMetadata();
    }

    public QDmDbMirroringPastActions(String variable, String schema, String table) {
        super(QDmDbMirroringPastActions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMirroringPastActions(Path<? extends QDmDbMirroringPastActions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_mirroring_past_actions");
        addMetadata();
    }

    public QDmDbMirroringPastActions(PathMetadata metadata) {
        super(QDmDbMirroringPastActions.class, metadata, "sys", "dm_db_mirroring_past_actions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionSequence, ColumnMetadata.named("action_sequence").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(actionType, ColumnMetadata.named("action_type").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(currentState, ColumnMetadata.named("current_state").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(mirroringGuid, ColumnMetadata.named("mirroring_guid").withIndex(1).ofType(Types.CHAR).withSize(36));
        addMetadata(name, ColumnMetadata.named("name").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(stateMachineName, ColumnMetadata.named("state_machine_name").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
    }

}

