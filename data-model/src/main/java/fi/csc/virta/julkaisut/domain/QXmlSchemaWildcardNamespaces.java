package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlSchemaWildcardNamespaces is a Querydsl query type for QXmlSchemaWildcardNamespaces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlSchemaWildcardNamespaces extends com.querydsl.sql.RelationalPathBase<QXmlSchemaWildcardNamespaces> {

    private static final long serialVersionUID = 242867373;

    public static final QXmlSchemaWildcardNamespaces xmlSchemaWildcardNamespaces = new QXmlSchemaWildcardNamespaces("xml_schema_wildcard_namespaces");

    public final StringPath namespace = createString("namespace");

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public QXmlSchemaWildcardNamespaces(String variable) {
        super(QXmlSchemaWildcardNamespaces.class, forVariable(variable), "sys", "xml_schema_wildcard_namespaces");
        addMetadata();
    }

    public QXmlSchemaWildcardNamespaces(String variable, String schema, String table) {
        super(QXmlSchemaWildcardNamespaces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlSchemaWildcardNamespaces(Path<? extends QXmlSchemaWildcardNamespaces> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_schema_wildcard_namespaces");
        addMetadata();
    }

    public QXmlSchemaWildcardNamespaces(PathMetadata metadata) {
        super(QXmlSchemaWildcardNamespaces.class, metadata, "sys", "xml_schema_wildcard_namespaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(namespace, ColumnMetadata.named("namespace").withIndex(2).ofType(Types.NVARCHAR).withSize(4000).notNull());
        addMetadata(xmlComponentId, ColumnMetadata.named("xml_component_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

