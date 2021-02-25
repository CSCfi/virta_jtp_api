package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerSqlModules is a Querydsl query type for QServerSqlModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerSqlModules extends com.querydsl.sql.RelationalPathBase<QServerSqlModules> {

    private static final long serialVersionUID = 786252633;

    public static final QServerSqlModules serverSqlModules = new QServerSqlModules("server_sql_modules");

    public final StringPath definition = createString("definition");

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final BooleanPath usesAnsiNulls = createBoolean("usesAnsiNulls");

    public final BooleanPath usesQuotedIdentifier = createBoolean("usesQuotedIdentifier");

    public QServerSqlModules(String variable) {
        super(QServerSqlModules.class, forVariable(variable), "sys", "server_sql_modules");
        addMetadata();
    }

    public QServerSqlModules(String variable, String schema, String table) {
        super(QServerSqlModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerSqlModules(Path<? extends QServerSqlModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_sql_modules");
        addMetadata();
    }

    public QServerSqlModules(PathMetadata metadata) {
        super(QServerSqlModules.class, metadata, "sys", "server_sql_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(definition, ColumnMetadata.named("definition").withIndex(2).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(usesAnsiNulls, ColumnMetadata.named("uses_ansi_nulls").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(usesQuotedIdentifier, ColumnMetadata.named("uses_quoted_identifier").withIndex(4).ofType(Types.BIT).withSize(1));
    }

}

