package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemSqlModules is a Querydsl query type for QSystemSqlModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemSqlModules extends com.querydsl.sql.RelationalPathBase<QSystemSqlModules> {

    private static final long serialVersionUID = 1348587333;

    public static final QSystemSqlModules systemSqlModules = new QSystemSqlModules("system_sql_modules");

    public final StringPath definition = createString("definition");

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final BooleanPath isRecompiled = createBoolean("isRecompiled");

    public final BooleanPath isSchemaBound = createBoolean("isSchemaBound");

    public final BooleanPath nullOnNullInput = createBoolean("nullOnNullInput");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final BooleanPath usesAnsiNulls = createBoolean("usesAnsiNulls");

    public final BooleanPath usesDatabaseCollation = createBoolean("usesDatabaseCollation");

    public final BooleanPath usesQuotedIdentifier = createBoolean("usesQuotedIdentifier");

    public QSystemSqlModules(String variable) {
        super(QSystemSqlModules.class, forVariable(variable), "sys", "system_sql_modules");
        addMetadata();
    }

    public QSystemSqlModules(String variable, String schema, String table) {
        super(QSystemSqlModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemSqlModules(Path<? extends QSystemSqlModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_sql_modules");
        addMetadata();
    }

    public QSystemSqlModules(PathMetadata metadata) {
        super(QSystemSqlModules.class, metadata, "sys", "system_sql_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(2).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(isRecompiled, ColumnMetadata.named("is_recompiled").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaBound, ColumnMetadata.named("is_schema_bound").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(nullOnNullInput, ColumnMetadata.named("null_on_null_input").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usesAnsiNulls, ColumnMetadata.named("uses_ansi_nulls").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(usesDatabaseCollation, ColumnMetadata.named("uses_database_collation").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(usesQuotedIdentifier, ColumnMetadata.named("uses_quoted_identifier").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
    }

}

