package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseMirroringEndpoints is a Querydsl query type for QDatabaseMirroringEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseMirroringEndpoints extends com.querydsl.sql.RelationalPathBase<QDatabaseMirroringEndpoints> {

    private static final long serialVersionUID = -1597380749;

    public static final QDatabaseMirroringEndpoints databaseMirroringEndpoints = new QDatabaseMirroringEndpoints("database_mirroring_endpoints");

    public final NumberPath<Integer> certificateId = createNumber("certificateId", Integer.class);

    public final NumberPath<Byte> connectionAuth = createNumber("connectionAuth", Byte.class);

    public final StringPath connectionAuthDesc = createString("connectionAuthDesc");

    public final NumberPath<Byte> encryptionAlgorithm = createNumber("encryptionAlgorithm", Byte.class);

    public final StringPath encryptionAlgorithmDesc = createString("encryptionAlgorithmDesc");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final BooleanPath isEncryptionEnabled = createBoolean("isEncryptionEnabled");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final NumberPath<Byte> role = createNumber("role", Byte.class);

    public final StringPath roleDesc = createString("roleDesc");

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QDatabaseMirroringEndpoints(String variable) {
        super(QDatabaseMirroringEndpoints.class, forVariable(variable), "sys", "database_mirroring_endpoints");
        addMetadata();
    }

    public QDatabaseMirroringEndpoints(String variable, String schema, String table) {
        super(QDatabaseMirroringEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseMirroringEndpoints(Path<? extends QDatabaseMirroringEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_mirroring_endpoints");
        addMetadata();
    }

    public QDatabaseMirroringEndpoints(PathMetadata metadata) {
        super(QDatabaseMirroringEndpoints.class, metadata, "sys", "database_mirroring_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(certificateId, ColumnMetadata.named("certificate_id").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(connectionAuth, ColumnMetadata.named("connection_auth").withIndex(14).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(connectionAuthDesc, ColumnMetadata.named("connection_auth_desc").withIndex(15).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(encryptionAlgorithm, ColumnMetadata.named("encryption_algorithm").withIndex(17).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(encryptionAlgorithmDesc, ColumnMetadata.named("encryption_algorithm_desc").withIndex(18).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isEncryptionEnabled, ColumnMetadata.named("is_encryption_enabled").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(role, ColumnMetadata.named("role").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(roleDesc, ColumnMetadata.named("role_desc").withIndex(12).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

