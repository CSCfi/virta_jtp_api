package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QResourceGovernorConfiguration is a Querydsl query type for QResourceGovernorConfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QResourceGovernorConfiguration extends com.querydsl.sql.RelationalPathBase<QResourceGovernorConfiguration> {

    private static final long serialVersionUID = 928444213;

    public static final QResourceGovernorConfiguration resourceGovernorConfiguration = new QResourceGovernorConfiguration("resource_governor_configuration");

    public final NumberPath<Integer> classifierFunctionId = createNumber("classifierFunctionId", Integer.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public QResourceGovernorConfiguration(String variable) {
        super(QResourceGovernorConfiguration.class, forVariable(variable), "sys", "resource_governor_configuration");
        addMetadata();
    }

    public QResourceGovernorConfiguration(String variable, String schema, String table) {
        super(QResourceGovernorConfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QResourceGovernorConfiguration(Path<? extends QResourceGovernorConfiguration> path) {
        super(path.getType(), path.getMetadata(), "sys", "resource_governor_configuration");
        addMetadata();
    }

    public QResourceGovernorConfiguration(PathMetadata metadata) {
        super(QResourceGovernorConfiguration.class, metadata, "sys", "resource_governor_configuration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classifierFunctionId, ColumnMetadata.named("classifier_function_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isEnabled, ColumnMetadata.named("is_enabled").withIndex(2).ofType(Types.BIT).withSize(1).notNull());
    }

}

