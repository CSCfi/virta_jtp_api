package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTranCommitTable is a Querydsl query type for QDmTranCommitTable
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTranCommitTable extends com.querydsl.sql.RelationalPathBase<QDmTranCommitTable> {

    private static final long serialVersionUID = 1292098214;

    public static final QDmTranCommitTable dmTranCommitTable = new QDmTranCommitTable("dm_tran_commit_table");

    public final NumberPath<Long> commitCsn = createNumber("commitCsn", Long.class);

    public final NumberPath<Long> commitLbn = createNumber("commitLbn", Long.class);

    public final DateTimePath<java.sql.Timestamp> commitTime = createDateTime("commitTime", java.sql.Timestamp.class);

    public final NumberPath<Long> commitTs = createNumber("commitTs", Long.class);

    public final NumberPath<Long> xdesId = createNumber("xdesId", Long.class);

    public QDmTranCommitTable(String variable) {
        super(QDmTranCommitTable.class, forVariable(variable), "sys", "dm_tran_commit_table");
        addMetadata();
    }

    public QDmTranCommitTable(String variable, String schema, String table) {
        super(QDmTranCommitTable.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTranCommitTable(Path<? extends QDmTranCommitTable> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tran_commit_table");
        addMetadata();
    }

    public QDmTranCommitTable(PathMetadata metadata) {
        super(QDmTranCommitTable.class, metadata, "sys", "dm_tran_commit_table");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commitCsn, ColumnMetadata.named("commit_csn").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(commitLbn, ColumnMetadata.named("commit_lbn").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(commitTime, ColumnMetadata.named("commit_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(commitTs, ColumnMetadata.named("commit_ts").withIndex(1).ofType(Types.BIGINT).withSize(19));
        addMetadata(xdesId, ColumnMetadata.named("xdes_id").withIndex(2).ofType(Types.BIGINT).withSize(19));
    }

}

