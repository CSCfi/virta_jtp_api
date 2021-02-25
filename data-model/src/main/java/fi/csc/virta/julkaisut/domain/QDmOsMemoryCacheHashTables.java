package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryCacheHashTables is a Querydsl query type for QDmOsMemoryCacheHashTables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryCacheHashTables extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryCacheHashTables> {

    private static final long serialVersionUID = -1052466326;

    public static final QDmOsMemoryCacheHashTables dmOsMemoryCacheHashTables = new QDmOsMemoryCacheHashTables("dm_os_memory_cache_hash_tables");

    public final NumberPath<Integer> bucketsAvgLength = createNumber("bucketsAvgLength", Integer.class);

    public final NumberPath<Integer> bucketsAvgScanHitLength = createNumber("bucketsAvgScanHitLength", Integer.class);

    public final NumberPath<Integer> bucketsAvgScanMissLength = createNumber("bucketsAvgScanMissLength", Integer.class);

    public final NumberPath<Integer> bucketsCount = createNumber("bucketsCount", Integer.class);

    public final NumberPath<Integer> bucketsInUseCount = createNumber("bucketsInUseCount", Integer.class);

    public final NumberPath<Integer> bucketsMaxLength = createNumber("bucketsMaxLength", Integer.class);

    public final NumberPath<Integer> bucketsMaxLengthEver = createNumber("bucketsMaxLengthEver", Integer.class);

    public final NumberPath<Integer> bucketsMinLength = createNumber("bucketsMinLength", Integer.class);

    public final SimplePath<byte[]> cacheAddress = createSimple("cacheAddress", byte[].class);

    public final NumberPath<Long> hitsCount = createNumber("hitsCount", Long.class);

    public final NumberPath<Long> missesCount = createNumber("missesCount", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> tableLevel = createNumber("tableLevel", Integer.class);

    public final StringPath type = createString("type");

    public QDmOsMemoryCacheHashTables(String variable) {
        super(QDmOsMemoryCacheHashTables.class, forVariable(variable), "sys", "dm_os_memory_cache_hash_tables");
        addMetadata();
    }

    public QDmOsMemoryCacheHashTables(String variable, String schema, String table) {
        super(QDmOsMemoryCacheHashTables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryCacheHashTables(Path<? extends QDmOsMemoryCacheHashTables> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_cache_hash_tables");
        addMetadata();
    }

    public QDmOsMemoryCacheHashTables(PathMetadata metadata) {
        super(QDmOsMemoryCacheHashTables.class, metadata, "sys", "dm_os_memory_cache_hash_tables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(bucketsAvgLength, ColumnMetadata.named("buckets_avg_length").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsAvgScanHitLength, ColumnMetadata.named("buckets_avg_scan_hit_length").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsAvgScanMissLength, ColumnMetadata.named("buckets_avg_scan_miss_length").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsCount, ColumnMetadata.named("buckets_count").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsInUseCount, ColumnMetadata.named("buckets_in_use_count").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsMaxLength, ColumnMetadata.named("buckets_max_length").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsMaxLengthEver, ColumnMetadata.named("buckets_max_length_ever").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(bucketsMinLength, ColumnMetadata.named("buckets_min_length").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(cacheAddress, ColumnMetadata.named("cache_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(hitsCount, ColumnMetadata.named("hits_count").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(missesCount, ColumnMetadata.named("misses_count").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(tableLevel, ColumnMetadata.named("table_level").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

