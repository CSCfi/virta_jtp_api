package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConversationPriorities is a Querydsl query type for QConversationPriorities
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConversationPriorities extends com.querydsl.sql.RelationalPathBase<QConversationPriorities> {

    private static final long serialVersionUID = 1004976706;

    public static final QConversationPriorities conversationPriorities = new QConversationPriorities("conversation_priorities");

    public final NumberPath<Integer> localServiceId = createNumber("localServiceId", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> priority = createNumber("priority", Byte.class);

    public final NumberPath<Integer> priorityId = createNumber("priorityId", Integer.class);

    public final StringPath remoteServiceName = createString("remoteServiceName");

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public QConversationPriorities(String variable) {
        super(QConversationPriorities.class, forVariable(variable), "sys", "conversation_priorities");
        addMetadata();
    }

    public QConversationPriorities(String variable, String schema, String table) {
        super(QConversationPriorities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConversationPriorities(Path<? extends QConversationPriorities> path) {
        super(path.getType(), path.getMetadata(), "sys", "conversation_priorities");
        addMetadata();
    }

    public QConversationPriorities(PathMetadata metadata) {
        super(QConversationPriorities.class, metadata, "sys", "conversation_priorities");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(localServiceId, ColumnMetadata.named("local_service_id").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(priorityId, ColumnMetadata.named("priority_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(remoteServiceName, ColumnMetadata.named("remote_service_name").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

