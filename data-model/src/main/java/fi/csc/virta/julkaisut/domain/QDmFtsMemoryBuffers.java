package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsMemoryBuffers is a Querydsl query type for QDmFtsMemoryBuffers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsMemoryBuffers extends com.querydsl.sql.RelationalPathBase<QDmFtsMemoryBuffers> {

    private static final long serialVersionUID = -548177965;

    public static final QDmFtsMemoryBuffers dmFtsMemoryBuffers = new QDmFtsMemoryBuffers("dm_fts_memory_buffers");

    public final NumberPath<Integer> bytesUsed = createNumber("bytesUsed", Integer.class);

    public final BooleanPath isFree = createBoolean("isFree");

    public final SimplePath<byte[]> memoryAddress = createSimple("memoryAddress", byte[].class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> percentUsed = createNumber("percentUsed", Integer.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Integer> rowCount = createNumber("rowCount", Integer.class);

    public QDmFtsMemoryBuffers(String variable) {
        super(QDmFtsMemoryBuffers.class, forVariable(variable), "sys", "dm_fts_memory_buffers");
        addMetadata();
    }

    public QDmFtsMemoryBuffers(String variable, String schema, String table) {
        super(QDmFtsMemoryBuffers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsMemoryBuffers(Path<? extends QDmFtsMemoryBuffers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_memory_buffers");
        addMetadata();
    }

    public QDmFtsMemoryBuffers(PathMetadata metadata) {
        super(QDmFtsMemoryBuffers.class, metadata, "sys", "dm_fts_memory_buffers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bytesUsed, ColumnMetadata.named("bytes_used").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isFree, ColumnMetadata.named("is_free").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memoryAddress, ColumnMetadata.named("memory_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(4000).notNull());
        addMetadata(percentUsed, ColumnMetadata.named("percent_used").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

