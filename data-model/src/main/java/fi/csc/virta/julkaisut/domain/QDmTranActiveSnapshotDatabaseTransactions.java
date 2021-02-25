package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranActiveSnapshotDatabaseTransactions is a Querydsl query type for QDmTranActiveSnapshotDatabaseTransactions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranActiveSnapshotDatabaseTransactions extends com.querydsl.sql.RelationalPathBase<QDmTranActiveSnapshotDatabaseTransactions> {

    private static final long serialVersionUID = -1492920885;

    public static final QDmTranActiveSnapshotDatabaseTransactions dmTranActiveSnapshotDatabaseTransactions = new QDmTranActiveSnapshotDatabaseTransactions("dm_tran_active_snapshot_database_transactions");

    public final NumberPath<Double> averageVersionChainTraversed = createNumber("averageVersionChainTraversed", Double.class);

    public final NumberPath<Long> commitSequenceNum = createNumber("commitSequenceNum", Long.class);

    public final NumberPath<Long> elapsedTimeSeconds = createNumber("elapsedTimeSeconds", Long.class);

    public final NumberPath<Long> firstSnapshotSequenceNum = createNumber("firstSnapshotSequenceNum", Long.class);

    public final BooleanPath isSnapshot = createBoolean("isSnapshot");

    public final NumberPath<Integer> maxVersionChainTraversed = createNumber("maxVersionChainTraversed", Integer.class);

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final NumberPath<Long> transactionSequenceNum = createNumber("transactionSequenceNum", Long.class);

    public QDmTranActiveSnapshotDatabaseTransactions(String variable) {
        super(QDmTranActiveSnapshotDatabaseTransactions.class, forVariable(variable), "sys", "dm_tran_active_snapshot_database_transactions");
        addMetadata();
    }

    public QDmTranActiveSnapshotDatabaseTransactions(String variable, String schema, String table) {
        super(QDmTranActiveSnapshotDatabaseTransactions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranActiveSnapshotDatabaseTransactions(Path<? extends QDmTranActiveSnapshotDatabaseTransactions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_active_snapshot_database_transactions");
        addMetadata();
    }

    public QDmTranActiveSnapshotDatabaseTransactions(PathMetadata metadata) {
        super(QDmTranActiveSnapshotDatabaseTransactions.class, metadata, "sys", "dm_tran_active_snapshot_database_transactions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(averageVersionChainTraversed, ColumnMetadata.named("average_version_chain_traversed").withIndex(8).ofType(Types.DOUBLE).withSize(53));
        addMetadata(commitSequenceNum, ColumnMetadata.named("commit_sequence_num").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(elapsedTimeSeconds, ColumnMetadata.named("elapsed_time_seconds").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(firstSnapshotSequenceNum, ColumnMetadata.named("first_snapshot_sequence_num").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(isSnapshot, ColumnMetadata.named("is_snapshot").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(maxVersionChainTraversed, ColumnMetadata.named("max_version_chain_traversed").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(transactionSequenceNum, ColumnMetadata.named("transaction_sequence_num").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

