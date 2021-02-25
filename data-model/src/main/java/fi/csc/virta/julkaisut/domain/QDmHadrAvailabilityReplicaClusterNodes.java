package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrAvailabilityReplicaClusterNodes is a Querydsl query type for QDmHadrAvailabilityReplicaClusterNodes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrAvailabilityReplicaClusterNodes extends com.querydsl.sql.RelationalPathBase<QDmHadrAvailabilityReplicaClusterNodes> {

    private static final long serialVersionUID = 1787991303;

    public static final QDmHadrAvailabilityReplicaClusterNodes dmHadrAvailabilityReplicaClusterNodes = new QDmHadrAvailabilityReplicaClusterNodes("dm_hadr_availability_replica_cluster_nodes");

    public final StringPath groupName = createString("groupName");

    public final StringPath nodeName = createString("nodeName");

    public final StringPath replicaServerName = createString("replicaServerName");

    public QDmHadrAvailabilityReplicaClusterNodes(String variable) {
        super(QDmHadrAvailabilityReplicaClusterNodes.class, forVariable(variable), "sys", "dm_hadr_availability_replica_cluster_nodes");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterNodes(String variable, String schema, String table) {
        super(QDmHadrAvailabilityReplicaClusterNodes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterNodes(Path<? extends QDmHadrAvailabilityReplicaClusterNodes> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_availability_replica_cluster_nodes");
        addMetadata();
    }

    public QDmHadrAvailabilityReplicaClusterNodes(PathMetadata metadata) {
        super(QDmHadrAvailabilityReplicaClusterNodes.class, metadata, "sys", "dm_hadr_availability_replica_cluster_nodes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupName, ColumnMetadata.named("group_name").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(nodeName, ColumnMetadata.named("node_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(replicaServerName, ColumnMetadata.named("replica_server_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

