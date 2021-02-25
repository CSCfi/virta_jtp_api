package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QParameterXmlSchemaCollectionUsages is a Querydsl query type for QParameterXmlSchemaCollectionUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QParameterXmlSchemaCollectionUsages extends com.querydsl.sql.RelationalPathBase<QParameterXmlSchemaCollectionUsages> {

    private static final long serialVersionUID = -321258276;

    public static final QParameterXmlSchemaCollectionUsages parameterXmlSchemaCollectionUsages = new QParameterXmlSchemaCollectionUsages("parameter_xml_schema_collection_usages");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QParameterXmlSchemaCollectionUsages(String variable) {
        super(QParameterXmlSchemaCollectionUsages.class, forVariable(variable), "sys", "parameter_xml_schema_collection_usages");
        addMetadata();
    }

    public QParameterXmlSchemaCollectionUsages(String variable, String schema, String table) {
        super(QParameterXmlSchemaCollectionUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QParameterXmlSchemaCollectionUsages(Path<? extends QParameterXmlSchemaCollectionUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "parameter_xml_schema_collection_usages");
        addMetadata();
    }

    public QParameterXmlSchemaCollectionUsages(PathMetadata metadata) {
        super(QParameterXmlSchemaCollectionUsages.class, metadata, "sys", "parameter_xml_schema_collection_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

