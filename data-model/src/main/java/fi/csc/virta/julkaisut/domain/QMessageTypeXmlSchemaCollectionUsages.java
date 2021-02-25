package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMessageTypeXmlSchemaCollectionUsages is a Querydsl query type for QMessageTypeXmlSchemaCollectionUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMessageTypeXmlSchemaCollectionUsages extends com.querydsl.sql.RelationalPathBase<QMessageTypeXmlSchemaCollectionUsages> {

    private static final long serialVersionUID = 2059732068;

    public static final QMessageTypeXmlSchemaCollectionUsages messageTypeXmlSchemaCollectionUsages = new QMessageTypeXmlSchemaCollectionUsages("message_type_xml_schema_collection_usages");

    public final NumberPath<Integer> messageTypeId = createNumber("messageTypeId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QMessageTypeXmlSchemaCollectionUsages(String variable) {
        super(QMessageTypeXmlSchemaCollectionUsages.class, forVariable(variable), "sys", "message_type_xml_schema_collection_usages");
        addMetadata();
    }

    public QMessageTypeXmlSchemaCollectionUsages(String variable, String schema, String table) {
        super(QMessageTypeXmlSchemaCollectionUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMessageTypeXmlSchemaCollectionUsages(Path<? extends QMessageTypeXmlSchemaCollectionUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "message_type_xml_schema_collection_usages");
        addMetadata();
    }

    public QMessageTypeXmlSchemaCollectionUsages(PathMetadata metadata) {
        super(QMessageTypeXmlSchemaCollectionUsages.class, metadata, "sys", "message_type_xml_schema_collection_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(messageTypeId, ColumnMetadata.named("message_type_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

