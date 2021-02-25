package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConstraintTableUsage is a Querydsl query type for QConstraintTableUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConstraintTableUsage extends com.querydsl.sql.RelationalPathBase<QConstraintTableUsage> {

    private static final long serialVersionUID = 1540030349;

    public static final QConstraintTableUsage constraintTableUsage = new QConstraintTableUsage("CONSTRAINT_TABLE_USAGE");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QConstraintTableUsage(String variable) {
        super(QConstraintTableUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "CONSTRAINT_TABLE_USAGE");
        addMetadata();
    }

    public QConstraintTableUsage(String variable, String schema, String table) {
        super(QConstraintTableUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConstraintTableUsage(Path<? extends QConstraintTableUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "CONSTRAINT_TABLE_USAGE");
        addMetadata();
    }

    public QConstraintTableUsage(PathMetadata metadata) {
        super(QConstraintTableUsage.class, metadata, "INFORMATION_SCHEMA", "CONSTRAINT_TABLE_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

