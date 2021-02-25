package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnPrivileges is a Querydsl query type for QColumnPrivileges
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnPrivileges extends com.querydsl.sql.RelationalPathBase<QColumnPrivileges> {

    private static final long serialVersionUID = 929467829;

    public static final QColumnPrivileges columnPrivileges = new QColumnPrivileges("COLUMN_PRIVILEGES");

    public final StringPath columnName = createString("columnName");

    public final StringPath grantee = createString("grantee");

    public final StringPath grantor = createString("grantor");

    public final StringPath isGrantable = createString("isGrantable");

    public final StringPath privilegeType = createString("privilegeType");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QColumnPrivileges(String variable) {
        super(QColumnPrivileges.class, forVariable(variable), "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public QColumnPrivileges(String variable, String schema, String table) {
        super(QColumnPrivileges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnPrivileges(Path<? extends QColumnPrivileges> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public QColumnPrivileges(PathMetadata metadata) {
        super(QColumnPrivileges.class, metadata, "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(grantee, ColumnMetadata.named("GRANTEE").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(grantor, ColumnMetadata.named("GRANTOR").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isGrantable, ColumnMetadata.named("IS_GRANTABLE").withIndex(8).ofType(Types.VARCHAR).withSize(3));
        addMetadata(privilegeType, ColumnMetadata.named("PRIVILEGE_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
    }

}

