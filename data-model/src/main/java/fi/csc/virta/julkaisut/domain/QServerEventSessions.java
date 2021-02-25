package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerEventSessions is a Querydsl query type for QServerEventSessions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerEventSessions extends com.querydsl.sql.RelationalPathBase<QServerEventSessions> {

    private static final long serialVersionUID = -354961449;

    public static final QServerEventSessions serverEventSessions = new QServerEventSessions("server_event_sessions");

    public final StringPath eventRetentionMode = createString("eventRetentionMode");

    public final StringPath eventRetentionModeDesc = createString("eventRetentionModeDesc");

    public final NumberPath<Integer> eventSessionId = createNumber("eventSessionId", Integer.class);

    public final NumberPath<Integer> maxDispatchLatency = createNumber("maxDispatchLatency", Integer.class);

    public final NumberPath<Integer> maxEventSize = createNumber("maxEventSize", Integer.class);

    public final NumberPath<Integer> maxMemory = createNumber("maxMemory", Integer.class);

    public final StringPath memoryPartitionMode = createString("memoryPartitionMode");

    public final StringPath memoryPartitionModeDesc = createString("memoryPartitionModeDesc");

    public final StringPath name = createString("name");

    public final BooleanPath startupState = createBoolean("startupState");

    public final BooleanPath trackCausality = createBoolean("trackCausality");

    public QServerEventSessions(String variable) {
        super(QServerEventSessions.class, forVariable(variable), "sys", "server_event_sessions");
        addMetadata();
    }

    public QServerEventSessions(String variable, String schema, String table) {
        super(QServerEventSessions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerEventSessions(Path<? extends QServerEventSessions> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_event_sessions");
        addMetadata();
    }

    public QServerEventSessions(PathMetadata metadata) {
        super(QServerEventSessions.class, metadata, "sys", "server_event_sessions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventRetentionMode, ColumnMetadata.named("event_retention_mode").withIndex(3).ofType(Types.CHAR).withSize(1));
        addMetadata(eventRetentionModeDesc, ColumnMetadata.named("event_retention_mode_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(eventSessionId, ColumnMetadata.named("event_session_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxDispatchLatency, ColumnMetadata.named("max_dispatch_latency").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxEventSize, ColumnMetadata.named("max_event_size").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxMemory, ColumnMetadata.named("max_memory").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(memoryPartitionMode, ColumnMetadata.named("memory_partition_mode").withIndex(8).ofType(Types.CHAR).withSize(1));
        addMetadata(memoryPartitionModeDesc, ColumnMetadata.named("memory_partition_mode_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(startupState, ColumnMetadata.named("startup_state").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(trackCausality, ColumnMetadata.named("track_causality").withIndex(10).ofType(Types.BIT).withSize(1));
    }

}

