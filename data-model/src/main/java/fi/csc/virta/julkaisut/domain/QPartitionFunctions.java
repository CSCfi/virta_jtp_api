package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPartitionFunctions is a Querydsl query type for QPartitionFunctions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPartitionFunctions extends com.querydsl.sql.RelationalPathBase<QPartitionFunctions> {

    private static final long serialVersionUID = -919442834;

    public static final QPartitionFunctions partitionFunctions = new QPartitionFunctions("partition_functions");

    public final BooleanPath boundaryValueOnRight = createBoolean("boundaryValueOnRight");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> fanout = createNumber("fanout", Integer.class);

    public final NumberPath<Integer> functionId = createNumber("functionId", Integer.class);

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QPartitionFunctions(String variable) {
        super(QPartitionFunctions.class, forVariable(variable), "sys", "partition_functions");
        addMetadata();
    }

    public QPartitionFunctions(String variable, String schema, String table) {
        super(QPartitionFunctions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPartitionFunctions(Path<? extends QPartitionFunctions> path) {
        super(path.getType(), path.getMetadata(), "sys", "partition_functions");
        addMetadata();
    }

    public QPartitionFunctions(PathMetadata metadata) {
        super(QPartitionFunctions.class, metadata, "sys", "partition_functions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(boundaryValueOnRight, ColumnMetadata.named("boundary_value_on_right").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fanout, ColumnMetadata.named("fanout").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(functionId, ColumnMetadata.named("function_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

