package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QParameterTypeUsages is a Querydsl query type for QParameterTypeUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QParameterTypeUsages extends com.querydsl.sql.RelationalPathBase<QParameterTypeUsages> {

    private static final long serialVersionUID = -1019292584;

    public static final QParameterTypeUsages parameterTypeUsages = new QParameterTypeUsages("parameter_type_usages");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QParameterTypeUsages(String variable) {
        super(QParameterTypeUsages.class, forVariable(variable), "sys", "parameter_type_usages");
        addMetadata();
    }

    public QParameterTypeUsages(String variable, String schema, String table) {
        super(QParameterTypeUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QParameterTypeUsages(Path<? extends QParameterTypeUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "parameter_type_usages");
        addMetadata();
    }

    public QParameterTypeUsages(PathMetadata metadata) {
        super(QParameterTypeUsages.class, metadata, "sys", "parameter_type_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

