package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerRoleMembers is a Querydsl query type for QServerRoleMembers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerRoleMembers extends com.querydsl.sql.RelationalPathBase<QServerRoleMembers> {

    private static final long serialVersionUID = -417629629;

    public static final QServerRoleMembers serverRoleMembers = new QServerRoleMembers("server_role_members");

    public final NumberPath<Integer> memberPrincipalId = createNumber("memberPrincipalId", Integer.class);

    public final NumberPath<Integer> rolePrincipalId = createNumber("rolePrincipalId", Integer.class);

    public QServerRoleMembers(String variable) {
        super(QServerRoleMembers.class, forVariable(variable), "sys", "server_role_members");
        addMetadata();
    }

    public QServerRoleMembers(String variable, String schema, String table) {
        super(QServerRoleMembers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerRoleMembers(Path<? extends QServerRoleMembers> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_role_members");
        addMetadata();
    }

    public QServerRoleMembers(PathMetadata metadata) {
        super(QServerRoleMembers.class, metadata, "sys", "server_role_members");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(memberPrincipalId, ColumnMetadata.named("member_principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rolePrincipalId, ColumnMetadata.named("role_principal_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

