package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryCacheEntries is a Querydsl query type for QDmOsMemoryCacheEntries
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryCacheEntries extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryCacheEntries> {

    private static final long serialVersionUID = -1820573287;

    public static final QDmOsMemoryCacheEntries dmOsMemoryCacheEntries = new QDmOsMemoryCacheEntries("dm_os_memory_cache_entries");

    public final NumberPath<Double> averageTimeBetweenUses = createNumber("averageTimeBetweenUses", Double.class);

    public final SimplePath<byte[]> cacheAddress = createSimple("cacheAddress", byte[].class);

    public final NumberPath<Integer> contextSwitchesCount = createNumber("contextSwitchesCount", Integer.class);

    public final NumberPath<Integer> currentCost = createNumber("currentCost", Integer.class);

    public final NumberPath<Integer> diskIosCount = createNumber("diskIosCount", Integer.class);

    public final SimplePath<byte[]> entryAddress = createSimple("entryAddress", byte[].class);

    public final StringPath entryData = createString("entryData");

    public final SimplePath<byte[]> entryDataAddress = createSimple("entryDataAddress", byte[].class);

    public final NumberPath<Integer> inUseCount = createNumber("inUseCount", Integer.class);

    public final BooleanPath isDirty = createBoolean("isDirty");

    public final SimplePath<byte[]> memoryObjectAddress = createSimple("memoryObjectAddress", byte[].class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> originalCost = createNumber("originalCost", Integer.class);

    public final NumberPath<Long> pagesKb = createNumber("pagesKb", Long.class);

    public final NumberPath<Integer> poolId = createNumber("poolId", Integer.class);

    public final NumberPath<Double> probabilityOfReuse = createNumber("probabilityOfReuse", Double.class);

    public final NumberPath<Double> timeSinceLastUse = createNumber("timeSinceLastUse", Double.class);

    public final NumberPath<Double> timeToGenerate = createNumber("timeToGenerate", Double.class);

    public final StringPath type = createString("type");

    public final NumberPath<Long> useCount = createNumber("useCount", Long.class);

    public final NumberPath<Double> value = createNumber("value", Double.class);

    public QDmOsMemoryCacheEntries(String variable) {
        super(QDmOsMemoryCacheEntries.class, forVariable(variable), "sys", "dm_os_memory_cache_entries");
        addMetadata();
    }

    public QDmOsMemoryCacheEntries(String variable, String schema, String table) {
        super(QDmOsMemoryCacheEntries.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryCacheEntries(Path<? extends QDmOsMemoryCacheEntries> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_cache_entries");
        addMetadata();
    }

    public QDmOsMemoryCacheEntries(PathMetadata metadata) {
        super(QDmOsMemoryCacheEntries.class, metadata, "sys", "dm_os_memory_cache_entries");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(averageTimeBetweenUses, ColumnMetadata.named("average_time_between_uses").withIndex(18).ofType(Types.DOUBLE).withSize(53));
        addMetadata(cacheAddress, ColumnMetadata.named("cache_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(contextSwitchesCount, ColumnMetadata.named("context_switches_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(currentCost, ColumnMetadata.named("current_cost").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(diskIosCount, ColumnMetadata.named("disk_ios_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(entryAddress, ColumnMetadata.named("entry_address").withIndex(4).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(entryData, ColumnMetadata.named("entry_data").withIndex(14).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(entryDataAddress, ColumnMetadata.named("entry_data_address").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(inUseCount, ColumnMetadata.named("in_use_count").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDirty, ColumnMetadata.named("is_dirty").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memoryObjectAddress, ColumnMetadata.named("memory_object_address").withIndex(12).ofType(Types.VARBINARY).withSize(8));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(originalCost, ColumnMetadata.named("original_cost").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(pagesKb, ColumnMetadata.named("pages_kb").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(poolId, ColumnMetadata.named("pool_id").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(probabilityOfReuse, ColumnMetadata.named("probability_of_reuse").withIndex(20).ofType(Types.DOUBLE).withSize(53));
        addMetadata(timeSinceLastUse, ColumnMetadata.named("time_since_last_use").withIndex(19).ofType(Types.DOUBLE).withSize(53));
        addMetadata(timeToGenerate, ColumnMetadata.named("time_to_generate").withIndex(16).ofType(Types.DOUBLE).withSize(53));
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(useCount, ColumnMetadata.named("use_count").withIndex(17).ofType(Types.BIGINT).withSize(19));
        addMetadata(value, ColumnMetadata.named("value").withIndex(21).ofType(Types.DOUBLE).withSize(53));
    }

}

