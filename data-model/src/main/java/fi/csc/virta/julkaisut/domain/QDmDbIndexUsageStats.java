package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbIndexUsageStats is a Querydsl query type for QDmDbIndexUsageStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbIndexUsageStats extends com.querydsl.sql.RelationalPathBase<QDmDbIndexUsageStats> {

    private static final long serialVersionUID = -2078370548;

    public static final QDmDbIndexUsageStats dmDbIndexUsageStats = new QDmDbIndexUsageStats("dm_db_index_usage_stats");

    public final NumberPath<Short> databaseId = createNumber("databaseId", Short.class);

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemLookup = createDateTime("lastSystemLookup", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemScan = createDateTime("lastSystemScan", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemSeek = createDateTime("lastSystemSeek", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemUpdate = createDateTime("lastSystemUpdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserLookup = createDateTime("lastUserLookup", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserScan = createDateTime("lastUserScan", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserSeek = createDateTime("lastUserSeek", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserUpdate = createDateTime("lastUserUpdate", java.sql.Timestamp.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Long> systemLookups = createNumber("systemLookups", Long.class);

    public final NumberPath<Long> systemScans = createNumber("systemScans", Long.class);

    public final NumberPath<Long> systemSeeks = createNumber("systemSeeks", Long.class);

    public final NumberPath<Long> systemUpdates = createNumber("systemUpdates", Long.class);

    public final NumberPath<Long> userLookups = createNumber("userLookups", Long.class);

    public final NumberPath<Long> userScans = createNumber("userScans", Long.class);

    public final NumberPath<Long> userSeeks = createNumber("userSeeks", Long.class);

    public final NumberPath<Long> userUpdates = createNumber("userUpdates", Long.class);

    public QDmDbIndexUsageStats(String variable) {
        super(QDmDbIndexUsageStats.class, forVariable(variable), "sys", "dm_db_index_usage_stats");
        addMetadata();
    }

    public QDmDbIndexUsageStats(String variable, String schema, String table) {
        super(QDmDbIndexUsageStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbIndexUsageStats(Path<? extends QDmDbIndexUsageStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_index_usage_stats");
        addMetadata();
    }

    public QDmDbIndexUsageStats(PathMetadata metadata) {
        super(QDmDbIndexUsageStats.class, metadata, "sys", "dm_db_index_usage_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastSystemLookup, ColumnMetadata.named("last_system_lookup").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastSystemScan, ColumnMetadata.named("last_system_scan").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastSystemSeek, ColumnMetadata.named("last_system_seek").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastSystemUpdate, ColumnMetadata.named("last_system_update").withIndex(19).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserLookup, ColumnMetadata.named("last_user_lookup").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserScan, ColumnMetadata.named("last_user_scan").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserSeek, ColumnMetadata.named("last_user_seek").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserUpdate, ColumnMetadata.named("last_user_update").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(systemLookups, ColumnMetadata.named("system_lookups").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemScans, ColumnMetadata.named("system_scans").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemSeeks, ColumnMetadata.named("system_seeks").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemUpdates, ColumnMetadata.named("system_updates").withIndex(15).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userLookups, ColumnMetadata.named("user_lookups").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userScans, ColumnMetadata.named("user_scans").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userSeeks, ColumnMetadata.named("user_seeks").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userUpdates, ColumnMetadata.named("user_updates").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

