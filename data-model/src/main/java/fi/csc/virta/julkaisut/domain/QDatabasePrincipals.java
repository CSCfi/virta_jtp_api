package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabasePrincipals is a Querydsl query type for QDatabasePrincipals
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabasePrincipals extends com.querydsl.sql.RelationalPathBase<QDatabasePrincipals> {

    private static final long serialVersionUID = 1097847933;

    public static final QDatabasePrincipals databasePrincipals = new QDatabasePrincipals("database_principals");

    public final NumberPath<Integer> authenticationType = createNumber("authenticationType", Integer.class);

    public final StringPath authenticationTypeDesc = createString("authenticationTypeDesc");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> defaultLanguageLcid = createNumber("defaultLanguageLcid", Integer.class);

    public final StringPath defaultLanguageName = createString("defaultLanguageName");

    public final StringPath defaultSchemaName = createString("defaultSchemaName");

    public final BooleanPath isFixedRole = createBoolean("isFixedRole");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> owningPrincipalId = createNumber("owningPrincipalId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QDatabasePrincipals(String variable) {
        super(QDatabasePrincipals.class, forVariable(variable), "sys", "database_principals");
        addMetadata();
    }

    public QDatabasePrincipals(String variable, String schema, String table) {
        super(QDatabasePrincipals.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabasePrincipals(Path<? extends QDatabasePrincipals> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_principals");
        addMetadata();
    }

    public QDatabasePrincipals(PathMetadata metadata) {
        super(QDatabasePrincipals.class, metadata, "sys", "database_principals");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authenticationType, ColumnMetadata.named("authentication_type").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(authenticationTypeDesc, ColumnMetadata.named("authentication_type_desc").withIndex(12).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(defaultLanguageLcid, ColumnMetadata.named("default_language_lcid").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(defaultLanguageName, ColumnMetadata.named("default_language_name").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultSchemaName, ColumnMetadata.named("default_schema_name").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isFixedRole, ColumnMetadata.named("is_fixed_role").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(owningPrincipalId, ColumnMetadata.named("owning_principal_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(9).ofType(Types.VARBINARY).withSize(85));
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
    }

}

