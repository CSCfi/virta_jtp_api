package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChangeTrackingDatabases is a Querydsl query type for QChangeTrackingDatabases
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChangeTrackingDatabases extends com.querydsl.sql.RelationalPathBase<QChangeTrackingDatabases> {

    private static final long serialVersionUID = -468407532;

    public static final QChangeTrackingDatabases changeTrackingDatabases = new QChangeTrackingDatabases("change_tracking_databases");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Byte> isAutoCleanupOn = createNumber("isAutoCleanupOn", Byte.class);

    public final NumberPath<Long> maxCleanupVersion = createNumber("maxCleanupVersion", Long.class);

    public final NumberPath<Integer> retentionPeriod = createNumber("retentionPeriod", Integer.class);

    public final NumberPath<Byte> retentionPeriodUnits = createNumber("retentionPeriodUnits", Byte.class);

    public final StringPath retentionPeriodUnitsDesc = createString("retentionPeriodUnitsDesc");

    public QChangeTrackingDatabases(String variable) {
        super(QChangeTrackingDatabases.class, forVariable(variable), "sys", "change_tracking_databases");
        addMetadata();
    }

    public QChangeTrackingDatabases(String variable, String schema, String table) {
        super(QChangeTrackingDatabases.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangeTrackingDatabases(Path<? extends QChangeTrackingDatabases> path) {
        super(path.getType(), path.getMetadata(), "sys", "change_tracking_databases");
        addMetadata();
    }

    public QChangeTrackingDatabases(PathMetadata metadata) {
        super(QChangeTrackingDatabases.class, metadata, "sys", "change_tracking_databases");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAutoCleanupOn, ColumnMetadata.named("is_auto_cleanup_on").withIndex(2).ofType(Types.TINYINT).withSize(3));
        addMetadata(maxCleanupVersion, ColumnMetadata.named("max_cleanup_version").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(retentionPeriod, ColumnMetadata.named("retention_period").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(retentionPeriodUnits, ColumnMetadata.named("retention_period_units").withIndex(4).ofType(Types.TINYINT).withSize(3));
        addMetadata(retentionPeriodUnitsDesc, ColumnMetadata.named("retention_period_units_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
    }

}

