package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraces is a Querydsl query type for QTraces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraces extends com.querydsl.sql.RelationalPathBase<QTraces> {

    private static final long serialVersionUID = -1483855381;

    public static final QTraces traces = new QTraces("traces");

    public final NumberPath<Integer> bufferCount = createNumber("bufferCount", Integer.class);

    public final NumberPath<Integer> bufferSize = createNumber("bufferSize", Integer.class);

    public final NumberPath<Integer> droppedEventCount = createNumber("droppedEventCount", Integer.class);

    public final NumberPath<Long> eventCount = createNumber("eventCount", Long.class);

    public final NumberPath<Long> filePosition = createNumber("filePosition", Long.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final BooleanPath isRollover = createBoolean("isRollover");

    public final BooleanPath isRowset = createBoolean("isRowset");

    public final BooleanPath isShutdown = createBoolean("isShutdown");

    public final DateTimePath<java.sql.Timestamp> lastEventTime = createDateTime("lastEventTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> maxFiles = createNumber("maxFiles", Integer.class);

    public final NumberPath<Long> maxSize = createNumber("maxSize", Long.class);

    public final StringPath path = createString("path");

    public final NumberPath<Integer> readerSpid = createNumber("readerSpid", Integer.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final DateTimePath<java.sql.Timestamp> stopTime = createDateTime("stopTime", java.sql.Timestamp.class);

    public QTraces(String variable) {
        super(QTraces.class, forVariable(variable), "sys", "traces");
        addMetadata();
    }

    public QTraces(String variable, String schema, String table) {
        super(QTraces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraces(Path<? extends QTraces> path) {
        super(path.getType(), path.getMetadata(), "sys", "traces");
        addMetadata();
    }

    public QTraces(PathMetadata metadata) {
        super(QTraces.class, metadata, "sys", "traces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bufferCount, ColumnMetadata.named("buffer_count").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(bufferSize, ColumnMetadata.named("buffer_size").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(droppedEventCount, ColumnMetadata.named("dropped_event_count").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(eventCount, ColumnMetadata.named("event_count").withIndex(17).ofType(Types.BIGINT).withSize(19));
        addMetadata(filePosition, ColumnMetadata.named("file_position").withIndex(13).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDefault, ColumnMetadata.named("is_default").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isRollover, ColumnMetadata.named("is_rollover").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(isRowset, ColumnMetadata.named("is_rowset").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isShutdown, ColumnMetadata.named("is_shutdown").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(lastEventTime, ColumnMetadata.named("last_event_time").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(maxFiles, ColumnMetadata.named("max_files").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxSize, ColumnMetadata.named("max_size").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(path, ColumnMetadata.named("path").withIndex(3).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(readerSpid, ColumnMetadata.named("reader_spid").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(15).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(status, ColumnMetadata.named("status").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stopTime, ColumnMetadata.named("stop_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
    }

}

