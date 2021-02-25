package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseRecoveryStatus is a Querydsl query type for QDatabaseRecoveryStatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseRecoveryStatus extends com.querydsl.sql.RelationalPathBase<QDatabaseRecoveryStatus> {

    private static final long serialVersionUID = 493009503;

    public static final QDatabaseRecoveryStatus databaseRecoveryStatus = new QDatabaseRecoveryStatus("database_recovery_status");

    public final StringPath databaseGuid = createString("databaseGuid");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final StringPath familyGuid = createString("familyGuid");

    public final StringPath firstRecoveryForkGuid = createString("firstRecoveryForkGuid");

    public final NumberPath<java.math.BigInteger> forkPointLsn = createNumber("forkPointLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> lastLogBackupLsn = createNumber("lastLogBackupLsn", java.math.BigInteger.class);

    public final StringPath recoveryForkGuid = createString("recoveryForkGuid");

    public QDatabaseRecoveryStatus(String variable) {
        super(QDatabaseRecoveryStatus.class, forVariable(variable), "sys", "database_recovery_status");
        addMetadata();
    }

    public QDatabaseRecoveryStatus(String variable, String schema, String table) {
        super(QDatabaseRecoveryStatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseRecoveryStatus(Path<? extends QDatabaseRecoveryStatus> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_recovery_status");
        addMetadata();
    }

    public QDatabaseRecoveryStatus(PathMetadata metadata) {
        super(QDatabaseRecoveryStatus.class, metadata, "sys", "database_recovery_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseGuid, ColumnMetadata.named("database_guid").withIndex(2).ofType(Types.CHAR).withSize(36));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(familyGuid, ColumnMetadata.named("family_guid").withIndex(3).ofType(Types.CHAR).withSize(36));
        addMetadata(firstRecoveryForkGuid, ColumnMetadata.named("first_recovery_fork_guid").withIndex(6).ofType(Types.CHAR).withSize(36));
        addMetadata(forkPointLsn, ColumnMetadata.named("fork_point_lsn").withIndex(7).ofType(Types.NUMERIC).withSize(25));
        addMetadata(lastLogBackupLsn, ColumnMetadata.named("last_log_backup_lsn").withIndex(4).ofType(Types.NUMERIC).withSize(25));
        addMetadata(recoveryForkGuid, ColumnMetadata.named("recovery_fork_guid").withIndex(5).ofType(Types.CHAR).withSize(36));
    }

}

