package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerPrincipals is a Querydsl query type for QServerPrincipals
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerPrincipals extends com.querydsl.sql.RelationalPathBase<QServerPrincipals> {

    private static final long serialVersionUID = 1813601157;

    public static final QServerPrincipals serverPrincipals = new QServerPrincipals("server_principals");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> credentialId = createNumber("credentialId", Integer.class);

    public final StringPath defaultDatabaseName = createString("defaultDatabaseName");

    public final StringPath defaultLanguageName = createString("defaultLanguageName");

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isFixedRole = createBoolean("isFixedRole");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> owningPrincipalId = createNumber("owningPrincipalId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QServerPrincipals(String variable) {
        super(QServerPrincipals.class, forVariable(variable), "sys", "server_principals");
        addMetadata();
    }

    public QServerPrincipals(String variable, String schema, String table) {
        super(QServerPrincipals.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerPrincipals(Path<? extends QServerPrincipals> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_principals");
        addMetadata();
    }

    public QServerPrincipals(PathMetadata metadata) {
        super(QServerPrincipals.class, metadata, "sys", "server_principals");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(credentialId, ColumnMetadata.named("credential_id").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(defaultDatabaseName, ColumnMetadata.named("default_database_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultLanguageName, ColumnMetadata.named("default_language_name").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isFixedRole, ColumnMetadata.named("is_fixed_role").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(owningPrincipalId, ColumnMetadata.named("owning_principal_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(3).ofType(Types.VARBINARY).withSize(85));
        addMetadata(type, ColumnMetadata.named("type").withIndex(4).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
    }

}

