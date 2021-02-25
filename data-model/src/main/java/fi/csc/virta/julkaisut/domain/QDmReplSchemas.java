package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmReplSchemas is a Querydsl query type for QDmReplSchemas
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmReplSchemas extends com.querydsl.sql.RelationalPathBase<QDmReplSchemas> {

    private static final long serialVersionUID = 1180716925;

    public static final QDmReplSchemas dmReplSchemas = new QDmReplSchemas("dm_repl_schemas");

    public final SimplePath<byte[]> artcacheSchemaAddress = createSimple("artcacheSchemaAddress", byte[].class);

    public final NumberPath<Short> ccTabname = createNumber("ccTabname", Short.class);

    public final NumberPath<Short> ccTabschema = createNumber("ccTabschema", Short.class);

    public final NumberPath<Integer> idSch = createNumber("idSch", Integer.class);

    public final NumberPath<Short> indexid = createNumber("indexid", Short.class);

    public final NumberPath<Integer> numPkCols = createNumber("numPkCols", Integer.class);

    public final SimplePath<byte[]> pcitee = createSimple("pcitee", byte[].class);

    public final StringPath reAwcName = createString("reAwcName");

    public final NumberPath<Byte> reBitpos = createNumber("reBitpos", Byte.class);

    public final NumberPath<Short> reCcName = createNumber("reCcName", Short.class);

    public final NumberPath<Short> reColattr = createNumber("reColattr", Short.class);

    public final NumberPath<Integer> reColid = createNumber("reColid", Integer.class);

    public final NumberPath<Integer> reCollatid = createNumber("reCollatid", Integer.class);

    public final NumberPath<Integer> reComputed = createNumber("reComputed", Integer.class);

    public final NumberPath<Byte> reFAnsiTrim = createNumber("reFAnsiTrim", Byte.class);

    public final NumberPath<Byte> reFNullable = createNumber("reFNullable", Byte.class);

    public final NumberPath<Short> reMaxlen = createNumber("reMaxlen", Short.class);

    public final NumberPath<Integer> reNumcols = createNumber("reNumcols", Integer.class);

    public final NumberPath<Integer> reNumtextcols = createNumber("reNumtextcols", Integer.class);

    public final NumberPath<Integer> reOffset = createNumber("reOffset", Integer.class);

    public final NumberPath<Byte> rePrec = createNumber("rePrec", Byte.class);

    public final NumberPath<Byte> reScale = createNumber("reScale", Byte.class);

    public final StringPath reSchemaLsnBegin = createString("reSchemaLsnBegin");

    public final StringPath reSchemaLsnEnd = createString("reSchemaLsnEnd");

    public final NumberPath<Byte> reXvtype = createNumber("reXvtype", Byte.class);

    public final NumberPath<Long> rowsetidDelete = createNumber("rowsetidDelete", Long.class);

    public final NumberPath<Long> rowsetidInsert = createNumber("rowsetidInsert", Long.class);

    public final NumberPath<Byte> seBitpos = createNumber("seBitpos", Byte.class);

    public final NumberPath<Integer> seColid = createNumber("seColid", Integer.class);

    public final NumberPath<Integer> seCollatid = createNumber("seCollatid", Integer.class);

    public final NumberPath<Byte> seComputed = createNumber("seComputed", Byte.class);

    public final NumberPath<Byte> seFAnsiTrim = createNumber("seFAnsiTrim", Byte.class);

    public final NumberPath<Byte> seFNullable = createNumber("seFNullable", Byte.class);

    public final NumberPath<Short> seMaxlen = createNumber("seMaxlen", Short.class);

    public final NumberPath<Short> seNullBitInLeafRows = createNumber("seNullBitInLeafRows", Short.class);

    public final NumberPath<Integer> seNumcols = createNumber("seNumcols", Integer.class);

    public final NumberPath<Integer> seOffset = createNumber("seOffset", Integer.class);

    public final NumberPath<Byte> sePrec = createNumber("sePrec", Byte.class);

    public final NumberPath<Long> seRowsetid = createNumber("seRowsetid", Long.class);

    public final NumberPath<Byte> seScale = createNumber("seScale", Byte.class);

    public final StringPath seSchemaLsnBegin = createString("seSchemaLsnBegin");

    public final StringPath seSchemaLsnEnd = createString("seSchemaLsnEnd");

    public final NumberPath<Byte> seXvtype = createNumber("seXvtype", Byte.class);

    public final NumberPath<Integer> tabid = createNumber("tabid", Integer.class);

    public final StringPath tabname = createString("tabname");

    public final StringPath tabschema = createString("tabschema");

    public QDmReplSchemas(String variable) {
        super(QDmReplSchemas.class, forVariable(variable), "sys", "dm_repl_schemas");
        addMetadata();
    }

    public QDmReplSchemas(String variable, String schema, String table) {
        super(QDmReplSchemas.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmReplSchemas(Path<? extends QDmReplSchemas> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_repl_schemas");
        addMetadata();
    }

    public QDmReplSchemas(PathMetadata metadata) {
        super(QDmReplSchemas.class, metadata, "sys", "dm_repl_schemas");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artcacheSchemaAddress, ColumnMetadata.named("artcache_schema_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(ccTabname, ColumnMetadata.named("ccTabname").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(ccTabschema, ColumnMetadata.named("ccTabschema").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(idSch, ColumnMetadata.named("idSch").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(indexid, ColumnMetadata.named("indexid").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(numPkCols, ColumnMetadata.named("num_pk_cols").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(pcitee, ColumnMetadata.named("pcitee").withIndex(12).ofType(Types.VARBINARY).withSize(8));
        addMetadata(reAwcName, ColumnMetadata.named("re_awcName").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(reBitpos, ColumnMetadata.named("re_bitpos").withIndex(27).ofType(Types.TINYINT).withSize(3));
        addMetadata(reCcName, ColumnMetadata.named("re_ccName").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(reColattr, ColumnMetadata.named("re_colattr").withIndex(20).ofType(Types.SMALLINT).withSize(5));
        addMetadata(reColid, ColumnMetadata.named("re_colid").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(reCollatid, ColumnMetadata.named("re_collatid").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(reComputed, ColumnMetadata.named("re_computed").withIndex(30).ofType(Types.INTEGER).withSize(10));
        addMetadata(reFAnsiTrim, ColumnMetadata.named("re_fAnsiTrim").withIndex(29).ofType(Types.TINYINT).withSize(3));
        addMetadata(reFNullable, ColumnMetadata.named("re_fNullable").withIndex(28).ofType(Types.TINYINT).withSize(3));
        addMetadata(reMaxlen, ColumnMetadata.named("re_maxlen").withIndex(21).ofType(Types.SMALLINT).withSize(5));
        addMetadata(reNumcols, ColumnMetadata.named("re_numcols").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(reNumtextcols, ColumnMetadata.named("re_numtextcols").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(reOffset, ColumnMetadata.named("re_offset").withIndex(26).ofType(Types.INTEGER).withSize(10));
        addMetadata(rePrec, ColumnMetadata.named("re_prec").withIndex(22).ofType(Types.TINYINT).withSize(3));
        addMetadata(reScale, ColumnMetadata.named("re_scale").withIndex(23).ofType(Types.TINYINT).withSize(3));
        addMetadata(reSchemaLsnBegin, ColumnMetadata.named("re_schema_lsn_begin").withIndex(14).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(reSchemaLsnEnd, ColumnMetadata.named("re_schema_lsn_end").withIndex(15).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(reXvtype, ColumnMetadata.named("re_xvtype").withIndex(25).ofType(Types.TINYINT).withSize(3));
        addMetadata(rowsetidDelete, ColumnMetadata.named("rowsetid_delete").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(rowsetidInsert, ColumnMetadata.named("rowsetid_insert").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(seBitpos, ColumnMetadata.named("se_bitpos").withIndex(42).ofType(Types.TINYINT).withSize(3));
        addMetadata(seColid, ColumnMetadata.named("se_colid").withIndex(35).ofType(Types.INTEGER).withSize(10));
        addMetadata(seCollatid, ColumnMetadata.named("se_collatid").withIndex(39).ofType(Types.INTEGER).withSize(10));
        addMetadata(seComputed, ColumnMetadata.named("se_computed").withIndex(45).ofType(Types.TINYINT).withSize(3));
        addMetadata(seFAnsiTrim, ColumnMetadata.named("se_fAnsiTrim").withIndex(44).ofType(Types.TINYINT).withSize(3));
        addMetadata(seFNullable, ColumnMetadata.named("se_fNullable").withIndex(43).ofType(Types.TINYINT).withSize(3));
        addMetadata(seMaxlen, ColumnMetadata.named("se_maxlen").withIndex(36).ofType(Types.SMALLINT).withSize(5));
        addMetadata(seNullBitInLeafRows, ColumnMetadata.named("se_nullBitInLeafRows").withIndex(46).ofType(Types.SMALLINT).withSize(5));
        addMetadata(seNumcols, ColumnMetadata.named("se_numcols").withIndex(34).ofType(Types.INTEGER).withSize(10));
        addMetadata(seOffset, ColumnMetadata.named("se_offset").withIndex(41).ofType(Types.INTEGER).withSize(10));
        addMetadata(sePrec, ColumnMetadata.named("se_prec").withIndex(37).ofType(Types.TINYINT).withSize(3));
        addMetadata(seRowsetid, ColumnMetadata.named("se_rowsetid").withIndex(31).ofType(Types.BIGINT).withSize(19));
        addMetadata(seScale, ColumnMetadata.named("se_scale").withIndex(38).ofType(Types.TINYINT).withSize(3));
        addMetadata(seSchemaLsnBegin, ColumnMetadata.named("se_schema_lsn_begin").withIndex(32).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(seSchemaLsnEnd, ColumnMetadata.named("se_schema_lsn_end").withIndex(33).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(seXvtype, ColumnMetadata.named("se_xvtype").withIndex(40).ofType(Types.TINYINT).withSize(3));
        addMetadata(tabid, ColumnMetadata.named("tabid").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(tabname, ColumnMetadata.named("tabname").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(tabschema, ColumnMetadata.named("tabschema").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
    }

}

