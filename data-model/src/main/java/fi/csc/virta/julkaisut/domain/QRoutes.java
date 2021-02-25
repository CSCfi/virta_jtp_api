package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRoutes is a Querydsl query type for QRoutes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRoutes extends com.querydsl.sql.RelationalPathBase<QRoutes> {

    private static final long serialVersionUID = -1543272089;

    public static final QRoutes routes = new QRoutes("routes");

    public final StringPath address = createString("address");

    public final StringPath brokerInstance = createString("brokerInstance");

    public final DateTimePath<java.sql.Timestamp> lifetime = createDateTime("lifetime", java.sql.Timestamp.class);

    public final StringPath mirrorAddress = createString("mirrorAddress");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath remoteServiceName = createString("remoteServiceName");

    public final NumberPath<Integer> routeId = createNumber("routeId", Integer.class);

    public QRoutes(String variable) {
        super(QRoutes.class, forVariable(variable), "sys", "routes");
        addMetadata();
    }

    public QRoutes(String variable, String schema, String table) {
        super(QRoutes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRoutes(Path<? extends QRoutes> path) {
        super(path.getType(), path.getMetadata(), "sys", "routes");
        addMetadata();
    }

    public QRoutes(PathMetadata metadata) {
        super(QRoutes.class, metadata, "sys", "routes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("address").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(brokerInstance, ColumnMetadata.named("broker_instance").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(lifetime, ColumnMetadata.named("lifetime").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(mirrorAddress, ColumnMetadata.named("mirror_address").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(remoteServiceName, ColumnMetadata.named("remote_service_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(routeId, ColumnMetadata.named("route_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

