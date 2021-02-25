package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrAvailabilityReplicaClusterStates is a Querydsl query type for QDmHadrAvailabilityReplicaClusterStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrAvailabilityReplicaClusterStates extends com.querydsl.sql.RelationalPathBase<QDmHadrAvailabilityReplicaClusterStates> {

    private static final long serialVersionUID = -259156372;

    public static final QDmHadrAvailabilityReplicaClusterStates dmHadrAvailabilityReplicaClusterStates = new QDmHadrAvailabilityReplicaClusterStates("dm_hadr_availability_replica_cluster_states");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Byte> joinState = createNumber("joinState", Byte.class);

    public final StringPath joinStateDesc = createString("joinStateDesc");

    public final StringPath replicaId = createString("replicaId");

    public final StringPath replicaServerName = createString("replicaServerName");

    public QDmHadrAvailabilityReplicaClusterStates(String variable) {
        super(QDmHadrAvailabilityReplicaClusterStates.class, forVariable(variable), "sys", "dm_hadr_availability_replica_cluster_states");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterStates(String variable, String schema, String table) {
        super(QDmHadrAvailabilityReplicaClusterStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterStates(Path<? extends QDmHadrAvailabilityReplicaClusterStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_availability_replica_cluster_states");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterStates(PathMetadata metadata) {
        super(QDmHadrAvailabilityReplicaClusterStates.class, metadata, "sys", "dm_hadr_availability_replica_cluster_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(joinState, ColumnMetadata.named("join_state").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(joinStateDesc, ColumnMetadata.named("join_state_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(replicaServerName, ColumnMetadata.named("replica_server_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

