package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmBrokerQueueMonitors is a Querydsl query type for QDmBrokerQueueMonitors
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmBrokerQueueMonitors extends com.querydsl.sql.RelationalPathBase<QDmBrokerQueueMonitors> {

    private static final long serialVersionUID = 913158187;

    public static final QDmBrokerQueueMonitors dmBrokerQueueMonitors = new QDmBrokerQueueMonitors("dm_broker_queue_monitors");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastActivatedTime = createDateTime("lastActivatedTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastEmptyRowsetTime = createDateTime("lastEmptyRowsetTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> queueId = createNumber("queueId", Integer.class);

    public final StringPath state = createString("state");

    public final NumberPath<Integer> tasksWaiting = createNumber("tasksWaiting", Integer.class);

    public QDmBrokerQueueMonitors(String variable) {
        super(QDmBrokerQueueMonitors.class, forVariable(variable), "sys", "dm_broker_queue_monitors");
        addMetadata();
    }

    public QDmBrokerQueueMonitors(String variable, String schema, String table) {
        super(QDmBrokerQueueMonitors.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmBrokerQueueMonitors(Path<? extends QDmBrokerQueueMonitors> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_broker_queue_monitors");
        addMetadata();
    }

    public QDmBrokerQueueMonitors(PathMetadata metadata) {
        super(QDmBrokerQueueMonitors.class, metadata, "sys", "dm_broker_queue_monitors");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(lastActivatedTime, ColumnMetadata.named("last_activated_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastEmptyRowsetTime, ColumnMetadata.named("last_empty_rowset_time").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(queueId, ColumnMetadata.named("queue_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(state, ColumnMetadata.named("state").withIndex(3).ofType(Types.NVARCHAR).withSize(32));
        addMetadata(tasksWaiting, ColumnMetadata.named("tasks_waiting").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

