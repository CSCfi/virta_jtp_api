package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QForeignKeyColumns is a Querydsl query type for QForeignKeyColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QForeignKeyColumns extends com.querydsl.sql.RelationalPathBase<QForeignKeyColumns> {

    private static final long serialVersionUID = 38954549;

    public static final QForeignKeyColumns foreignKeyColumns = new QForeignKeyColumns("foreign_key_columns");

    public final NumberPath<Integer> constraintColumnId = createNumber("constraintColumnId", Integer.class);

    public final NumberPath<Integer> constraintObjectId = createNumber("constraintObjectId", Integer.class);

    public final NumberPath<Integer> parentColumnId = createNumber("parentColumnId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Integer> referencedColumnId = createNumber("referencedColumnId", Integer.class);

    public final NumberPath<Integer> referencedObjectId = createNumber("referencedObjectId", Integer.class);

    public QForeignKeyColumns(String variable) {
        super(QForeignKeyColumns.class, forVariable(variable), "sys", "foreign_key_columns");
        addMetadata();
    }

    public QForeignKeyColumns(String variable, String schema, String table) {
        super(QForeignKeyColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QForeignKeyColumns(Path<? extends QForeignKeyColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "foreign_key_columns");
        addMetadata();
    }

    public QForeignKeyColumns(PathMetadata metadata) {
        super(QForeignKeyColumns.class, metadata, "sys", "foreign_key_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintColumnId, ColumnMetadata.named("constraint_column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(constraintObjectId, ColumnMetadata.named("constraint_object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentColumnId, ColumnMetadata.named("parent_column_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedColumnId, ColumnMetadata.named("referenced_column_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedObjectId, ColumnMetadata.named("referenced_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

