package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsClusterProperties is a Querydsl query type for QDmOsClusterProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsClusterProperties extends com.querydsl.sql.RelationalPathBase<QDmOsClusterProperties> {

    private static final long serialVersionUID = -875239869;

    public static final QDmOsClusterProperties dmOsClusterProperties = new QDmOsClusterProperties("dm_os_cluster_properties");

    public final NumberPath<Long> failureConditionLevel = createNumber("failureConditionLevel", Long.class);

    public final NumberPath<Long> healthCheckTimeout = createNumber("healthCheckTimeout", Long.class);

    public final NumberPath<Long> sqlDumperDumpFlags = createNumber("sqlDumperDumpFlags", Long.class);

    public final StringPath sqlDumperDumpPath = createString("sqlDumperDumpPath");

    public final NumberPath<Long> sqlDumperDumpTimeOut = createNumber("sqlDumperDumpTimeOut", Long.class);

    public final NumberPath<Long> verboseLogging = createNumber("verboseLogging", Long.class);

    public QDmOsClusterProperties(String variable) {
        super(QDmOsClusterProperties.class, forVariable(variable), "sys", "dm_os_cluster_properties");
        addMetadata();
    }

    public QDmOsClusterProperties(String variable, String schema, String table) {
        super(QDmOsClusterProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsClusterProperties(Path<? extends QDmOsClusterProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_cluster_properties");
        addMetadata();
    }

    public QDmOsClusterProperties(PathMetadata metadata) {
        super(QDmOsClusterProperties.class, metadata, "sys", "dm_os_cluster_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(failureConditionLevel, ColumnMetadata.named("FailureConditionLevel").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(healthCheckTimeout, ColumnMetadata.named("HealthCheckTimeout").withIndex(6).ofType(Types.BIGINT).withSize(19));
        addMetadata(sqlDumperDumpFlags, ColumnMetadata.named("SqlDumperDumpFlags").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(sqlDumperDumpPath, ColumnMetadata.named("SqlDumperDumpPath").withIndex(3).ofType(Types.NVARCHAR).withSize(260).notNull());
        addMetadata(sqlDumperDumpTimeOut, ColumnMetadata.named("SqlDumperDumpTimeOut").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(verboseLogging, ColumnMetadata.named("VerboseLogging").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

