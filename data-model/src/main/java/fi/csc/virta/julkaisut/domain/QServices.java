package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServices is a Querydsl query type for QServices
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServices extends com.querydsl.sql.RelationalPathBase<QServices> {

    private static final long serialVersionUID = 53014331;

    public static final QServices services = new QServices("services");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public final NumberPath<Integer> serviceQueueId = createNumber("serviceQueueId", Integer.class);

    public QServices(String variable) {
        super(QServices.class, forVariable(variable), "sys", "services");
        addMetadata();
    }

    public QServices(String variable, String schema, String table) {
        super(QServices.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServices(Path<? extends QServices> path) {
        super(path.getType(), path.getMetadata(), "sys", "services");
        addMetadata();
    }

    public QServices(PathMetadata metadata) {
        super(QServices.class, metadata, "sys", "services");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(serviceId, ColumnMetadata.named("service_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(serviceQueueId, ColumnMetadata.named("service_queue_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

