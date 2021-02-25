package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServiceContracts is a Querydsl query type for QServiceContracts
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceContracts extends com.querydsl.sql.RelationalPathBase<QServiceContracts> {

    private static final long serialVersionUID = 800118857;

    public static final QServiceContracts serviceContracts = new QServiceContracts("service_contracts");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public QServiceContracts(String variable) {
        super(QServiceContracts.class, forVariable(variable), "sys", "service_contracts");
        addMetadata();
    }

    public QServiceContracts(String variable, String schema, String table) {
        super(QServiceContracts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceContracts(Path<? extends QServiceContracts> path) {
        super(path.getType(), path.getMetadata(), "sys", "service_contracts");
        addMetadata();
    }

    public QServiceContracts(PathMetadata metadata) {
        super(QServiceContracts.class, metadata, "sys", "service_contracts");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

