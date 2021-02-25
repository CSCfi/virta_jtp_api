package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecCachedPlans is a Querydsl query type for QDmExecCachedPlans
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecCachedPlans extends com.querydsl.sql.RelationalPathBase<QDmExecCachedPlans> {

    private static final long serialVersionUID = -1667949807;

    public static final QDmExecCachedPlans dmExecCachedPlans = new QDmExecCachedPlans("dm_exec_cached_plans");

    public final NumberPath<Integer> bucketid = createNumber("bucketid", Integer.class);

    public final StringPath cacheobjtype = createString("cacheobjtype");

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final StringPath objtype = createString("objtype");

    public final SimplePath<byte[]> parentPlanHandle = createSimple("parentPlanHandle", byte[].class);

    public final SimplePath<byte[]> planHandle = createSimple("planHandle", byte[].class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Integer> refcounts = createNumber("refcounts", Integer.class);

    public final NumberPath<Integer> sizeInBytes = createNumber("sizeInBytes", Integer.class);

    public final NumberPath<Integer> usecounts = createNumber("usecounts", Integer.class);

    public QDmExecCachedPlans(String variable) {
        super(QDmExecCachedPlans.class, forVariable(variable), "sys", "dm_exec_cached_plans");
        addMetadata();
    }

    public QDmExecCachedPlans(String variable, String schema, String table) {
        super(QDmExecCachedPlans.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecCachedPlans(Path<? extends QDmExecCachedPlans> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_cached_plans");
        addMetadata();
    }

    public QDmExecCachedPlans(PathMetadata metadata) {
        super(QDmExecCachedPlans.class, metadata, "sys", "dm_exec_cached_plans");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bucketid, ColumnMetadata.named("bucketid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cacheobjtype, ColumnMetadata.named("cacheobjtype").withIndex(6).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(objtype, ColumnMetadata.named("objtype").withIndex(7).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(parentPlanHandle, ColumnMetadata.named("parent_plan_handle").withIndex(10).ofType(Types.VARBINARY).withSize(64));
        addMetadata(planHandle, ColumnMetadata.named("plan_handle").withIndex(8).ofType(Types.VARBINARY).withSize(64).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(refcounts, ColumnMetadata.named("refcounts").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sizeInBytes, ColumnMetadata.named("size_in_bytes").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usecounts, ColumnMetadata.named("usecounts").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

