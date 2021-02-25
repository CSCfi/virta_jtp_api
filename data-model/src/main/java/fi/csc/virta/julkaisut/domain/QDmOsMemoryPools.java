package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryPools is a Querydsl query type for QDmOsMemoryPools
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryPools extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryPools> {

    private static final long serialVersionUID = -444587188;

    public static final QDmOsMemoryPools dmOsMemoryPools = new QDmOsMemoryPools("dm_os_memory_pools");

    public final NumberPath<Long> freeEntriesCount = createNumber("freeEntriesCount", Long.class);

    public final NumberPath<Long> maxFreeEntriesCount = createNumber("maxFreeEntriesCount", Long.class);

    public final SimplePath<byte[]> memoryPoolAddress = createSimple("memoryPoolAddress", byte[].class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Long> removedInAllRoundsCount = createNumber("removedInAllRoundsCount", Long.class);

    public final StringPath type = createString("type");

    public QDmOsMemoryPools(String variable) {
        super(QDmOsMemoryPools.class, forVariable(variable), "sys", "dm_os_memory_pools");
        addMetadata();
    }

    public QDmOsMemoryPools(String variable, String schema, String table) {
        super(QDmOsMemoryPools.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryPools(Path<? extends QDmOsMemoryPools> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_pools");
        addMetadata();
    }

    public QDmOsMemoryPools(PathMetadata metadata) {
        super(QDmOsMemoryPools.class, metadata, "sys", "dm_os_memory_pools");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(freeEntriesCount, ColumnMetadata.named("free_entries_count").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(maxFreeEntriesCount, ColumnMetadata.named("max_free_entries_count").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(memoryPoolAddress, ColumnMetadata.named("memory_pool_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(removedInAllRoundsCount, ColumnMetadata.named("removed_in_all_rounds_count").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

