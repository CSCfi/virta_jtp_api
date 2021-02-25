package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrAvailabilityReplicaStates is a Querydsl query type for QDmHadrAvailabilityReplicaStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrAvailabilityReplicaStates extends com.querydsl.sql.RelationalPathBase<QDmHadrAvailabilityReplicaStates> {

    private static final long serialVersionUID = 326109746;

    public static final QDmHadrAvailabilityReplicaStates dmHadrAvailabilityReplicaStates = new QDmHadrAvailabilityReplicaStates("dm_hadr_availability_replica_states");

    public final NumberPath<Byte> connectedState = createNumber("connectedState", Byte.class);

    public final StringPath connectedStateDesc = createString("connectedStateDesc");

    public final StringPath groupId = createString("groupId");

    public final BooleanPath isLocal = createBoolean("isLocal");

    public final StringPath lastConnectErrorDescription = createString("lastConnectErrorDescription");

    public final NumberPath<Integer> lastConnectErrorNumber = createNumber("lastConnectErrorNumber", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastConnectErrorTimestamp = createDateTime("lastConnectErrorTimestamp", java.sql.Timestamp.class);

    public final NumberPath<Byte> operationalState = createNumber("operationalState", Byte.class);

    public final StringPath operationalStateDesc = createString("operationalStateDesc");

    public final NumberPath<Byte> recoveryHealth = createNumber("recoveryHealth", Byte.class);

    public final StringPath recoveryHealthDesc = createString("recoveryHealthDesc");

    public final StringPath replicaId = createString("replicaId");

    public final NumberPath<Byte> role = createNumber("role", Byte.class);

    public final StringPath roleDesc = createString("roleDesc");

    public final NumberPath<Byte> synchronizationHealth = createNumber("synchronizationHealth", Byte.class);

    public final StringPath synchronizationHealthDesc = createString("synchronizationHealthDesc");

    public QDmHadrAvailabilityReplicaStates(String variable) {
        super(QDmHadrAvailabilityReplicaStates.class, forVariable(variable), "sys", "dm_hadr_availability_replica_states");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaStates(String variable, String schema, String table) {
        super(QDmHadrAvailabilityReplicaStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaStates(Path<? extends QDmHadrAvailabilityReplicaStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_availability_replica_states");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaStates(PathMetadata metadata) {
        super(QDmHadrAvailabilityReplicaStates.class, metadata, "sys", "dm_hadr_availability_replica_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(connectedState, ColumnMetadata.named("connected_state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(connectedStateDesc, ColumnMetadata.named("connected_state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(isLocal, ColumnMetadata.named("is_local").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(lastConnectErrorDescription, ColumnMetadata.named("last_connect_error_description").withIndex(15).ofType(Types.NVARCHAR).withSize(1024));
        addMetadata(lastConnectErrorNumber, ColumnMetadata.named("last_connect_error_number").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(lastConnectErrorTimestamp, ColumnMetadata.named("last_connect_error_timestamp").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(operationalState, ColumnMetadata.named("operational_state").withIndex(6).ofType(Types.TINYINT).withSize(3));
        addMetadata(operationalStateDesc, ColumnMetadata.named("operational_state_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(recoveryHealth, ColumnMetadata.named("recovery_health").withIndex(10).ofType(Types.TINYINT).withSize(3));
        addMetadata(recoveryHealthDesc, ColumnMetadata.named("recovery_health_desc").withIndex(11).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(role, ColumnMetadata.named("role").withIndex(4).ofType(Types.TINYINT).withSize(3));
        addMetadata(roleDesc, ColumnMetadata.named("role_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(synchronizationHealth, ColumnMetadata.named("synchronization_health").withIndex(12).ofType(Types.TINYINT).withSize(3));
        addMetadata(synchronizationHealthDesc, ColumnMetadata.named("synchronization_health_desc").withIndex(13).ofType(Types.NVARCHAR).withSize(60));
    }

}

