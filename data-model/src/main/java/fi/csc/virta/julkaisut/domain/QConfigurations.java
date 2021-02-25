package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConfigurations is a Querydsl query type for QConfigurations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConfigurations extends com.querydsl.sql.RelationalPathBase<QConfigurations> {

    private static final long serialVersionUID = 873574234;

    public static final QConfigurations configurations = new QConfigurations("configurations");

    public final NumberPath<Integer> configurationId = createNumber("configurationId", Integer.class);

    public final StringPath description = createString("description");

    public final BooleanPath isAdvanced = createBoolean("isAdvanced");

    public final BooleanPath isDynamic = createBoolean("isDynamic");

    public final SimplePath<Object> maximum = createSimple("maximum", Object.class);

    public final SimplePath<Object> minimum = createSimple("minimum", Object.class);

    public final StringPath name = createString("name");

    public final SimplePath<Object> value = createSimple("value", Object.class);

    public final SimplePath<Object> valueInUse = createSimple("valueInUse", Object.class);

    public QConfigurations(String variable) {
        super(QConfigurations.class, forVariable(variable), "sys", "configurations");
        addMetadata();
    }

    public QConfigurations(String variable, String schema, String table) {
        super(QConfigurations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConfigurations(Path<? extends QConfigurations> path) {
        super(path.getType(), path.getMetadata(), "sys", "configurations");
        addMetadata();
    }

    public QConfigurations(PathMetadata metadata) {
        super(QConfigurations.class, metadata, "sys", "configurations");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(configurationId, ColumnMetadata.named("configuration_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(description, ColumnMetadata.named("description").withIndex(7).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(isAdvanced, ColumnMetadata.named("is_advanced").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDynamic, ColumnMetadata.named("is_dynamic").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maximum, ColumnMetadata.named("maximum").withIndex(5).ofType(-150).withSize(2147483647));
        addMetadata(minimum, ColumnMetadata.named("minimum").withIndex(4).ofType(-150).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(35).notNull());
        addMetadata(value, ColumnMetadata.named("value").withIndex(3).ofType(-150).withSize(2147483647));
        addMetadata(valueInUse, ColumnMetadata.named("value_in_use").withIndex(6).ofType(-150).withSize(2147483647));
    }

}

