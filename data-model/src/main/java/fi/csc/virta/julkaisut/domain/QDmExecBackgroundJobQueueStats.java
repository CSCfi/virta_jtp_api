package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecBackgroundJobQueueStats is a Querydsl query type for QDmExecBackgroundJobQueueStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecBackgroundJobQueueStats extends com.querydsl.sql.RelationalPathBase<QDmExecBackgroundJobQueueStats> {

    private static final long serialVersionUID = 1358166598;

    public static final QDmExecBackgroundJobQueueStats dmExecBackgroundJobQueueStats = new QDmExecBackgroundJobQueueStats("dm_exec_background_job_queue_stats");

    public final NumberPath<Integer> elapsedAvgMs = createNumber("elapsedAvgMs", Integer.class);

    public final NumberPath<Integer> elapsedMaxMs = createNumber("elapsedMaxMs", Integer.class);

    public final NumberPath<Integer> endedCount = createNumber("endedCount", Integer.class);

    public final NumberPath<Integer> enqueuedCount = createNumber("enqueuedCount", Integer.class);

    public final NumberPath<Integer> enqueueFailedDuplicateCount = createNumber("enqueueFailedDuplicateCount", Integer.class);

    public final NumberPath<Integer> enqueueFailedFullCount = createNumber("enqueueFailedFullCount", Integer.class);

    public final NumberPath<Integer> failedGiveupCount = createNumber("failedGiveupCount", Integer.class);

    public final NumberPath<Integer> failedLockCount = createNumber("failedLockCount", Integer.class);

    public final NumberPath<Integer> failedOtherCount = createNumber("failedOtherCount", Integer.class);

    public final NumberPath<Integer> queueMaxLen = createNumber("queueMaxLen", Integer.class);

    public final NumberPath<Integer> startedCount = createNumber("startedCount", Integer.class);

    public QDmExecBackgroundJobQueueStats(String variable) {
        super(QDmExecBackgroundJobQueueStats.class, forVariable(variable), "sys", "dm_exec_background_job_queue_stats");
        addMetadata();
    }

    public QDmExecBackgroundJobQueueStats(String variable, String schema, String table) {
        super(QDmExecBackgroundJobQueueStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecBackgroundJobQueueStats(Path<? extends QDmExecBackgroundJobQueueStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_background_job_queue_stats");
        addMetadata();
    }

    public QDmExecBackgroundJobQueueStats(PathMetadata metadata) {
        super(QDmExecBackgroundJobQueueStats.class, metadata, "sys", "dm_exec_background_job_queue_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(elapsedAvgMs, ColumnMetadata.named("elapsed_avg_ms").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(elapsedMaxMs, ColumnMetadata.named("elapsed_max_ms").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(endedCount, ColumnMetadata.named("ended_count").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(enqueuedCount, ColumnMetadata.named("enqueued_count").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(enqueueFailedDuplicateCount, ColumnMetadata.named("enqueue_failed_duplicate_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(enqueueFailedFullCount, ColumnMetadata.named("enqueue_failed_full_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(failedGiveupCount, ColumnMetadata.named("failed_giveup_count").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(failedLockCount, ColumnMetadata.named("failed_lock_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(failedOtherCount, ColumnMetadata.named("failed_other_count").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(queueMaxLen, ColumnMetadata.named("queue_max_len").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startedCount, ColumnMetadata.named("started_count").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

