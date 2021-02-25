package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaNamespaces is a Querydsl query type for QXmlSchemaNamespaces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaNamespaces extends com.querydsl.sql.RelationalPathBase<QXmlSchemaNamespaces> {

    private static final long serialVersionUID = 208322099;

    public static final QXmlSchemaNamespaces xmlSchemaNamespaces = new QXmlSchemaNamespaces("xml_schema_namespaces");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public final NumberPath<Integer> xmlNamespaceId = createNumber("xmlNamespaceId", Integer.class);

    public QXmlSchemaNamespaces(String variable) {
        super(QXmlSchemaNamespaces.class, forVariable(variable), "sys", "xml_schema_namespaces");
        addMetadata();
    }

    public QXmlSchemaNamespaces(String variable, String schema, String table) {
        super(QXmlSchemaNamespaces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaNamespaces(Path<? extends QXmlSchemaNamespaces> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_namespaces");
        addMetadata();
    }

    public QXmlSchemaNamespaces(PathMetadata metadata) {
        super(QXmlSchemaNamespaces.class, metadata, "sys", "xml_schema_namespaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlNamespaceId, ColumnMetadata.named("xml_namespace_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

