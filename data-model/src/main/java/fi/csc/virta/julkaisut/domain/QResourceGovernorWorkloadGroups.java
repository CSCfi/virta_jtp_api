package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QResourceGovernorWorkloadGroups is a Querydsl query type for QResourceGovernorWorkloadGroups
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QResourceGovernorWorkloadGroups extends com.querydsl.sql.RelationalPathBase<QResourceGovernorWorkloadGroups> {

    private static final long serialVersionUID = -1334674996;

    public static final QResourceGovernorWorkloadGroups resourceGovernorWorkloadGroups = new QResourceGovernorWorkloadGroups("resource_governor_workload_groups");

    public final NumberPath<Integer> groupId = createNumber("groupId", Integer.class);

    public final NumberPath<Integer> groupMaxRequests = createNumber("groupMaxRequests", Integer.class);

    public final StringPath importance = createString("importance");

    public final NumberPath<Integer> maxDop = createNumber("maxDop", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Integer> requestMaxCpuTimeSec = createNumber("requestMaxCpuTimeSec", Integer.class);

    public final NumberPath<Integer> requestMaxMemoryGrantPercent = createNumber("requestMaxMemoryGrantPercent", Integer.class);

    public final NumberPath<Integer> requestMemoryGrantTimeoutSec = createNumber("requestMemoryGrantTimeoutSec", Integer.class);

    public QResourceGovernorWorkloadGroups(String variable) {
        super(QResourceGovernorWorkloadGroups.class, forVariable(variable), "sys", "resource_governor_workload_groups");
        addMetadata();
    }

    public QResourceGovernorWorkloadGroups(String variable, String schema, String table) {
        super(QResourceGovernorWorkloadGroups.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QResourceGovernorWorkloadGroups(Path<? extends QResourceGovernorWorkloadGroups> path) {
        super(path.getType(), path.getMetadata(), "sys", "resource_governor_workload_groups");
        addMetadata();
    }

    public QResourceGovernorWorkloadGroups(PathMetadata metadata) {
        super(QResourceGovernorWorkloadGroups.class, metadata, "sys", "resource_governor_workload_groups");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(groupMaxRequests, ColumnMetadata.named("group_max_requests").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(importance, ColumnMetadata.named("importance").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(maxDop, ColumnMetadata.named("max_dop").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMaxCpuTimeSec, ColumnMetadata.named("request_max_cpu_time_sec").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMaxMemoryGrantPercent, ColumnMetadata.named("request_max_memory_grant_percent").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestMemoryGrantTimeoutSec, ColumnMetadata.named("request_memory_grant_timeout_sec").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

