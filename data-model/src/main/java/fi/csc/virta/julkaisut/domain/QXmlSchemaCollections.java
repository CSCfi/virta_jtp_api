package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaCollections is a Querydsl query type for QXmlSchemaCollections
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaCollections extends com.querydsl.sql.RelationalPathBase<QXmlSchemaCollections> {

    private static final long serialVersionUID = -1068911302;

    public static final QXmlSchemaCollections xmlSchemaCollections = new QXmlSchemaCollections("xml_schema_collections");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QXmlSchemaCollections(String variable) {
        super(QXmlSchemaCollections.class, forVariable(variable), "sys", "xml_schema_collections");
        addMetadata();
    }

    public QXmlSchemaCollections(String variable, String schema, String table) {
        super(QXmlSchemaCollections.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaCollections(Path<? extends QXmlSchemaCollections> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_collections");
        addMetadata();
    }

    public QXmlSchemaCollections(PathMetadata metadata) {
        super(QXmlSchemaCollections.class, metadata, "sys", "xml_schema_collections");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

