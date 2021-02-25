package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceQueueUsages is a Querydsl query type for QServiceQueueUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceQueueUsages extends com.querydsl.sql.RelationalPathBase<QServiceQueueUsages> {

    private static final long serialVersionUID = 1396516875;

    public static final QServiceQueueUsages serviceQueueUsages = new QServiceQueueUsages("service_queue_usages");

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public final NumberPath<Integer> serviceQueueId = createNumber("serviceQueueId", Integer.class);

    public QServiceQueueUsages(String variable) {
        super(QServiceQueueUsages.class, forVariable(variable), "sys", "service_queue_usages");
        addMetadata();
    }

    public QServiceQueueUsages(String variable, String schema, String table) {
        super(QServiceQueueUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceQueueUsages(Path<? extends QServiceQueueUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_queue_usages");
        addMetadata();
    }

    public QServiceQueueUsages(PathMetadata metadata) {
        super(QServiceQueueUsages.class, metadata, "sys", "service_queue_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(serviceId, ColumnMetadata.named("service_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(serviceQueueId, ColumnMetadata.named("service_queue_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

