package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysdatabases is a Querydsl query type for QSysdatabases
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysdatabases extends com.querydsl.sql.RelationalPathBase<QSysdatabases> {

    private static final long serialVersionUID = -1067721080;

    public static final QSysdatabases sysdatabases = new QSysdatabases("sysdatabases");

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final NumberPath<Byte> cmptlevel = createNumber("cmptlevel", Byte.class);

    public final DateTimePath<java.sql.Timestamp> crdate = createDateTime("crdate", java.sql.Timestamp.class);

    public final NumberPath<Short> dbid = createNumber("dbid", Short.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Short> mode = createNumber("mode", Short.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> reserved = createDateTime("reserved", java.sql.Timestamp.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Integer> status2 = createNumber("status2", Integer.class);

    public final NumberPath<Short> version = createNumber("version", Short.class);

    public QSysdatabases(String variable) {
        super(QSysdatabases.class, forVariable(variable), "sys", "sysdatabases");
        addMetadata();
    }

    public QSysdatabases(String variable, String schema, String table) {
        super(QSysdatabases.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysdatabases(Path<? extends QSysdatabases> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysdatabases");
        addMetadata();
    }

    public QSysdatabases(PathMetadata metadata) {
        super(QSysdatabases.class, metadata, "sys", "sysdatabases");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(category, ColumnMetadata.named("category").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(cmptlevel, ColumnMetadata.named("cmptlevel").withIndex(10).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(crdate, ColumnMetadata.named("crdate").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(11).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(mode, ColumnMetadata.named("mode").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(reserved, ColumnMetadata.named("reserved").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(3).ofType(Types.VARBINARY).withSize(85));
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(status2, ColumnMetadata.named("status2").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(version, ColumnMetadata.named("version").withIndex(12).ofType(Types.SMALLINT).withSize(5));
    }

}

