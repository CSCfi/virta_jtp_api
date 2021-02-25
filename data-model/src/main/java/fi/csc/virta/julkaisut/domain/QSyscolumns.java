package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyscolumns is a Querydsl query type for QSyscolumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyscolumns extends com.querydsl.sql.RelationalPathBase<QSyscolumns> {

    private static final long serialVersionUID = -141515763;

    public static final QSyscolumns syscolumns = new QSyscolumns("syscolumns");

    public final SimplePath<byte[]> autoval = createSimple("autoval", byte[].class);

    public final NumberPath<Byte> bitpos = createNumber("bitpos", Byte.class);

    public final NumberPath<Integer> cdefault = createNumber("cdefault", Integer.class);

    public final NumberPath<Short> colid = createNumber("colid", Short.class);

    public final StringPath collation = createString("collation");

    public final NumberPath<Integer> collationid = createNumber("collationid", Integer.class);

    public final NumberPath<Short> colorder = createNumber("colorder", Short.class);

    public final NumberPath<Short> colstat = createNumber("colstat", Short.class);

    public final NumberPath<Integer> domain = createNumber("domain", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> iscomputed = createNumber("iscomputed", Integer.class);

    public final NumberPath<Integer> isnullable = createNumber("isnullable", Integer.class);

    public final NumberPath<Integer> isoutparam = createNumber("isoutparam", Integer.class);

    public final NumberPath<Integer> language = createNumber("language", Integer.class);

    public final NumberPath<Short> length = createNumber("length", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> number = createNumber("number", Short.class);

    public final NumberPath<Short> offset = createNumber("offset", Short.class);

    public final NumberPath<Short> prec = createNumber("prec", Short.class);

    public final StringPath printfmt = createString("printfmt");

    public final NumberPath<Byte> reserved = createNumber("reserved", Byte.class);

    public final NumberPath<Integer> scale = createNumber("scale", Integer.class);

    public final NumberPath<Byte> status = createNumber("status", Byte.class);

    public final SimplePath<byte[]> tdscollation = createSimple("tdscollation", byte[].class);

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final NumberPath<Byte> typestat = createNumber("typestat", Byte.class);

    public final NumberPath<Short> usertype = createNumber("usertype", Short.class);

    public final NumberPath<Short> xoffset = createNumber("xoffset", Short.class);

    public final NumberPath<Byte> xprec = createNumber("xprec", Byte.class);

    public final NumberPath<Byte> xscale = createNumber("xscale", Byte.class);

    public final NumberPath<Byte> xtype = createNumber("xtype", Byte.class);

    public final NumberPath<Short> xusertype = createNumber("xusertype", Short.class);

    public QSyscolumns(String variable) {
        super(QSyscolumns.class, forVariable(variable), "sys", "syscolumns");
        addMetadata();
    }

    public QSyscolumns(String variable, String schema, String table) {
        super(QSyscolumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyscolumns(Path<? extends QSyscolumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "syscolumns");
        addMetadata();
    }

    public QSyscolumns(PathMetadata metadata) {
        super(QSyscolumns.class, metadata, "sys", "syscolumns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(autoval, ColumnMetadata.named("autoval").withIndex(18).ofType(Types.VARBINARY).withSize(8000));
        addMetadata(bitpos, ColumnMetadata.named("bitpos").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(cdefault, ColumnMetadata.named("cdefault").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(colid, ColumnMetadata.named("colid").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(collation, ColumnMetadata.named("collation").withIndex(31).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationid, ColumnMetadata.named("collationid").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(colorder, ColumnMetadata.named("colorder").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(colstat, ColumnMetadata.named("colstat").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(domain, ColumnMetadata.named("domain").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(iscomputed, ColumnMetadata.named("iscomputed").withIndex(28).ofType(Types.INTEGER).withSize(10));
        addMetadata(isnullable, ColumnMetadata.named("isnullable").withIndex(30).ofType(Types.INTEGER).withSize(10));
        addMetadata(isoutparam, ColumnMetadata.named("isoutparam").withIndex(29).ofType(Types.INTEGER).withSize(10));
        addMetadata(language, ColumnMetadata.named("language").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(length, ColumnMetadata.named("length").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(number, ColumnMetadata.named("number").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(offset, ColumnMetadata.named("offset").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(prec, ColumnMetadata.named("prec").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(printfmt, ColumnMetadata.named("printfmt").withIndex(25).ofType(Types.VARCHAR).withSize(255));
        addMetadata(reserved, ColumnMetadata.named("reserved").withIndex(12).ofType(Types.TINYINT).withSize(3));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(27).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(22).ofType(Types.TINYINT).withSize(3));
        addMetadata(tdscollation, ColumnMetadata.named("tdscollation").withIndex(32).ofType(Types.BINARY).withSize(5));
        addMetadata(type, ColumnMetadata.named("type").withIndex(23).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typestat, ColumnMetadata.named("typestat").withIndex(4).ofType(Types.TINYINT).withSize(3));
        addMetadata(usertype, ColumnMetadata.named("usertype").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(xoffset, ColumnMetadata.named("xoffset").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(xprec, ColumnMetadata.named("xprec").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xscale, ColumnMetadata.named("xscale").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xtype, ColumnMetadata.named("xtype").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xusertype, ColumnMetadata.named("xusertype").withIndex(5).ofType(Types.SMALLINT).withSize(5));
    }

}

