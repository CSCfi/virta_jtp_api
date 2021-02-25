package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaTypes is a Querydsl query type for QXmlSchemaTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaTypes extends com.querydsl.sql.RelationalPathBase<QXmlSchemaTypes> {

    private static final long serialVersionUID = 337561566;

    public static final QXmlSchemaTypes xmlSchemaTypes = new QXmlSchemaTypes("xml_schema_types");

    public final BooleanPath allowsMixedContent = createBoolean("allowsMixedContent");

    public final NumberPath<Integer> baseXmlComponentId = createNumber("baseXmlComponentId", Integer.class);

    public final StringPath derivation = createString("derivation");

    public final StringPath derivationDesc = createString("derivationDesc");

    public final BooleanPath isAbstract = createBoolean("isAbstract");

    public final BooleanPath isExtensionBlocked = createBoolean("isExtensionBlocked");

    public final BooleanPath isFinalExtension = createBoolean("isFinalExtension");

    public final BooleanPath isFinalListMember = createBoolean("isFinalListMember");

    public final BooleanPath isFinalRestriction = createBoolean("isFinalRestriction");

    public final BooleanPath isFinalUnionMember = createBoolean("isFinalUnionMember");

    public final BooleanPath isQualified = createBoolean("isQualified");

    public final BooleanPath isRestrictionBlocked = createBoolean("isRestrictionBlocked");

    public final StringPath kind = createString("kind");

    public final StringPath kindDesc = createString("kindDesc");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> scopingXmlComponentId = createNumber("scopingXmlComponentId", Integer.class);

    public final StringPath symbolSpace = createString("symbolSpace");

    public final StringPath symbolSpaceDesc = createString("symbolSpaceDesc");

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public final NumberPath<Integer> xmlNamespaceId = createNumber("xmlNamespaceId", Integer.class);

    public QXmlSchemaTypes(String variable) {
        super(QXmlSchemaTypes.class, forVariable(variable), "sys", "xml_schema_types");
        addMetadata();
    }

    public QXmlSchemaTypes(String variable, String schema, String table) {
        super(QXmlSchemaTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaTypes(Path<? extends QXmlSchemaTypes> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_types");
        addMetadata();
    }

    public QXmlSchemaTypes(PathMetadata metadata) {
        super(QXmlSchemaTypes.class, metadata, "sys", "xml_schema_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowsMixedContent, ColumnMetadata.named("allows_mixed_content").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(baseXmlComponentId, ColumnMetadata.named("base_xml_component_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(derivation, ColumnMetadata.named("derivation").withIndex(10).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(derivationDesc, ColumnMetadata.named("derivation_desc").withIndex(11).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(isAbstract, ColumnMetadata.named("is_abstract").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isExtensionBlocked, ColumnMetadata.named("is_extension_blocked").withIndex(16).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFinalExtension, ColumnMetadata.named("is_final_extension").withIndex(18).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFinalListMember, ColumnMetadata.named("is_final_list_member").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFinalRestriction, ColumnMetadata.named("is_final_restriction").withIndex(19).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isFinalUnionMember, ColumnMetadata.named("is_final_union_member").withIndex(21).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isQualified, ColumnMetadata.named("is_qualified").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isRestrictionBlocked, ColumnMetadata.named("is_restriction_blocked").withIndex(17).ofType(Types.BIT).withSize(1).notNull());
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

