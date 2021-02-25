package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabasePermissions is a Querydsl query type for QDatabasePermissions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabasePermissions extends com.querydsl.sql.RelationalPathBase<QDatabasePermissions> {

    private static final long serialVersionUID = -1577417460;

    public static final QDatabasePermissions databasePermissions = new QDatabasePermissions("database_permissions");

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

    public QDatabasePermissions(String variable) {
        super(QDatabasePermissions.class, forVariable(variable), "sys", "database_permissions");
        addMetadata();
    }

    public QDatabasePermissions(String variable, String schema, String table) {
        super(QDatabasePermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabasePermissions(Path<? extends QDatabasePermissions> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_permissions");
        addMetadata();
    }

    public QDatabasePermissions(PathMetadata metadata) {
        super(QDatabasePermissions.class, metadata, "sys", "database_permissions");
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

