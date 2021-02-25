package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmXeSessionTargets is a Querydsl query type for QDmXeSessionTargets
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmXeSessionTargets extends com.querydsl.sql.RelationalPathBase<QDmXeSessionTargets> {

    private static final long serialVersionUID = 719480607;

    public static final QDmXeSessionTargets dmXeSessionTargets = new QDmXeSessionTargets("dm_xe_session_targets");

    public final SimplePath<byte[]> eventSessionAddress = createSimple("eventSessionAddress", byte[].class);

    public final NumberPath<Long> executionCount = createNumber("executionCount", Long.class);

    public final NumberPath<Long> executionDurationMs = createNumber("executionDurationMs", Long.class);

    public final StringPath targetData = createString("targetData");

    public final StringPath targetName = createString("targetName");

    public final StringPath targetPackageGuid = createString("targetPackageGuid");

    public QDmXeSessionTargets(String variable) {
        super(QDmXeSessionTargets.class, forVariable(variable), "sys", "dm_xe_session_targets");
        addMetadata();
    }

    public QDmXeSessionTargets(String variable, String schema, String table) {
        super(QDmXeSessionTargets.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmXeSessionTargets(Path<? extends QDmXeSessionTargets> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_xe_session_targets");
        addMetadata();
    }

    public QDmXeSessionTargets(PathMetadata metadata) {
        super(QDmXeSessionTargets.class, metadata, "sys", "dm_xe_session_targets");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(eventSessionAddress, ColumnMetadata.named("event_session_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(executionCount, ColumnMetadata.named("execution_count").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(executionDurationMs, ColumnMetadata.named("execution_duration_ms").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(targetData, ColumnMetadata.named("target_data").withIndex(6).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(targetName, ColumnMetadata.named("target_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(targetPackageGuid, ColumnMetadata.named("target_package_guid").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
    }

}

