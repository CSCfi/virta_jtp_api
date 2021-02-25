package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystypes is a Querydsl query type for QSystypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystypes extends com.querydsl.sql.RelationalPathBase<QSystypes> {

    private static final long serialVersionUID = 650490025;

    public static final QSystypes systypes = new QSystypes("systypes");

    public final BooleanPath allownulls = createBoolean("allownulls");

    public final StringPath collation = createString("collation");

    public final NumberPath<Integer> collationid = createNumber("collationid", Integer.class);

    public final NumberPath<Integer> domain = createNumber("domain", Integer.class);

    public final NumberPath<Short> length = createNumber("length", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> prec = createNumber("prec", Short.class);

    public final StringPath printfmt = createString("printfmt");

    public final NumberPath<Short> reserved = createNumber("reserved", Short.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> status = createNumber("status", Byte.class);

    public final NumberPath<Integer> tdefault = createNumber("tdefault", Integer.class);

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public final NumberPath<Short> usertype = createNumber("usertype", Short.class);

    public final BooleanPath variable = createBoolean("variable");

    public final NumberPath<Byte> xprec = createNumber("xprec", Byte.class);

    public final NumberPath<Byte> xscale = createNumber("xscale", Byte.class);

    public final NumberPath<Byte> xtype = createNumber("xtype", Byte.class);

    public final NumberPath<Short> xusertype = createNumber("xusertype", Short.class);

    public QSystypes(String variable) {
        super(QSystypes.class, forVariable(variable), "sys", "systypes");
        addMetadata();
    }

    public QSystypes(String variable, String schema, String table) {
        super(QSystypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystypes(Path<? extends QSystypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "systypes");
        addMetadata();
    }

    public QSystypes(PathMetadata metadata) {
        super(QSystypes.class, metadata, "sys", "systypes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allownulls, ColumnMetadata.named("allownulls").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(collation, ColumnMetadata.named("collation").withIndex(20).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationid, ColumnMetadata.named("collationid").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(domain, ColumnMetadata.named("domain").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(length, ColumnMetadata.named("length").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(prec, ColumnMetadata.named("prec").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(printfmt, ColumnMetadata.named("printfmt").withIndex(17).ofType(Types.VARCHAR).withSize(255));
        addMetadata(reserved, ColumnMetadata.named("reserved").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(19).ofType(Types.TINYINT).withSize(3));
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(tdefault, ColumnMetadata.named("tdefault").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(16).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(usertype, ColumnMetadata.named("usertype").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(variable, ColumnMetadata.named("variable").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(xprec, ColumnMetadata.named("xprec").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xscale, ColumnMetadata.named("xscale").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xtype, ColumnMetadata.named("xtype").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(xusertype, ColumnMetadata.named("xusertype").withIndex(4).ofType(Types.SMALLINT).withSize(5));
    }

}

