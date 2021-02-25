package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAssemblyModules is a Querydsl query type for QAssemblyModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAssemblyModules extends com.querydsl.sql.RelationalPathBase<QAssemblyModules> {

    private static final long serialVersionUID = -958574268;

    public static final QAssemblyModules assemblyModules = new QAssemblyModules("assembly_modules");

    public final StringPath assemblyClass = createString("assemblyClass");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final StringPath assemblyMethod = createString("assemblyMethod");

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final BooleanPath nullOnNullInput = createBoolean("nullOnNullInput");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QAssemblyModules(String variable) {
        super(QAssemblyModules.class, forVariable(variable), "sys", "assembly_modules");
        addMetadata();
    }

    public QAssemblyModules(String variable, String schema, String table) {
        super(QAssemblyModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAssemblyModules(Path<? extends QAssemblyModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "assembly_modules");
        addMetadata();
    }

    public QAssemblyModules(PathMetadata metadata) {
        super(QAssemblyModules.class, metadata, "sys", "assembly_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyClass, ColumnMetadata.named("assembly_class").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(assemblyMethod, ColumnMetadata.named("assembly_method").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(nullOnNullInput, ColumnMetadata.named("null_on_null_input").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

