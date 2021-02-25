package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrAvailabilityGroupStates is a Querydsl query type for QDmHadrAvailabilityGroupStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrAvailabilityGroupStates extends com.querydsl.sql.RelationalPathBase<QDmHadrAvailabilityGroupStates> {

    private static final long serialVersionUID = 3601593;

    public static final QDmHadrAvailabilityGroupStates dmHadrAvailabilityGroupStates = new QDmHadrAvailabilityGroupStates("dm_hadr_availability_group_states");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Byte> primaryRecoveryHealth = createNumber("primaryRecoveryHealth", Byte.class);

    public final StringPath primaryRecoveryHealthDesc = createString("primaryRecoveryHealthDesc");

    public final StringPath primaryReplica = createString("primaryReplica");

    public final NumberPath<Byte> secondaryRecoveryHealth = createNumber("secondaryRecoveryHealth", Byte.class);

    public final StringPath secondaryRecoveryHealthDesc = createString("secondaryRecoveryHealthDesc");

    public final NumberPath<Byte> synchronizationHealth = createNumber("synchronizationHealth", Byte.class);

    public final StringPath synchronizationHealthDesc = createString("synchronizationHealthDesc");

    public QDmHadrAvailabilityGroupStates(String variable) {
        super(QDmHadrAvailabilityGroupStates.class, forVariable(variable), "sys", "dm_hadr_availability_group_states");
        addMetadata();
    }

    public QDmHadrAvailabilityGroupStates(String variable, String schema, String table) {
        super(QDmHadrAvailabilityGroupStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrAvailabilityGroupStates(Path<? extends QDmHadrAvailabilityGroupStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_availability_group_states");
        addMetadata();
    }

    public QDmHadrAvailabilityGroupStates(PathMetadata metadata) {
        super(QDmHadrAvailabilityGroupStates.class, metadata, "sys", "dm_hadr_availability_group_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(primaryRecoveryHealth, ColumnMetadata.named("primary_recovery_health").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(primaryRecoveryHealthDesc, ColumnMetadata.named("primary_recovery_health_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(primaryReplica, ColumnMetadata.named("primary_replica").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(secondaryRecoveryHealth, ColumnMetadata.named("secondary_recovery_health").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(secondaryRecoveryHealthDesc, ColumnMetadata.named("secondary_recovery_health_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(synchronizationHealth, ColumnMetadata.named("synchronization_health").withIndex(7).ofType(Types.TINYINT).withSize(3));
        addMetadata(synchronizationHealthDesc, ColumnMetadata.named("synchronization_health_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
    }

}

