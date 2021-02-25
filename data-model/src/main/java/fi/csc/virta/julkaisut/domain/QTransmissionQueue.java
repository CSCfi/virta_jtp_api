package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTransmissionQueue is a Querydsl query type for QTransmissionQueue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTransmissionQueue extends com.querydsl.sql.RelationalPathBase<QTransmissionQueue> {

    private static final long serialVersionUID = 2111995728;

    public static final QTransmissionQueue transmissionQueue = new QTransmissionQueue("transmission_queue");

    public final StringPath conversationHandle = createString("conversationHandle");

    public final DateTimePath<java.sql.Timestamp> enqueueTime = createDateTime("enqueueTime", java.sql.Timestamp.class);

    public final StringPath fromServiceName = createString("fromServiceName");

    public final BooleanPath isConversationError = createBoolean("isConversationError");

    public final BooleanPath isEndOfDialog = createBoolean("isEndOfDialog");

    public final SimplePath<byte[]> messageBody = createSimple("messageBody", byte[].class);

    public final NumberPath<Long> messageSequenceNumber = createNumber("messageSequenceNumber", Long.class);

    public final StringPath messageTypeName = createString("messageTypeName");

    public final NumberPath<Byte> priority = createNumber("priority", Byte.class);

    public final StringPath serviceContractName = createString("serviceContractName");

    public final StringPath toBrokerInstance = createString("toBrokerInstance");

    public final StringPath toServiceName = createString("toServiceName");

    public final StringPath transmissionStatus = createString("transmissionStatus");

    public QTransmissionQueue(String variable) {
        super(QTransmissionQueue.class, forVariable(variable), "sys", "transmission_queue");
        addMetadata();
    }

    public QTransmissionQueue(String variable, String schema, String table) {
        super(QTransmissionQueue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTransmissionQueue(Path<? extends QTransmissionQueue> path) {
        super(path.getType(), path.getMetadata(), "sys", "transmission_queue");
        addMetadata();
    }

    public QTransmissionQueue(PathMetadata metadata) {
        super(QTransmissionQueue.class, metadata, "sys", "transmission_queue");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(conversationHandle, ColumnMetadata.named("conversation_handle").withIndex(1).ofType(Types.CHAR).withSize(36).notNull());
        addMetadata(enqueueTime, ColumnMetadata.named("enqueue_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(fromServiceName, ColumnMetadata.named("from_service_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(isConversationError, ColumnMetadata.named("is_conversation_error").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isEndOfDialog, ColumnMetadata.named("is_end_of_dialog").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(messageBody, ColumnMetadata.named("message_body").withIndex(11).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(messageSequenceNumber, ColumnMetadata.named("message_sequence_number").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(messageTypeName, ColumnMetadata.named("message_type_name").withIndex(8).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(13).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(serviceContractName, ColumnMetadata.named("service_contract_name").withIndex(5).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(toBrokerInstance, ColumnMetadata.named("to_broker_instance").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(toServiceName, ColumnMetadata.named("to_service_name").withIndex(2).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(transmissionStatus, ColumnMetadata.named("transmission_status").withIndex(12).ofType(Types.NVARCHAR).withSize(4000));
    }

}

