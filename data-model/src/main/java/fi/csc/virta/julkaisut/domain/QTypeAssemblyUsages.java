package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTypeAssemblyUsages is a Querydsl query type for QTypeAssemblyUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTypeAssemblyUsages extends com.querydsl.sql.RelationalPathBase<QTypeAssemblyUsages> {

    private static final long serialVersionUID = 1903540463;

    public static final QTypeAssemblyUsages typeAssemblyUsages = new QTypeAssemblyUsages("type_assembly_usages");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QTypeAssemblyUsages(String variable) {
        super(QTypeAssemblyUsages.class, forVariable(variable), "sys", "type_assembly_usages");
        addMetadata();
    }

    public QTypeAssemblyUsages(String variable, String schema, String table) {
        super(QTypeAssemblyUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTypeAssemblyUsages(Path<? extends QTypeAssemblyUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "type_assembly_usages");
        addMetadata();
    }

    public QTypeAssemblyUsages(PathMetadata metadata) {
        super(QTypeAssemblyUsages.class, metadata, "sys", "type_assembly_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

