package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseRoleMembers is a Querydsl query type for QDatabaseRoleMembers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseRoleMembers extends com.querydsl.sql.RelationalPathBase<QDatabaseRoleMembers> {

    private static final long serialVersionUID = -1131143093;

    public static final QDatabaseRoleMembers databaseRoleMembers = new QDatabaseRoleMembers("database_role_members");

    public final NumberPath<Integer> memberPrincipalId = createNumber("memberPrincipalId", Integer.class);

    public final NumberPath<Integer> rolePrincipalId = createNumber("rolePrincipalId", Integer.class);

    public QDatabaseRoleMembers(String variable) {
        super(QDatabaseRoleMembers.class, forVariable(variable), "sys", "database_role_members");
        addMetadata();
    }

    public QDatabaseRoleMembers(String variable, String schema, String table) {
        super(QDatabaseRoleMembers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseRoleMembers(Path<? extends QDatabaseRoleMembers> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_role_members");
        addMetadata();
    }

    public QDatabaseRoleMembers(PathMetadata metadata) {
        super(QDatabaseRoleMembers.class, metadata, "sys", "database_role_members");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(memberPrincipalId, ColumnMetadata.named("member_principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rolePrincipalId, ColumnMetadata.named("role_principal_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

