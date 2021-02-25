package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranSessionTransactions is a Querydsl query type for QDmTranSessionTransactions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranSessionTransactions extends com.querydsl.sql.RelationalPathBase<QDmTranSessionTransactions> {

    private static final long serialVersionUID = 900365786;

    public static final QDmTranSessionTransactions dmTranSessionTransactions = new QDmTranSessionTransactions("dm_tran_session_transactions");

    public final NumberPath<Integer> enlistCount = createNumber("enlistCount", Integer.class);

    public final BooleanPath isBound = createBoolean("isBound");

    public final BooleanPath isEnlisted = createBoolean("isEnlisted");

    public final BooleanPath isLocal = createBoolean("isLocal");

    public final BooleanPath isUserTransaction = createBoolean("isUserTransaction");

    public final NumberPath<Integer> openTransactionCount = createNumber("openTransactionCount", Integer.class);

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final SimplePath<byte[]> transactionDescriptor = createSimple("transactionDescriptor", byte[].class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public QDmTranSessionTransactions(String variable) {
        super(QDmTranSessionTransactions.class, forVariable(variable), "sys", "dm_tran_session_transactions");
        addMetadata();
    }

    public QDmTranSessionTransactions(String variable, String schema, String table) {
        super(QDmTranSessionTransactions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranSessionTransactions(Path<? extends QDmTranSessionTransactions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_session_transactions");
        addMetadata();
    }

    public QDmTranSessionTransactions(PathMetadata metadata) {
        super(QDmTranSessionTransactions.class, metadata, "sys", "dm_tran_session_transactions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(enlistCount, ColumnMetadata.named("enlist_count").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isBound, ColumnMetadata.named("is_bound").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isEnlisted, ColumnMetadata.named("is_enlisted").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isLocal, ColumnMetadata.named("is_local").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isUserTransaction, ColumnMetadata.named("is_user_transaction").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(openTransactionCount, ColumnMetadata.named("open_transaction_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionDescriptor, ColumnMetadata.named("transaction_descriptor").withIndex(3).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

