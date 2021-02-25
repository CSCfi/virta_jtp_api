package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QHttpEndpoints is a Querydsl query type for QHttpEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QHttpEndpoints extends com.querydsl.sql.RelationalPathBase<QHttpEndpoints> {

    private static final long serialVersionUID = -34559719;

    public static final QHttpEndpoints httpEndpoints = new QHttpEndpoints("http_endpoints");

    public final StringPath authorizationRealm = createString("authorizationRealm");

    public final NumberPath<Integer> clearPort = createNumber("clearPort", Integer.class);

    public final StringPath defaultLogonDomain = createString("defaultLogonDomain");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final BooleanPath isAnonymousEnabled = createBoolean("isAnonymousEnabled");

    public final BooleanPath isBasicAuthEnabled = createBoolean("isBasicAuthEnabled");

    public final BooleanPath isClearPortEnabled = createBoolean("isClearPortEnabled");

    public final BooleanPath isCompressionEnabled = createBoolean("isCompressionEnabled");

    public final BooleanPath isDigestAuthEnabled = createBoolean("isDigestAuthEnabled");

    public final BooleanPath isIntegratedAuthEnabled = createBoolean("isIntegratedAuthEnabled");

    public final BooleanPath isKerberosAuthEnabled = createBoolean("isKerberosAuthEnabled");

    public final BooleanPath isNtlmAuthEnabled = createBoolean("isNtlmAuthEnabled");

    public final BooleanPath isSslPortEnabled = createBoolean("isSslPortEnabled");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final StringPath site = createString("site");

    public final NumberPath<Integer> sslPort = createNumber("sslPort", Integer.class);

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public final StringPath urlPath = createString("urlPath");

    public QHttpEndpoints(String variable) {
        super(QHttpEndpoints.class, forVariable(variable), "sys", "http_endpoints");
        addMetadata();
    }

    public QHttpEndpoints(String variable, String schema, String table) {
        super(QHttpEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QHttpEndpoints(Path<? extends QHttpEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "http_endpoints");
        addMetadata();
    }

    public QHttpEndpoints(PathMetadata metadata) {
        super(QHttpEndpoints.class, metadata, "sys", "http_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorizationRealm, ColumnMetadata.named("authorization_realm").withIndex(23).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(clearPort, ColumnMetadata.named("clear_port").withIndex(14).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(defaultLogonDomain, ColumnMetadata.named("default_logon_domain").withIndex(24).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isAnonymousEnabled, ColumnMetadata.named("is_anonymous_enabled").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isBasicAuthEnabled, ColumnMetadata.named("is_basic_auth_enabled").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isClearPortEnabled, ColumnMetadata.named("is_clear_port_enabled").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isCompressionEnabled, ColumnMetadata.named("is_compression_enabled").withIndex(25).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDigestAuthEnabled, ColumnMetadata.named("is_digest_auth_enabled").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isIntegratedAuthEnabled, ColumnMetadata.named("is_integrated_auth_enabled").withIndex(22).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isKerberosAuthEnabled, ColumnMetadata.named("is_kerberos_auth_enabled").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isNtlmAuthEnabled, ColumnMetadata.named("is_ntlm_auth_enabled").withIndex(21).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSslPortEnabled, ColumnMetadata.named("is_ssl_port_enabled").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(site, ColumnMetadata.named("site").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sslPort, ColumnMetadata.named("ssl_port").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(urlPath, ColumnMetadata.named("url_path").withIndex(12).ofType(Types.NVARCHAR).withSize(4000));
    }

}

