package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscacheobjects is a Querydsl query type for QSyscacheobjects
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscacheobjects extends com.querydsl.sql.RelationalPathBase<QSyscacheobjects> {

    private static final long serialVersionUID = -810282718;

    public static final QSyscacheobjects syscacheobjects = new QSyscacheobjects("syscacheobjects");

    public final NumberPath<Long> avgexectime = createNumber("avgexectime", Long.class);

    public final NumberPath<Integer> bucketid = createNumber("bucketid", Integer.class);

    public final StringPath cacheobjtype = createString("cacheobjtype");

    public final NumberPath<Short> dateformat = createNumber("dateformat", Short.class);

    public final NumberPath<Short> dbid = createNumber("dbid", Short.class);

    public final NumberPath<Short> dbidexec = createNumber("dbidexec", Short.class);

    public final NumberPath<Short> langid = createNumber("langid", Short.class);

    public final NumberPath<Long> lastreads = createNumber("lastreads", Long.class);

    public final NumberPath<Long> lasttime = createNumber("lasttime", Long.class);

    public final NumberPath<Long> lastwrites = createNumber("lastwrites", Long.class);

    public final NumberPath<Long> maxexectime = createNumber("maxexectime", Long.class);

    public final NumberPath<Integer> objid = createNumber("objid", Integer.class);

    public final StringPath objtype = createString("objtype");

    public final NumberPath<Integer> pagesused = createNumber("pagesused", Integer.class);

    public final NumberPath<Integer> refcounts = createNumber("refcounts", Integer.class);

    public final NumberPath<Integer> setopts = createNumber("setopts", Integer.class);

    public final StringPath sql = createString("sql");

    public final NumberPath<Integer> sqlbytes = createNumber("sqlbytes", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public final NumberPath<Integer> usecounts = createNumber("usecounts", Integer.class);

    public QSyscacheobjects(String variable) {
        super(QSyscacheobjects.class, forVariable(variable), "sys", "syscacheobjects");
        addMetadata();
    }

    public QSyscacheobjects(String variable, String schema, String table) {
        super(QSyscacheobjects.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscacheobjects(Path<? extends QSyscacheobjects> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscacheobjects");
        addMetadata();
    }

    public QSyscacheobjects(PathMetadata metadata) {
        super(QSyscacheobjects.class, metadata, "sys", "syscacheobjects");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avgexectime, ColumnMetadata.named("avgexectime").withIndex(17).ofType(Types.BIGINT).withSize(19));
        addMetadata(bucketid, ColumnMetadata.named("bucketid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cacheobjtype, ColumnMetadata.named("cacheobjtype").withIndex(2).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(dateformat, ColumnMetadata.named("dateformat").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dbidexec, ColumnMetadata.named("dbidexec").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(langid, ColumnMetadata.named("langid").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(lastreads, ColumnMetadata.named("lastreads").withIndex(18).ofType(Types.BIGINT).withSize(19));
        addMetadata(lasttime, ColumnMetadata.named("lasttime").withIndex(15).ofType(Types.BIGINT).withSize(19));
        addMetadata(lastwrites, ColumnMetadata.named("lastwrites").withIndex(19).ofType(Types.BIGINT).withSize(19));
        addMetadata(maxexectime, ColumnMetadata.named("maxexectime").withIndex(16).ofType(Types.BIGINT).withSize(19));
        addMetadata(objid, ColumnMetadata.named("objid").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(objtype, ColumnMetadata.named("objtype").withIndex(3).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(pagesused, ColumnMetadata.named("pagesused").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(refcounts, ColumnMetadata.named("refcounts").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(setopts, ColumnMetadata.named("setopts").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(sql, ColumnMetadata.named("sql").withIndex(21).ofType(Types.NVARCHAR).withSize(3900));
        addMetadata(sqlbytes, ColumnMetadata.named("sqlbytes").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(usecounts, ColumnMetadata.named("usecounts").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

