package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSequences is a Querydsl query type for QSequences
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSequences extends com.querydsl.sql.RelationalPathBase<QSequences> {

    private static final long serialVersionUID = 723942805;

    public static final QSequences sequences = new QSequences("sequences");

    public final NumberPath<Integer> cacheSize = createNumber("cacheSize", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final SimplePath<Object> currentValue = createSimple("currentValue", Object.class);

    public final SimplePath<Object> increment = createSimple("increment", Object.class);

    public final BooleanPath isCached = createBoolean("isCached");

    public final BooleanPath isCycling = createBoolean("isCycling");

    public final BooleanPath isExhausted = createBoolean("isExhausted");

    public final BooleanPath isMsShipped = createBoolean("isMsShipped");

    public final BooleanPath isPublished = createBoolean("isPublished");

    public final BooleanPath isSchemaPublished = createBoolean("isSchemaPublished");

    public final SimplePath<Object> maximumValue = createSimple("maximumValue", Object.class);

    public final SimplePath<Object> minimumValue = createSimple("minimumValue", Object.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> parentObjectId = createNumber("parentObjectId", Integer.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Integer> schemaId = createNumber("schemaId", Integer.class);

    public final SimplePath<Object> startValue = createSimple("startValue", Object.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public QSequences(String variable) {
        super(QSequences.class, forVariable(variable), "sys", "sequences");
        addMetadata();
    }

    public QSequences(String variable, String schema, String table) {
        super(QSequences.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSequences(Path<? extends QSequences> path) {
        super(path.getType(), path.getMetadata(), "sys", "sequences");
        addMetadata();
    }

    public QSequences(PathMetadata metadata) {
        super(QSequences.class, metadata, "sys", "sequences");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cacheSize, ColumnMetadata.named("cache_size").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(currentValue, ColumnMetadata.named("current_value").withIndex(24).ofType(-150).withSize(2147483647).notNull());
        addMetadata(increment, ColumnMetadata.named("increment").withIndex(14).ofType(-150).withSize(2147483647).notNull());
        addMetadata(isCached, ColumnMetadata.named("is_cached").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(isCycling, ColumnMetadata.named("is_cycling").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(isExhausted, ColumnMetadata.named("is_exhausted").withIndex(25).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMsShipped, ColumnMetadata.named("is_ms_shipped").withIndex(10).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isPublished, ColumnMetadata.named("is_published").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSchemaPublished, ColumnMetadata.named("is_schema_published").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maximumValue, ColumnMetadata.named("maximum_value").withIndex(16).ofType(-150).withSize(2147483647).notNull());
        addMetadata(minimumValue, ColumnMetadata.named("minimum_value").withIndex(15).ofType(-150).withSize(2147483647).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(parentObjectId, ColumnMetadata.named("parent_object_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(22).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(23).ofType(Types.TINYINT).withSize(3));
        addMetadata(schemaId, ColumnMetadata.named("schema_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startValue, ColumnMetadata.named("start_value").withIndex(13).ofType(-150).withSize(2147483647).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(20).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(6).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(7).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

