package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAssemblyReferences is a Querydsl query type for QAssemblyReferences
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAssemblyReferences extends com.querydsl.sql.RelationalPathBase<QAssemblyReferences> {

    private static final long serialVersionUID = -1689138261;

    public static final QAssemblyReferences assemblyReferences = new QAssemblyReferences("assembly_references");

    public final NumberPath<Integer> assemblyId = createNumber("assemblyId", Integer.class);

    public final NumberPath<Integer> referencedAssemblyId = createNumber("referencedAssemblyId", Integer.class);

    public QAssemblyReferences(String variable) {
        super(QAssemblyReferences.class, forVariable(variable), "sys", "assembly_references");
        addMetadata();
    }

    public QAssemblyReferences(String variable, String schema, String table) {
        super(QAssemblyReferences.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAssemblyReferences(Path<? extends QAssemblyReferences> path) {
        super(path.getType(), path.getMetadata(), "sys", "assembly_references");
        addMetadata();
    }

    public QAssemblyReferences(PathMetadata metadata) {
        super(QAssemblyReferences.class, metadata, "sys", "assembly_references");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(assemblyId, ColumnMetadata.named("assembly_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(referencedAssemblyId, ColumnMetadata.named("referenced_assembly_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

