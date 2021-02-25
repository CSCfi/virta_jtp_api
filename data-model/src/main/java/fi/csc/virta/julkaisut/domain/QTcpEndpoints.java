package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTcpEndpoints is a Querydsl query type for QTcpEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTcpEndpoints extends com.querydsl.sql.RelationalPathBase<QTcpEndpoints> {

    private static final long serialVersionUID = 1033857786;

    public static final QTcpEndpoints tcpEndpoints = new QTcpEndpoints("tcp_endpoints");

    public final NumberPath<Integer> endpointId = createNumber("endpointId", Integer.class);

    public final StringPath ipAddress = createString("ipAddress");

    public final BooleanPath isAdminEndpoint = createBoolean("isAdminEndpoint");

    public final BooleanPath isDynamicPort = createBoolean("isDynamicPort");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> protocol = createNumber("protocol", Byte.class);

    public final StringPath protocolDesc = createString("protocolDesc");

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QTcpEndpoints(String variable) {
        super(QTcpEndpoints.class, forVariable(variable), "sys", "tcp_endpoints");
        addMetadata();
    }

    public QTcpEndpoints(String variable, String schema, String table) {
        super(QTcpEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTcpEndpoints(Path<? extends QTcpEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "tcp_endpoints");
        addMetadata();
    }

    public QTcpEndpoints(PathMetadata metadata) {
        super(QTcpEndpoints.class, metadata, "sys", "tcp_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(endpointId, ColumnMetadata.named("endpoint_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(ipAddress, ColumnMetadata.named("ip_address").withIndex(13).ofType(Types.VARCHAR).withSize(45));
        addMetadata(isAdminEndpoint, ColumnMetadata.named("is_admin_endpoint").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDynamicPort, ColumnMetadata.named("is_dynamic_port").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(port, ColumnMetadata.named("port").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(protocol, ColumnMetadata.named("protocol").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(protocolDesc, ColumnMetadata.named("protocol_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
    }

}

