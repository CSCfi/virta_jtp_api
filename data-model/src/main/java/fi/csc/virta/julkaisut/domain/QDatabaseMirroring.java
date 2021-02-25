package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseMirroring is a Querydsl query type for QDatabaseMirroring
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseMirroring extends com.querydsl.sql.RelationalPathBase<QDatabaseMirroring> {

    private static final long serialVersionUID = -1837026741;

    public static final QDatabaseMirroring databaseMirroring = new QDatabaseMirroring("database_mirroring");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> mirroringConnectionTimeout = createNumber("mirroringConnectionTimeout", Integer.class);

    public final NumberPath<java.math.BigInteger> mirroringEndOfLogLsn = createNumber("mirroringEndOfLogLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> mirroringFailoverLsn = createNumber("mirroringFailoverLsn", java.math.BigInteger.class);

    public final StringPath mirroringGuid = createString("mirroringGuid");

    public final StringPath mirroringPartnerInstance = createString("mirroringPartnerInstance");

    public final StringPath mirroringPartnerName = createString("mirroringPartnerName");

    public final NumberPath<Integer> mirroringRedoQueue = createNumber("mirroringRedoQueue", Integer.class);

    public final StringPath mirroringRedoQueueType = createString("mirroringRedoQueueType");

    public final NumberPath<java.math.BigInteger> mirroringReplicationLsn = createNumber("mirroringReplicationLsn", java.math.BigInteger.class);

    public final NumberPath<Byte> mirroringRole = createNumber("mirroringRole", Byte.class);

    public final StringPath mirroringRoleDesc = createString("mirroringRoleDesc");

    public final NumberPath<Integer> mirroringRoleSequence = createNumber("mirroringRoleSequence", Integer.class);

    public final NumberPath<Byte> mirroringSafetyLevel = createNumber("mirroringSafetyLevel", Byte.class);

    public final StringPath mirroringSafetyLevelDesc = createString("mirroringSafetyLevelDesc");

    public final NumberPath<Integer> mirroringSafetySequence = createNumber("mirroringSafetySequence", Integer.class);

    public final NumberPath<Byte> mirroringState = createNumber("mirroringState", Byte.class);

    public final StringPath mirroringStateDesc = createString("mirroringStateDesc");

    public final StringPath mirroringWitnessName = createString("mirroringWitnessName");

    public final NumberPath<Byte> mirroringWitnessState = createNumber("mirroringWitnessState", Byte.class);

    public final StringPath mirroringWitnessStateDesc = createString("mirroringWitnessStateDesc");

    public QDatabaseMirroring(String variable) {
        super(QDatabaseMirroring.class, forVariable(variable), "sys", "database_mirroring");
        addMetadata();
    }

    public QDatabaseMirroring(String variable, String schema, String table) {
        super(QDatabaseMirroring.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseMirroring(Path<? extends QDatabaseMirroring> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_mirroring");
        addMetadata();
    }

    public QDatabaseMirroring(PathMetadata metadata) {
        super(QDatabaseMirroring.class, metadata, "sys", "database_mirroring");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(mirroringConnectionTimeout, ColumnMetadata.named("mirroring_connection_timeout").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(mirroringEndOfLogLsn, ColumnMetadata.named("mirroring_end_of_log_lsn").withIndex(20).ofType(Types.NUMERIC).withSize(25));
        addMetadata(mirroringFailoverLsn, ColumnMetadata.named("mirroring_failover_lsn").withIndex(16).ofType(Types.NUMERIC).withSize(25));
        addMetadata(mirroringGuid, ColumnMetadata.named("mirroring_guid").withIndex(2).ofType(Types.CHAR).withSize(36));
        addMetadata(mirroringPartnerInstance, ColumnMetadata.named("mirroring_partner_instance").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(mirroringPartnerName, ColumnMetadata.named("mirroring_partner_name").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(mirroringRedoQueue, ColumnMetadata.named("mirroring_redo_queue").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(mirroringRedoQueueType, ColumnMetadata.named("mirroring_redo_queue_type").withIndex(19).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(mirroringReplicationLsn, ColumnMetadata.named("mirroring_replication_lsn").withIndex(21).ofType(Types.NUMERIC).withSize(25));
        addMetadata(mirroringRole, ColumnMetadata.named("mirroring_role").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(mirroringRoleDesc, ColumnMetadata.named("mirroring_role_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(mirroringRoleSequence, ColumnMetadata.named("mirroring_role_sequence").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(mirroringSafetyLevel, ColumnMetadata.named("mirroring_safety_level").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(mirroringSafetyLevelDesc, ColumnMetadata.named("mirroring_safety_level_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(mirroringSafetySequence, ColumnMetadata.named("mirroring_safety_sequence").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(mirroringState, ColumnMetadata.named("mirroring_state").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(mirroringStateDesc, ColumnMetadata.named("mirroring_state_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(mirroringWitnessName, ColumnMetadata.named("mirroring_witness_name").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(mirroringWitnessState, ColumnMetadata.named("mirroring_witness_state").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(mirroringWitnessStateDesc, ColumnMetadata.named("mirroring_witness_state_desc").withIndex(15).ofType(Types.NVARCHAR).withSize(60));
    }

}

