package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbSessionSpaceUsage is a Querydsl query type for QDmDbSessionSpaceUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbSessionSpaceUsage extends com.querydsl.sql.RelationalPathBase<QDmDbSessionSpaceUsage> {

    private static final long serialVersionUID = 573689741;

    public static final QDmDbSessionSpaceUsage dmDbSessionSpaceUsage = new QDmDbSessionSpaceUsage("dm_db_session_space_usage");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> internalObjectsAllocPageCount = createNumber("internalObjectsAllocPageCount", Long.class);

    public final NumberPath<Long> internalObjectsDeallocPageCount = createNumber("internalObjectsDeallocPageCount", Long.class);

    public final NumberPath<Short> sessionId = createNumber("sessionId", Short.class);

    public final NumberPath<Long> userObjectsAllocPageCount = createNumber("userObjectsAllocPageCount", Long.class);

    public final NumberPath<Long> userObjectsDeallocPageCount = createNumber("userObjectsDeallocPageCount", Long.class);

    public final NumberPath<Long> userObjectsDeferredDeallocPageCount = createNumber("userObjectsDeferredDeallocPageCount", Long.class);

    public QDmDbSessionSpaceUsage(String variable) {
        super(QDmDbSessionSpaceUsage.class, forVariable(variable), "sys", "dm_db_session_space_usage");
        addMetadata();
    }

    public QDmDbSessionSpaceUsage(String variable, String schema, String table) {
        super(QDmDbSessionSpaceUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbSessionSpaceUsage(Path<? extends QDmDbSessionSpaceUsage> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_session_space_usage");
        addMetadata();
    }

    public QDmDbSessionSpaceUsage(PathMetadata metadata) {
        super(QDmDbSessionSpaceUsage.class, metadata, "sys", "dm_db_session_space_usage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(internalObjectsAllocPageCount, ColumnMetadata.named("internal_objects_alloc_page_count").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(internalObjectsDeallocPageCount, ColumnMetadata.named("internal_objects_dealloc_page_count").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.SMALLINT).withSize(5));
        addMetadata(userObjectsAllocPageCount, ColumnMetadata.named("user_objects_alloc_page_count").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(userObjectsDeallocPageCount, ColumnMetadata.named("user_objects_dealloc_page_count").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(userObjectsDeferredDeallocPageCount, ColumnMetadata.named("user_objects_deferred_dealloc_page_count").withIndex(7).ofType(Types.BIGINT).withSize(19));
    }

}

