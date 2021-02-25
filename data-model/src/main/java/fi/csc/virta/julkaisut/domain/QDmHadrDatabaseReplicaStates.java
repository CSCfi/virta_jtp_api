package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrDatabaseReplicaStates is a Querydsl query type for QDmHadrDatabaseReplicaStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrDatabaseReplicaStates extends com.querydsl.sql.RelationalPathBase<QDmHadrDatabaseReplicaStates> {

    private static final long serialVersionUID = -1349569646;

    public static final QDmHadrDatabaseReplicaStates dmHadrDatabaseReplicaStates = new QDmHadrDatabaseReplicaStates("dm_hadr_database_replica_states");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Byte> databaseState = createNumber("databaseState", Byte.class);

    public final StringPath databaseStateDesc = createString("databaseStateDesc");

    public final NumberPath<java.math.BigInteger> endOfLogLsn = createNumber("endOfLogLsn", java.math.BigInteger.class);

    public final NumberPath<Long> filestreamSendRate = createNumber("filestreamSendRate", Long.class);

    public final StringPath groupDatabaseId = createString("groupDatabaseId");

    public final StringPath groupId = createString("groupId");

    public final BooleanPath isCommitParticipant = createBoolean("isCommitParticipant");

    public final BooleanPath isLocal = createBoolean("isLocal");

    public final BooleanPath isSuspended = createBoolean("isSuspended");

    public final NumberPath<java.math.BigInteger> lastCommitLsn = createNumber("lastCommitLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> lastCommitTime = createDateTime("lastCommitTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> lastHardenedLsn = createNumber("lastHardenedLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> lastHardenedTime = createDateTime("lastHardenedTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> lastReceivedLsn = createNumber("lastReceivedLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> lastReceivedTime = createDateTime("lastReceivedTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> lastRedoneLsn = createNumber("lastRedoneLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> lastRedoneTime = createDateTime("lastRedoneTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> lastSentLsn = createNumber("lastSentLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> lastSentTime = createDateTime("lastSentTime", java.sql.Timestamp.class);

    public final NumberPath<Long> logSendQueueSize = createNumber("logSendQueueSize", Long.class);

    public final NumberPath<Long> logSendRate = createNumber("logSendRate", Long.class);

    public final NumberPath<Long> lowWaterMarkForGhosts = createNumber("lowWaterMarkForGhosts", Long.class);

    public final NumberPath<java.math.BigInteger> recoveryLsn = createNumber("recoveryLsn", java.math.BigInteger.class);

    public final NumberPath<Long> redoQueueSize = createNumber("redoQueueSize", Long.class);

    public final NumberPath<Long> redoRate = createNumber("redoRate", Long.class);

    public final StringPath replicaId = createString("replicaId");

    public final NumberPath<Byte> suspendReason = createNumber("suspendReason", Byte.class);

    public final StringPath suspendReasonDesc = createString("suspendReasonDesc");

    public final NumberPath<Byte> synchronizationHealth = createNumber("synchronizationHealth", Byte.class);

    public final StringPath synchronizationHealthDesc = createString("synchronizationHealthDesc");

    public final NumberPath<Byte> synchronizationState = createNumber("synchronizationState", Byte.class);

    public final StringPath synchronizationStateDesc = createString("synchronizationStateDesc");

    public final NumberPath<java.math.BigInteger> truncationLsn = createNumber("truncationLsn", java.math.BigInteger.class);

    public QDmHadrDatabaseReplicaStates(String variable) {
        super(QDmHadrDatabaseReplicaStates.class, forVariable(variable), "sys", "dm_hadr_database_replica_states");
        addMetadata();
    }

    public QDmHadrDatabaseReplicaStates(String variable, String schema, String table) {
        super(QDmHadrDatabaseReplicaStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrDatabaseReplicaStates(Path<? extends QDmHadrDatabaseReplicaStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_database_replica_states");
        addMetadata();
    }

    public QDmHadrDatabaseReplicaStates(PathMetadata metadata) {
        super(QDmHadrDatabaseReplicaStates.class, metadata, "sys", "dm_hadr_database_replica_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseState, ColumnMetadata.named("database_state").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(databaseStateDesc, ColumnMetadata.named("database_state_desc").withIndex(12).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(endOfLogLsn, ColumnMetadata.named("end_of_log_lsn").withIndex(31).ofType(Types.NUMERIC).withSize(25));
        addMetadata(filestreamSendRate, ColumnMetadata.named("filestream_send_rate").withIndex(30).ofType(Types.BIGINT).withSize(19));
        addMetadata(groupDatabaseId, ColumnMetadata.named("group_database_id").withIndex(4).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(isCommitParticipant, ColumnMetadata.named("is_commit_participant").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(isLocal, ColumnMetadata.named("is_local").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(isSuspended, ColumnMetadata.named("is_suspended").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(lastCommitLsn, ColumnMetadata.named("last_commit_lsn").withIndex(32).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastCommitTime, ColumnMetadata.named("last_commit_time").withIndex(33).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastHardenedLsn, ColumnMetadata.named("last_hardened_lsn").withIndex(22).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastHardenedTime, ColumnMetadata.named("last_hardened_time").withIndex(23).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastReceivedLsn, ColumnMetadata.named("last_received_lsn").withIndex(20).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastReceivedTime, ColumnMetadata.named("last_received_time").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastRedoneLsn, ColumnMetadata.named("last_redone_lsn").withIndex(24).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastRedoneTime, ColumnMetadata.named("last_redone_time").withIndex(25).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastSentLsn, ColumnMetadata.named("last_sent_lsn").withIndex(18).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastSentTime, ColumnMetadata.named("last_sent_time").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(logSendQueueSize, ColumnMetadata.named("log_send_queue_size").withIndex(26).ofType(Types.BIGINT).withSize(19));
        addMetadata(logSendRate, ColumnMetadata.named("log_send_rate").withIndex(27).ofType(Types.BIGINT).withSize(19));
        addMetadata(lowWaterMarkForGhosts, ColumnMetadata.named("low_water_mark_for_ghosts").withIndex(34).ofType(Types.BIGINT).withSize(19));
        addMetadata(recoveryLsn, ColumnMetadata.named("recovery_lsn").withIndex(16).ofType(Types.NUMERIC).withSize(25));
        addMetadata(redoQueueSize, ColumnMetadata.named("redo_queue_size").withIndex(28).ofType(Types.BIGINT).withSize(19));
        addMetadata(redoRate, ColumnMetadata.named("redo_rate").withIndex(29).ofType(Types.BIGINT).withSize(19));
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(suspendReason, ColumnMetadata.named("suspend_reason").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(suspendReasonDesc, ColumnMetadata.named("suspend_reason_desc").withIndex(15).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(synchronizationHealth, ColumnMetadata.named("synchronization_health").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(synchronizationHealthDesc, ColumnMetadata.named("synchronization_health_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(synchronizationState, ColumnMetadata.named("synchronization_state").withIndex(6).ofType(Types.TINYINT).withSize(3));
        addMetadata(synchronizationStateDesc, ColumnMetadata.named("synchronization_state_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(truncationLsn, ColumnMetadata.named("truncation_lsn").withIndex(17).ofType(Types.NUMERIC).withSize(25));
    }

}

