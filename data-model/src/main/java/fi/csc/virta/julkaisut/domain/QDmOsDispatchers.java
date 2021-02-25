package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsDispatchers is a Querydsl query type for QDmOsDispatchers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsDispatchers extends com.querydsl.sql.RelationalPathBase<QDmOsDispatchers> {

    private static final long serialVersionUID = -783440222;

    public static final QDmOsDispatchers dmOsDispatchers = new QDmOsDispatchers("dm_os_dispatchers");

    public final NumberPath<Long> currentItemDuration = createNumber("currentItemDuration", Long.class);

    public final SimplePath<byte[]> dispatcherPoolAddress = createSimple("dispatcherPoolAddress", byte[].class);

    public final NumberPath<Integer> fadeEndTime = createNumber("fadeEndTime", Integer.class);

    public final NumberPath<Long> itemsProcessed = createNumber("itemsProcessed", Long.class);

    public final StringPath state = createString("state");

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final NumberPath<Long> waitDuration = createNumber("waitDuration", Long.class);

    public QDmOsDispatchers(String variable) {
        super(QDmOsDispatchers.class, forVariable(variable), "sys", "dm_os_dispatchers");
        addMetadata();
    }

    public QDmOsDispatchers(String variable, String schema, String table) {
        super(QDmOsDispatchers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsDispatchers(Path<? extends QDmOsDispatchers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_dispatchers");
        addMetadata();
    }

    public QDmOsDispatchers(PathMetadata metadata) {
        super(QDmOsDispatchers.class, metadata, "sys", "dm_os_dispatchers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(currentItemDuration, ColumnMetadata.named("current_item_duration").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(dispatcherPoolAddress, ColumnMetadata.named("dispatcher_pool_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(fadeEndTime, ColumnMetadata.named("fade_end_time").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(itemsProcessed, ColumnMetadata.named("items_processed").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(2).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(waitDuration, ColumnMetadata.named("wait_duration").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

