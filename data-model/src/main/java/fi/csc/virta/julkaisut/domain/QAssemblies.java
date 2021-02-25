package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAssemblies is a Querydsl query type for QAssemblies
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAssemblies extends com.querydsl.sql.RelationalPathBase<QAssemblies> {

    private static final long serialVersionUID = -1231173471;

    public static final QAssemblies assemblies = new QAssemblies("assemblies");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final StringPath clrName = createString("clrName");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final BooleanPath isUserDefined = createBoolean("isUserDefined");

    public final BooleanPath isVisible = createBoolean("isVisible");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> permissionSet = createNumber("permissionSet", Byte.class);

    public final StringPath permissionSetDesc = createString("permissionSetDesc");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public QAssemblies(String variable) {
        super(QAssemblies.class, forVariable(variable), "sys", "assemblies");
        addMetadata();
    }

    public QAssemblies(String variable, String schema, String table) {
        super(QAssemblies.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAssemblies(Path<? extends QAssemblies> path) {
        super(path.getType(), path.getMetadata(), "sys", "assemblies");
        addMetadata();
    }

    public QAssemblies(PathMetadata metadata) {
        super(QAssemblies.class, metadata, "sys", "assemblies");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(clrName, ColumnMetadata.named("clr_name").withIndex(4).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(isUserDefined, ColumnMetadata.named("is_user_defined").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isVisible, ColumnMetadata.named("is_visible").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(permissionSet, ColumnMetadata.named("permission_set").withIndex(5).ofType(Types.TINYINT).withSize(3));
        addMetadata(permissionSetDesc, ColumnMetadata.named("permission_set_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
    }

}

