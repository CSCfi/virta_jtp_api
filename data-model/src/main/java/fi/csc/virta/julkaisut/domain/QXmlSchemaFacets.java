package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaFacets is a Querydsl query type for QXmlSchemaFacets
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaFacets extends com.querydsl.sql.RelationalPathBase<QXmlSchemaFacets> {

    private static final long serialVersionUID = 1451114199;

    public static final QXmlSchemaFacets xmlSchemaFacets = new QXmlSchemaFacets("xml_schema_facets");

    public final NumberPath<Integer> facetId = createNumber("facetId", Integer.class);

    public final BooleanPath isFixed = createBoolean("isFixed");

    public final StringPath kind = createString("kind");

    public final StringPath kindDesc = createString("kindDesc");

    public final StringPath value = createString("value");

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public QXmlSchemaFacets(String variable) {
        super(QXmlSchemaFacets.class, forVariable(variable), "sys", "xml_schema_facets");
        addMetadata();
    }

    public QXmlSchemaFacets(String variable, String schema, String table) {
        super(QXmlSchemaFacets.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaFacets(Path<? extends QXmlSchemaFacets> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_facets");
        addMetadata();
    }

    public QXmlSchemaFacets(PathMetadata metadata) {
        super(QXmlSchemaFacets.class, metadata, "sys", "xml_schema_facets");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(facetId, ColumnMetadata.named("facet_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isFixed, ColumnMetadata.named("is_fixed").withIndex(5).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(kind, ColumnMetadata.named("kind").withIndex(3).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(kindDesc, ColumnMetadata.named("kind_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(value, ColumnMetadata.named("value").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(xmlComponentId, ColumnMetadata.named("xml_component_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

