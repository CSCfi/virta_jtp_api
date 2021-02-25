package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceContractUsages is a Querydsl query type for QServiceContractUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceContractUsages extends com.querydsl.sql.RelationalPathBase<QServiceContractUsages> {

    private static final long serialVersionUID = 83411196;

    public static final QServiceContractUsages serviceContractUsages = new QServiceContractUsages("service_contract_usages");

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public final NumberPath<Integer> serviceId = createNumber("serviceId", Integer.class);

    public QServiceContractUsages(String variable) {
        super(QServiceContractUsages.class, forVariable(variable), "sys", "service_contract_usages");
        addMetadata();
    }

    public QServiceContractUsages(String variable, String schema, String table) {
        super(QServiceContractUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceContractUsages(Path<? extends QServiceContractUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_contract_usages");
        addMetadata();
    }

    public QServiceContractUsages(PathMetadata metadata) {
        super(QServiceContractUsages.class, metadata, "sys", "service_contract_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(serviceId, ColumnMetadata.named("service_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

