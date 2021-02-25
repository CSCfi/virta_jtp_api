package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTableConstraints is a Querydsl query type for QTableConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTableConstraints extends com.querydsl.sql.RelationalPathBase<QTableConstraints> {

    private static final long serialVersionUID = -898697371;

    public static final QTableConstraints tableConstraints = new QTableConstraints("TABLE_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath constraintType = createString("constraintType");

    public final StringPath initiallyDeferred = createString("initiallyDeferred");

    public final StringPath isDeferrable = createString("isDeferrable");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QTableConstraints(String variable) {
        super(QTableConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public QTableConstraints(String variable, String schema, String table) {
        super(QTableConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTableConstraints(Path<? extends QTableConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public QTableConstraints(PathMetadata metadata) {
        super(QTableConstraints.class, metadata, "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(constraintType, ColumnMetadata.named("CONSTRAINT_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(11));
        addMetadata(initiallyDeferred, ColumnMetadata.named("INITIALLY_DEFERRED").withIndex(9).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(isDeferrable, ColumnMetadata.named("IS_DEFERRABLE").withIndex(8).ofType(Types.VARCHAR).withSize(2).notNull());
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
    }

}

