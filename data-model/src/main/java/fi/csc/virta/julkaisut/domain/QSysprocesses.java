package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSysprocesses is a Querydsl query type for QSysprocesses
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysprocesses extends com.querydsl.sql.RelationalPathBase<QSysprocesses> {

    private static final long serialVersionUID = -1801319539;

    public static final QSysprocesses sysprocesses = new QSysprocesses("sysprocesses");

    public final NumberPath<Short> blocked = createNumber("blocked", Short.class);

    public final StringPath cmd = createString("cmd");

    public final SimplePath<byte[]> contextInfo = createSimple("contextInfo", byte[].class);

    public final NumberPath<Integer> cpu = createNumber("cpu", Integer.class);

    public final NumberPath<Short> dbid = createNumber("dbid", Short.class);

    public final NumberPath<Short> ecid = createNumber("ecid", Short.class);

    public final StringPath hostname = createString("hostname");

    public final StringPath hostprocess = createString("hostprocess");

    public final NumberPath<Short> kpid = createNumber("kpid", Short.class);

    public final DateTimePath<java.sql.Timestamp> lastBatch = createDateTime("lastBatch", java.sql.Timestamp.class);

    public final StringPath lastwaittype = createString("lastwaittype");

    public final StringPath loginame = createString("loginame");

    public final DateTimePath<java.sql.Timestamp> loginTime = createDateTime("loginTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> memusage = createNumber("memusage", Integer.class);

    public final StringPath netAddress = createString("netAddress");

    public final StringPath netLibrary = createString("netLibrary");

    public final StringPath ntDomain = createString("ntDomain");

    public final StringPath ntUsername = createString("ntUsername");

    public final NumberPath<Short> openTran = createNumber("openTran", Short.class);

    public final NumberPath<Long> physicalIo = createNumber("physicalIo", Long.class);

    public final StringPath programName = createString("programName");

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final NumberPath<Short> spid = createNumber("spid", Short.class);

    public final SimplePath<byte[]> sqlHandle = createSimple("sqlHandle", byte[].class);

    public final StringPath status = createString("status");

    public final NumberPath<Integer> stmtEnd = createNumber("stmtEnd", Integer.class);

    public final NumberPath<Integer> stmtStart = createNumber("stmtStart", Integer.class);

    public final NumberPath<Short> uid = createNumber("uid", Short.class);

    public final StringPath waitresource = createString("waitresource");

    public final NumberPath<Long> waittime = createNumber("waittime", Long.class);

    public final SimplePath<byte[]> waittype = createSimple("waittype", byte[].class);

    public QSysprocesses(String variable) {
        super(QSysprocesses.class, forVariable(variable), "sys", "sysprocesses");
        addMetadata();
    }

    public QSysprocesses(String variable, String schema, String table) {
        super(QSysprocesses.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysprocesses(Path<? extends QSysprocesses> path) {
        super(path.getType(), path.getMetadata(), "sys", "sysprocesses");
        addMetadata();
    }

    public QSysprocesses(PathMetadata metadata) {
        super(QSysprocesses.class, metadata, "sys", "sysprocesses");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blocked, ColumnMetadata.named("blocked").withIndex(3).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(cmd, ColumnMetadata.named("cmd").withIndex(22).ofType(Types.NCHAR).withSize(16).notNull());
        addMetadata(contextInfo, ColumnMetadata.named("context_info").withIndex(28).ofType(Types.BINARY).withSize(128).notNull());
        addMetadata(cpu, ColumnMetadata.named("cpu").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dbid, ColumnMetadata.named("dbid").withIndex(8).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(ecid, ColumnMetadata.named("ecid").withIndex(15).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(hostname, ColumnMetadata.named("hostname").withIndex(19).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(hostprocess, ColumnMetadata.named("hostprocess").withIndex(21).ofType(Types.NCHAR).withSize(10).notNull());
        addMetadata(kpid, ColumnMetadata.named("kpid").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastBatch, ColumnMetadata.named("last_batch").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastwaittype, ColumnMetadata.named("lastwaittype").withIndex(6).ofType(Types.NCHAR).withSize(32).notNull());
        addMetadata(loginame, ColumnMetadata.named("loginame").withIndex(27).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(loginTime, ColumnMetadata.named("login_time").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(memusage, ColumnMetadata.named("memusage").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(netAddress, ColumnMetadata.named("net_address").withIndex(25).ofType(Types.NCHAR).withSize(12).notNull());
        addMetadata(netLibrary, ColumnMetadata.named("net_library").withIndex(26).ofType(Types.NCHAR).withSize(12).notNull());
        addMetadata(ntDomain, ColumnMetadata.named("nt_domain").withIndex(23).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(ntUsername, ColumnMetadata.named("nt_username").withIndex(24).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(openTran, ColumnMetadata.named("open_tran").withIndex(16).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(physicalIo, ColumnMetadata.named("physical_io").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(programName, ColumnMetadata.named("program_name").withIndex(20).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(32).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(18).ofType(Types.BINARY).withSize(86).notNull());
        addMetadata(spid, ColumnMetadata.named("spid").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sqlHandle, ColumnMetadata.named("sql_handle").withIndex(29).ofType(Types.BINARY).withSize(20).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(17).ofType(Types.NCHAR).withSize(30).notNull());
        addMetadata(stmtEnd, ColumnMetadata.named("stmt_end").withIndex(31).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stmtStart, ColumnMetadata.named("stmt_start").withIndex(30).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(uid, ColumnMetadata.named("uid").withIndex(9).ofType(Types.SMALLINT).withSize(5));
        addMetadata(waitresource, ColumnMetadata.named("waitresource").withIndex(7).ofType(Types.NCHAR).withSize(256).notNull());
        addMetadata(waittime, ColumnMetadata.named("waittime").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(waittype, ColumnMetadata.named("waittype").withIndex(4).ofType(Types.BINARY).withSize(2).notNull());
    }

}

