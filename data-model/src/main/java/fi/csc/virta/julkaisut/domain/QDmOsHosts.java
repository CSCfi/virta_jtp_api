package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsHosts is a Querydsl query type for QDmOsHosts
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsHosts extends com.querydsl.sql.RelationalPathBase<QDmOsHosts> {

    private static final long serialVersionUID = -1365779391;

    public static final QDmOsHosts dmOsHosts = new QDmOsHosts("dm_os_hosts");

    public final NumberPath<Integer> activeIosCount = createNumber("activeIosCount", Integer.class);

    public final NumberPath<Integer> activeTasksCount = createNumber("activeTasksCount", Integer.class);

    public final NumberPath<Integer> completedIosCount = createNumber("completedIosCount", Integer.class);

    public final NumberPath<Long> completedIosInBytes = createNumber("completedIosInBytes", Long.class);

    public final SimplePath<byte[]> defaultMemoryClerkAddress = createSimple("defaultMemoryClerkAddress", byte[].class);

    public final NumberPath<Integer> enqueuedTasksCount = createNumber("enqueuedTasksCount", Integer.class);

    public final SimplePath<byte[]> hostAddress = createSimple("hostAddress", byte[].class);

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public QDmOsHosts(String variable) {
        super(QDmOsHosts.class, forVariable(variable), "sys", "dm_os_hosts");
        addMetadata();
    }

    public QDmOsHosts(String variable, String schema, String table) {
        super(QDmOsHosts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsHosts(Path<? extends QDmOsHosts> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_hosts");
        addMetadata();
    }

    public QDmOsHosts(PathMetadata metadata) {
        super(QDmOsHosts.class, metadata, "sys", "dm_os_hosts");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(activeIosCount, ColumnMetadata.named("active_ios_count").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(activeTasksCount, ColumnMetadata.named("active_tasks_count").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(completedIosCount, ColumnMetadata.named("completed_ios_count").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(completedIosInBytes, ColumnMetadata.named("completed_ios_in_bytes").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(defaultMemoryClerkAddress, ColumnMetadata.named("default_memory_clerk_address").withIndex(9).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(enqueuedTasksCount, ColumnMetadata.named("enqueued_tasks_count").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(hostAddress, ColumnMetadata.named("host_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
    }

}

