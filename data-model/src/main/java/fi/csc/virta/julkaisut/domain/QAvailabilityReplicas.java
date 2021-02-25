package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityReplicas is a Querydsl query type for QAvailabilityReplicas
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityReplicas extends com.querydsl.sql.RelationalPathBase<QAvailabilityReplicas> {

    private static final long serialVersionUID = 99201171;

    public static final QAvailabilityReplicas availabilityReplicas = new QAvailabilityReplicas("availability_replicas");

    public final NumberPath<Byte> availabilityMode = createNumber("availabilityMode", Byte.class);

    public final StringPath availabilityModeDesc = createString("availabilityModeDesc");

    public final NumberPath<Integer> backupPriority = createNumber("backupPriority", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath endpointUrl = createString("endpointUrl");

    public final NumberPath<Byte> failoverMode = createNumber("failoverMode", Byte.class);

    public final StringPath failoverModeDesc = createString("failoverModeDesc");

    public final StringPath groupId = createString("groupId");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final SimplePath<byte[]> ownerSid = createSimple("ownerSid", byte[].class);

    public final NumberPath<Byte> primaryRoleAllowConnections = createNumber("primaryRoleAllowConnections", Byte.class);

    public final StringPath primaryRoleAllowConnectionsDesc = createString("primaryRoleAllowConnectionsDesc");

    public final StringPath readOnlyRoutingUrl = createString("readOnlyRoutingUrl");

    public final StringPath replicaId = createString("replicaId");

    public final NumberPath<Integer> replicaMetadataId = createNumber("replicaMetadataId", Integer.class);

    public final StringPath replicaServerName = createString("replicaServerName");

    public final NumberPath<Byte> secondaryRoleAllowConnections = createNumber("secondaryRoleAllowConnections", Byte.class);

    public final StringPath secondaryRoleAllowConnectionsDesc = createString("secondaryRoleAllowConnectionsDesc");

    public final NumberPath<Integer> sessionTimeout = createNumber("sessionTimeout", Integer.class);

    public QAvailabilityReplicas(String variable) {
        super(QAvailabilityReplicas.class, forVariable(variable), "sys", "availability_replicas");
        addMetadata();
    }

    public QAvailabilityReplicas(String variable, String schema, String table) {
        super(QAvailabilityReplicas.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityReplicas(Path<? extends QAvailabilityReplicas> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_replicas");
        addMetadata();
    }

    public QAvailabilityReplicas(PathMetadata metadata) {
        super(QAvailabilityReplicas.class, metadata, "sys", "availability_replicas");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(availabilityMode, ColumnMetadata.named("availability_mode").withIndex(7).ofType(Types.TINYINT).withSize(3));
        addMetadata(availabilityModeDesc, ColumnMetadata.named("availability_mode_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(backupPriority, ColumnMetadata.named("backup_priority").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(endpointUrl, ColumnMetadata.named("endpoint_url").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(failoverMode, ColumnMetadata.named("failover_mode").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(failoverModeDesc, ColumnMetadata.named("failover_mode_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(2).ofType(Types.CHAR).withSize(36));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(ownerSid, ColumnMetadata.named("owner_sid").withIndex(5).ofType(Types.VARBINARY).withSize(85));
        addMetadata(primaryRoleAllowConnections, ColumnMetadata.named("primary_role_allow_connections").withIndex(12).ofType(Types.TINYINT).withSize(3));
        addMetadata(primaryRoleAllowConnectionsDesc, ColumnMetadata.named("primary_role_allow_connections_desc").withIndex(13).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(readOnlyRoutingUrl, ColumnMetadata.named("read_only_routing_url").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(1).ofType(Types.CHAR).withSize(36));
        addMetadata(replicaMetadataId, ColumnMetadata.named("replica_metadata_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(replicaServerName, ColumnMetadata.named("replica_server_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(secondaryRoleAllowConnections, ColumnMetadata.named("secondary_role_allow_connections").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(secondaryRoleAllowConnectionsDesc, ColumnMetadata.named("secondary_role_allow_connections_desc").withIndex(15).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(sessionTimeout, ColumnMetadata.named("session_timeout").withIndex(11).ofType(Types.INTEGER).withSize(10));
    }

}

