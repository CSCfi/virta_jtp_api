package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSchemata is a Querydsl query type for QSchemata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSchemata extends com.querydsl.sql.RelationalPathBase<QSchemata> {

    private static final long serialVersionUID = -2023866709;

    public static final QSchemata schemata = new QSchemata("SCHEMATA");

    public final StringPath catalogName = createString("catalogName");

    public final StringPath defaultCharacterSetCatalog = createString("defaultCharacterSetCatalog");

    public final StringPath defaultCharacterSetName = createString("defaultCharacterSetName");

    public final StringPath defaultCharacterSetSchema = createString("defaultCharacterSetSchema");

    public final StringPath schemaName = createString("schemaName");

    public final StringPath schemaOwner = createString("schemaOwner");

    public QSchemata(String variable) {
        super(QSchemata.class, forVariable(variable), "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public QSchemata(String variable, String schema, String table) {
        super(QSchemata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemata(Path<? extends QSchemata> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public QSchemata(PathMetadata metadata) {
        super(QSchemata.class, metadata, "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalogName, ColumnMetadata.named("CATALOG_NAME").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultCharacterSetCatalog, ColumnMetadata.named("DEFAULT_CHARACTER_SET_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultCharacterSetName, ColumnMetadata.named("DEFAULT_CHARACTER_SET_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(defaultCharacterSetSchema, ColumnMetadata.named("DEFAULT_CHARACTER_SET_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(schemaName, ColumnMetadata.named("SCHEMA_NAME").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(schemaOwner, ColumnMetadata.named("SCHEMA_OWNER").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
    }

}

