package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityGroupListeners is a Querydsl query type for QAvailabilityGroupListeners
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityGroupListeners extends com.querydsl.sql.RelationalPathBase<QAvailabilityGroupListeners> {

    private static final long serialVersionUID = -550731176;

    public static final QAvailabilityGroupListeners availabilityGroupListeners = new QAvailabilityGroupListeners("availability_group_listeners");

    public final StringPath dnsName = createString("dnsName");

    public final StringPath groupId = createString("groupId");

    public final StringPath ipConfigurationStringFromCluster = createString("ipConfigurationStringFromCluster");

    public final BooleanPath isConformant = createBoolean("isConformant");

    public final StringPath listenerId = createString("listenerId");

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    public QAvailabilityGroupListeners(String variable) {
        super(QAvailabilityGroupListeners.class, forVariable(variable), "sys", "availability_group_listeners");
        addMetadata();
    }

    public QAvailabilityGroupListeners(String variable, String schema, String table) {
        super(QAvailabilityGroupListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityGroupListeners(Path<? extends QAvailabilityGroupListeners> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_group_listeners");
        addMetadata();
    }

    public QAvailabilityGroupListeners(PathMetadata metadata) {
        super(QAvailabilityGroupListeners.class, metadata, "sys", "availability_group_listeners");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dnsName, ColumnMetadata.named("dns_name").withIndex(3).ofType(Types.NVARCHAR).withSize(63));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(ipConfigurationStringFromCluster, ColumnMetadata.named("ip_configuration_string_from_cluster").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(isConformant, ColumnMetadata.named("is_conformant").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(listenerId, ColumnMetadata.named("listener_id").withIndex(2).ofType(Types.NVARCHAR).withSize(36));
        addMetadata(port, ColumnMetadata.named("port").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

