package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSyslockinfo is a Querydsl query type for QSyslockinfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSyslockinfo extends com.querydsl.sql.RelationalPathBase<QSyslockinfo> {

    private static final long serialVersionUID = -1853614551;

    public static final QSyslockinfo syslockinfo = new QSyslockinfo("syslockinfo");

    public final NumberPath<Short> reqCryrefcnt = createNumber("reqCryrefcnt", Short.class);

    public final NumberPath<Integer> reqEcid = createNumber("reqEcid", Integer.class);

    public final NumberPath<Integer> reqLifetime = createNumber("reqLifetime", Integer.class);

    public final NumberPath<Byte> reqMode = createNumber("reqMode", Byte.class);

    public final NumberPath<Short> reqOwnertype = createNumber("reqOwnertype", Short.class);

    public final NumberPath<Short> reqRefcnt = createNumber("reqRefcnt", Short.class);

    public final NumberPath<Integer> reqSpid = createNumber("reqSpid", Integer.class);

    public final NumberPath<Byte> reqStatus = createNumber("reqStatus", Byte.class);

    public final NumberPath<Long> reqTransactionID = createNumber("reqTransactionID", Long.class);

    public final StringPath reqTransactionUOW = createString("reqTransactionUOW");

    public final SimplePath<byte[]> rscBin = createSimple("rscBin", byte[].class);

    public final NumberPath<Short> rscDbid = createNumber("rscDbid", Short.class);

    public final NumberPath<Byte> rscFlag = createNumber("rscFlag", Byte.class);

    public final NumberPath<Short> rscIndid = createNumber("rscIndid", Short.class);

    public final NumberPath<Integer> rscObjid = createNumber("rscObjid", Integer.class);

    public final StringPath rscText = createString("rscText");

    public final NumberPath<Byte> rscType = createNumber("rscType", Byte.class);

    public final SimplePath<byte[]> rscValblk = createSimple("rscValblk", byte[].class);

    public QSyslockinfo(String variable) {
        super(QSyslockinfo.class, forVariable(variable), "sys", "syslockinfo");
        addMetadata();
    }

    public QSyslockinfo(String variable, String schema, String table) {
        super(QSyslockinfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSyslockinfo(Path<? extends QSyslockinfo> path) {
        super(path.getType(), path.getMetadata(), "sys", "syslockinfo");
        addMetadata();
    }

    public QSyslockinfo(PathMetadata metadata) {
        super(QSyslockinfo.class, metadata, "sys", "syslockinfo");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(reqCryrefcnt, ColumnMetadata.named("req_cryrefcnt").withIndex(12).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(reqEcid, ColumnMetadata.named("req_ecid").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(reqLifetime, ColumnMetadata.named("req_lifetime").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(reqMode, ColumnMetadata.named("req_mode").withIndex(9).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(reqOwnertype, ColumnMetadata.named("req_ownertype").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(reqRefcnt, ColumnMetadata.named("req_refcnt").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(reqSpid, ColumnMetadata.named("req_spid").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(reqStatus, ColumnMetadata.named("req_status").withIndex(10).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(reqTransactionID, ColumnMetadata.named("req_transactionID").withIndex(17).ofType(Types.BIGINT).withSize(19));
        addMetadata(reqTransactionUOW, ColumnMetadata.named("req_transactionUOW").withIndex(18).ofType(Types.CHAR).withSize(36));
        addMetadata(rscBin, ColumnMetadata.named("rsc_bin").withIndex(2).ofType(Types.BINARY).withSize(16).notNull());
        addMetadata(rscDbid, ColumnMetadata.named("rsc_dbid").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(rscFlag, ColumnMetadata.named("rsc_flag").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(rscIndid, ColumnMetadata.named("rsc_indid").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(rscObjid, ColumnMetadata.named("rsc_objid").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rscText, ColumnMetadata.named("rsc_text").withIndex(1).ofType(Types.NCHAR).withSize(32).notNull());
        addMetadata(rscType, ColumnMetadata.named("rsc_type").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(rscValblk, ColumnMetadata.named("rsc_valblk").withIndex(3).ofType(Types.BINARY).withSize(16).notNull());
    }

}

