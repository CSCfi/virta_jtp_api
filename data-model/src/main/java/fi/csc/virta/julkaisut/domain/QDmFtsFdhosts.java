package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsFdhosts is a Querydsl query type for QDmFtsFdhosts
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsFdhosts extends com.querydsl.sql.RelationalPathBase<QDmFtsFdhosts> {

    private static final long serialVersionUID = 2005455470;

    public static final QDmFtsFdhosts dmFtsFdhosts = new QDmFtsFdhosts("dm_fts_fdhosts");

    public final NumberPath<Integer> batchCount = createNumber("batchCount", Integer.class);

    public final NumberPath<Integer> fdhostId = createNumber("fdhostId", Integer.class);

    public final StringPath fdhostName = createString("fdhostName");

    public final NumberPath<Integer> fdhostProcessId = createNumber("fdhostProcessId", Integer.class);

    public final StringPath fdhostType = createString("fdhostType");

    public final NumberPath<Integer> maxThread = createNumber("maxThread", Integer.class);

    public QDmFtsFdhosts(String variable) {
        super(QDmFtsFdhosts.class, forVariable(variable), "sys", "dm_fts_fdhosts");
        addMetadata();
    }

    public QDmFtsFdhosts(String variable, String schema, String table) {
        super(QDmFtsFdhosts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsFdhosts(Path<? extends QDmFtsFdhosts> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_fdhosts");
        addMetadata();
    }

    public QDmFtsFdhosts(PathMetadata metadata) {
        super(QDmFtsFdhosts.class, metadata, "sys", "dm_fts_fdhosts");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(batchCount, ColumnMetadata.named("batch_count").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fdhostId, ColumnMetadata.named("fdhost_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fdhostName, ColumnMetadata.named("fdhost_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(fdhostProcessId, ColumnMetadata.named("fdhost_process_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fdhostType, ColumnMetadata.named("fdhost_type").withIndex(4).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(maxThread, ColumnMetadata.named("max_thread").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

