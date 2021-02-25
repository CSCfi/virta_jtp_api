package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRemoteServiceBindings is a Querydsl query type for QRemoteServiceBindings
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRemoteServiceBindings extends com.querydsl.sql.RelationalPathBase<QRemoteServiceBindings> {

    private static final long serialVersionUID = -1602542720;

    public static final QRemoteServiceBindings remoteServiceBindings = new QRemoteServiceBindings("remote_service_bindings");

    public final BooleanPath isAnonymousOn = createBoolean("isAnonymousOn");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> remotePrincipalId = createNumber("remotePrincipalId", Integer.class);

    public final NumberPath<Integer> remoteServiceBindingId = createNumber("remoteServiceBindingId", Integer.class);

    public final StringPath remoteServiceName = createString("remoteServiceName");

    public final NumberPath<Integer> serviceContractId = createNumber("serviceContractId", Integer.class);

    public QRemoteServiceBindings(String variable) {
        super(QRemoteServiceBindings.class, forVariable(variable), "sys", "remote_service_bindings");
        addMetadata();
    }

    public QRemoteServiceBindings(String variable, String schema, String table) {
        super(QRemoteServiceBindings.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemoteServiceBindings(Path<? extends QRemoteServiceBindings> path) {
        super(path.getType(), path.getMetadata(), "sys", "remote_service_bindings");
        addMetadata();
    }

    public QRemoteServiceBindings(PathMetadata metadata) {
        super(QRemoteServiceBindings.class, metadata, "sys", "remote_service_bindings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isAnonymousOn, ColumnMetadata.named("is_anonymous_on").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(remotePrincipalId, ColumnMetadata.named("remote_principal_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(remoteServiceBindingId, ColumnMetadata.named("remote_service_binding_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(remoteServiceName, ColumnMetadata.named("remote_service_name").withIndex(4).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(serviceContractId, ColumnMetadata.named("service_contract_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

