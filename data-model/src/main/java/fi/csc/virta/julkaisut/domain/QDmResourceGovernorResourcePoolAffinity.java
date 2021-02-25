package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmResourceGovernorResourcePoolAffinity is a Querydsl query type for QDmResourceGovernorResourcePoolAffinity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmResourceGovernorResourcePoolAffinity extends com.querydsl.sql.RelationalPathBase<QDmResourceGovernorResourcePoolAffinity> {

    private static final long serialVersionUID = 2004834908;

    public static final QDmResourceGovernorResourcePoolAffinity dmResourceGovernorResourcePoolAffinity = new QDmResourceGovernorResourcePoolAffinity("dm_resource_governor_resource_pool_affinity");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Short> processorGroup = createNumber("processorGroup", Short.class);

    public final NumberPath<Long> schedulerMask = createNumber("schedulerMask", Long.class);

    public QDmResourceGovernorResourcePoolAffinity(String variable) {
        super(QDmResourceGovernorResourcePoolAffinity.class, forVariable(variable), "sys", "dm_resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public QDmResourceGovernorResourcePoolAffinity(String variable, String schema, String table) {
        super(QDmResourceGovernorResourcePoolAffinity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmResourceGovernorResourcePoolAffinity(Path<? extends QDmResourceGovernorResourcePoolAffinity> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public QDmResourceGovernorResourcePoolAffinity(PathMetadata metadata) {
        super(QDmResourceGovernorResourcePoolAffinity.class, metadata, "sys", "dm_resource_governor_resource_pool_affinity");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(processorGroup, ColumnMetadata.named("processor_group").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(schedulerMask, ColumnMetadata.named("scheduler_mask").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

