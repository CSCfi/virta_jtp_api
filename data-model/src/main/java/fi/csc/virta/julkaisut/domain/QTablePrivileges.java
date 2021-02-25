package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTablePrivileges is a Querydsl query type for QTablePrivileges
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTablePrivileges extends com.querydsl.sql.RelationalPathBase<QTablePrivileges> {

    private static final long serialVersionUID = -2047202093;

    public static final QTablePrivileges tablePrivileges = new QTablePrivileges("TABLE_PRIVILEGES");

    public final StringPath grantee = createString("grantee");

    public final StringPath grantor = createString("grantor");

    public final StringPath isGrantable = createString("isGrantable");

    public final StringPath privilegeType = createString("privilegeType");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QTablePrivileges(String variable) {
        super(QTablePrivileges.class, forVariable(variable), "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public QTablePrivileges(String variable, String schema, String table) {
        super(QTablePrivileges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTablePrivileges(Path<? extends QTablePrivileges> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public QTablePrivileges(PathMetadata metadata) {
        super(QTablePrivileges.class, metadata, "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(grantee, ColumnMetadata.named("GRANTEE").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(grantor, ColumnMetadata.named("GRANTOR").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isGrantable, ColumnMetadata.named("IS_GRANTABLE").withIndex(7).ofType(Types.VARCHAR).withSize(3));
        addMetadata(privilegeType, ColumnMetadata.named("PRIVILEGE_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
    }

}

