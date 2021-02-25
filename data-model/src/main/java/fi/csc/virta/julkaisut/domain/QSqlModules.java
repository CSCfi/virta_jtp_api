package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSqlModules is a Querydsl query type for QSqlModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSqlModules extends com.querydsl.sql.RelationalPathBase<QSqlModules> {

    private static final long serialVersionUID = -234153610;

    public static final QSqlModules sqlModules = new QSqlModules("sql_modules");

    public final StringPath definition = createString("definition");

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final BooleanPath isRecompiled = createBoolean("isRecompiled");

    public final BooleanPath isSchemaBound = createBoolean("isSchemaBound");

    public final BooleanPath nullOnNullInput = createBoolean("nullOnNullInput");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final BooleanPath usesAnsiNulls = createBoolean("usesAnsiNulls");

    public final BooleanPath usesDatabaseCollation = createBoolean("usesDatabaseCollation");

    public final BooleanPath usesQuotedIdentifier = createBoolean("usesQuotedIdentifier");

    public QSqlModules(String variable) {
        super(QSqlModules.class, forVariable(variable), "sys", "sql_modules");
        addMetadata();
    }

    public QSqlModules(String variable, String schema, String table) {
        super(QSqlModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSqlModules(Path<? extends QSqlModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "sql_modules");
        addMetadata();
    }

    public QSqlModules(PathMetadata metadata) {
        super(QSqlModules.class, metadata, "sys", "sql_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(2).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(isRecompiled, ColumnMetadata.named("is_recompiled").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isSchemaBound, ColumnMetadata.named("is_schema_bound").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(nullOnNullInput, ColumnMetadata.named("null_on_null_input").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usesAnsiNulls, ColumnMetadata.named("uses_ansi_nulls").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(usesDatabaseCollation, ColumnMetadata.named("uses_database_collation").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(usesQuotedIdentifier, ColumnMetadata.named("uses_quoted_identifier").withIndex(4).ofType(Types.BIT).withSize(1));
    }

}

