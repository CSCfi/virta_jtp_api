package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecSessions is a Querydsl query type for QDmExecSessions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecSessions extends com.querydsl.sql.RelationalPathBase<QDmExecSessions> {

    private static final long serialVersionUID = -161272684;

    public static final QDmExecSessions dmExecSessions = new QDmExecSessions("dm_exec_sessions");

    public final BooleanPath ansiDefaults = createBoolean("ansiDefaults");

    public final BooleanPath ansiNullDfltOn = createBoolean("ansiNullDfltOn");

    public final BooleanPath ansiNulls = createBoolean("ansiNulls");

    public final BooleanPath ansiPadding = createBoolean("ansiPadding");

    public final BooleanPath ansiWarnings = createBoolean("ansiWarnings");

    public final BooleanPath arithabort = createBoolean("arithabort");

    public final NumberPath<Integer> authenticatingDatabaseId = createNumber("authenticatingDatabaseId", Integer.class);

    public final StringPath clientInterfaceName = createString("clientInterfaceName");

    public final NumberPath<Integer> clientVersion = createNumber("clientVersion", Integer.class);

    public final BooleanPath concatNullYieldsNull = createBoolean("concatNullYieldsNull");

    public final SimplePath<byte[]> contextInfo = createSimple("contextInfo", byte[].class);

    public final NumberPath<Integer> cpuTime = createNumber("cpuTime", Integer.class);

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Short> dateFirst = createNumber("dateFirst", Short.class);

    public final StringPath dateFormat = createString("dateFormat");

    public final NumberPath<Integer> deadlockPriority = createNumber("deadlockPriority", Integer.class);

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final StringPath hostName = createString("hostName");

    public final NumberPath<Integer> hostProcessId = createNumber("hostProcessId", Integer.class);

    public final BooleanPath isUserProcess = createBoolean("isUserProcess");

    public final StringPath language = createString("language");

    public final DateTimePath<java.sql.Timestamp> lastRequestEndTime = createDateTime("lastRequestEndTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastRequestStartTime = createDateTime("lastRequestStartTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastSuccessfulLogon = createDateTime("lastSuccessfulLogon", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUnsuccessfulLogon = createDateTime("lastUnsuccessfulLogon", java.sql.Timestamp.class);

    public final NumberPath<Integer> lockTimeout = createNumber("lockTimeout", Integer.class);

    public final NumberPath<Long> logicalReads = createNumber("logicalReads", Long.class);

    public final StringPath loginName = createString("loginName");

    public final DateTimePath<java.sql.Timestamp> loginTime = createDateTime("loginTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> memoryUsage = createNumber("memoryUsage", Integer.class);

    public final StringPath ntDomain = createString("ntDomain");

    public final StringPath ntUserName = createString("ntUserName");

    public final NumberPath<Integer> openTransactionCount = createNumber("openTransactionCount", Integer.class);

    public final StringPath originalLoginName = createString("originalLoginName");

    public final SimplePath<byte[]> originalSecurityId = createSimple("originalSecurityId", byte[].class);

    public final NumberPath<Integer> prevError = createNumber("prevError", Integer.class);

    public final StringPath programName = createString("programName");

    public final BooleanPath quotedIdentifier = createBoolean("quotedIdentifier");

    public final NumberPath<Long> reads = createNumber("reads", Long.class);

    public final NumberPath<Long> rowCount = createNumber("rowCount", Long.class);

    public final SimplePath<byte[]> securityId = createSimple("securityId", byte[].class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final StringPath status = createString("status");

    public final NumberPath<Integer> textSize = createNumber("textSize", Integer.class);

    public final NumberPath<Integer> totalElapsedTime = createNumber("totalElapsedTime", Integer.class);

    public final NumberPath<Integer> totalScheduledTime = createNumber("totalScheduledTime", Integer.class);

    public final NumberPath<Short> transactionIsolationLevel = createNumber("transactionIsolationLevel", Short.class);

    public final NumberPath<Long> unsuccessfulLogons = createNumber("unsuccessfulLogons", Long.class);

    public final NumberPath<Long> writes = createNumber("writes", Long.class);

    public QDmExecSessions(String variable) {
        super(QDmExecSessions.class, forVariable(variable), "sys", "dm_exec_sessions");
        addMetadata();
    }

    public QDmExecSessions(String variable, String schema, String table) {
        super(QDmExecSessions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecSessions(Path<? extends QDmExecSessions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_sessions");
        addMetadata();
    }

    public QDmExecSessions(PathMetadata metadata) {
        super(QDmExecSessions.class, metadata, "sys", "dm_exec_sessions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ansiDefaults, ColumnMetadata.named("ansi_defaults").withIndex(32).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiNullDfltOn, ColumnMetadata.named("ansi_null_dflt_on").withIndex(31).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiNulls, ColumnMetadata.named("ansi_nulls").withIndex(35).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiPadding, ColumnMetadata.named("ansi_padding").withIndex(34).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiWarnings, ColumnMetadata.named("ansi_warnings").withIndex(33).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(arithabort, ColumnMetadata.named("arithabort").withIndex(30).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(authenticatingDatabaseId, ColumnMetadata.named("authenticating_database_id").withIndex(49).ofType(Types.INTEGER).withSize(10));
        addMetadata(clientInterfaceName, ColumnMetadata.named("client_interface_name").withIndex(7).ofType(Types.NVARCHAR).withSize(32));
        addMetadata(clientVersion, ColumnMetadata.named("client_version").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(concatNullYieldsNull, ColumnMetadata.named("concat_null_yields_null").withIndex(36).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(contextInfo, ColumnMetadata.named("context_info").withIndex(13).ofType(Types.VARBINARY).withSize(128));
        addMetadata(cpuTime, ColumnMetadata.named("cpu_time").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(48).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dateFirst, ColumnMetadata.named("date_first").withIndex(28).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dateFormat, ColumnMetadata.named("date_format").withIndex(27).ofType(Types.NVARCHAR).withSize(3));
        addMetadata(deadlockPriority, ColumnMetadata.named("deadlock_priority").withIndex(39).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(47).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(hostName, ColumnMetadata.named("host_name").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(hostProcessId, ColumnMetadata.named("host_process_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(isUserProcess, ColumnMetadata.named("is_user_process").withIndex(24).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(language, ColumnMetadata.named("language").withIndex(26).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(lastRequestEndTime, ColumnMetadata.named("last_request_end_time").withIndex(20).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastRequestStartTime, ColumnMetadata.named("last_request_start_time").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(lastSuccessfulLogon, ColumnMetadata.named("last_successful_logon").withIndex(44).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUnsuccessfulLogon, ColumnMetadata.named("last_unsuccessful_logon").withIndex(45).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lockTimeout, ColumnMetadata.named("lock_timeout").withIndex(38).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(logicalReads, ColumnMetadata.named("logical_reads").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(loginName, ColumnMetadata.named("login_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(loginTime, ColumnMetadata.named("login_time").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(memoryUsage, ColumnMetadata.named("memory_usage").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(ntDomain, ColumnMetadata.named("nt_domain").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(ntUserName, ColumnMetadata.named("nt_user_name").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(openTransactionCount, ColumnMetadata.named("open_transaction_count").withIndex(50).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(originalLoginName, ColumnMetadata.named("original_login_name").withIndex(43).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(originalSecurityId, ColumnMetadata.named("original_security_id").withIndex(42).ofType(Types.VARBINARY).withSize(85).notNull());
        addMetadata(prevError, ColumnMetadata.named("prev_error").withIndex(41).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(programName, ColumnMetadata.named("program_name").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(quotedIdentifier, ColumnMetadata.named("quoted_identifier").withIndex(29).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(reads, ColumnMetadata.named("reads").withIndex(21).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(40).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(securityId, ColumnMetadata.named("security_id").withIndex(8).ofType(Types.VARBINARY).withSize(85).notNull());
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(12).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(textSize, ColumnMetadata.named("text_size").withIndex(25).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(totalElapsedTime, ColumnMetadata.named("total_elapsed_time").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(totalScheduledTime, ColumnMetadata.named("total_scheduled_time").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionIsolationLevel, ColumnMetadata.named("transaction_isolation_level").withIndex(37).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(unsuccessfulLogons, ColumnMetadata.named("unsuccessful_logons").withIndex(46).ofType(Types.BIGINT).withSize(19));
        addMetadata(writes, ColumnMetadata.named("writes").withIndex(22).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

