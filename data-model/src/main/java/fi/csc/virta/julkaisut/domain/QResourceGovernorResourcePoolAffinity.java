package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QResourceGovernorResourcePoolAffinity is a Querydsl query type for QResourceGovernorResourcePoolAffinity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QResourceGovernorResourcePoolAffinity extends com.querydsl.sql.RelationalPathBase<QResourceGovernorResourcePoolAffinity> {

    private static final long serialVersionUID = 1961823603;

    public static final QResourceGovernorResourcePoolAffinity resourceGovernorResourcePoolAffinity = new QResourceGovernorResourcePoolAffinity("resource_governor_resource_pool_affinity");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final NumberPath<Long> schedulerMask = createNumber("schedulerMask", Long.class);

    public QResourceGovernorResourcePoolAffinity(String variable) {
        super(QResourceGovernorResourcePoolAffinity.class, forVariable(variable), "sys", "resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public QResourceGovernorResourcePoolAffinity(String variable, String schema, String table) {
        super(QResourceGovernorResourcePoolAffinity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QResourceGovernorResourcePoolAffinity(Path<? extends QResourceGovernorResourcePoolAffinity> path) {
        super(path.getType(), path.getMetadata(), "sys", "resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public QResourceGovernorResourcePoolAffinity(PathMetadata metadata) {
        super(QResourceGovernorResourcePoolAffinity.class, metadata, "sys", "resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(schedulerMask, ColumnMetadata.named("scheduler_mask").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

