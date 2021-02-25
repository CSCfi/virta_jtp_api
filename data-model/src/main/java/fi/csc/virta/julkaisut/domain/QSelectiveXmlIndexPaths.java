package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSelectiveXmlIndexPaths is a Querydsl query type for QSelectiveXmlIndexPaths
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSelectiveXmlIndexPaths extends com.querydsl.sql.RelationalPathBase<QSelectiveXmlIndexPaths> {

    private static final long serialVersionUID = -72416812;

    public static final QSelectiveXmlIndexPaths selectiveXmlIndexPaths = new QSelectiveXmlIndexPaths("selective_xml_index_paths");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final BooleanPath isNode = createBoolean("isNode");

    public final BooleanPath isSingleton = createBoolean("isSingleton");

    public final BooleanPath isXqueryMaxLengthInferred = createBoolean("isXqueryMaxLengthInferred");

    public final BooleanPath isXqueryTypeInferred = createBoolean("isXqueryTypeInferred");

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final StringPath path = createString("path");

    public final NumberPath<Integer> pathId = createNumber("pathId", Integer.class);

    public final NumberPath<Byte> pathType = createNumber("pathType", Byte.class);

    public final StringPath pathTypeDesc = createString("pathTypeDesc");

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Byte> userTypeId = createNumber("userTypeId", Byte.class);

    public final NumberPath<Integer> xmlComponentId = createNumber("xmlComponentId", Integer.class);

    public final NumberPath<Integer> xqueryMaxLength = createNumber("xqueryMaxLength", Integer.class);

    public final StringPath xqueryTypeDescription = createString("xqueryTypeDescription");

    public QSelectiveXmlIndexPaths(String variable) {
        super(QSelectiveXmlIndexPaths.class, forVariable(variable), "sys", "selective_xml_index_paths");
        addMetadata();
    }

    public QSelectiveXmlIndexPaths(String variable, String schema, String table) {
        super(QSelectiveXmlIndexPaths.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSelectiveXmlIndexPaths(Path<? extends QSelectiveXmlIndexPaths> path) {
        super(path.getType(), path.getMetadata(), "sys", "selective_xml_index_paths");
        addMetadata();
    }

    public QSelectiveXmlIndexPaths(PathMetadata metadata) {
        super(QSelectiveXmlIndexPaths.class, metadata, "sys", "selective_xml_index_paths");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(19).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isNode, ColumnMetadata.named("is_node").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isSingleton, ColumnMetadata.named("is_singleton").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(isXqueryMaxLengthInferred, ColumnMetadata.named("is_xquery_max_length_inferred").withIndex(12).ofType(Types.BIT).withSize(1));
        addMetadata(isXqueryTypeInferred, ColumnMetadata.named("is_xquery_type_inferred").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(path, ColumnMetadata.named("path").withIndex(4).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(pathId, ColumnMetadata.named("path_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(pathType, ColumnMetadata.named("path_type").withIndex(6).ofType(Types.TINYINT).withSize(3));
        addMetadata(pathTypeDesc, ColumnMetadata.named("path_type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(17).ofType(Types.TINYINT).withSize(3));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(18).ofType(Types.TINYINT).withSize(3));
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(15).ofType(Types.TINYINT).withSize(3));
        addMetadata(xmlComponentId, ColumnMetadata.named("xml_component_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(xqueryMaxLength, ColumnMetadata.named("xquery_max_length").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(xqueryTypeDescription, ColumnMetadata.named("xquery_type_description").withIndex(9).ofType(Types.NVARCHAR).withSize(4000));
    }

}

