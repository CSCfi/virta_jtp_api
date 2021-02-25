package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsDispatcherPools is a Querydsl query type for QDmOsDispatcherPools
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsDispatcherPools extends com.querydsl.sql.RelationalPathBase<QDmOsDispatcherPools> {

    private static final long serialVersionUID = -1925418394;

    public static final QDmOsDispatcherPools dmOsDispatcherPools = new QDmOsDispatcherPools("dm_os_dispatcher_pools");

    public final NumberPath<Integer> dispatcherCount = createNumber("dispatcherCount", Integer.class);

    public final NumberPath<Integer> dispatcherIdealCount = createNumber("dispatcherIdealCount", Integer.class);

    public final SimplePath<byte[]> dispatcherPoolAddress = createSimple("dispatcherPoolAddress", byte[].class);

    public final NumberPath<Integer> dispatcherTimeoutMs = createNumber("dispatcherTimeoutMs", Integer.class);

    public final NumberPath<Integer> dispatcherWaitingCount = createNumber("dispatcherWaitingCount", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> queueLength = createNumber("queueLength", Integer.class);

    public final StringPath type = createString("type");

    public QDmOsDispatcherPools(String variable) {
        super(QDmOsDispatcherPools.class, forVariable(variable), "sys", "dm_os_dispatcher_pools");
        addMetadata();
    }

    public QDmOsDispatcherPools(String variable, String schema, String table) {
        super(QDmOsDispatcherPools.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsDispatcherPools(Path<? extends QDmOsDispatcherPools> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_dispatcher_pools");
        addMetadata();
    }

    public QDmOsDispatcherPools(PathMetadata metadata) {
        super(QDmOsDispatcherPools.class, metadata, "sys", "dm_os_dispatcher_pools");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dispatcherCount, ColumnMetadata.named("dispatcher_count").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dispatcherIdealCount, ColumnMetadata.named("dispatcher_ideal_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dispatcherPoolAddress, ColumnMetadata.named("dispatcher_pool_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(dispatcherTimeoutMs, ColumnMetadata.named("dispatcher_timeout_ms").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(dispatcherWaitingCount, ColumnMetadata.named("dispatcher_waiting_count").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(queueLength, ColumnMetadata.named("queue_length").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

