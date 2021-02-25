package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecBackgroundJobQueue is a Querydsl query type for QDmExecBackgroundJobQueue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecBackgroundJobQueue extends com.querydsl.sql.RelationalPathBase<QDmExecBackgroundJobQueue> {

    private static final long serialVersionUID = 2141657561;

    public static final QDmExecBackgroundJobQueue dmExecBackgroundJobQueue = new QDmExecBackgroundJobQueue("dm_exec_background_job_queue");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> errorCode = createNumber("errorCode", Integer.class);

    public final NumberPath<Short> inProgress = createNumber("inProgress", Short.class);

    public final NumberPath<Integer> jobId = createNumber("jobId", Integer.class);

    public final NumberPath<Integer> objectId1 = createNumber("objectId1", Integer.class);

    public final NumberPath<Integer> objectId2 = createNumber("objectId2", Integer.class);

    public final NumberPath<Integer> objectId3 = createNumber("objectId3", Integer.class);

    public final NumberPath<Integer> objectId4 = createNumber("objectId4", Integer.class);

    public final NumberPath<Short> requestType = createNumber("requestType", Short.class);

    public final NumberPath<Short> retryCount = createNumber("retryCount", Short.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final DateTimePath<java.sql.Timestamp> timeQueued = createDateTime("timeQueued", java.sql.Timestamp.class);

    public QDmExecBackgroundJobQueue(String variable) {
        super(QDmExecBackgroundJobQueue.class, forVariable(variable), "sys", "dm_exec_background_job_queue");
        addMetadata();
    }

    public QDmExecBackgroundJobQueue(String variable, String schema, String table) {
        super(QDmExecBackgroundJobQueue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecBackgroundJobQueue(Path<? extends QDmExecBackgroundJobQueue> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_background_job_queue");
        addMetadata();
    }

    public QDmExecBackgroundJobQueue(PathMetadata metadata) {
        super(QDmExecBackgroundJobQueue.class, metadata, "sys", "dm_exec_background_job_queue");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(errorCode, ColumnMetadata.named("error_code").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(inProgress, ColumnMetadata.named("in_progress").withIndex(11).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(jobId, ColumnMetadata.named("job_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId1, ColumnMetadata.named("object_id1").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId2, ColumnMetadata.named("object_id2").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId3, ColumnMetadata.named("object_id3").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId4, ColumnMetadata.named("object_id4").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestType, ColumnMetadata.named("request_type").withIndex(9).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(retryCount, ColumnMetadata.named("retry_count").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(timeQueued, ColumnMetadata.named("time_queued").withIndex(1).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
    }

}

