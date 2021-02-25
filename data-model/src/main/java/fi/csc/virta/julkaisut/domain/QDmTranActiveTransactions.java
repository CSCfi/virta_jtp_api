package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranActiveTransactions is a Querydsl query type for QDmTranActiveTransactions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranActiveTransactions extends com.querydsl.sql.RelationalPathBase<QDmTranActiveTransactions> {

    private static final long serialVersionUID = 660676300;

    public static final QDmTranActiveTransactions dmTranActiveTransactions = new QDmTranActiveTransactions("dm_tran_active_transactions");

    public final NumberPath<Integer> dtcIsolationLevel = createNumber("dtcIsolationLevel", Integer.class);

    public final NumberPath<Integer> dtcState = createNumber("dtcState", Integer.class);

    public final NumberPath<Integer> dtcStatus = createNumber("dtcStatus", Integer.class);

    public final SimplePath<byte[]> filestreamTransactionId = createSimple("filestreamTransactionId", byte[].class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> transactionBeginTime = createDateTime("transactionBeginTime", java.sql.Timestamp.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final NumberPath<Integer> transactionState = createNumber("transactionState", Integer.class);

    public final NumberPath<Integer> transactionStatus = createNumber("transactionStatus", Integer.class);

    public final NumberPath<Integer> transactionStatus2 = createNumber("transactionStatus2", Integer.class);

    public final NumberPath<Integer> transactionType = createNumber("transactionType", Integer.class);

    public final StringPath transactionUow = createString("transactionUow");

    public QDmTranActiveTransactions(String variable) {
        super(QDmTranActiveTransactions.class, forVariable(variable), "sys", "dm_tran_active_transactions");
        addMetadata();
    }

    public QDmTranActiveTransactions(String variable, String schema, String table) {
        super(QDmTranActiveTransactions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranActiveTransactions(Path<? extends QDmTranActiveTransactions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_active_transactions");
        addMetadata();
    }

    public QDmTranActiveTransactions(PathMetadata metadata) {
        super(QDmTranActiveTransactions.class, metadata, "sys", "dm_tran_active_transactions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dtcIsolationLevel, ColumnMetadata.named("dtc_isolation_level").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dtcState, ColumnMetadata.named("dtc_state").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dtcStatus, ColumnMetadata.named("dtc_status").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(filestreamTransactionId, ColumnMetadata.named("filestream_transaction_id").withIndex(12).ofType(Types.VARBINARY).withSize(128));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(32).notNull());
        addMetadata(transactionBeginTime, ColumnMetadata.named("transaction_begin_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(transactionState, ColumnMetadata.named("transaction_state").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionStatus, ColumnMetadata.named("transaction_status").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionStatus2, ColumnMetadata.named("transaction_status2").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionType, ColumnMetadata.named("transaction_type").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionUow, ColumnMetadata.named("transaction_uow").withIndex(5).ofType(Types.CHAR).withSize(36));
    }

}

