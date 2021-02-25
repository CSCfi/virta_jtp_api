package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAvailabilityReadOnlyRoutingLists is a Querydsl query type for QAvailabilityReadOnlyRoutingLists
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvailabilityReadOnlyRoutingLists extends com.querydsl.sql.RelationalPathBase<QAvailabilityReadOnlyRoutingLists> {

    private static final long serialVersionUID = -1802893367;

    public static final QAvailabilityReadOnlyRoutingLists availabilityReadOnlyRoutingLists = new QAvailabilityReadOnlyRoutingLists("availability_read_only_routing_lists");

    public final StringPath readOnlyReplicaId = createString("readOnlyReplicaId");

    public final StringPath replicaId = createString("replicaId");

    public final NumberPath<Integer> routingPriority = createNumber("routingPriority", Integer.class);

    public QAvailabilityReadOnlyRoutingLists(String variable) {
        super(QAvailabilityReadOnlyRoutingLists.class, forVariable(variable), "sys", "availability_read_only_routing_lists");
        addMetadata();
    }

    public QAvailabilityReadOnlyRoutingLists(String variable, String schema, String table) {
        super(QAvailabilityReadOnlyRoutingLists.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvailabilityReadOnlyRoutingLists(Path<? extends QAvailabilityReadOnlyRoutingLists> path) {
        super(path.getType(), path.getMetadata(), "sys", "availability_read_only_routing_lists");
        addMetadata();
    }

    public QAvailabilityReadOnlyRoutingLists(PathMetadata metadata) {
        super(QAvailabilityReadOnlyRoutingLists.class, metadata, "sys", "availability_read_only_routing_lists");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(readOnlyReplicaId, ColumnMetadata.named("read_only_replica_id").withIndex(3).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(replicaId, ColumnMetadata.named("replica_id").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(routingPriority, ColumnMetadata.named("routing_priority").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

