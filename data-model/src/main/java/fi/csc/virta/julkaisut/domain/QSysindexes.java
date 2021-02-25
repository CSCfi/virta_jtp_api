package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysindexes is a Querydsl query type for QSysindexes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysindexes extends com.querydsl.sql.RelationalPathBase<QSysindexes> {

    private static final long serialVersionUID = 852055344;

    public static final QSysindexes sysindexes = new QSysindexes("sysindexes");

    public final NumberPath<Integer> dpages = createNumber("dpages", Integer.class);

    public final SimplePath<byte[]> first = createSimple("first", byte[].class);

    public final SimplePath<byte[]> firstIAM = createSimple("firstIAM", byte[].class);

    public final NumberPath<Short> groupid = createNumber("groupid", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Short> impid = createNumber("impid", Short.class);

    public final NumberPath<Short> indid = createNumber("indid", Short.class);

    public final NumberPath<Short> keycnt = createNumber("keycnt", Short.class);

    public final SimplePath<byte[]> keys = createSimple("keys", byte[].class);

    public final NumberPath<Short> lockflags = createNumber("lockflags", Short.class);

    public final NumberPath<Short> maxirow = createNumber("maxirow", Short.class);

    public final NumberPath<Integer> maxlen = createNumber("maxlen", Integer.class);

    public final NumberPath<Short> minlen = createNumber("minlen", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> origFillFactor = createNumber("origFillFactor", Byte.class);

    public final NumberPath<Integer> pgmodctr = createNumber("pgmodctr", Integer.class);

    public final NumberPath<Integer> reserved = createNumber("reserved", Integer.class);

    public final NumberPath<Integer> reserved2 = createNumber("reserved2", Integer.class);

    public final NumberPath<Byte> reserved3 = createNumber("reserved3", Byte.class);

    public final NumberPath<Byte> reserved4 = createNumber("reserved4", Byte.class);

    public final SimplePath<byte[]> root = createSimple("root", byte[].class);

    public final NumberPath<Long> rowcnt = createNumber("rowcnt", Long.class);

    public final NumberPath<Integer> rowmodctr = createNumber("rowmodctr", Integer.class);

    public final NumberPath<Integer> rows = createNumber("rows", Integer.class);

    public final SimplePath<byte[]> statblob = createSimple("statblob", byte[].class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Byte> statVersion = createNumber("statVersion", Byte.class);

    public final NumberPath<Integer> used = createNumber("used", Integer.class);

    public final NumberPath<Short> xmaxlen = createNumber("xmaxlen", Short.class);

    public QSysindexes(String variable) {
        super(QSysindexes.class, forVariable(variable), "sys", "sysindexes");
        addMetadata();
    }

    public QSysindexes(String variable, String schema, String table) {
        super(QSysindexes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysindexes(Path<? extends QSysindexes> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysindexes");
        addMetadata();
    }

    public QSysindexes(PathMetadata metadata) {
        super(QSysindexes.class, metadata, "sys", "sysindexes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dpages, ColumnMetadata.named("dpages").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(first, ColumnMetadata.named("first").withIndex(3).ofType(Types.BINARY).withSize(6));
        addMetadata(firstIAM, ColumnMetadata.named("FirstIAM").withIndex(21).ofType(Types.BINARY).withSize(6));
        addMetadata(groupid, ColumnMetadata.named("groupid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(impid, ColumnMetadata.named("impid").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(indid, ColumnMetadata.named("indid").withIndex(4).ofType(Types.SMALLINT).withSize(5));
        addMetadata(keycnt, ColumnMetadata.named("keycnt").withIndex(7).ofType(Types.SMALLINT).withSize(5));
        addMetadata(keys, ColumnMetadata.named("keys").withIndex(25).ofType(Types.VARBINARY).withSize(1088));
        addMetadata(lockflags, ColumnMetadata.named("lockflags").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(maxirow, ColumnMetadata.named("maxirow").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(maxlen, ColumnMetadata.named("maxlen").withIndex(28).ofType(Types.INTEGER).withSize(10));
        addMetadata(minlen, ColumnMetadata.named("minlen").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(name, ColumnMetadata.named("name").withIndex(26).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(origFillFactor, ColumnMetadata.named("OrigFillFactor").withIndex(18).ofType(Types.TINYINT).withSize(3));
        addMetadata(pgmodctr, ColumnMetadata.named("pgmodctr").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(reserved, ColumnMetadata.named("reserved").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(reserved2, ColumnMetadata.named("reserved2").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(reserved3, ColumnMetadata.named("reserved3").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(reserved4, ColumnMetadata.named("reserved4").withIndex(15).ofType(Types.TINYINT).withSize(3));
        addMetadata(root, ColumnMetadata.named("root").withIndex(5).ofType(Types.BINARY).withSize(6));
        addMetadata(rowcnt, ColumnMetadata.named("rowcnt").withIndex(12).ofType(Types.BIGINT).withSize(19));
        addMetadata(rowmodctr, ColumnMetadata.named("rowmodctr").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(rows, ColumnMetadata.named("rows").withIndex(29).ofType(Types.INTEGER).withSize(10));
        addMetadata(statblob, ColumnMetadata.named("statblob").withIndex(27).ofType(Types.LONGVARBINARY).withSize(2147483647));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(statVersion, ColumnMetadata.named("StatVersion").withIndex(19).ofType(Types.TINYINT).withSize(3));
        addMetadata(used, ColumnMetadata.named("used").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(xmaxlen, ColumnMetadata.named("xmaxlen").withIndex(16).ofType(Types.SMALLINT).withSize(5));
    }

}

