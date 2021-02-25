package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAssemblyTypes is a Querydsl query type for QAssemblyTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAssemblyTypes extends com.querydsl.sql.RelationalPathBase<QAssemblyTypes> {

    private static final long serialVersionUID = 1574489462;

    public static final QAssemblyTypes assemblyTypes = new QAssemblyTypes("assembly_types");

    public final StringPath assemblyClass = createString("assemblyClass");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final StringPath assemblyQualifiedName = createString("assemblyQualifiedName");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Integer> defaultObjectId = createNumber("defaultObjectId", Integer.class);

    public final BooleanPath isAssemblyType = createBoolean("isAssemblyType");

    public final BooleanPath isBinaryOrdered = createBoolean("isBinaryOrdered");

    public final BooleanPath isFixedLength = createBoolean("isFixedLength");

    public final BooleanPath isNullable = createBoolean("isNullable");

    public final BooleanPath isTableType = createBoolean("isTableType");

    public final BooleanPath isUserDefined = createBoolean("isUserDefined");

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath progId = createString("progId");

    public final NumberPath<Integer> ruleObjectId = createNumber("ruleObjectId", Integer.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QAssemblyTypes(String variable) {
        super(QAssemblyTypes.class, forVariable(variable), "sys", "assembly_types");
        addMetadata();
    }

    public QAssemblyTypes(String variable, String schema, String table) {
        super(QAssemblyTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAssemblyTypes(Path<? extends QAssemblyTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "assembly_types");
        addMetadata();
    }

    public QAssemblyTypes(PathMetadata metadata) {
        super(QAssemblyTypes.class, metadata, "sys", "assembly_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyClass, ColumnMetadata.named("assembly_class").withIndex(16).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(assemblyQualifiedName, ColumnMetadata.named("assembly_qualified_name").withIndex(20).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultObjectId, ColumnMetadata.named("default_object_id").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(isAssemblyType, ColumnMetadata.named("is_assembly_type").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isBinaryOrdered, ColumnMetadata.named("is_binary_ordered").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(isFixedLength, ColumnMetadata.named("is_fixed_length").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(isNullable, ColumnMetadata.named("is_nullable").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isTableType, ColumnMetadata.named("is_table_type").withIndex(21).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isUserDefined, ColumnMetadata.named("is_user_defined").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(progId, ColumnMetadata.named("prog_id").withIndex(19).ofType(Types.NVARCHAR).withSize(40));
        addMetadata(ruleObjectId, ColumnMetadata.named("rule_object_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

