package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmResourceGovernorConfiguration is a Querydsl query type for QDmResourceGovernorConfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmResourceGovernorConfiguration extends com.querydsl.sql.RelationalPathBase<QDmResourceGovernorConfiguration> {

    private static final long serialVersionUID = -930912660;

    public static final QDmResourceGovernorConfiguration dmResourceGovernorConfiguration = new QDmResourceGovernorConfiguration("dm_resource_governor_configuration");

    public final NumberPath<Integer> classifierFunctionId = createNumber("classifierFunctionId", Integer.class);

    public final NumberPath<Byte> isReconfigurationPending = createNumber("isReconfigurationPending", Byte.class);

    public QDmResourceGovernorConfiguration(String variable) {
        super(QDmResourceGovernorConfiguration.class, forVariable(variable), "sys", "dm_resource_governor_configuration");
        addMetadata();
    }

    public QDmResourceGovernorConfiguration(String variable, String schema, String table) {
        super(QDmResourceGovernorConfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmResourceGovernorConfiguration(Path<? extends QDmResourceGovernorConfiguration> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_resource_governor_configuration");
        addMetadata();
    }

    public QDmResourceGovernorConfiguration(PathMetadata metadata) {
        super(QDmResourceGovernorConfiguration.class, metadata, "sys", "dm_resource_governor_configuration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classifierFunctionId, ColumnMetadata.named("classifier_function_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isReconfigurationPending, ColumnMetadata.named("is_reconfiguration_pending").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

