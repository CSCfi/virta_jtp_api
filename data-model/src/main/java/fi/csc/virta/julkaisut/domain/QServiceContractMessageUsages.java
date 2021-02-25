package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceContractMessageUsages is a Querydsl query type for QServiceContractMessageUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceContractMessageUsages extends com.querydsl.sql.RelationalPathBase<QServiceContractMessageUsages> {

    private static final long serialVersionUID = 1775351951;

    public static final QServiceContractMessageUsages serviceContractMessageUsages = new QServiceContractMessageUsages("service_contract_message_usages");

    public final BooleanPath isSentByInitiator = createBoolean("isSentByInitiator");

    public final BooleanPath isSentByTarget = createBoolean("isSentByTarget");

    public final NumberPath<Integer> messageTypeId = createNumber("messageTypeId", Integer.class);

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public QServiceContractMessageUsages(String variable) {
        super(QServiceContractMessageUsages.class, forVariable(variable), "sys", "service_contract_message_usages");
        addMetadata();
    }

    public QServiceContractMessageUsages(String variable, String schema, String table) {
        super(QServiceContractMessageUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceContractMessageUsages(Path<? extends QServiceContractMessageUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_contract_message_usages");
        addMetadata();
    }

    public QServiceContractMessageUsages(PathMetadata metadata) {
        super(QServiceContractMessageUsages.class, metadata, "sys", "service_contract_message_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isSentByInitiator, ColumnMetadata.named("is_sent_by_initiator").withIndex(3).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSentByTarget, ColumnMetadata.named("is_sent_by_target").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(messageTypeId, ColumnMetadata.named("message_type_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

