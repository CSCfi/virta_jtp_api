package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbTaskSpaceUsage is a Querydsl query type for QDmDbTaskSpaceUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbTaskSpaceUsage extends com.querydsl.sql.RelationalPathBase<QDmDbTaskSpaceUsage> {

    private static final long serialVersionUID = 1826222340;

    public static final QDmDbTaskSpaceUsage dmDbTaskSpaceUsage = new QDmDbTaskSpaceUsage("dm_db_task_space_usage");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> execContextId = createNumber("execContextId", Integer.class);

    public final NumberPath<Long> internalObjectsAllocPageCount = createNumber("internalObjectsAllocPageCount", Long.class);

    public final NumberPath<Long> internalObjectsDeallocPageCount = createNumber("internalObjectsDeallocPageCount", Long.class);

    public final BooleanPath isRemoteTask = createBoolean("isRemoteTask");

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final SimplePath<byte[]> taskAddress = createSimple("taskAddress", byte[].class);

    public final NumberPath<Long> userObjectsAllocPageCount = createNumber("userObjectsAllocPageCount", Long.class);

    public final NumberPath<Long> userObjectsDeallocPageCount = createNumber("userObjectsDeallocPageCount", Long.class);

    public QDmDbTaskSpaceUsage(String variable) {
        super(QDmDbTaskSpaceUsage.class, forVariable(variable), "sys", "dm_db_task_space_usage");
        addMetadata();
    }

    public QDmDbTaskSpaceUsage(String variable, String schema, String table) {
        super(QDmDbTaskSpaceUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbTaskSpaceUsage(Path<? extends QDmDbTaskSpaceUsage> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_task_space_usage");
        addMetadata();
    }

    public QDmDbTaskSpaceUsage(PathMetadata metadata) {
        super(QDmDbTaskSpaceUsage.class, metadata, "sys", "dm_db_task_space_usage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(execContextId, ColumnMetadata.named("exec_context_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(internalObjectsAllocPageCount, ColumnMetadata.named("internal_objects_alloc_page_count").withIndex(9).ofType(Types.BIGINT).withSize(19));
        addMetadata(internalObjectsDeallocPageCount, ColumnMetadata.named("internal_objects_dealloc_page_count").withIndex(10).ofType(Types.BIGINT).withSize(19));
        addMetadata(isRemoteTask, ColumnMetadata.named("is_remote_task").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(taskAddress, ColumnMetadata.named("task_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(userObjectsAllocPageCount, ColumnMetadata.named("user_objects_alloc_page_count").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(userObjectsDeallocPageCount, ColumnMetadata.named("user_objects_dealloc_page_count").withIndex(8).ofType(Types.BIGINT).withSize(19));
    }

}

