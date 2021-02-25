package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnTypeUsages is a Querydsl query type for QColumnTypeUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnTypeUsages extends com.querydsl.sql.RelationalPathBase<QColumnTypeUsages> {

    private static final long serialVersionUID = 1216973983;

    public static final QColumnTypeUsages columnTypeUsages = new QColumnTypeUsages("column_type_usages");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QColumnTypeUsages(String variable) {
        super(QColumnTypeUsages.class, forVariable(variable), "sys", "column_type_usages");
        addMetadata();
    }

    public QColumnTypeUsages(String variable, String schema, String table) {
        super(QColumnTypeUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnTypeUsages(Path<? extends QColumnTypeUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "column_type_usages");
        addMetadata();
    }

    public QColumnTypeUsages(PathMetadata metadata) {
        super(QColumnTypeUsages.class, metadata, "sys", "column_type_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

