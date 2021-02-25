package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceBrokerEndpoints is a Querydsl query type for QServiceBrokerEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceBrokerEndpoints extends com.querydsl.sql.RelationalPathBase<QServiceBrokerEndpoints> {

    private static final long serialVersionUID = 2118003277;

    public static final QServiceBrokerEndpoints serviceBrokerEndpoints = new QServiceBrokerEndpoints("service_broker_endpoints");

    public final NumberPath<Integer> certificateId = createNumber("certificateId", Integer.class);

    public final NumberPath<Byte> connectionAuth = createNumber("connectionAuth", Byte.class);

    public final StringPath connectionAuthDesc = createString("connectionAuthDesc");

    public final NumberPath<Byte> encryptionAlgorithm = createNumber("encryptionAlgorithm", Byte.class);

    public final StringPath encryptionAlgorithmDesc = createString("encryptionAlgorithmDesc");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final BooleanPath isMessageForwardingEnabled = createBoolean("isMessageForwardingEnabled");

    public final NumberPath<Integer> messageForwardingSize = createNumber("messageForwardingSize", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QServiceBrokerEndpoints(String variable) {
        super(QServiceBrokerEndpoints.class, forVariable(variable), "sys", "service_broker_endpoints");
        addMetadata();
    }

    public QServiceBrokerEndpoints(String variable, String schema, String table) {
        super(QServiceBrokerEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceBrokerEndpoints(Path<? extends QServiceBrokerEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_broker_endpoints");
        addMetadata();
    }

    public QServiceBrokerEndpoints(PathMetadata metadata) {
        super(QServiceBrokerEndpoints.class, metadata, "sys", "service_broker_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(certificateId, ColumnMetadata.named("certificate_id").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(connectionAuth, ColumnMetadata.named("connection_auth").withIndex(13).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(connectionAuthDesc, ColumnMetadata.named("connection_auth_desc").withIndex(14).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(encryptionAlgorithm, ColumnMetadata.named("encryption_algorithm").withIndex(16).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(encryptionAlgorithmDesc, ColumnMetadata.named("encryption_algorithm_desc").withIndex(17).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMessageForwardingEnabled, ColumnMetadata.named("is_message_forwarding_enabled").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(messageForwardingSize, ColumnMetadata.named("message_forwarding_size").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

