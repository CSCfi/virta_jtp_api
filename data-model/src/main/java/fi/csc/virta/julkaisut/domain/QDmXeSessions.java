package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeSessions is a Querydsl query type for QDmXeSessions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeSessions extends com.querydsl.sql.RelationalPathBase<QDmXeSessions> {

    private static final long serialVersionUID = 2057093232;

    public static final QDmXeSessions dmXeSessions = new QDmXeSessions("dm_xe_sessions");

    public final SimplePath<byte[]> address = createSimple("address", byte[].class);

    public final NumberPath<Integer> blockedEventFireTime = createNumber("blockedEventFireTime", Integer.class);

    public final StringPath bufferPolicyDesc = createString("bufferPolicyDesc");

    public final NumberPath<Integer> bufferPolicyFlags = createNumber("bufferPolicyFlags", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createTime = createDateTime("createTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> droppedBufferCount = createNumber("droppedBufferCount", Integer.class);

    public final NumberPath<Integer> droppedEventCount = createNumber("droppedEventCount", Integer.class);

    public final StringPath flagDesc = createString("flagDesc");

    public final NumberPath<Integer> flags = createNumber("flags", Integer.class);

    public final NumberPath<Long> largeBufferSize = createNumber("largeBufferSize", Long.class);

    public final NumberPath<Integer> largestEventDroppedSize = createNumber("largestEventDroppedSize", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> pendingBuffers = createNumber("pendingBuffers", Integer.class);

    public final NumberPath<Long> regularBufferSize = createNumber("regularBufferSize", Long.class);

    public final NumberPath<Long> totalBufferSize = createNumber("totalBufferSize", Long.class);

    public final NumberPath<Integer> totalLargeBuffers = createNumber("totalLargeBuffers", Integer.class);

    public final NumberPath<Integer> totalRegularBuffers = createNumber("totalRegularBuffers", Integer.class);

    public QDmXeSessions(String variable) {
        super(QDmXeSessions.class, forVariable(variable), "sys", "dm_xe_sessions");
        addMetadata();
    }

    public QDmXeSessions(String variable, String schema, String table) {
        super(QDmXeSessions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeSessions(Path<? extends QDmXeSessions> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_sessions");
        addMetadata();
    }

    public QDmXeSessions(PathMetadata metadata) {
        super(QDmXeSessions.class, metadata, "sys", "dm_xe_sessions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(blockedEventFireTime, ColumnMetadata.named("blocked_event_fire_time").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bufferPolicyDesc, ColumnMetadata.named("buffer_policy_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(bufferPolicyFlags, ColumnMetadata.named("buffer_policy_flags").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(createTime, ColumnMetadata.named("create_time").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(droppedBufferCount, ColumnMetadata.named("dropped_buffer_count").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(droppedEventCount, ColumnMetadata.named("dropped_event_count").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(flagDesc, ColumnMetadata.named("flag_desc").withIndex(12).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(flags, ColumnMetadata.named("flags").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(largeBufferSize, ColumnMetadata.named("large_buffer_size").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(largestEventDroppedSize, ColumnMetadata.named("largest_event_dropped_size").withIndex(17).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(pendingBuffers, ColumnMetadata.named("pending_buffers").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(regularBufferSize, ColumnMetadata.named("regular_buffer_size").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalBufferSize, ColumnMetadata.named("total_buffer_size").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(totalLargeBuffers, ColumnMetadata.named("total_large_buffers").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(totalRegularBuffers, ColumnMetadata.named("total_regular_buffers").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

