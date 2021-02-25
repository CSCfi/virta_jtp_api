package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysfiles is a Querydsl query type for QSysfiles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysfiles extends com.querydsl.sql.RelationalPathBase<QSysfiles> {

    private static final long serialVersionUID = 637080231;

    public static final QSysfiles sysfiles = new QSysfiles("sysfiles");

    public final NumberPath<Short> fileid = createNumber("fileid", Short.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Short> groupid = createNumber("groupid", Short.class);

    public final NumberPath<Integer> growth = createNumber("growth", Integer.class);

    public final NumberPath<Integer> maxsize = createNumber("maxsize", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> perf = createNumber("perf", Integer.class);

    public final NumberPath<Integer> size = createNumber("size", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QSysfiles(String variable) {
        super(QSysfiles.class, forVariable(variable), "sys", "sysfiles");
        addMetadata();
    }

    public QSysfiles(String variable, String schema, String table) {
        super(QSysfiles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysfiles(Path<? extends QSysfiles> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysfiles");
        addMetadata();
    }

    public QSysfiles(PathMetadata metadata) {
        super(QSysfiles.class, metadata, "sys", "sysfiles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fileid, ColumnMetadata.named("fileid").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(9).ofType(Types.NVARCHAR).withSize(260).notNull());
        addMetadata(groupid, ColumnMetadata.named("groupid").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(growth, ColumnMetadata.named("growth").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxsize, ColumnMetadata.named("maxsize").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(8).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(perf, ColumnMetadata.named("perf").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(size, ColumnMetadata.named("size").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

