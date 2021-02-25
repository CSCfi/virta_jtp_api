package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerAssemblyModules is a Querydsl query type for QServerAssemblyModules
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerAssemblyModules extends com.querydsl.sql.RelationalPathBase<QServerAssemblyModules> {

    private static final long serialVersionUID = 928570689;

    public static final QServerAssemblyModules serverAssemblyModules = new QServerAssemblyModules("server_assembly_modules");

    public final StringPath assemblyClass = createString("assemblyClass");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final StringPath assemblyMethod = createString("assemblyMethod");

    public final NumberPath<Integer> executeAsPrincipalId = createNumber("executeAsPrincipalId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QServerAssemblyModules(String variable) {
        super(QServerAssemblyModules.class, forVariable(variable), "sys", "server_assembly_modules");
        addMetadata();
    }

    public QServerAssemblyModules(String variable, String schema, String table) {
        super(QServerAssemblyModules.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerAssemblyModules(Path<? extends QServerAssemblyModules> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_assembly_modules");
        addMetadata();
    }

    public QServerAssemblyModules(PathMetadata metadata) {
        super(QServerAssemblyModules.class, metadata, "sys", "server_assembly_modules");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyClass, ColumnMetadata.named("assembly_class").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(assemblyMethod, ColumnMetadata.named("assembly_method").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(executeAsPrincipalId, ColumnMetadata.named("execute_as_principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

