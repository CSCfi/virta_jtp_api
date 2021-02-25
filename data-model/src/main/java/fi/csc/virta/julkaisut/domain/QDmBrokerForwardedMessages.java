package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmBrokerForwardedMessages is a Querydsl query type for QDmBrokerForwardedMessages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmBrokerForwardedMessages extends com.querydsl.sql.RelationalPathBase<QDmBrokerForwardedMessages> {

    private static final long serialVersionUID = 471085233;

    public static final QDmBrokerForwardedMessages dmBrokerForwardedMessages = new QDmBrokerForwardedMessages("dm_broker_forwarded_messages");

    public final StringPath adjacentBrokerAddress = createString("adjacentBrokerAddress");

    public final StringPath conversationId = createString("conversationId");

    public final StringPath fromBrokerInstance = createString("fromBrokerInstance");

    public final StringPath fromServiceName = createString("fromServiceName");

    public final NumberPath<Byte> hopsRemaining = createNumber("hopsRemaining", Byte.class);

    public final BooleanPath isInitiator = createBoolean("isInitiator");

    public final NumberPath<Integer> messageFragmentNumber = createNumber("messageFragmentNumber", Integer.class);

    public final StringPath messageId = createString("messageId");

    public final NumberPath<Long> messageSequenceNumber = createNumber("messageSequenceNumber", Long.class);

    public final NumberPath<Integer> timeConsumed = createNumber("timeConsumed", Integer.class);

    public final NumberPath<Integer> timeToLive = createNumber("timeToLive", Integer.class);

    public final StringPath toBrokerInstance = createString("toBrokerInstance");

    public final StringPath toServiceName = createString("toServiceName");

    public QDmBrokerForwardedMessages(String variable) {
        super(QDmBrokerForwardedMessages.class, forVariable(variable), "sys", "dm_broker_forwarded_messages");
        addMetadata();
    }

    public QDmBrokerForwardedMessages(String variable, String schema, String table) {
        super(QDmBrokerForwardedMessages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmBrokerForwardedMessages(Path<? extends QDmBrokerForwardedMessages> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_broker_forwarded_messages");
        addMetadata();
    }

    public QDmBrokerForwardedMessages(PathMetadata metadata) {
        super(QDmBrokerForwardedMessages.class, metadata, "sys", "dm_broker_forwarded_messages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(adjacentBrokerAddress, ColumnMetadata.named("adjacent_broker_address").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(conversationId, ColumnMetadata.named("conversation_id").withIndex(1).ofType(Types.CHAR).withSize(36));
        addMetadata(fromBrokerInstance, ColumnMetadata.named("from_broker_instance").withIndex(6).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(fromServiceName, ColumnMetadata.named("from_service_name").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(hopsRemaining, ColumnMetadata.named("hops_remaining").withIndex(10).ofType(Types.TINYINT).withSize(3));
        addMetadata(isInitiator, ColumnMetadata.named("is_initiator").withIndex(2).ofType(Types.BIT).withSize(1));
        addMetadata(messageFragmentNumber, ColumnMetadata.named("message_fragment_number").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(messageId, ColumnMetadata.named("message_id").withIndex(13).ofType(Types.CHAR).withSize(36));
        addMetadata(messageSequenceNumber, ColumnMetadata.named("message_sequence_number").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(timeConsumed, ColumnMetadata.named("time_consumed").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(timeToLive, ColumnMetadata.named("time_to_live").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(toBrokerInstance, ColumnMetadata.named("to_broker_instance").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(toServiceName, ColumnMetadata.named("to_service_name").withIndex(3).ofType(Types.NVARCHAR).withSize(256));
    }

}

