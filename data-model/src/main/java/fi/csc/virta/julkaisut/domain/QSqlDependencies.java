package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSqlDependencies is a Querydsl query type for QSqlDependencies
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSqlDependencies extends com.querydsl.sql.RelationalPathBase<QSqlDependencies> {

    private static final long serialVersionUID = -1316362086;

    public static final QSqlDependencies sqlDependencies = new QSqlDependencies("sql_dependencies");

    public final NumberPath<Byte> classCol = createNumber("classCol", Byte.class);

    public final StringPath classDesc = createString("classDesc");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final BooleanPath isSelectAll = createBoolean("isSelectAll");

    public final BooleanPath isSelected = createBoolean("isSelected");

    public final BooleanPath isUpdated = createBoolean("isUpdated");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> referencedMajorId = createNumber("referencedMajorId", Integer.class);

    public final NumberPath<Integer> referencedMinorId = createNumber("referencedMinorId", Integer.class);

    public QSqlDependencies(String variable) {
        super(QSqlDependencies.class, forVariable(variable), "sys", "sql_dependencies");
        addMetadata();
    }

    public QSqlDependencies(String variable, String schema, String table) {
        super(QSqlDependencies.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSqlDependencies(Path<? extends QSqlDependencies> path) {
        super(path.getType(), path.getMetadata(), "sys", "sql_dependencies");
        addMetadata();
    }

    public QSqlDependencies(PathMetadata metadata) {
        super(QSqlDependencies.class, metadata, "sys", "sql_dependencies");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isSelectAll, ColumnMetadata.named("is_select_all").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSelected, ColumnMetadata.named("is_selected").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isUpdated, ColumnMetadata.named("is_updated").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedMajorId, ColumnMetadata.named("referenced_major_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedMinorId, ColumnMetadata.named("referenced_minor_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

