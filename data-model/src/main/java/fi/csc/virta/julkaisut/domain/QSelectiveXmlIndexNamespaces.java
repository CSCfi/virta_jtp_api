package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSelectiveXmlIndexNamespaces is a Querydsl query type for QSelectiveXmlIndexNamespaces
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSelectiveXmlIndexNamespaces extends com.querydsl.sql.RelationalPathBase<QSelectiveXmlIndexNamespaces> {

    private static final long serialVersionUID = -1070131886;

    public static final QSelectiveXmlIndexNamespaces selectiveXmlIndexNamespaces = new QSelectiveXmlIndexNamespaces("selective_xml_index_namespaces");

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final BooleanPath isDefaultUri = createBoolean("isDefaultUri");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final StringPath prefix = createString("prefix");

    public final StringPath uri = createString("uri");

    public QSelectiveXmlIndexNamespaces(String variable) {
        super(QSelectiveXmlIndexNamespaces.class, forVariable(variable), "sys", "selective_xml_index_namespaces");
        addMetadata();
    }

    public QSelectiveXmlIndexNamespaces(String variable, String schema, String table) {
        super(QSelectiveXmlIndexNamespaces.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSelectiveXmlIndexNamespaces(Path<? extends QSelectiveXmlIndexNamespaces> path) {
        super(path.getType(), path.getMetadata(), "sys", "selective_xml_index_namespaces");
        addMetadata();
    }

    public QSelectiveXmlIndexNamespaces(PathMetadata metadata) {
        super(QSelectiveXmlIndexNamespaces.class, metadata, "sys", "selective_xml_index_namespaces");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDefaultUri, ColumnMetadata.named("is_default_uri").withIndex(3).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(prefix, ColumnMetadata.named("prefix").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(uri, ColumnMetadata.named("uri").withIndex(4).ofType(Types.NVARCHAR).withSize(4000));
    }

}

