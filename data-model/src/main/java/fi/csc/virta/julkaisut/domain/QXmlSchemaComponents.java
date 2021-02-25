package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaComponents is a Querydsl query type for QXmlSchemaComponents
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaComponents extends com.querydsl.sql.RelationalPathBase<QXmlSchemaComponents> {

    private static final long serialVersionUID = -403182895;

    public static final QXmlSchemaComponents xmlSchemaComponents = new QXmlSchemaComponents("xml_schema_components");

    public final NumberPath<Integer> baseXmlComponentId = createNumber("baseXmlComponentId", Integer.class);

    public final StringPath derivation = createString("derivation");

    public final StringPath derivationDesc = createString("derivationDesc");

    public final BooleanPath isQualified = createBoolean("isQualified");

    public final StringPath kind = createString("kind");

    public final StringPath kindDesc = createString("kindDesc");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> scopingXmlComponentId = createNumber("scopingXmlComponentId", Integer.class);

    public final StringPath symbolSpace = createString("symbolSpace");

    public final StringPath symbolSpaceDesc = createString("symbolSpaceDesc");

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public final NumberPath<Integer> xmlNamespaceId = createNumber("xmlNamespaceId", Integer.class);

    public QXmlSchemaComponents(String variable) {
        super(QXmlSchemaComponents.class, forVariable(variable), "sys", "xml_schema_components");
        addMetadata();
    }

    public QXmlSchemaComponents(String variable, String schema, String table) {
        super(QXmlSchemaComponents.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaComponents(Path<? extends QXmlSchemaComponents> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_components");
        addMetadata();
    }

    public QXmlSchemaComponents(PathMetadata metadata) {
        super(QXmlSchemaComponents.class, metadata, "sys", "xml_schema_components");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseXmlComponentId, ColumnMetadata.named("base_xml_component_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(derivation, ColumnMetadata.named("derivation").withIndex(10).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(derivationDesc, ColumnMetadata.named("derivation_desc").withIndex(11).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(isQualified, ColumnMetadata.named("is_qualified").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(kind, ColumnMetadata.named("kind").withIndex(8).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(kindDesc, ColumnMetadata.named("kind_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(scopingXmlComponentId, ColumnMetadata.named("scoping_xml_component_id").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(symbolSpace, ColumnMetadata.named("symbol_space").withIndex(6).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(symbolSpaceDesc, ColumnMetadata.named("symbol_space_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlComponentId, ColumnMetadata.named("xml_component_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlNamespaceId, ColumnMetadata.named("xml_namespace_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

