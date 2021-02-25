package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsServerDiagnosticsLogConfigurations is a Querydsl query type for QDmOsServerDiagnosticsLogConfigurations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsServerDiagnosticsLogConfigurations extends com.querydsl.sql.RelationalPathBase<QDmOsServerDiagnosticsLogConfigurations> {

    private static final long serialVersionUID = -80652670;

    public static final QDmOsServerDiagnosticsLogConfigurations dmOsServerDiagnosticsLogConfigurations = new QDmOsServerDiagnosticsLogConfigurations("dm_os_server_diagnostics_log_configurations");

    public final NumberPath<Integer> isEnabled = createNumber("isEnabled", Integer.class);

    public final NumberPath<Integer> maxFiles = createNumber("maxFiles", Integer.class);

    public final NumberPath<Integer> maxSize = createNumber("maxSize", Integer.class);

    public final StringPath path = createString("path");

    public QDmOsServerDiagnosticsLogConfigurations(String variable) {
        super(QDmOsServerDiagnosticsLogConfigurations.class, forVariable(variable), "sys", "dm_os_server_diagnostics_log_configurations");
        addMetadata();
    }

    public QDmOsServerDiagnosticsLogConfigurations(String variable, String schema, String table) {
        super(QDmOsServerDiagnosticsLogConfigurations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsServerDiagnosticsLogConfigurations(Path<? extends QDmOsServerDiagnosticsLogConfigurations> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_server_diagnostics_log_configurations");
        addMetadata();
    }

    public QDmOsServerDiagnosticsLogConfigurations(PathMetadata metadata) {
        super(QDmOsServerDiagnosticsLogConfigurations.class, metadata, "sys", "dm_os_server_diagnostics_log_configurations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isEnabled, ColumnMetadata.named("is_enabled").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxFiles, ColumnMetadata.named("max_files").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxSize, ColumnMetadata.named("max_size").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(path, ColumnMetadata.named("path").withIndex(2).ofType(Types.NVARCHAR).withSize(260).notNull());
    }

}

