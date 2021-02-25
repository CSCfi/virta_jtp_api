package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QModuleAssemblyUsages is a Querydsl query type for QModuleAssemblyUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QModuleAssemblyUsages extends com.querydsl.sql.RelationalPathBase<QModuleAssemblyUsages> {

    private static final long serialVersionUID = 1438653793;

    public static final QModuleAssemblyUsages moduleAssemblyUsages = new QModuleAssemblyUsages("module_assembly_usages");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QModuleAssemblyUsages(String variable) {
        super(QModuleAssemblyUsages.class, forVariable(variable), "sys", "module_assembly_usages");
        addMetadata();
    }

    public QModuleAssemblyUsages(String variable, String schema, String table) {
        super(QModuleAssemblyUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QModuleAssemblyUsages(Path<? extends QModuleAssemblyUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "module_assembly_usages");
        addMetadata();
    }

    public QModuleAssemblyUsages(PathMetadata metadata) {
        super(QModuleAssemblyUsages.class, metadata, "sys", "module_assembly_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

