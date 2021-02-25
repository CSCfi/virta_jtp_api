package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmBrokerActivatedTasks is a Querydsl query type for QDmBrokerActivatedTasks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmBrokerActivatedTasks extends com.querydsl.sql.RelationalPathBase<QDmBrokerActivatedTasks> {

    private static final long serialVersionUID = 471534268;

    public static final QDmBrokerActivatedTasks dmBrokerActivatedTasks = new QDmBrokerActivatedTasks("dm_broker_activated_tasks");

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Integer> executeAs = createNumber("executeAs", Integer.class);

    public final StringPath procedureName = createString("procedureName");

    public final NumberPath<Integer> queueId = createNumber("queueId", Integer.class);

    public final NumberPath<Integer> spid = createNumber("spid", Integer.class);

    public QDmBrokerActivatedTasks(String variable) {
        super(QDmBrokerActivatedTasks.class, forVariable(variable), "sys", "dm_broker_activated_tasks");
        addMetadata();
    }

    public QDmBrokerActivatedTasks(String variable, String schema, String table) {
        super(QDmBrokerActivatedTasks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmBrokerActivatedTasks(Path<? extends QDmBrokerActivatedTasks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_broker_activated_tasks");
        addMetadata();
    }

    public QDmBrokerActivatedTasks(PathMetadata metadata) {
        super(QDmBrokerActivatedTasks.class, metadata, "sys", "dm_broker_activated_tasks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.SMALLINT).withSize(5));
        addMetadata(executeAs, ColumnMetadata.named("execute_as").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(procedureName, ColumnMetadata.named("procedure_name").withIndex(4).ofType(Types.NVARCHAR).withSize(325));
        addMetadata(queueId, ColumnMetadata.named("queue_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(spid, ColumnMetadata.named("spid").withIndex(1).ofType(Types.INTEGER).withSize(10));
    }

}

