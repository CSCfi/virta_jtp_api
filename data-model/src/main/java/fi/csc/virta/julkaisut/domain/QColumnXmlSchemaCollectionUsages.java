package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumnXmlSchemaCollectionUsages is a Querydsl query type for QColumnXmlSchemaCollectionUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnXmlSchemaCollectionUsages extends com.querydsl.sql.RelationalPathBase<QColumnXmlSchemaCollectionUsages> {

    private static final long serialVersionUID = 1362939317;

    public static final QColumnXmlSchemaCollectionUsages columnXmlSchemaCollectionUsages = new QColumnXmlSchemaCollectionUsages("column_xml_schema_collection_usages");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QColumnXmlSchemaCollectionUsages(String variable) {
        super(QColumnXmlSchemaCollectionUsages.class, forVariable(variable), "sys", "column_xml_schema_collection_usages");
        addMetadata();
    }

    public QColumnXmlSchemaCollectionUsages(String variable, String schema, String table) {
        super(QColumnXmlSchemaCollectionUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnXmlSchemaCollectionUsages(Path<? extends QColumnXmlSchemaCollectionUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "column_xml_schema_collection_usages");
        addMetadata();
    }

    public QColumnXmlSchemaCollectionUsages(PathMetadata metadata) {
        super(QColumnXmlSchemaCollectionUsages.class, metadata, "sys", "column_xml_schema_collection_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

