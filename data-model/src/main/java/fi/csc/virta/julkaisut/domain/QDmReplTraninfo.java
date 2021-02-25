package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmReplTraninfo is a Querydsl query type for QDmReplTraninfo
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmReplTraninfo extends com.querydsl.sql.RelationalPathBase<QDmReplTraninfo> {

    private static final long serialVersionUID = -74216658;

    public static final QDmReplTraninfo dmReplTraninfo = new QDmReplTraninfo("dm_repl_traninfo");

    public final SimplePath<byte[]> artcacheTableAddress = createSimple("artcacheTableAddress", byte[].class);

    public final StringPath beginLsn = createString("beginLsn");

    public final DateTimePath<java.sql.Timestamp> beginTime = createDateTime("beginTime", java.sql.Timestamp.class);

    public final StringPath beginUpdateLsn = createString("beginUpdateLsn");

    public final NumberPath<Integer> cmdsInTran = createNumber("cmdsInTran", Integer.class);

    public final StringPath commitLsn = createString("commitLsn");

    public final DateTimePath<java.sql.Timestamp> commitTime = createDateTime("commitTime", java.sql.Timestamp.class);

    public final SimplePath<byte[]> compRangeAddress = createSimple("compRangeAddress", byte[].class);

    public final StringPath database = createString("database");

    public final NumberPath<Short> dbid = createNumber("dbid", Short.class);

    public final NumberPath<Integer> dbLenInBytes = createNumber("dbLenInBytes", Integer.class);

    public final NumberPath<Integer> dbVer = createNumber("dbVer", Integer.class);

    public final StringPath deleteLsn = createString("deleteLsn");

    public final NumberPath<Integer> errorCount = createNumber("errorCount", Integer.class);

    public final NumberPath<Byte> fcompensated = createNumber("fcompensated", Byte.class);

    public final NumberPath<Byte> fcomplete = createNumber("fcomplete", Byte.class);

    public final NumberPath<Byte> fp2pPubExists = createNumber("fp2pPubExists", Byte.class);

    public final NumberPath<Byte> fprocessingtext = createNumber("fprocessingtext", Byte.class);

    public final SimplePath<byte[]> fsinfoAddress = createSimple("fsinfoAddress", byte[].class);

    public final NumberPath<Byte> isBoundedupdateSingleton = createNumber("isBoundedupdateSingleton", Byte.class);

    public final NumberPath<Byte> isKnownCdcTran = createNumber("isKnownCdcTran", Byte.class);

    public final StringPath lastEndLsn = createString("lastEndLsn");

    public final NumberPath<Integer> maxCmdsInTran = createNumber("maxCmdsInTran", Integer.class);

    public final StringPath origDb = createString("origDb");

    public final NumberPath<Integer> origDbLenInBytes = createNumber("origDbLenInBytes", Integer.class);

    public final StringPath originator = createString("originator");

    public final NumberPath<Integer> originatorLenInBytes = createNumber("originatorLenInBytes", Integer.class);

    public final NumberPath<Integer> rows = createNumber("rows", Integer.class);

    public final StringPath server = createString("server");

    public final NumberPath<Integer> serverLenInBytes = createNumber("serverLenInBytes", Integer.class);

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final StringPath sessionPhase = createString("sessionPhase");

    public final SimplePath<byte[]> textinfoAddress = createSimple("textinfoAddress", byte[].class);

    public final StringPath xdesid = createString("xdesid");

    public QDmReplTraninfo(String variable) {
        super(QDmReplTraninfo.class, forVariable(variable), "sys", "dm_repl_traninfo");
        addMetadata();
    }

    public QDmReplTraninfo(String variable, String schema, String table) {
        super(QDmReplTraninfo.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmReplTraninfo(Path<? extends QDmReplTraninfo> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_repl_traninfo");
        addMetadata();
    }

    public QDmReplTraninfo(PathMetadata metadata) {
        super(QDmReplTraninfo.class, metadata, "sys", "dm_repl_traninfo");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artcacheTableAddress, ColumnMetadata.named("artcache_table_address").withIndex(11).ofType(Types.VARBINARY).withSize(8));
        addMetadata(beginLsn, ColumnMetadata.named("begin_lsn").withIndex(6).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(beginTime, ColumnMetadata.named("begin_time").withIndex(29).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(beginUpdateLsn, ColumnMetadata.named("begin_update_lsn").withIndex(22).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(cmdsInTran, ColumnMetadata.named("cmds_in_tran").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(commitLsn, ColumnMetadata.named("commit_lsn").withIndex(7).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(commitTime, ColumnMetadata.named("commit_time").withIndex(30).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(compRangeAddress, ColumnMetadata.named("comp_range_address").withIndex(3).ofType(Types.VARBINARY).withSize(8));
        addMetadata(database, ColumnMetadata.named("database").withIndex(14).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(8).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dbLenInBytes, ColumnMetadata.named("db_len_in_bytes").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(dbVer, ColumnMetadata.named("db_ver").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(deleteLsn, ColumnMetadata.named("delete_lsn").withIndex(23).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(errorCount, ColumnMetadata.named("error_count").withIndex(34).ofType(Types.INTEGER).withSize(10));
        addMetadata(fcompensated, ColumnMetadata.named("fcompensated").withIndex(26).ofType(Types.TINYINT).withSize(3));
        addMetadata(fcomplete, ColumnMetadata.named("fcomplete").withIndex(25).ofType(Types.TINYINT).withSize(3));
        addMetadata(fp2pPubExists, ColumnMetadata.named("fp2p_pub_exists").withIndex(1).ofType(Types.TINYINT).withSize(3));
        addMetadata(fprocessingtext, ColumnMetadata.named("fprocessingtext").withIndex(27).ofType(Types.TINYINT).withSize(3));
        addMetadata(fsinfoAddress, ColumnMetadata.named("fsinfo_address").withIndex(5).ofType(Types.VARBINARY).withSize(8));
        addMetadata(isBoundedupdateSingleton, ColumnMetadata.named("is_boundedupdate_singleton").withIndex(21).ofType(Types.TINYINT).withSize(3));
        addMetadata(isKnownCdcTran, ColumnMetadata.named("is_known_cdc_tran").withIndex(33).ofType(Types.TINYINT).withSize(3));
        addMetadata(lastEndLsn, ColumnMetadata.named("last_end_lsn").withIndex(24).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(maxCmdsInTran, ColumnMetadata.named("max_cmds_in_tran").withIndex(28).ofType(Types.INTEGER).withSize(10));
        addMetadata(origDb, ColumnMetadata.named("orig_db").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(origDbLenInBytes, ColumnMetadata.named("orig_db_len_in_bytes").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(originator, ColumnMetadata.named("originator").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(originatorLenInBytes, ColumnMetadata.named("originator_len_in_bytes").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(rows, ColumnMetadata.named("rows").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(server, ColumnMetadata.named("server").withIndex(12).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(serverLenInBytes, ColumnMetadata.named("server_len_in_bytes").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(31).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionPhase, ColumnMetadata.named("session_phase").withIndex(32).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(textinfoAddress, ColumnMetadata.named("textinfo_address").withIndex(4).ofType(Types.VARBINARY).withSize(8));
        addMetadata(xdesid, ColumnMetadata.named("xdesid").withIndex(10).ofType(Types.NVARCHAR).withSize(24));
    }

}

