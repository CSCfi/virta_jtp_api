package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMissingIndexGroupStats is a Querydsl query type for QDmDbMissingIndexGroupStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMissingIndexGroupStats extends com.querydsl.sql.RelationalPathBase<QDmDbMissingIndexGroupStats> {

    private static final long serialVersionUID = -1416526096;

    public static final QDmDbMissingIndexGroupStats dmDbMissingIndexGroupStats = new QDmDbMissingIndexGroupStats("dm_db_missing_index_group_stats");

    public final NumberPath<Double> avgSystemImpact = createNumber("avgSystemImpact", Double.class);

    public final NumberPath<Double> avgTotalSystemCost = createNumber("avgTotalSystemCost", Double.class);

    public final NumberPath<Double> avgTotalUserCost = createNumber("avgTotalUserCost", Double.class);

    public final NumberPath<Double> avgUserImpact = createNumber("avgUserImpact", Double.class);

    public final NumberPath<Integer> groupHandle = createNumber("groupHandle", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemScan = createDateTime("lastSystemScan", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastSystemSeek = createDateTime("lastSystemSeek", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserScan = createDateTime("lastUserScan", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastUserSeek = createDateTime("lastUserSeek", java.sql.Timestamp.class);

    public final NumberPath<Long> systemScans = createNumber("systemScans", Long.class);

    public final NumberPath<Long> systemSeeks = createNumber("systemSeeks", Long.class);

    public final NumberPath<Long> uniqueCompiles = createNumber("uniqueCompiles", Long.class);

    public final NumberPath<Long> userScans = createNumber("userScans", Long.class);

    public final NumberPath<Long> userSeeks = createNumber("userSeeks", Long.class);

    public QDmDbMissingIndexGroupStats(String variable) {
        super(QDmDbMissingIndexGroupStats.class, forVariable(variable), "sys", "dm_db_missing_index_group_stats");
        addMetadata();
    }

    public QDmDbMissingIndexGroupStats(String variable, String schema, String table) {
        super(QDmDbMissingIndexGroupStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMissingIndexGroupStats(Path<? extends QDmDbMissingIndexGroupStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_missing_index_group_stats");
        addMetadata();
    }

    public QDmDbMissingIndexGroupStats(PathMetadata metadata) {
        super(QDmDbMissingIndexGroupStats.class, metadata, "sys", "dm_db_missing_index_group_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avgSystemImpact, ColumnMetadata.named("avg_system_impact").withIndex(14).ofType(Types.DOUBLE).withSize(53));
        addMetadata(avgTotalSystemCost, ColumnMetadata.named("avg_total_system_cost").withIndex(13).ofType(Types.DOUBLE).withSize(53));
        addMetadata(avgTotalUserCost, ColumnMetadata.named("avg_total_user_cost").withIndex(7).ofType(Types.DOUBLE).withSize(53));
        addMetadata(avgUserImpact, ColumnMetadata.named("avg_user_impact").withIndex(8).ofType(Types.DOUBLE).withSize(53));
        addMetadata(groupHandle, ColumnMetadata.named("group_handle").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastSystemScan, ColumnMetadata.named("last_system_scan").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastSystemSeek, ColumnMetadata.named("last_system_seek").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserScan, ColumnMetadata.named("last_user_scan").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastUserSeek, ColumnMetadata.named("last_user_seek").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(systemScans, ColumnMetadata.named("system_scans").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(systemSeeks, ColumnMetadata.named("system_seeks").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(uniqueCompiles, ColumnMetadata.named("unique_compiles").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userScans, ColumnMetadata.named("user_scans").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userSeeks, ColumnMetadata.named("user_seeks").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

