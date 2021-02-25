package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmExecConnections is a Querydsl query type for QDmExecConnections
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmExecConnections extends com.querydsl.sql.RelationalPathBase<QDmExecConnections> {

    private static final long serialVersionUID = -954832386;

    public static final QDmExecConnections dmExecConnections = new QDmExecConnections("dm_exec_connections");

    public final StringPath authScheme = createString("authScheme");

    public final StringPath clientNetAddress = createString("clientNetAddress");

    public final NumberPath<Integer> clientTcpPort = createNumber("clientTcpPort", Integer.class);

    public final StringPath connectionId = createString("connectionId");

    public final DateTimePath<java.sql.Timestamp> connectTime = createDateTime("connectTime", java.sql.Timestamp.class);

    public final StringPath encryptOption = createString("encryptOption");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> lastRead = createDateTime("lastRead", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> lastWrite = createDateTime("lastWrite", java.sql.Timestamp.class);

    public final StringPath localNetAddress = createString("localNetAddress");

    public final NumberPath<Integer> localTcpPort = createNumber("localTcpPort", Integer.class);

    public final NumberPath<Integer> mostRecentSessionId = createNumber("mostRecentSessionId", Integer.class);

    public final SimplePath<byte[]> mostRecentSqlHandle = createSimple("mostRecentSqlHandle", byte[].class);

    public final NumberPath<Integer> netPacketSize = createNumber("netPacketSize", Integer.class);

    public final StringPath netTransport = createString("netTransport");

    public final NumberPath<Short> nodeAffinity = createNumber("nodeAffinity", Short.class);

    public final NumberPath<Integer> numReads = createNumber("numReads", Integer.class);

    public final NumberPath<Integer> numWrites = createNumber("numWrites", Integer.class);

    public final StringPath parentConnectionId = createString("parentConnectionId");

    public final StringPath protocolType = createString("protocolType");

    public final NumberPath<Integer> protocolVersion = createNumber("protocolVersion", Integer.class);

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public QDmExecConnections(String variable) {
        super(QDmExecConnections.class, forVariable(variable), "sys", "dm_exec_connections");
        addMetadata();
    }

    public QDmExecConnections(String variable, String schema, String table) {
        super(QDmExecConnections.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmExecConnections(Path<? extends QDmExecConnections> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_exec_connections");
        addMetadata();
    }

    public QDmExecConnections(PathMetadata metadata) {
        super(QDmExecConnections.class, metadata, "sys", "dm_exec_connections");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authScheme, ColumnMetadata.named("auth_scheme").withIndex(9).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(clientNetAddress, ColumnMetadata.named("client_net_address").withIndex(16).ofType(Types.VARCHAR).withSize(48));
        addMetadata(clientTcpPort, ColumnMetadata.named("client_tcp_port").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(connectionId, ColumnMetadata.named("connection_id").withIndex(20).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(connectTime, ColumnMetadata.named("connect_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(encryptOption, ColumnMetadata.named("encrypt_option").withIndex(8).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(lastRead, ColumnMetadata.named("last_read").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(lastWrite, ColumnMetadata.named("last_write").withIndex(14).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(localNetAddress, ColumnMetadata.named("local_net_address").withIndex(18).ofType(Types.VARCHAR).withSize(48));
        addMetadata(localTcpPort, ColumnMetadata.named("local_tcp_port").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(mostRecentSessionId, ColumnMetadata.named("most_recent_session_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(mostRecentSqlHandle, ColumnMetadata.named("most_recent_sql_handle").withIndex(22).ofType(Types.VARBINARY).withSize(64));
        addMetadata(netPacketSize, ColumnMetadata.named("net_packet_size").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(netTransport, ColumnMetadata.named("net_transport").withIndex(4).ofType(Types.NVARCHAR).withSize(40).notNull());
        addMetadata(nodeAffinity, ColumnMetadata.named("node_affinity").withIndex(10).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(numReads, ColumnMetadata.named("num_reads").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(numWrites, ColumnMetadata.named("num_writes").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(parentConnectionId, ColumnMetadata.named("parent_connection_id").withIndex(21).ofType(Types.CHAR).withSize(36));
        addMetadata(protocolType, ColumnMetadata.named("protocol_type").withIndex(5).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(protocolVersion, ColumnMetadata.named("protocol_version").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(sessionId, ColumnMetadata.named("session_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
    }

}

