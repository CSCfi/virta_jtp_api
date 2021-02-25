package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsPerformanceCounters is a Querydsl query type for QDmOsPerformanceCounters
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsPerformanceCounters extends com.querydsl.sql.RelationalPathBase<QDmOsPerformanceCounters> {

    private static final long serialVersionUID = -668875715;

    public static final QDmOsPerformanceCounters dmOsPerformanceCounters = new QDmOsPerformanceCounters("dm_os_performance_counters");

    public final NumberPath<Integer> cntrType = createNumber("cntrType", Integer.class);

    public final NumberPath<Long> cntrValue = createNumber("cntrValue", Long.class);

    public final StringPath counterName = createString("counterName");

    public final StringPath instanceName = createString("instanceName");

    public final StringPath objectName = createString("objectName");

    public QDmOsPerformanceCounters(String variable) {
        super(QDmOsPerformanceCounters.class, forVariable(variable), "sys", "dm_os_performance_counters");
        addMetadata();
    }

    public QDmOsPerformanceCounters(String variable, String schema, String table) {
        super(QDmOsPerformanceCounters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsPerformanceCounters(Path<? extends QDmOsPerformanceCounters> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_performance_counters");
        addMetadata();
    }

    public QDmOsPerformanceCounters(PathMetadata metadata) {
        super(QDmOsPerformanceCounters.class, metadata, "sys", "dm_os_performance_counters");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cntrType, ColumnMetadata.named("cntr_type").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cntrValue, ColumnMetadata.named("cntr_value").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(counterName, ColumnMetadata.named("counter_name").withIndex(2).ofType(Types.NCHAR).withSize(128).notNull());
        addMetadata(instanceName, ColumnMetadata.named("instance_name").withIndex(3).ofType(Types.NCHAR).withSize(128));
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(1).ofType(Types.NCHAR).withSize(128).notNull());
    }

}

