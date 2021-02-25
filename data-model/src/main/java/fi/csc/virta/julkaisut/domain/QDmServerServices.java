package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmServerServices is a Querydsl query type for QDmServerServices
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmServerServices extends com.querydsl.sql.RelationalPathBase<QDmServerServices> {

    private static final long serialVersionUID = -447539321;

    public static final QDmServerServices dmServerServices = new QDmServerServices("dm_server_services");

    public final StringPath clusterNodename = createString("clusterNodename");

    public final StringPath filename = createString("filename");

    public final StringPath isClustered = createString("isClustered");

    public final SimplePath<Object> lastStartupTime = createSimple("lastStartupTime", Object.class);

    public final NumberPath<Integer> processId = createNumber("processId", Integer.class);

    public final StringPath serviceAccount = createString("serviceAccount");

    public final StringPath servicename = createString("servicename");

    public final NumberPath<Integer> startupType = createNumber("startupType", Integer.class);

    public final StringPath startupTypeDesc = createString("startupTypeDesc");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDesc = createString("statusDesc");

    public QDmServerServices(String variable) {
        super(QDmServerServices.class, forVariable(variable), "sys", "dm_server_services");
        addMetadata();
    }

    public QDmServerServices(String variable, String schema, String table) {
        super(QDmServerServices.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmServerServices(Path<? extends QDmServerServices> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_server_services");
        addMetadata();
    }

    public QDmServerServices(PathMetadata metadata) {
        super(QDmServerServices.class, metadata, "sys", "dm_server_services");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clusterNodename, ColumnMetadata.named("cluster_nodename").withIndex(11).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(9).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(isClustered, ColumnMetadata.named("is_clustered").withIndex(10).ofType(Types.NVARCHAR).withSize(1).notNull());
        addMetadata(lastStartupTime, ColumnMetadata.named("last_startup_time").withIndex(7).ofType(-155).withSize(34).withDigits(7));
        addMetadata(processId, ColumnMetadata.named("process_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(serviceAccount, ColumnMetadata.named("service_account").withIndex(8).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(servicename, ColumnMetadata.named("servicename").withIndex(1).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(startupType, ColumnMetadata.named("startup_type").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(startupTypeDesc, ColumnMetadata.named("startup_type_desc").withIndex(3).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(statusDesc, ColumnMetadata.named("status_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(256).notNull());
    }

}

