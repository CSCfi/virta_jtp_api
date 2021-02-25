package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QConversationEndpoints is a Querydsl query type for QConversationEndpoints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConversationEndpoints extends com.querydsl.sql.RelationalPathBase<QConversationEndpoints> {

    private static final long serialVersionUID = 1327049854;

    public static final QConversationEndpoints conversationEndpoints = new QConversationEndpoints("conversation_endpoints");

    public final StringPath conversationGroupId = createString("conversationGroupId");

    public final StringPath conversationHandle = createString("conversationHandle");

    public final StringPath conversationId = createString("conversationId");

    public final DateTimePath<java.sql.Timestamp> dialogTimer = createDateTime("dialogTimer", java.sql.Timestamp.class);

    public final NumberPath<Long> endDialogSequence = createNumber("endDialogSequence", Long.class);

    public final StringPath farBrokerInstance = createString("farBrokerInstance");

    public final NumberPath<Integer> farPrincipalId = createNumber("farPrincipalId", Integer.class);

    public final StringPath farService = createString("farService");

    public final NumberPath<Long> firstOutOfOrderSequence = createNumber("firstOutOfOrderSequence", Long.class);

    public final StringPath inboundSessionKeyIdentifier = createString("inboundSessionKeyIdentifier");

    public final BooleanPath isInitiator = createBoolean("isInitiator");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final NumberPath<Integer> lastOutOfOrderFrag = createNumber("lastOutOfOrderFrag", Integer.class);

    public final NumberPath<Long> lastOutOfOrderSequence = createNumber("lastOutOfOrderSequence", Long.class);

    public final SimplePath<byte[]> lastSendTranId = createSimple("lastSendTranId", byte[].class);

    public final DateTimePath<java.sql.Timestamp> lifetime = createDateTime("lifetime", java.sql.Timestamp.class);

    public final StringPath outboundSessionKeyIdentifier = createString("outboundSessionKeyIdentifier");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> priority = createNumber("priority", Byte.class);

    public final NumberPath<Long> receiveSequence = createNumber("receiveSequence", Long.class);

    public final NumberPath<Integer> receiveSequenceFrag = createNumber("receiveSequenceFrag", Integer.class);

    public final DateTimePath<java.sql.Timestamp> securityTimestamp = createDateTime("securityTimestamp", java.sql.Timestamp.class);

    public final NumberPath<Long> sendSequence = createNumber("sendSequence", Long.class);

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public final StringPath state = createString("state");

    public final StringPath stateDesc = createString("stateDesc");

    public final NumberPath<Long> systemSequence = createNumber("systemSequence", Long.class);

    public QConversationEndpoints(String variable) {
        super(QConversationEndpoints.class, forVariable(variable), "sys", "conversation_endpoints");
        addMetadata();
    }

    public QConversationEndpoints(String variable, String schema, String table) {
        super(QConversationEndpoints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConversationEndpoints(Path<? extends QConversationEndpoints> path) {
        super(path.getType(), path.getMetadata(), "sys", "conversation_endpoints");
        addMetadata();
    }

    public QConversationEndpoints(PathMetadata metadata) {
        super(QConversationEndpoints.class, metadata, "sys", "conversation_endpoints");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(conversationGroupId, ColumnMetadata.named("conversation_group_id").withIndex(5).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(conversationHandle, ColumnMetadata.named("conversation_handle").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(conversationId, ColumnMetadata.named("conversation_id").withIndex(2).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(dialogTimer, ColumnMetadata.named("dialog_timer").withIndex(17).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(endDialogSequence, ColumnMetadata.named("end_dialog_sequence").withIndex(20).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(farBrokerInstance, ColumnMetadata.named("far_broker_instance").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(farPrincipalId, ColumnMetadata.named("far_principal_id").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(farService, ColumnMetadata.named("far_service").withIndex(10).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(firstOutOfOrderSequence, ColumnMetadata.named("first_out_of_order_sequence").withIndex(24).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(inboundSessionKeyIdentifier, ColumnMetadata.named("inbound_session_key_identifier").withIndex(15).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(isInitiator, ColumnMetadata.named("is_initiator").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSystem, ColumnMetadata.named("is_system").withIndex(27).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(lastOutOfOrderFrag, ColumnMetadata.named("last_out_of_order_frag").withIndex(26).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastOutOfOrderSequence, ColumnMetadata.named("last_out_of_order_sequence").withIndex(25).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lastSendTranId, ColumnMetadata.named("last_send_tran_id").withIndex(19).ofType(Types.BINARY).withSize(6).notNull());
        addMetadata(lifetime, ColumnMetadata.named("lifetime").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(outboundSessionKeyIdentifier, ColumnMetadata.named("outbound_session_key_identifier").withIndex(14).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(12).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(28).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(receiveSequence, ColumnMetadata.named("receive_sequence").withIndex(21).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(receiveSequenceFrag, ColumnMetadata.named("receive_sequence_frag").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(securityTimestamp, ColumnMetadata.named("security_timestamp").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(sendSequence, ColumnMetadata.named("send_sequence").withIndex(18).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(serviceId, ColumnMetadata.named("service_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(state, ColumnMetadata.named("state").withIndex(8).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(systemSequence, ColumnMetadata.named("system_sequence").withIndex(23).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

