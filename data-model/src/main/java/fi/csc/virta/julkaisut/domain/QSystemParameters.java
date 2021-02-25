package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSystemParameters is a Querydsl query type for QSystemParameters
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSystemParameters extends com.querydsl.sql.RelationalPathBase<QSystemParameters> {

    private static final long serialVersionUID = -1121578154;

    public static final QSystemParameters systemParameters = new QSystemParameters("system_parameters");

    public final SimplePath<Object> defaultValue = createSimple("defaultValue", Object.class);

    public final BooleanPath hasDefaultValue = createBoolean("hasDefaultValue");

    public final BooleanPath isCursorRef = createBoolean("isCursorRef");

    public final BooleanPath isOutput = createBoolean("isOutput");

    public final BooleanPath isReadonly = createBoolean("isReadonly");

    public final BooleanPath isXmlDocument = createBoolean("isXmlDocument");

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parameterId = createNumber("parameterId", Integer.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QSystemParameters(String variable) {
        super(QSystemParameters.class, forVariable(variable), "sys", "system_parameters");
        addMetadata();
    }

    public QSystemParameters(String variable, String schema, String table) {
        super(QSystemParameters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSystemParameters(Path<? extends QSystemParameters> path) {
        super(path.getType(), path.getMetadata(), "sys", "system_parameters");
        addMetadata();
    }

    public QSystemParameters(PathMetadata metadata) {
        super(QSystemParameters.class, metadata, "sys", "system_parameters");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(defaultValue, ColumnMetadata.named("default_value").withIndex(13).ofType(-150).withSize(2147483647));
        addMetadata(hasDefaultValue, ColumnMetadata.named("has_default_value").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isCursorRef, ColumnMetadata.named("is_cursor_ref").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isOutput, ColumnMetadata.named("is_output").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isReadonly, ColumnMetadata.named("is_readonly").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isXmlDocument, ColumnMetadata.named("is_xml_document").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parameterId, ColumnMetadata.named("parameter_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
    }

}

