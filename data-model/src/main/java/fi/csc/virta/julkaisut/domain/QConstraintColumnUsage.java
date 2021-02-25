package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConstraintColumnUsage is a Querydsl query type for QConstraintColumnUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConstraintColumnUsage extends com.querydsl.sql.RelationalPathBase<QConstraintColumnUsage> {

    private static final long serialVersionUID = -667122159;

    public static final QConstraintColumnUsage constraintColumnUsage = new QConstraintColumnUsage("CONSTRAINT_COLUMN_USAGE");

    public final StringPath columnName = createString("columnName");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QConstraintColumnUsage(String variable) {
        super(QConstraintColumnUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public QConstraintColumnUsage(String variable, String schema, String table) {
        super(QConstraintColumnUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConstraintColumnUsage(Path<? extends QConstraintColumnUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public QConstraintColumnUsage(PathMetadata metadata) {
        super(QConstraintColumnUsage.class, metadata, "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(7).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

