package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsMemoryPools is a Querydsl query type for QDmFtsMemoryPools
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsMemoryPools extends com.querydsl.sql.RelationalPathBase<QDmFtsMemoryPools> {

    private static final long serialVersionUID = -962111625;

    public static final QDmFtsMemoryPools dmFtsMemoryPools = new QDmFtsMemoryPools("dm_fts_memory_pools");

    public final NumberPath<Integer> bufferCount = createNumber("bufferCount", Integer.class);

    public final NumberPath<Integer> bufferSize = createNumber("bufferSize", Integer.class);

    public final NumberPath<Integer> maxBufferLimit = createNumber("maxBufferLimit", Integer.class);

    public final NumberPath<Integer> minBufferLimit = createNumber("minBufferLimit", Integer.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public QDmFtsMemoryPools(String variable) {
        super(QDmFtsMemoryPools.class, forVariable(variable), "sys", "dm_fts_memory_pools");
        addMetadata();
    }

    public QDmFtsMemoryPools(String variable, String schema, String table) {
        super(QDmFtsMemoryPools.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsMemoryPools(Path<? extends QDmFtsMemoryPools> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_memory_pools");
        addMetadata();
    }

    public QDmFtsMemoryPools(PathMetadata metadata) {
        super(QDmFtsMemoryPools.class, metadata, "sys", "dm_fts_memory_pools");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bufferCount, ColumnMetadata.named("buffer_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bufferSize, ColumnMetadata.named("buffer_size").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxBufferLimit, ColumnMetadata.named("max_buffer_limit").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minBufferLimit, ColumnMetadata.named("min_buffer_limit").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

