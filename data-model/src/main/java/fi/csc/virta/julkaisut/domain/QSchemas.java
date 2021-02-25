package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSchemas is a Querydsl query type for QSchemas
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSchemas extends com.querydsl.sql.RelationalPathBase<QSchemas> {

    private static final long serialVersionUID = -65286027;

    public static final QSchemas schemas = new QSchemas("schemas");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public QSchemas(String variable) {
        super(QSchemas.class, forVariable(variable), "sys", "schemas");
        addMetadata();
    }

    public QSchemas(String variable, String schema, String table) {
        super(QSchemas.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemas(Path<? extends QSchemas> path) {
        super(path.getType(), path.getMetadata(), "sys", "schemas");
        addMetadata();
    }

    public QSchemas(PathMetadata metadata) {
        super(QSchemas.class, metadata, "sys", "schemas");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

