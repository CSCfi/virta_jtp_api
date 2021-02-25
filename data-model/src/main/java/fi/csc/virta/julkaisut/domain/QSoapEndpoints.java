package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSoapEndpoints is a Querydsl query type for QSoapEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSoapEndpoints extends com.querydsl.sql.RelationalPathBase<QSoapEndpoints> {

    private static final long serialVersionUID = 169898358;

    public static final QSoapEndpoints soapEndpoints = new QSoapEndpoints("soap_endpoints");

    public final StringPath defaultDatabase = createString("defaultDatabase");

    public final StringPath defaultNamespace = createString("defaultNamespace");

    public final NumberPath<Byte> defaultResultSchema = createNumber("defaultResultSchema", Byte.class);

    public final StringPath defaultResultSchemaDesc = createString("defaultResultSchemaDesc");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final NumberPath<Integer> headerLimit = createNumber("headerLimit", Integer.class);

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final BooleanPath isSessionEnabled = createBoolean("isSessionEnabled");

    public final BooleanPath isSqlLanguageEnabled = createBoolean("isSqlLanguageEnabled");

    public final BooleanPath isXmlCharsetEnforced = createBoolean("isXmlCharsetEnforced");

    public final StringPath loginType = createString("loginType");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final NumberPath<Integer> sessionTimeout = createNumber("sessionTimeout", Integer.class);

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public final StringPath wsdlGeneratorProcedure = createString("wsdlGeneratorProcedure");

    public QSoapEndpoints(String variable) {
        super(QSoapEndpoints.class, forVariable(variable), "sys", "soap_endpoints");
        addMetadata();
    }

    public QSoapEndpoints(String variable, String schema, String table) {
        super(QSoapEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSoapEndpoints(Path<? extends QSoapEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "soap_endpoints");
        addMetadata();
    }

    public QSoapEndpoints(PathMetadata metadata) {
        super(QSoapEndpoints.class, metadata, "sys", "soap_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultDatabase, ColumnMetadata.named("default_database").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultNamespace, ColumnMetadata.named("default_namespace").withIndex(14).ofType(Types.NVARCHAR).withSize(384));
        addMetadata(defaultResultSchema, ColumnMetadata.named("default_result_schema").withIndex(15).ofType(Types.TINYINT).withSize(3));
        addMetadata(defaultResultSchemaDesc, ColumnMetadata.named("default_result_schema_desc").withIndex(16).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(headerLimit, ColumnMetadata.named("header_limit").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSessionEnabled, ColumnMetadata.named("is_session_enabled").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSqlLanguageEnabled, ColumnMetadata.named("is_sql_language_enabled").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isXmlCharsetEnforced, ColumnMetadata.named("is_xml_charset_enforced").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(loginType, ColumnMetadata.named("login_type").withIndex(20).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(sessionTimeout, ColumnMetadata.named("session_timeout").withIndex(19).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(wsdlGeneratorProcedure, ColumnMetadata.named("wsdl_generator_procedure").withIndex(12).ofType(Types.NVARCHAR).withSize(776));
    }

}

