package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecRequests is a Querydsl query type for QDmExecRequests
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecRequests extends com.querydsl.sql.RelationalPathBase<QDmExecRequests> {

    private static final long serialVersionUID = -1959609413;

    public static final QDmExecRequests dmExecRequests = new QDmExecRequests("dm_exec_requests");

    public final BooleanPath ansiDefaults = createBoolean("ansiDefaults");

    public final BooleanPath ansiNullDfltOn = createBoolean("ansiNullDfltOn");

    public final BooleanPath ansiNulls = createBoolean("ansiNulls");

    public final BooleanPath ansiPadding = createBoolean("ansiPadding");

    public final BooleanPath ansiWarnings = createBoolean("ansiWarnings");

    public final BooleanPath arithabort = createBoolean("arithabort");

    public final NumberPath<Short> blockingSessionId = createNumber("blockingSessionId", Short.class);

    public final StringPath command = createString("command");

    public final BooleanPath concatNullYieldsNull = createBoolean("concatNullYieldsNull");

    public final StringPath connectionId = createString("connectionId");

    public final SimplePath<byte[]> contextInfo = createSimple("contextInfo", byte[].class);

    public final NumberPath<Integer> cpuTime = createNumber("cpuTime", Integer.class);

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Short> dateFirst = createNumber("dateFirst", Short.class);

    public final StringPath dateFormat = createString("dateFormat");

    public final NumberPath<Integer> deadlockPriority = createNumber("deadlockPriority", Integer.class);

    public final NumberPath<Long> estimatedCompletionTime = createNumber("estimatedCompletionTime", Long.class);

    public final BooleanPath executingManagedCode = createBoolean("executingManagedCode");

    public final NumberPath<Integer> grantedQueryMemory = createNumber("grantedQueryMemory", Integer.class);

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final StringPath language = createString("language");

    public final StringPath lastWaitType = createString("lastWaitType");

    public final NumberPath<Integer> lockTimeout = createNumber("lockTimeout", Integer.class);

    public final NumberPath<Long> logicalReads = createNumber("logicalReads", Long.class);

    public final NumberPath<Integer> nestLevel = createNumber("nestLevel", Integer.class);

    public final NumberPath<Integer> openResultsetCount = createNumber("openResultsetCount", Integer.class);

    public final NumberPath<Integer> openTransactionCount = createNumber("openTransactionCount", Integer.class);

    public final NumberPath<Float> percentComplete = createNumber("percentComplete", Float.class);

    public final SimplePath<byte[]> planHandle = createSimple("planHandle", byte[].class);

    public final NumberPath<Integer> prevError = createNumber("prevError", Integer.class);

    public final SimplePath<byte[]> queryHash = createSimple("queryHash", byte[].class);

    public final SimplePath<byte[]> queryPlanHash = createSimple("queryPlanHash", byte[].class);

    public final BooleanPath quotedIdentifier = createBoolean("quotedIdentifier");

    public final NumberPath<Long> reads = createNumber("reads", Long.class);

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final NumberPath<Long> rowCount = createNumber("rowCount", Long.class);

    public final NumberPath<Integer> schedulerId = createNumber("schedulerId", Integer.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final SimplePath<byte[]> sqlHandle = createSimple("sqlHandle", byte[].class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> statementEndOffset = createNumber("statementEndOffset", Integer.class);

    public final NumberPath<Integer> statementStartOffset = createNumber("statementStartOffset", Integer.class);

    public final StringPath status = createString("status");

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final NumberPath<Integer> textSize = createNumber("textSize", Integer.class);

    public final NumberPath<Integer> totalElapsedTime = createNumber("totalElapsedTime", Integer.class);

    public final NumberPath<Long> transactionId = createNumber("transactionId", Long.class);

    public final NumberPath<Short> transactionIsolationLevel = createNumber("transactionIsolationLevel", Short.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final StringPath waitResource = createString("waitResource");

    public final NumberPath<Integer> waitTime = createNumber("waitTime", Integer.class);

    public final StringPath waitType = createString("waitType");

    public final NumberPath<Long> writes = createNumber("writes", Long.class);

    public QDmExecRequests(String variable) {
        super(QDmExecRequests.class, forVariable(variable), "sys", "dm_exec_requests");
        addMetadata();
    }

    public QDmExecRequests(String variable, String schema, String table) {
        super(QDmExecRequests.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecRequests(Path<? extends QDmExecRequests> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_requests");
        addMetadata();
    }

    public QDmExecRequests(PathMetadata metadata) {
        super(QDmExecRequests.class, metadata, "sys", "dm_exec_requests");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ansiDefaults, ColumnMetadata.named("ansi_defaults").withIndex(38).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiNullDfltOn, ColumnMetadata.named("ansi_null_dflt_on").withIndex(37).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiNulls, ColumnMetadata.named("ansi_nulls").withIndex(41).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiPadding, ColumnMetadata.named("ansi_padding").withIndex(40).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(ansiWarnings, ColumnMetadata.named("ansi_warnings").withIndex(39).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(arithabort, ColumnMetadata.named("arithabort").withIndex(36).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(blockingSessionId, ColumnMetadata.named("blocking_session_id").withIndex(13).ofType(Types.SMALLINT).withSize(5));
        addMetadata(command, ColumnMetadata.named("command").withIndex(5).ofType(Types.NVARCHAR).withSize(32).notNull());
        addMetadata(concatNullYieldsNull, ColumnMetadata.named("concat_null_yields_null").withIndex(42).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(connectionId, ColumnMetadata.named("connection_id").withIndex(12).ofType(Types.CHAR).withSize(36));
        addMetadata(contextInfo, ColumnMetadata.named("context_info").withIndex(21).ofType(Types.VARBINARY).withSize(128));
        addMetadata(cpuTime, ColumnMetadata.named("cpu_time").withIndex(24).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dateFirst, ColumnMetadata.named("date_first").withIndex(34).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(dateFormat, ColumnMetadata.named("date_format").withIndex(33).ofType(Types.NVARCHAR).withSize(3));
        addMetadata(deadlockPriority, ColumnMetadata.named("deadlock_priority").withIndex(45).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(estimatedCompletionTime, ColumnMetadata.named("estimated_completion_time").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(executingManagedCode, ColumnMetadata.named("executing_managed_code").withIndex(50).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(grantedQueryMemory, ColumnMetadata.named("granted_query_memory").withIndex(49).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(51).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(language, ColumnMetadata.named("language").withIndex(32).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(lastWaitType, ColumnMetadata.named("last_wait_type").withIndex(16).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(lockTimeout, ColumnMetadata.named("lock_timeout").withIndex(44).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(logicalReads, ColumnMetadata.named("logical_reads").withIndex(30).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(nestLevel, ColumnMetadata.named("nest_level").withIndex(48).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(openResultsetCount, ColumnMetadata.named("open_resultset_count").withIndex(19).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(openTransactionCount, ColumnMetadata.named("open_transaction_count").withIndex(18).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(percentComplete, ColumnMetadata.named("percent_complete").withIndex(22).ofType(Types.REAL).withSize(24).notNull());
        addMetadata(planHandle, ColumnMetadata.named("plan_handle").withIndex(9).ofType(Types.VARBINARY).withSize(64));
        addMetadata(prevError, ColumnMetadata.named("prev_error").withIndex(47).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(queryHash, ColumnMetadata.named("query_hash").withIndex(52).ofType(Types.BINARY).withSize(8));
        addMetadata(queryPlanHash, ColumnMetadata.named("query_plan_hash").withIndex(53).ofType(Types.BINARY).withSize(8));
        addMetadata(quotedIdentifier, ColumnMetadata.named("quoted_identifier").withIndex(35).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(reads, ColumnMetadata.named("reads").withIndex(28).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(46).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(schedulerId, ColumnMetadata.named("scheduler_id").withIndex(26).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sqlHandle, ColumnMetadata.named("sql_handle").withIndex(6).ofType(Types.VARBINARY).withSize(64));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(statementEndOffset, ColumnMetadata.named("statement_end_offset").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(statementStartOffset, ColumnMetadata.named("statement_start_offset").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(27).ofType(Types.VARBINARY).withSize(8));
        addMetadata(textSize, ColumnMetadata.named("text_size").withIndex(31).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(totalElapsedTime, ColumnMetadata.named("total_elapsed_time").withIndex(25).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(transactionId, ColumnMetadata.named("transaction_id").withIndex(20).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(transactionIsolationLevel, ColumnMetadata.named("transaction_isolation_level").withIndex(43).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(waitResource, ColumnMetadata.named("wait_resource").withIndex(17).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(waitTime, ColumnMetadata.named("wait_time").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(waitType, ColumnMetadata.named("wait_type").withIndex(14).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(writes, ColumnMetadata.named("writes").withIndex(29).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

