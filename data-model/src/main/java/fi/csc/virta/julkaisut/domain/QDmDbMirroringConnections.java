package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbMirroringConnections is a Querydsl query type for QDmDbMirroringConnections
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbMirroringConnections extends com.querydsl.sql.RelationalPathBase<QDmDbMirroringConnections> {

    private static final long serialVersionUID = 1107088374;

    public static final QDmDbMirroringConnections dmDbMirroringConnections = new QDmDbMirroringConnections("dm_db_mirroring_connections");

    public final StringPath authenticationMethod = createString("authenticationMethod");

    public final StringPath connectionId = createString("connectionId");

    public final DateTimePath<java.sql.Timestamp> connectTime = createDateTime("connectTime", java.sql.Timestamp.class);

    public final NumberPath<Short> encryptionAlgorithm = createNumber("encryptionAlgorithm", Short.class);

    public final StringPath encryptionAlgorithmDesc = createString("encryptionAlgorithmDesc");

    public final BooleanPath isAccept = createBoolean("isAccept");

    public final BooleanPath isReceiveFlowControlled = createBoolean("isReceiveFlowControlled");

    public final BooleanPath isSendFlowControlled = createBoolean("isSendFlowControlled");

    public final DateTimePath<java.sql.Timestamp> lastActivityTime = createDateTime("lastActivityTime", java.sql.Timestamp.class);

    public final NumberPath<Short> loginState = createNumber("loginState", Short.class);

    public final StringPath loginStateDesc = createString("loginStateDesc");

    public final DateTimePath<java.sql.Timestamp> loginTime = createDateTime("loginTime", java.sql.Timestamp.class);

    public final StringPath peerArbitrationId = createString("peerArbitrationId");

    public final NumberPath<Integer> peerCertificateId = createNumber("peerCertificateId", Integer.class);

    public final StringPath principalName = createString("principalName");

    public final NumberPath<Short> receivesPosted = createNumber("receivesPosted", Short.class);

    public final StringPath remoteUserName = createString("remoteUserName");

    public final NumberPath<Short> sendsPosted = createNumber("sendsPosted", Short.class);

    public final NumberPath<Short> state = createNumber("state", Short.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Long> totalBytesReceived = createNumber("totalBytesReceived", Long.class);

    public final NumberPath<Long> totalBytesSent = createNumber("totalBytesSent", Long.class);

    public final NumberPath<Long> totalFragmentsReceived = createNumber("totalFragmentsReceived", Long.class);

    public final NumberPath<Long> totalFragmentsSent = createNumber("totalFragmentsSent", Long.class);

    public final NumberPath<Long> totalReceives = createNumber("totalReceives", Long.class);

    public final NumberPath<Long> totalSends = createNumber("totalSends", Long.class);

    public final StringPath transportStreamId = createString("transportStreamId");

    public QDmDbMirroringConnections(String variable) {
        super(QDmDbMirroringConnections.class, forVariable(variable), "sys", "dm_db_mirroring_connections");
        addMetadata();
    }

    public QDmDbMirroringConnections(String variable, String schema, String table) {
        super(QDmDbMirroringConnections.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbMirroringConnections(Path<? extends QDmDbMirroringConnections> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_mirroring_connections");
        addMetadata();
    }

    public QDmDbMirroringConnections(PathMetadata metadata) {
        super(QDmDbMirroringConnections.class, metadata, "sys", "dm_db_mirroring_connections");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authenticationMethod, ColumnMetadata.named("authentication_method").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(connectionId, ColumnMetadata.named("connection_id").withIndex(1).ofType(Types.CHAR).withSize(36));
        addMetadata(connectTime, ColumnMetadata.named("connect_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(encryptionAlgorithm, ColumnMetadata.named("encryption_algorithm").withIndex(15).ofType(Types.SMALLINT).withSize(5));
        addMetadata(encryptionAlgorithmDesc, ColumnMetadata.named("encryption_algorithm_desc").withIndex(16).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(isAccept, ColumnMetadata.named("is_accept").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(isReceiveFlowControlled, ColumnMetadata.named("is_receive_flow_controlled").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(isSendFlowControlled, ColumnMetadata.named("is_send_flow_controlled").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(lastActivityTime, ColumnMetadata.named("last_activity_time").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(loginState, ColumnMetadata.named("login_state").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(loginStateDesc, ColumnMetadata.named("login_state_desc").withIndex(13).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(loginTime, ColumnMetadata.named("login_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(peerArbitrationId, ColumnMetadata.named("peer_arbitration_id").withIndex(27).ofType(Types.CHAR).withSize(36));
        addMetadata(peerCertificateId, ColumnMetadata.named("peer_certificate_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(principalName, ColumnMetadata.named("principal_name").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(receivesPosted, ColumnMetadata.named("receives_posted").withIndex(17).ofType(Types.SMALLINT).withSize(5));
        addMetadata(remoteUserName, ColumnMetadata.named("remote_user_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sendsPosted, ColumnMetadata.named("sends_posted").withIndex(19).ofType(Types.SMALLINT).withSize(5));
        addMetadata(state, ColumnMetadata.named("state").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(totalBytesReceived, ColumnMetadata.named("total_bytes_received").withIndex(22).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalBytesSent, ColumnMetadata.named("total_bytes_sent").withIndex(21).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalFragmentsReceived, ColumnMetadata.named("total_fragments_received").withIndex(24).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalFragmentsSent, ColumnMetadata.named("total_fragments_sent").withIndex(23).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalReceives, ColumnMetadata.named("total_receives").withIndex(26).ofType(Types.BIGINT).withSize(19));
        addMetadata(totalSends, ColumnMetadata.named("total_sends").withIndex(25).ofType(Types.BIGINT).withSize(19));
        addMetadata(transportStreamId, ColumnMetadata.named("transport_stream_id").withIndex(2).ofType(Types.CHAR).withSize(36));
    }

}

