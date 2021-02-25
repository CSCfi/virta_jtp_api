package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerPrincipalCredentials is a Querydsl query type for QServerPrincipalCredentials
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerPrincipalCredentials extends com.querydsl.sql.RelationalPathBase<QServerPrincipalCredentials> {

    private static final long serialVersionUID = 421197678;

    public static final QServerPrincipalCredentials serverPrincipalCredentials = new QServerPrincipalCredentials("server_principal_credentials");

    public final NumberPath<Integer> credentialId = createNumber("credentialId", Integer.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public QServerPrincipalCredentials(String variable) {
        super(QServerPrincipalCredentials.class, forVariable(variable), "sys", "server_principal_credentials");
        addMetadata();
    }

    public QServerPrincipalCredentials(String variable, String schema, String table) {
        super(QServerPrincipalCredentials.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerPrincipalCredentials(Path<? extends QServerPrincipalCredentials> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_principal_credentials");
        addMetadata();
    }

    public QServerPrincipalCredentials(PathMetadata metadata) {
        super(QServerPrincipalCredentials.class, metadata, "sys", "server_principal_credentials");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credentialId, ColumnMetadata.named("credential_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

