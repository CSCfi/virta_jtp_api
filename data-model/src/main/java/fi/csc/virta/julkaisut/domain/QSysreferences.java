package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysreferences is a Querydsl query type for QSysreferences
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysreferences extends com.querydsl.sql.RelationalPathBase<QSysreferences> {

    private static final long serialVersionUID = 956428376;

    public static final QSysreferences sysreferences = new QSysreferences("sysreferences");

    public final NumberPath<Integer> constid = createNumber("constid", Integer.class);

    public final NumberPath<Short> fkey1 = createNumber("fkey1", Short.class);

    public final NumberPath<Short> fkey10 = createNumber("fkey10", Short.class);

    public final NumberPath<Short> fkey11 = createNumber("fkey11", Short.class);

    public final NumberPath<Short> fkey12 = createNumber("fkey12", Short.class);

    public final NumberPath<Short> fkey13 = createNumber("fkey13", Short.class);

    public final NumberPath<Short> fkey14 = createNumber("fkey14", Short.class);

    public final NumberPath<Short> fkey15 = createNumber("fkey15", Short.class);

    public final NumberPath<Short> fkey16 = createNumber("fkey16", Short.class);

    public final NumberPath<Short> fkey2 = createNumber("fkey2", Short.class);

    public final NumberPath<Short> fkey3 = createNumber("fkey3", Short.class);

    public final NumberPath<Short> fkey4 = createNumber("fkey4", Short.class);

    public final NumberPath<Short> fkey5 = createNumber("fkey5", Short.class);

    public final NumberPath<Short> fkey6 = createNumber("fkey6", Short.class);

    public final NumberPath<Short> fkey7 = createNumber("fkey7", Short.class);

    public final NumberPath<Short> fkey8 = createNumber("fkey8", Short.class);

    public final NumberPath<Short> fkey9 = createNumber("fkey9", Short.class);

    public final NumberPath<Short> fkeydbid = createNumber("fkeydbid", Short.class);

    public final NumberPath<Integer> fkeyid = createNumber("fkeyid", Integer.class);

    public final SimplePath<byte[]> forkeys = createSimple("forkeys", byte[].class);

    public final NumberPath<Short> keycnt = createNumber("keycnt", Short.class);

    public final SimplePath<byte[]> refkeys = createSimple("refkeys", byte[].class);

    public final NumberPath<Short> rkey1 = createNumber("rkey1", Short.class);

    public final NumberPath<Short> rkey10 = createNumber("rkey10", Short.class);

    public final NumberPath<Short> rkey11 = createNumber("rkey11", Short.class);

    public final NumberPath<Short> rkey12 = createNumber("rkey12", Short.class);

    public final NumberPath<Short> rkey13 = createNumber("rkey13", Short.class);

    public final NumberPath<Short> rkey14 = createNumber("rkey14", Short.class);

    public final NumberPath<Short> rkey15 = createNumber("rkey15", Short.class);

    public final NumberPath<Short> rkey16 = createNumber("rkey16", Short.class);

    public final NumberPath<Short> rkey2 = createNumber("rkey2", Short.class);

    public final NumberPath<Short> rkey3 = createNumber("rkey3", Short.class);

    public final NumberPath<Short> rkey4 = createNumber("rkey4", Short.class);

    public final NumberPath<Short> rkey5 = createNumber("rkey5", Short.class);

    public final NumberPath<Short> rkey6 = createNumber("rkey6", Short.class);

    public final NumberPath<Short> rkey7 = createNumber("rkey7", Short.class);

    public final NumberPath<Short> rkey8 = createNumber("rkey8", Short.class);

    public final NumberPath<Short> rkey9 = createNumber("rkey9", Short.class);

    public final NumberPath<Short> rkeydbid = createNumber("rkeydbid", Short.class);

    public final NumberPath<Integer> rkeyid = createNumber("rkeyid", Integer.class);

    public final NumberPath<Short> rkeyindid = createNumber("rkeyindid", Short.class);

    public QSysreferences(String variable) {
        super(QSysreferences.class, forVariable(variable), "sys", "sysreferences");
        addMetadata();
    }

    public QSysreferences(String variable, String schema, String table) {
        super(QSysreferences.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysreferences(Path<? extends QSysreferences> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysreferences");
        addMetadata();
    }

    public QSysreferences(PathMetadata metadata) {
        super(QSysreferences.class, metadata, "sys", "sysreferences");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constid, ColumnMetadata.named("constid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fkey1, ColumnMetadata.named("fkey1").withIndex(10).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey10, ColumnMetadata.named("fkey10").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey11, ColumnMetadata.named("fkey11").withIndex(20).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey12, ColumnMetadata.named("fkey12").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey13, ColumnMetadata.named("fkey13").withIndex(22).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey14, ColumnMetadata.named("fkey14").withIndex(23).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey15, ColumnMetadata.named("fkey15").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey16, ColumnMetadata.named("fkey16").withIndex(25).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey2, ColumnMetadata.named("fkey2").withIndex(11).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey3, ColumnMetadata.named("fkey3").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey4, ColumnMetadata.named("fkey4").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey5, ColumnMetadata.named("fkey5").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey6, ColumnMetadata.named("fkey6").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey7, ColumnMetadata.named("fkey7").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey8, ColumnMetadata.named("fkey8").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkey9, ColumnMetadata.named("fkey9").withIndex(18).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkeydbid, ColumnMetadata.named("fkeydbid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(fkeyid, ColumnMetadata.named("fkeyid").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(forkeys, ColumnMetadata.named("forkeys").withIndex(6).ofType(Types.VARBINARY).withSize(32));
        addMetadata(keycnt, ColumnMetadata.named("keycnt").withIndex(5).ofType(Types.SMALLINT).withSize(5));
        addMetadata(refkeys, ColumnMetadata.named("refkeys").withIndex(7).ofType(Types.VARBINARY).withSize(32));
        addMetadata(rkey1, ColumnMetadata.named("rkey1").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey10, ColumnMetadata.named("rkey10").withIndex(35).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey11, ColumnMetadata.named("rkey11").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey12, ColumnMetadata.named("rkey12").withIndex(37).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey13, ColumnMetadata.named("rkey13").withIndex(38).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey14, ColumnMetadata.named("rkey14").withIndex(39).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey15, ColumnMetadata.named("rkey15").withIndex(40).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey16, ColumnMetadata.named("rkey16").withIndex(41).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey2, ColumnMetadata.named("rkey2").withIndex(27).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey3, ColumnMetadata.named("rkey3").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey4, ColumnMetadata.named("rkey4").withIndex(29).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey5, ColumnMetadata.named("rkey5").withIndex(30).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey6, ColumnMetadata.named("rkey6").withIndex(31).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey7, ColumnMetadata.named("rkey7").withIndex(32).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey8, ColumnMetadata.named("rkey8").withIndex(33).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkey9, ColumnMetadata.named("rkey9").withIndex(34).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkeydbid, ColumnMetadata.named("rkeydbid").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(rkeyid, ColumnMetadata.named("rkeyid").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(rkeyindid, ColumnMetadata.named("rkeyindid").withIndex(4).ofType(Types.SMALLINT).withSize(5));
    }

}

