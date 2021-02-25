package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranTransactionsSnapshot is a Querydsl query type for QDmTranTransactionsSnapshot
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranTransactionsSnapshot extends com.querydsl.sql.RelationalPathBase<QDmTranTransactionsSnapshot> {

    private static final long serialVersionUID = -877254326;

    public static final QDmTranTransactionsSnapshot dmTranTransactionsSnapshot = new QDmTranTransactionsSnapshot("dm_tran_transactions_snapshot");

    public final NumberPath<Integer> snapshotId = createNumber("snapshotId", Integer.class);

    public final NumberPath<Long> snapshotSequenceNum = createNumber("snapshotSequenceNum", Long.class);

    public final NumberPath<Long> transactionSequenceNum = createNumber("transactionSequenceNum", Long.class);

    public QDmTranTransactionsSnapshot(String variable) {
        super(QDmTranTransactionsSnapshot.class, forVariable(variable), "sys", "dm_tran_transactions_snapshot");
        addMetadata();
    }

    public QDmTranTransactionsSnapshot(String variable, String schema, String table) {
        super(QDmTranTransactionsSnapshot.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranTransactionsSnapshot(Path<? extends QDmTranTransactionsSnapshot> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_transactions_snapshot");
        addMetadata();
    }

    public QDmTranTransactionsSnapshot(PathMetadata metadata) {
        super(QDmTranTransactionsSnapshot.class, metadata, "sys", "dm_tran_transactions_snapshot");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(snapshotId, ColumnMetadata.named("snapshot_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(snapshotSequenceNum, ColumnMetadata.named("snapshot_sequence_num").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(transactionSequenceNum, ColumnMetadata.named("transaction_sequence_num").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

