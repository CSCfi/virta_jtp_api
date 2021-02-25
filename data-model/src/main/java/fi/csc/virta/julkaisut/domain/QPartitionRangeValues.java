package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPartitionRangeValues is a Querydsl query type for QPartitionRangeValues
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPartitionRangeValues extends com.querydsl.sql.RelationalPathBase<QPartitionRangeValues> {

    private static final long serialVersionUID = -1877861678;

    public static final QPartitionRangeValues partitionRangeValues = new QPartitionRangeValues("partition_range_values");

    public final NumberPath<Integer> boundaryId = createNumber("boundaryId", Integer.class);

    public final NumberPath<Integer> functionId = createNumber("functionId", Integer.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final SimplePath<Object> value = createSimple("value", Object.class);

    public QPartitionRangeValues(String variable) {
        super(QPartitionRangeValues.class, forVariable(variable), "sys", "partition_range_values");
        addMetadata();
    }

    public QPartitionRangeValues(String variable, String schema, String table) {
        super(QPartitionRangeValues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPartitionRangeValues(Path<? extends QPartitionRangeValues> path) {
        super(path.getType(), path.getMetadata(), "sys", "partition_range_values");
        addMetadata();
    }

    public QPartitionRangeValues(PathMetadata metadata) {
        super(QPartitionRangeValues.class, metadata, "sys", "partition_range_values");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boundaryId, ColumnMetadata.named("boundary_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(functionId, ColumnMetadata.named("function_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(value, ColumnMetadata.named("value").withIndex(4).ofType(-150).withSize(2147483647));
    }

}

