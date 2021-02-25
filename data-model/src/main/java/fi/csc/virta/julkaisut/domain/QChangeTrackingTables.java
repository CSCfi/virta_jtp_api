package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QChangeTrackingTables is a Querydsl query type for QChangeTrackingTables
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChangeTrackingTables extends com.querydsl.sql.RelationalPathBase<QChangeTrackingTables> {

    private static final long serialVersionUID = 443108137;

    public static final QChangeTrackingTables changeTrackingTables = new QChangeTrackingTables("change_tracking_tables");

    public final NumberPath<Long> beginVersion = createNumber("beginVersion", Long.class);

    public final NumberPath<Long> cleanupVersion = createNumber("cleanupVersion", Long.class);

    public final BooleanPath isTrackColumnsUpdatedOn = createBoolean("isTrackColumnsUpdatedOn");

    public final NumberPath<Long> minValidVersion = createNumber("minValidVersion", Long.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QChangeTrackingTables(String variable) {
        super(QChangeTrackingTables.class, forVariable(variable), "sys", "change_tracking_tables");
        addMetadata();
    }

    public QChangeTrackingTables(String variable, String schema, String table) {
        super(QChangeTrackingTables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangeTrackingTables(Path<? extends QChangeTrackingTables> path) {
        super(path.getType(), path.getMetadata(), "sys", "change_tracking_tables");
        addMetadata();
    }

    public QChangeTrackingTables(PathMetadata metadata) {
        super(QChangeTrackingTables.class, metadata, "sys", "change_tracking_tables");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(beginVersion, ColumnMetadata.named("begin_version").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(cleanupVersion, ColumnMetadata.named("cleanup_version").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(isTrackColumnsUpdatedOn, ColumnMetadata.named("is_track_columns_updated_on").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(minValidVersion, ColumnMetadata.named("min_valid_version").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

