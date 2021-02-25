package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmTcpListenerStates is a Querydsl query type for QDmTcpListenerStates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmTcpListenerStates extends com.querydsl.sql.RelationalPathBase<QDmTcpListenerStates> {

    private static final long serialVersionUID = 162902417;

    public static final QDmTcpListenerStates dmTcpListenerStates = new QDmTcpListenerStates("dm_tcp_listener_states");

    public final StringPath ipAddress = createString("ipAddress");

    public final BooleanPath isIpv4 = createBoolean("isIpv4");

    public final NumberPath<Integer> listenerId = createNumber("listenerId", Integer.class);

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Short> state = createNumber("state", Short.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QDmTcpListenerStates(String variable) {
        super(QDmTcpListenerStates.class, forVariable(variable), "sys", "dm_tcp_listener_states");
        addMetadata();
    }

    public QDmTcpListenerStates(String variable, String schema, String table) {
        super(QDmTcpListenerStates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmTcpListenerStates(Path<? extends QDmTcpListenerStates> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_tcp_listener_states");
        addMetadata();
    }

    public QDmTcpListenerStates(PathMetadata metadata) {
        super(QDmTcpListenerStates.class, metadata, "sys", "dm_tcp_listener_states");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ipAddress, ColumnMetadata.named("ip_address").withIndex(2).ofType(Types.NVARCHAR).withSize(48).notNull());
        addMetadata(isIpv4, ColumnMetadata.named("is_ipv4").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(listenerId, ColumnMetadata.named("listener_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(port, ColumnMetadata.named("port").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(16).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(20).notNull());
    }

}

