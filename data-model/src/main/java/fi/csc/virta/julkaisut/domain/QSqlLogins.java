package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSqlLogins is a Querydsl query type for QSqlLogins
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSqlLogins extends com.querydsl.sql.RelationalPathBase<QSqlLogins> {

    private static final long serialVersionUID = -1144483237;

    public static final QSqlLogins sqlLogins = new QSqlLogins("sql_logins");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> credentialId = createNumber("credentialId", Integer.class);

    public final StringPath defaultDatabaseName = createString("defaultDatabaseName");

    public final StringPath defaultLanguageName = createString("defaultLanguageName");

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isExpirationChecked = createBoolean("isExpirationChecked");

    public final BooleanPath isPolicyChecked = createBoolean("isPolicyChecked");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final SimplePath<byte[]> passwordHash = createSimple("passwordHash", byte[].class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QSqlLogins(String variable) {
        super(QSqlLogins.class, forVariable(variable), "sys", "sql_logins");
        addMetadata();
    }

    public QSqlLogins(String variable, String schema, String table) {
        super(QSqlLogins.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSqlLogins(Path<? extends QSqlLogins> path) {
        super(path.getType(), path.getMetadata(), "sys", "sql_logins");
        addMetadata();
    }

    public QSqlLogins(PathMetadata metadata) {
        super(QSqlLogins.class, metadata, "sys", "sql_logins");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(credentialId, ColumnMetadata.named("credential_id").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(defaultDatabaseName, ColumnMetadata.named("default_database_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultLanguageName, ColumnMetadata.named("default_language_name").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isExpirationChecked, ColumnMetadata.named("is_expiration_checked").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isPolicyChecked, ColumnMetadata.named("is_policy_checked").withIndex(12).ofType(Types.BIT).withSize(1));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(passwordHash, ColumnMetadata.named("password_hash").withIndex(14).ofType(Types.VARBINARY).withSize(256));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(3).ofType(Types.VARBINARY).withSize(85));
        addMetadata(type, ColumnMetadata.named("type").withIndex(4).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
    }

}

