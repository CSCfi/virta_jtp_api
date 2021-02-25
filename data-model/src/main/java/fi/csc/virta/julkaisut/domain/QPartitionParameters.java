package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPartitionParameters is a Querydsl query type for QPartitionParameters
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPartitionParameters extends com.querydsl.sql.RelationalPathBase<QPartitionParameters> {

    private static final long serialVersionUID = 2083567991;

    public static final QPartitionParameters partitionParameters = new QPartitionParameters("partition_parameters");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Integer> functionId = createNumber("functionId", Integer.class);

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QPartitionParameters(String variable) {
        super(QPartitionParameters.class, forVariable(variable), "sys", "partition_parameters");
        addMetadata();
    }

    public QPartitionParameters(String variable, String schema, String table) {
        super(QPartitionParameters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPartitionParameters(Path<? extends QPartitionParameters> path) {
        super(path.getType(), path.getMetadata(), "sys", "partition_parameters");
        addMetadata();
    }

    public QPartitionParameters(PathMetadata metadata) {
        super(QPartitionParameters.class, metadata, "sys", "partition_parameters");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(functionId, ColumnMetadata.named("function_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(5).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

