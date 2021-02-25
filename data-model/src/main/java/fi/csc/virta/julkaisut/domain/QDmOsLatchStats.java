package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsLatchStats is a Querydsl query type for QDmOsLatchStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsLatchStats extends com.querydsl.sql.RelationalPathBase<QDmOsLatchStats> {

    private static final long serialVersionUID = 1021188613;

    public static final QDmOsLatchStats dmOsLatchStats = new QDmOsLatchStats("dm_os_latch_stats");

    public final StringPath latchClass = createString("latchClass");

    public final NumberPath<Long> maxWaitTimeMs = createNumber("maxWaitTimeMs", Long.class);

    public final NumberPath<Long> waitingRequestsCount = createNumber("waitingRequestsCount", Long.class);

    public final NumberPath<Long> waitTimeMs = createNumber("waitTimeMs", Long.class);

    public QDmOsLatchStats(String variable) {
        super(QDmOsLatchStats.class, forVariable(variable), "sys", "dm_os_latch_stats");
        addMetadata();
    }

    public QDmOsLatchStats(String variable, String schema, String table) {
        super(QDmOsLatchStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsLatchStats(Path<? extends QDmOsLatchStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_latch_stats");
        addMetadata();
    }

    public QDmOsLatchStats(PathMetadata metadata) {
        super(QDmOsLatchStats.class, metadata, "sys", "dm_os_latch_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(latchClass, ColumnMetadata.named("latch_class").withIndex(1).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(maxWaitTimeMs, ColumnMetadata.named("max_wait_time_ms").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(waitingRequestsCount, ColumnMetadata.named("waiting_requests_count").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(waitTimeMs, ColumnMetadata.named("wait_time_ms").withIndex(3).ofType(Types.BIGINT).withSize(19));
    }

}

