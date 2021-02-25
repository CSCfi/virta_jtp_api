package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QExtendedProperties is a Querydsl query type for QExtendedProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExtendedProperties extends com.querydsl.sql.RelationalPathBase<QExtendedProperties> {

    private static final long serialVersionUID = -352120343;

    public static final QExtendedProperties extendedProperties = new QExtendedProperties("extended_properties");

    public final NumberPath<Byte> classCol = createNumber("classCol", Byte.class);

    public final StringPath classDesc = createString("classDesc");

    public final NumberPath<Integer> majorId = createNumber("majorId", Integer.class);

    public final NumberPath<Integer> minorId = createNumber("minorId", Integer.class);

    public final StringPath name = createString("name");

    public final SimplePath<Object> value = createSimple("value", Object.class);

    public QExtendedProperties(String variable) {
        super(QExtendedProperties.class, forVariable(variable), "sys", "extended_properties");
        addMetadata();
    }

    public QExtendedProperties(String variable, String schema, String table) {
        super(QExtendedProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExtendedProperties(Path<? extends QExtendedProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "extended_properties");
        addMetadata();
    }

    public QExtendedProperties(PathMetadata metadata) {
        super(QExtendedProperties.class, metadata, "sys", "extended_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(majorId, ColumnMetadata.named("major_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minorId, ColumnMetadata.named("minor_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(5).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(value, ColumnMetadata.named("value").withIndex(6).ofType(-150).withSize(2147483647));
    }

}

