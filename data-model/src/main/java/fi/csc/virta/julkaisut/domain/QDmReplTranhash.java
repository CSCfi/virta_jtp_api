package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmReplTranhash is a Querydsl query type for QDmReplTranhash
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmReplTranhash extends com.querydsl.sql.RelationalPathBase<QDmReplTranhash> {

    private static final long serialVersionUID = -74258546;

    public static final QDmReplTranhash dmReplTranhash = new QDmReplTranhash("dm_repl_tranhash");

    public final NumberPath<Integer> buckets = createNumber("buckets", Integer.class);

    public final NumberPath<Integer> compensatedTrans = createNumber("compensatedTrans", Integer.class);

    public final NumberPath<Integer> completedTrans = createNumber("completedTrans", Integer.class);

    public final StringPath firstBeginLsn = createString("firstBeginLsn");

    public final NumberPath<Integer> hashedTrans = createNumber("hashedTrans", Integer.class);

    public final StringPath lastCommitLsn = createString("lastCommitLsn");

    public QDmReplTranhash(String variable) {
        super(QDmReplTranhash.class, forVariable(variable), "sys", "dm_repl_tranhash");
        addMetadata();
    }

    public QDmReplTranhash(String variable, String schema, String table) {
        super(QDmReplTranhash.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmReplTranhash(Path<? extends QDmReplTranhash> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_repl_tranhash");
        addMetadata();
    }

    public QDmReplTranhash(PathMetadata metadata) {
        super(QDmReplTranhash.class, metadata, "sys", "dm_repl_tranhash");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(buckets, ColumnMetadata.named("buckets").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(compensatedTrans, ColumnMetadata.named("compensated_trans").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(completedTrans, ColumnMetadata.named("completed_trans").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(firstBeginLsn, ColumnMetadata.named("first_begin_lsn").withIndex(5).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(hashedTrans, ColumnMetadata.named("hashed_trans").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(lastCommitLsn, ColumnMetadata.named("last_commit_lsn").withIndex(6).ofType(Types.NVARCHAR).withSize(24));
    }

}

