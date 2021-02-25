package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbLogSpaceUsage is a Querydsl query type for QDmDbLogSpaceUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbLogSpaceUsage extends com.querydsl.sql.RelationalPathBase<QDmDbLogSpaceUsage> {

    private static final long serialVersionUID = -941957957;

    public static final QDmDbLogSpaceUsage dmDbLogSpaceUsage = new QDmDbLogSpaceUsage("dm_db_log_space_usage");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> totalLogSizeInBytes = createNumber("totalLogSizeInBytes", Long.class);

    public final NumberPath<Long> usedLogSpaceInBytes = createNumber("usedLogSpaceInBytes", Long.class);

    public final NumberPath<Float> usedLogSpaceInPercent = createNumber("usedLogSpaceInPercent", Float.class);

    public QDmDbLogSpaceUsage(String variable) {
        super(QDmDbLogSpaceUsage.class, forVariable(variable), "sys", "dm_db_log_space_usage");
        addMetadata();
    }

    public QDmDbLogSpaceUsage(String variable, String schema, String table) {
        super(QDmDbLogSpaceUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbLogSpaceUsage(Path<? extends QDmDbLogSpaceUsage> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_log_space_usage");
        addMetadata();
    }

    public QDmDbLogSpaceUsage(PathMetadata metadata) {
        super(QDmDbLogSpaceUsage.class, metadata, "sys", "dm_db_log_space_usage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(totalLogSizeInBytes, ColumnMetadata.named("total_log_size_in_bytes").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(usedLogSpaceInBytes, ColumnMetadata.named("used_log_space_in_bytes").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(usedLogSpaceInPercent, ColumnMetadata.named("used_log_space_in_percent").withIndex(4).ofType(Types.REAL).withSize(24));
    }

}

