package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmCdcLogScanSessions is a Querydsl query type for QDmCdcLogScanSessions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmCdcLogScanSessions extends com.querydsl.sql.RelationalPathBase<QDmCdcLogScanSessions> {

    private static final long serialVersionUID = -489839902;

    public static final QDmCdcLogScanSessions dmCdcLogScanSessions = new QDmCdcLogScanSessions("dm_cdc_log_scan_sessions");

    public final NumberPath<Long> commandCount = createNumber("commandCount", Long.class);

    public final StringPath currentLsn = createString("currentLsn");

    public final NumberPath<Integer> duration = createNumber("duration", Integer.class);

    public final NumberPath<Integer> emptyScanCount = createNumber("emptyScanCount", Integer.class);

    public final StringPath endLsn = createString("endLsn");

    public final DateTimePath<java.sql.Timestamp> endTime = createDateTime("endTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> errorCount = createNumber("errorCount", Integer.class);

    public final NumberPath<Integer> failedSessionsCount = createNumber("failedSessionsCount", Integer.class);

    public final StringPath firstBeginCdcLsn = createString("firstBeginCdcLsn");

    public final StringPath lastCommitCdcLsn = createString("lastCommitCdcLsn");

    public final DateTimePath<java.sql.Timestamp> lastCommitCdcTime = createDateTime("lastCommitCdcTime", java.sql.Timestamp.class);

    public final StringPath lastCommitLsn = createString("lastCommitLsn");

    public final DateTimePath<java.sql.Timestamp> lastCommitTime = createDateTime("lastCommitTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> latency = createNumber("latency", Integer.class);

    public final NumberPath<Long> logRecordCount = createNumber("logRecordCount", Long.class);

    public final StringPath scanPhase = createString("scanPhase");

    public final NumberPath<Integer> schemaChangeCount = createNumber("schemaChangeCount", Integer.class);

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final StringPath startLsn = createString("startLsn");

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Long> tranCount = createNumber("tranCount", Long.class);

    public QDmCdcLogScanSessions(String variable) {
        super(QDmCdcLogScanSessions.class, forVariable(variable), "sys", "dm_cdc_log_scan_sessions");
        addMetadata();
    }

    public QDmCdcLogScanSessions(String variable, String schema, String table) {
        super(QDmCdcLogScanSessions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmCdcLogScanSessions(Path<? extends QDmCdcLogScanSessions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_cdc_log_scan_sessions");
        addMetadata();
    }

    public QDmCdcLogScanSessions(PathMetadata metadata) {
        super(QDmCdcLogScanSessions.class, metadata, "sys", "dm_cdc_log_scan_sessions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commandCount, ColumnMetadata.named("command_count").withIndex(15).ofType(Types.BIGINT).withSize(19));
        addMetadata(currentLsn, ColumnMetadata.named("current_lsn").withIndex(8).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(duration, ColumnMetadata.named("duration").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(emptyScanCount, ColumnMetadata.named("empty_scan_count").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(endLsn, ColumnMetadata.named("end_lsn").withIndex(9).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(endTime, ColumnMetadata.named("end_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(errorCount, ColumnMetadata.named("error_count").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(failedSessionsCount, ColumnMetadata.named("failed_sessions_count").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(firstBeginCdcLsn, ColumnMetadata.named("first_begin_cdc_lsn").withIndex(16).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(lastCommitCdcLsn, ColumnMetadata.named("last_commit_cdc_lsn").withIndex(17).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(lastCommitCdcTime, ColumnMetadata.named("last_commit_cdc_time").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastCommitLsn, ColumnMetadata.named("last_commit_lsn").withIndex(11).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(lastCommitTime, ColumnMetadata.named("last_commit_time").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(latency, ColumnMetadata.named("latency").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(logRecordCount, ColumnMetadata.named("log_record_count").withIndex(13).ofType(Types.BIGINT).withSize(19));
        addMetadata(scanPhase, ColumnMetadata.named("scan_phase").withIndex(5).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(schemaChangeCount, ColumnMetadata.named("schema_change_count").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(startLsn, ColumnMetadata.named("start_lsn").withIndex(7).ofType(Types.NVARCHAR).withSize(24));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(tranCount, ColumnMetadata.named("tran_count").withIndex(10).ofType(Types.BIGINT).withSize(19));
    }

}

