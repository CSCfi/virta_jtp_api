package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranCurrentTransaction is a Querydsl query type for QDmTranCurrentTransaction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranCurrentTransaction extends com.querydsl.sql.RelationalPathBase<QDmTranCurrentTransaction> {

    private static final long serialVersionUID = 103736054;

    public static final QDmTranCurrentTransaction dmTranCurrentTransaction = new QDmTranCurrentTransaction("dm_tran_current_transaction");

    public final NumberPath<Long> firstSnapshotSequenceNum = createNumber("firstSnapshotSequenceNum", Long.class);

    public final NumberPath<Long> firstUsefulSequenceNum = createNumber("firstUsefulSequenceNum", Long.class);

    public final NumberPath<Long> lastTransactionSequenceNum = createNumber("lastTransactionSequenceNum", Long.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final BooleanPath transactionIsSnapshot = createBoolean("transactionIsSnapshot");

    public final NumberPath<Long> transactionSequenceNum = createNumber("transactionSequenceNum", Long.class);

    public QDmTranCurrentTransaction(String variable) {
        super(QDmTranCurrentTransaction.class, forVariable(variable), "sys", "dm_tran_current_transaction");
        addMetadata();
    }

    public QDmTranCurrentTransaction(String variable, String schema, String table) {
        super(QDmTranCurrentTransaction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranCurrentTransaction(Path<? extends QDmTranCurrentTransaction> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_current_transaction");
        addMetadata();
    }

    public QDmTranCurrentTransaction(PathMetadata metadata) {
        super(QDmTranCurrentTransaction.class, metadata, "sys", "dm_tran_current_transaction");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(firstSnapshotSequenceNum, ColumnMetadata.named("first_snapshot_sequence_num").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(firstUsefulSequenceNum, ColumnMetadata.named("first_useful_sequence_num").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(lastTransactionSequenceNum, ColumnMetadata.named("last_transaction_sequence_num").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(transactionIsSnapshot, ColumnMetadata.named("transaction_is_snapshot").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(transactionSequenceNum, ColumnMetadata.named("transaction_sequence_num").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

