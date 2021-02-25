package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSqlExpressionDependencies is a Querydsl query type for QSqlExpressionDependencies
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSqlExpressionDependencies extends com.querydsl.sql.RelationalPathBase<QSqlExpressionDependencies> {

    private static final long serialVersionUID = -1243950574;

    public static final QSqlExpressionDependencies sqlExpressionDependencies = new QSqlExpressionDependencies("sql_expression_dependencies");

    public final BooleanPath isAmbiguous = createBoolean("isAmbiguous");

    public final BooleanPath isCallerDependent = createBoolean("isCallerDependent");

    public final BooleanPath isSchemaBoundReference = createBoolean("isSchemaBoundReference");

    public final NumberPath<Byte> referencedClass = createNumber("referencedClass", Byte.class);

    public final StringPath referencedClassDesc = createString("referencedClassDesc");

    public final StringPath referencedDatabaseName = createString("referencedDatabaseName");

    public final StringPath referencedEntityName = createString("referencedEntityName");

    public final NumberPath<Integer> referencedId = createNumber("referencedId", Integer.class);

    public final NumberPath<Integer> referencedMinorId = createNumber("referencedMinorId", Integer.class);

    public final StringPath referencedSchemaName = createString("referencedSchemaName");

    public final StringPath referencedServerName = createString("referencedServerName");

    public final NumberPath<Byte> referencingClass = createNumber("referencingClass", Byte.class);

    public final StringPath referencingClassDesc = createString("referencingClassDesc");

    public final NumberPath<Integer> referencingId = createNumber("referencingId", Integer.class);

    public final NumberPath<Integer> referencingMinorId = createNumber("referencingMinorId", Integer.class);

    public QSqlExpressionDependencies(String variable) {
        super(QSqlExpressionDependencies.class, forVariable(variable), "sys", "sql_expression_dependencies");
        addMetadata();
    }

    public QSqlExpressionDependencies(String variable, String schema, String table) {
        super(QSqlExpressionDependencies.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSqlExpressionDependencies(Path<? extends QSqlExpressionDependencies> path) {
        super(path.getType(), path.getMetadata(), "sys", "sql_expression_dependencies");
        addMetadata();
    }

    public QSqlExpressionDependencies(PathMetadata metadata) {
        super(QSqlExpressionDependencies.class, metadata, "sys", "sql_expression_dependencies");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isAmbiguous, ColumnMetadata.named("is_ambiguous").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isCallerDependent, ColumnMetadata.named("is_caller_dependent").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaBoundReference, ColumnMetadata.named("is_schema_bound_reference").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(referencedClass, ColumnMetadata.named("referenced_class").withIndex(6).ofType(Types.TINYINT).withSize(3));
        addMetadata(referencedClassDesc, ColumnMetadata.named("referenced_class_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(referencedDatabaseName, ColumnMetadata.named("referenced_database_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(referencedEntityName, ColumnMetadata.named("referenced_entity_name").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(referencedId, ColumnMetadata.named("referenced_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(referencedMinorId, ColumnMetadata.named("referenced_minor_id").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedSchemaName, ColumnMetadata.named("referenced_schema_name").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(referencedServerName, ColumnMetadata.named("referenced_server_name").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(referencingClass, ColumnMetadata.named("referencing_class").withIndex(3).ofType(Types.TINYINT).withSize(3));
        addMetadata(referencingClassDesc, ColumnMetadata.named("referencing_class_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(referencingId, ColumnMetadata.named("referencing_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencingMinorId, ColumnMetadata.named("referencing_minor_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

