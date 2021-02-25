package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerPermissions is a Querydsl query type for QServerPermissions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerPermissions extends com.querydsl.sql.RelationalPathBase<QServerPermissions> {

    private static final long serialVersionUID = -863903996;

    public static final QServerPermissions serverPermissions = new QServerPermissions("server_permissions");

    public final NumberPath<Byte> classCol = createNumber("classCol", Byte.class);

    public final StringPath classDesc = createString("classDesc");

    public final NumberPath<Integer> granteePrincipalId = createNumber("granteePrincipalId", Integer.class);

    public final NumberPath<Integer> grantorPrincipalId = createNumber("grantorPrincipalId", Integer.class);

    public final NumberPath<Integer> majorId = createNumber("majorId", Integer.class);

    public final NumberPath<Integer> minorId = createNumber("minorId", Integer.class);

    public final StringPath permissionName = createString("permissionName");

    public final StringPath state = createString("state");

    public final StringPath stateDesc = createString("stateDesc");

    public final StringPath type = createString("type");

    public QServerPermissions(String variable) {
        super(QServerPermissions.class, forVariable(variable), "sys", "server_permissions");
        addMetadata();
    }

    public QServerPermissions(String variable, String schema, String table) {
        super(QServerPermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerPermissions(Path<? extends QServerPermissions> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_permissions");
        addMetadata();
    }

    public QServerPermissions(PathMetadata metadata) {
        super(QServerPermissions.class, metadata, "sys", "server_permissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(granteePrincipalId, ColumnMetadata.named("grantee_principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(grantorPrincipalId, ColumnMetadata.named("grantor_principal_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(majorId, ColumnMetadata.named("major_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minorId, ColumnMetadata.named("minor_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(permissionName, ColumnMetadata.named("permission_name").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(state, ColumnMetadata.named("state").withIndex(9).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(7).ofType(Types.CHAR).withSize(4).notNull());
    }

}

