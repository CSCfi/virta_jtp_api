package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityGroupListenerIpAddresses is a Querydsl query type for QAvailabilityGroupListenerIpAddresses
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityGroupListenerIpAddresses extends com.querydsl.sql.RelationalPathBase<QAvailabilityGroupListenerIpAddresses> {

    private static final long serialVersionUID = 1203648960;

    public static final QAvailabilityGroupListenerIpAddresses availabilityGroupListenerIpAddresses = new QAvailabilityGroupListenerIpAddresses("availability_group_listener_ip_addresses");

    public final StringPath ipAddress = createString("ipAddress");

    public final StringPath ipSubnetMask = createString("ipSubnetMask");

    public final BooleanPath isDhcp = createBoolean("isDhcp");

    public final StringPath listenerId = createString("listenerId");

    public final StringPath networkSubnetIp = createString("networkSubnetIp");

    public final StringPath networkSubnetIpv4Mask = createString("networkSubnetIpv4Mask");

    public final NumberPath<Integer> networkSubnetPrefixLength = createNumber("networkSubnetPrefixLength", Integer.class);

    public final NumberPath<Byte> state = createNumber("state", Byte.class);

    public final StringPath stateDesc = createString("stateDesc");

    public QAvailabilityGroupListenerIpAddresses(String variable) {
        super(QAvailabilityGroupListenerIpAddresses.class, forVariable(variable), "sys", "availability_group_listener_ip_addresses");
        addMetadata();
    }

    public QAvailabilityGroupListenerIpAddresses(String variable, String schema, String table) {
        super(QAvailabilityGroupListenerIpAddresses.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityGroupListenerIpAddresses(Path<? extends QAvailabilityGroupListenerIpAddresses> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_group_listener_ip_addresses");
        addMetadata();
    }

    public QAvailabilityGroupListenerIpAddresses(PathMetadata metadata) {
        super(QAvailabilityGroupListenerIpAddresses.class, metadata, "sys", "availability_group_listener_ip_addresses");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ipAddress, ColumnMetadata.named("ip_address").withIndex(2).ofType(Types.NVARCHAR).withSize(48));
        addMetadata(ipSubnetMask, ColumnMetadata.named("ip_subnet_mask").withIndex(3).ofType(Types.NVARCHAR).withSize(15));
        addMetadata(isDhcp, ColumnMetadata.named("is_dhcp").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(listenerId, ColumnMetadata.named("listener_id").withIndex(1).ofType(Types.NVARCHAR).withSize(36));
        addMetadata(networkSubnetIp, ColumnMetadata.named("network_subnet_ip").withIndex(5).ofType(Types.NVARCHAR).withSize(48));
        addMetadata(networkSubnetIpv4Mask, ColumnMetadata.named("network_subnet_ipv4_mask").withIndex(7).ofType(Types.NVARCHAR).withSize(48));
        addMetadata(networkSubnetPrefixLength, ColumnMetadata.named("network_subnet_prefix_length").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
    }

}

