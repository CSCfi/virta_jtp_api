package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCryptProperties is a Querydsl query type for QCryptProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCryptProperties extends com.querydsl.sql.RelationalPathBase<QCryptProperties> {

    private static final long serialVersionUID = -8465468;

    public static final QCryptProperties cryptProperties = new QCryptProperties("crypt_properties");

    public final NumberPath<Byte> classCol = createNumber("classCol", Byte.class);

    public final StringPath classDesc = createString("classDesc");

    public final SimplePath<byte[]> cryptProperty = createSimple("cryptProperty", byte[].class);

    public final StringPath cryptType = createString("cryptType");

    public final StringPath cryptTypeDesc = createString("cryptTypeDesc");

    public final NumberPath<Integer> majorId = createNumber("majorId", Integer.class);

    public final SimplePath<byte[]> thumbprint = createSimple("thumbprint", byte[].class);

    public QCryptProperties(String variable) {
        super(QCryptProperties.class, forVariable(variable), "sys", "crypt_properties");
        addMetadata();
    }

    public QCryptProperties(String variable, String schema, String table) {
        super(QCryptProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCryptProperties(Path<? extends QCryptProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "crypt_properties");
        addMetadata();
    }

    public QCryptProperties(PathMetadata metadata) {
        super(QCryptProperties.class, metadata, "sys", "crypt_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(2).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(cryptProperty, ColumnMetadata.named("crypt_property").withIndex(7).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(cryptType, ColumnMetadata.named("crypt_type").withIndex(5).ofType(Types.CHAR).withSize(4).notNull());
        addMetadata(cryptTypeDesc, ColumnMetadata.named("crypt_type_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(majorId, ColumnMetadata.named("major_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(thumbprint, ColumnMetadata.named("thumbprint").withIndex(4).ofType(Types.VARBINARY).withSize(32).notNull());
    }

}

