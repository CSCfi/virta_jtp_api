package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranCurrentSnapshot is a Querydsl query type for QDmTranCurrentSnapshot
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranCurrentSnapshot extends com.querydsl.sql.RelationalPathBase<QDmTranCurrentSnapshot> {

    private static final long serialVersionUID = 1823243436;

    public static final QDmTranCurrentSnapshot dmTranCurrentSnapshot = new QDmTranCurrentSnapshot("dm_tran_current_snapshot");

    public final NumberPath<Long> transactionSequenceNum = createNumber("transactionSequenceNum", Long.class);

    public QDmTranCurrentSnapshot(String variable) {
        super(QDmTranCurrentSnapshot.class, forVariable(variable), "sys", "dm_tran_current_snapshot");
        addMetadata();
    }

    public QDmTranCurrentSnapshot(String variable, String schema, String table) {
        super(QDmTranCurrentSnapshot.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranCurrentSnapshot(Path<? extends QDmTranCurrentSnapshot> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_current_snapshot");
        addMetadata();
    }

    public QDmTranCurrentSnapshot(PathMetadata metadata) {
        super(QDmTranCurrentSnapshot.class, metadata, "sys", "dm_tran_current_snapshot");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(transactionSequenceNum, ColumnMetadata.named("transaction_sequence_num").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

