package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryCacheCounters is a Querydsl query type for QDmOsMemoryCacheCounters
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryCacheCounters extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryCacheCounters> {

    private static final long serialVersionUID = 1118916110;

    public static final QDmOsMemoryCacheCounters dmOsMemoryCacheCounters = new QDmOsMemoryCacheCounters("dm_os_memory_cache_counters");

    public final SimplePath<byte[]> cacheAddress = createSimple("cacheAddress", byte[].class);

    public final NumberPath<Long> entriesCount = createNumber("entriesCount", Long.class);

    public final NumberPath<Long> entriesInUseCount = createNumber("entriesInUseCount", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> pagesInUseKb = createNumber("pagesInUseKb", Long.class);

    public final NumberPath<Long> pagesKb = createNumber("pagesKb", Long.class);

    public final StringPath type = createString("type");

    public QDmOsMemoryCacheCounters(String variable) {
        super(QDmOsMemoryCacheCounters.class, forVariable(variable), "sys", "dm_os_memory_cache_counters");
        addMetadata();
    }

    public QDmOsMemoryCacheCounters(String variable, String schema, String table) {
        super(QDmOsMemoryCacheCounters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryCacheCounters(Path<? extends QDmOsMemoryCacheCounters> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_cache_counters");
        addMetadata();
    }

    public QDmOsMemoryCacheCounters(PathMetadata metadata) {
        super(QDmOsMemoryCacheCounters.class, metadata, "sys", "dm_os_memory_cache_counters");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cacheAddress, ColumnMetadata.named("cache_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(entriesCount, ColumnMetadata.named("entries_count").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(entriesInUseCount, ColumnMetadata.named("entries_in_use_count").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(pagesInUseKb, ColumnMetadata.named("pages_in_use_kb").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(pagesKb, ColumnMetadata.named("pages_kb").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

