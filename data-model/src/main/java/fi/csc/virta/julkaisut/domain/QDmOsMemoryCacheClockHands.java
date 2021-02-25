package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsMemoryCacheClockHands is a Querydsl query type for QDmOsMemoryCacheClockHands
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsMemoryCacheClockHands extends com.querydsl.sql.RelationalPathBase<QDmOsMemoryCacheClockHands> {

    private static final long serialVersionUID = -660532019;

    public static final QDmOsMemoryCacheClockHands dmOsMemoryCacheClockHands = new QDmOsMemoryCacheClockHands("dm_os_memory_cache_clock_hands");

    public final SimplePath<byte[]> cacheAddress = createSimple("cacheAddress", byte[].class);

    public final StringPath clockHand = createString("clockHand");

    public final StringPath clockStatus = createString("clockStatus");

    public final NumberPath<Long> lastRoundStartTime = createNumber("lastRoundStartTime", Long.class);

    public final NumberPath<Long> lastTickTime = createNumber("lastTickTime", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> removedAllRoundsCount = createNumber("removedAllRoundsCount", Long.class);

    public final NumberPath<Long> removedLastRoundCount = createNumber("removedLastRoundCount", Long.class);

    public final NumberPath<Long> roundsCount = createNumber("roundsCount", Long.class);

    public final NumberPath<Long> roundStartTime = createNumber("roundStartTime", Long.class);

    public final StringPath type = createString("type");

    public final NumberPath<Long> updatedLastRoundCount = createNumber("updatedLastRoundCount", Long.class);

    public QDmOsMemoryCacheClockHands(String variable) {
        super(QDmOsMemoryCacheClockHands.class, forVariable(variable), "sys", "dm_os_memory_cache_clock_hands");
        addMetadata();
    }

    public QDmOsMemoryCacheClockHands(String variable, String schema, String table) {
        super(QDmOsMemoryCacheClockHands.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsMemoryCacheClockHands(Path<? extends QDmOsMemoryCacheClockHands> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_memory_cache_clock_hands");
        addMetadata();
    }

    public QDmOsMemoryCacheClockHands(PathMetadata metadata) {
        super(QDmOsMemoryCacheClockHands.class, metadata, "sys", "dm_os_memory_cache_clock_hands");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cacheAddress, ColumnMetadata.named("cache_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(clockHand, ColumnMetadata.named("clock_hand").withIndex(4).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(clockStatus, ColumnMetadata.named("clock_status").withIndex(5).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(lastRoundStartTime, ColumnMetadata.named("last_round_start_time").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastTickTime, ColumnMetadata.named("last_tick_time").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(removedAllRoundsCount, ColumnMetadata.named("removed_all_rounds_count").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(removedLastRoundCount, ColumnMetadata.named("removed_last_round_count").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(roundsCount, ColumnMetadata.named("rounds_count").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(roundStartTime, ColumnMetadata.named("round_start_time").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(updatedLastRoundCount, ColumnMetadata.named("updated_last_round_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

