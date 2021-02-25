package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QResourceGovernorResourcePools is a Querydsl query type for QResourceGovernorResourcePools
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QResourceGovernorResourcePools extends com.querydsl.sql.RelationalPathBase<QResourceGovernorResourcePools> {

    private static final long serialVersionUID = -38696280;

    public static final QResourceGovernorResourcePools resourceGovernorResourcePools = new QResourceGovernorResourcePools("resource_governor_resource_pools");

    public final NumberPath<Integer> capCpuPercent = createNumber("capCpuPercent", Integer.class);

    public final NumberPath<Integer> maxCpuPercent = createNumber("maxCpuPercent", Integer.class);

    public final NumberPath<Integer> maxMemoryPercent = createNumber("maxMemoryPercent", Integer.class);

    public final NumberPath<Integer> minCpuPercent = createNumber("minCpuPercent", Integer.class);

    public final NumberPath<Integer> minMemoryPercent = createNumber("minMemoryPercent", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public QResourceGovernorResourcePools(String variable) {
        super(QResourceGovernorResourcePools.class, forVariable(variable), "sys", "resource_governor_resource_pools");
        addMetadata();
    }

    public QResourceGovernorResourcePools(String variable, String schema, String table) {
        super(QResourceGovernorResourcePools.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QResourceGovernorResourcePools(Path<? extends QResourceGovernorResourcePools> path) {
        super(path.getType(), path.getMetadata(), "sys", "resource_governor_resource_pools");
        addMetadata();
    }

    public QResourceGovernorResourcePools(PathMetadata metadata) {
        super(QResourceGovernorResourcePools.class, metadata, "sys", "resource_governor_resource_pools");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(capCpuPercent, ColumnMetadata.named("cap_cpu_percent").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxCpuPercent, ColumnMetadata.named("max_cpu_percent").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxMemoryPercent, ColumnMetadata.named("max_memory_percent").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minCpuPercent, ColumnMetadata.named("min_cpu_percent").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minMemoryPercent, ColumnMetadata.named("min_memory_percent").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

