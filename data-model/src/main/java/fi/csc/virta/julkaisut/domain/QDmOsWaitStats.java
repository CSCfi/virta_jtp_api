package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsWaitStats is a Querydsl query type for QDmOsWaitStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsWaitStats extends com.querydsl.sql.RelationalPathBase<QDmOsWaitStats> {

    private static final long serialVersionUID = -1710959200;

    public static final QDmOsWaitStats dmOsWaitStats = new QDmOsWaitStats("dm_os_wait_stats");

    public final NumberPath<Long> maxWaitTimeMs = createNumber("maxWaitTimeMs", Long.class);

    public final NumberPath<Long> signalWaitTimeMs = createNumber("signalWaitTimeMs", Long.class);

    public final NumberPath<Long> waitingTasksCount = createNumber("waitingTasksCount", Long.class);

    public final NumberPath<Long> waitTimeMs = createNumber("waitTimeMs", Long.class);

    public final StringPath waitType = createString("waitType");

    public QDmOsWaitStats(String variable) {
        super(QDmOsWaitStats.class, forVariable(variable), "sys", "dm_os_wait_stats");
        addMetadata();
    }

    public QDmOsWaitStats(String variable, String schema, String table) {
        super(QDmOsWaitStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsWaitStats(Path<? extends QDmOsWaitStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_wait_stats");
        addMetadata();
    }

    public QDmOsWaitStats(PathMetadata metadata) {
        super(QDmOsWaitStats.class, metadata, "sys", "dm_os_wait_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(maxWaitTimeMs, ColumnMetadata.named("max_wait_time_ms").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(signalWaitTimeMs, ColumnMetadata.named("signal_wait_time_ms").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(waitingTasksCount, ColumnMetadata.named("waiting_tasks_count").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(waitTimeMs, ColumnMetadata.named("wait_time_ms").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(waitType, ColumnMetadata.named("wait_type").withIndex(1).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

