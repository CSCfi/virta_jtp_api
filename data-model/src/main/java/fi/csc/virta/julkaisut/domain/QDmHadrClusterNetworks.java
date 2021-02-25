package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmHadrClusterNetworks is a Querydsl query type for QDmHadrClusterNetworks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmHadrClusterNetworks extends com.querydsl.sql.RelationalPathBase<QDmHadrClusterNetworks> {

    private static final long serialVersionUID = 1296781010;

    public static final QDmHadrClusterNetworks dmHadrClusterNetworks = new QDmHadrClusterNetworks("dm_hadr_cluster_networks");

    public final BooleanPath isIpv4 = createBoolean("isIpv4");

    public final BooleanPath isPublic = createBoolean("isPublic");

    public final StringPath memberName = createString("memberName");

    public final StringPath networkSubnetIp = createString("networkSubnetIp");

    public final StringPath networkSubnetIpv4Mask = createString("networkSubnetIpv4Mask");

    public final NumberPath<Integer> networkSubnetPrefixLength = createNumber("networkSubnetPrefixLength", Integer.class);

    public QDmHadrClusterNetworks(String variable) {
        super(QDmHadrClusterNetworks.class, forVariable(variable), "sys", "dm_hadr_cluster_networks");
        addMetadata();
    }

    public QDmHadrClusterNetworks(String variable, String schema, String table) {
        super(QDmHadrClusterNetworks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmHadrClusterNetworks(Path<? extends QDmHadrClusterNetworks> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_hadr_cluster_networks");
        addMetadata();
    }

    public QDmHadrClusterNetworks(PathMetadata metadata) {
        super(QDmHadrClusterNetworks.class, metadata, "sys", "dm_hadr_cluster_networks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isIpv4, ColumnMetadata.named("is_ipv4").withIndex(6).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublic, ColumnMetadata.named("is_public").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memberName, ColumnMetadata.named("member_name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(networkSubnetIp, ColumnMetadata.named("network_subnet_ip").withIndex(2).ofType(Types.NVARCHAR).withSize(64).notNull());
        addMetadata(networkSubnetIpv4Mask, ColumnMetadata.named("network_subnet_ipv4_mask").withIndex(3).ofType(Types.NVARCHAR).withSize(45));
        addMetadata(networkSubnetPrefixLength, ColumnMetadata.named("network_subnet_prefix_length").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

