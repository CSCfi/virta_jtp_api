package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaComponentPlacements is a Querydsl query type for QXmlSchemaComponentPlacements
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaComponentPlacements extends com.querydsl.sql.RelationalPathBase<QXmlSchemaComponentPlacements> {

    private static final long serialVersionUID = 1509754288;

    public static final QXmlSchemaComponentPlacements xmlSchemaComponentPlacements = new QXmlSchemaComponentPlacements("xml_schema_component_placements");

    public final StringPath defaultValue = createString("defaultValue");

    public final BooleanPath isDefaultFixed = createBoolean("isDefaultFixed");

    public final NumberPath<Integer> maxOccurences = createNumber("maxOccurences", Integer.class);

    public final NumberPath<Integer> minOccurences = createNumber("minOccurences", Integer.class);

    public final NumberPath<Integer> placedXmlComponentId = createNumber("placedXmlComponentId", Integer.class);

    public final NumberPath<Integer> placementId = createNumber("placementId", Integer.class);

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public QXmlSchemaComponentPlacements(String variable) {
        super(QXmlSchemaComponentPlacements.class, forVariable(variable), "sys", "xml_schema_component_placements");
        addMetadata();
    }

    public QXmlSchemaComponentPlacements(String variable, String schema, String table) {
        super(QXmlSchemaComponentPlacements.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaComponentPlacements(Path<? extends QXmlSchemaComponentPlacements> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_component_placements");
        addMetadata();
    }

    public QXmlSchemaComponentPlacements(PathMetadata metadata) {
        super(QXmlSchemaComponentPlacements.class, metadata, "sys", "xml_schema_component_placements");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultValue, ColumnMetadata.named("default_value").withIndex(7).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(isDefaultFixed, ColumnMetadata.named("is_default_fixed").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxOccurences, ColumnMetadata.named("max_occurences").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minOccurences, ColumnMetadata.named("min_occurences").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(placedXmlComponentId, ColumnMetadata.named("placed_xml_component_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(placementId, ColumnMetadata.named("placement_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlComponentId, ColumnMetadata.named("xml_component_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

