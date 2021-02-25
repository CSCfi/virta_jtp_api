package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranDatabaseTransactions is a Querydsl query type for QDmTranDatabaseTransactions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranDatabaseTransactions extends com.querydsl.sql.RelationalPathBase<QDmTranDatabaseTransactions> {

    private static final long serialVersionUID = 1897404801;

    public static final QDmTranDatabaseTransactions dmTranDatabaseTransactions = new QDmTranDatabaseTransactions("dm_tran_database_transactions");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionBeginLsn = createNumber("databaseTransactionBeginLsn", java.math.BigInteger.class);

    public final DateTimePath<java.sql.Timestamp> databaseTransactionBeginTime = createDateTime("databaseTransactionBeginTime", java.sql.Timestamp.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionCommitLsn = createNumber("databaseTransactionCommitLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionLastLsn = createNumber("databaseTransactionLastLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionLastRollbackLsn = createNumber("databaseTransactionLastRollbackLsn", java.math.BigInteger.class);

    public final NumberPath<Long> databaseTransactionLogBytesReserved = createNumber("databaseTransactionLogBytesReserved", Long.class);

    public final NumberPath<Integer> databaseTransactionLogBytesReservedSystem = createNumber("databaseTransactionLogBytesReservedSystem", Integer.class);

    public final NumberPath<Long> databaseTransactionLogBytesUsed = createNumber("databaseTransactionLogBytesUsed", Long.class);

    public final NumberPath<Integer> databaseTransactionLogBytesUsedSystem = createNumber("databaseTransactionLogBytesUsedSystem", Integer.class);

    public final NumberPath<Long> databaseTransactionLogRecordCount = createNumber("databaseTransactionLogRecordCount", Long.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionMostRecentSavepointLsn = createNumber("databaseTransactionMostRecentSavepointLsn", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> databaseTransactionNextUndoLsn = createNumber("databaseTransactionNextUndoLsn", java.math.BigInteger.class);

    public final NumberPath<Integer> databaseTransactionReplicateRecordCount = createNumber("databaseTransactionReplicateRecordCount", Integer.class);

    public final NumberPath<Integer> databaseTransactionState = createNumber("databaseTransactionState", Integer.class);

    public final NumberPath<Integer> databaseTransactionStatus = createNumber("databaseTransactionStatus", Integer.class);

    public final NumberPath<Integer> databaseTransactionStatus2 = createNumber("databaseTransactionStatus2", Integer.class);

    public final NumberPath<Integer> databaseTransactionType = createNumber("databaseTransactionType", Integer.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public QDmTranDatabaseTransactions(String variable) {
        super(QDmTranDatabaseTransactions.class, forVariable(variable), "sys", "dm_tran_database_transactions");
        addMetadata();
    }

    public QDmTranDatabaseTransactions(String variable, String schema, String table) {
        super(QDmTranDatabaseTransactions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranDatabaseTransactions(Path<? extends QDmTranDatabaseTransactions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_database_transactions");
        addMetadata();
    }

    public QDmTranDatabaseTransactions(PathMetadata metadata) {
        super(QDmTranDatabaseTransactions.class, metadata, "sys", "dm_tran_database_transactions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionBeginLsn, ColumnMetadata.named("database_transaction_begin_lsn").withIndex(14).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionBeginTime, ColumnMetadata.named("database_transaction_begin_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(databaseTransactionCommitLsn, ColumnMetadata.named("database_transaction_commit_lsn").withIndex(17).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionLastLsn, ColumnMetadata.named("database_transaction_last_lsn").withIndex(15).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionLastRollbackLsn, ColumnMetadata.named("database_transaction_last_rollback_lsn").withIndex(18).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionLogBytesReserved, ColumnMetadata.named("database_transaction_log_bytes_reserved").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(databaseTransactionLogBytesReservedSystem, ColumnMetadata.named("database_transaction_log_bytes_reserved_system").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionLogBytesUsed, ColumnMetadata.named("database_transaction_log_bytes_used").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(databaseTransactionLogBytesUsedSystem, ColumnMetadata.named("database_transaction_log_bytes_used_system").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionLogRecordCount, ColumnMetadata.named("database_transaction_log_record_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(databaseTransactionMostRecentSavepointLsn, ColumnMetadata.named("database_transaction_most_recent_savepoint_lsn").withIndex(16).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionNextUndoLsn, ColumnMetadata.named("database_transaction_next_undo_lsn").withIndex(19).ofType(Types.NUMERIC).withSize(25));
        addMetadata(databaseTransactionReplicateRecordCount, ColumnMetadata.named("database_transaction_replicate_record_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionState, ColumnMetadata.named("database_transaction_state").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionStatus, ColumnMetadata.named("database_transaction_status").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionStatus2, ColumnMetadata.named("database_transaction_status2").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseTransactionType, ColumnMetadata.named("database_transaction_type").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

