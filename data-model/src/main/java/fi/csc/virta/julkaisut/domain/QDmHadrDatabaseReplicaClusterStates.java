package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrDatabaseReplicaClusterStates is a Querydsl query type for QDmHadrDatabaseReplicaClusterStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrDatabaseReplicaClusterStates extends com.querydsl.sql.RelationalPathBase<QDmHadrDatabaseReplicaClusterStates> {

    private static final long serialVersionUID = 1211048204;

    public static final QDmHadrDatabaseReplicaClusterStates dmHadrDatabaseReplicaClusterStates = new QDmHadrDatabaseReplicaClusterStates("dm_hadr_database_replica_cluster_states");

    public final StringPath databaseName = createString("databaseName");

    public final StringPath groupDatabaseId = createString("groupDatabaseId");

    public final BooleanPath isDatabaseJoined = createBoolean("isDatabaseJoined");

    public final BooleanPath isFailoverReady = createBoolean("isFailoverReady");

    public final BooleanPath isPendingSecondarySuspend = createBoolean("isPendingSecondarySuspend");

    public final NumberPath<java.math.BigInteger> recoveryLsn = createNumber("recoveryLsn", java.math.BigInteger.class);

    public final StringPath replicaId = createString("replicaId");

    public final NumberPath<java.math.BigInteger> truncationLsn = createNumber("truncationLsn", java.math.BigInteger.class);

    public QDmHadrDatabaseReplicaClusterStates(String variable) {
        super(QDmHadrDatabaseReplicaClusterStates.class, forVariable(variable), "sys", "dm_hadr_database_replica_cluster_states");
        addMetadata();
    }

    public QDmHadrDatabaseReplicaClusterStates(String variable, String schema, String table) {
        super(QDmHadrDatabaseReplicaClusterStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrDatabaseReplicaClusterStates(Path<? extends QDmHadrDatabaseReplicaClusterStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_database_replica_cluster_states");
        addMetadata();
    }

    public QDmHadrDatabaseReplicaClusterStates(PathMetadata metadata) {
        super(QDmHadrDatabaseReplicaClusterStates.class, metadata, "sys", "dm_hadr_database_replica_cluster_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseName, ColumnMetadata.named("database_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(groupDatabaseId, ColumnMetadata.named("group_database_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(isDatabaseJoined, ColumnMetadata.named("is_database_joined").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFailoverReady, ColumnMetadata.named("is_failover_ready").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPendingSecondarySuspend, ColumnMetadata.named("is_pending_secondary_suspend").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(recoveryLsn, ColumnMetadata.named("recovery_lsn").withIndex(7).ofType(Types.NUMERIC).withSize(25));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(truncationLsn, ColumnMetadata.named("truncation_lsn").withIndex(8).ofType(Types.NUMERIC).withSize(25));
    }

}

