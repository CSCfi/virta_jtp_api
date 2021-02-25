package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QKeyColumnUsage is a Querydsl query type for QKeyColumnUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QKeyColumnUsage extends com.querydsl.sql.RelationalPathBase<QKeyColumnUsage> {

    private static final long serialVersionUID = -1773302487;

    public static final QKeyColumnUsage keyColumnUsage = new QKeyColumnUsage("KEY_COLUMN_USAGE");

    public final StringPath columnName = createString("columnName");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QKeyColumnUsage(String variable) {
        super(QKeyColumnUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public QKeyColumnUsage(String variable, String schema, String table) {
        super(QKeyColumnUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QKeyColumnUsage(Path<? extends QKeyColumnUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public QKeyColumnUsage(PathMetadata metadata) {
        super(QKeyColumnUsage.class, metadata, "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
    }

}

