package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QKeyEncryptions is a Querydsl query type for QKeyEncryptions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QKeyEncryptions extends com.querydsl.sql.RelationalPathBase<QKeyEncryptions> {

    private static final long serialVersionUID = -576254322;

    public static final QKeyEncryptions keyEncryptions = new QKeyEncryptions("key_encryptions");

    public final SimplePath<byte[]> cryptProperty = createSimple("cryptProperty", byte[].class);

    public final StringPath cryptType = createString("cryptType");

    public final StringPath cryptTypeDesc = createString("cryptTypeDesc");

    public final NumberPath<Integer> keyId = createNumber("keyId", Integer.class);

    public final SimplePath<byte[]> thumbprint = createSimple("thumbprint", byte[].class);

    public QKeyEncryptions(String variable) {
        super(QKeyEncryptions.class, forVariable(variable), "sys", "key_encryptions");
        addMetadata();
    }

    public QKeyEncryptions(String variable, String schema, String table) {
        super(QKeyEncryptions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QKeyEncryptions(Path<? extends QKeyEncryptions> path) {
        super(path.getType(), path.getMetadata(), "sys", "key_encryptions");
        addMetadata();
    }

    public QKeyEncryptions(PathMetadata metadata) {
        super(QKeyEncryptions.class, metadata, "sys", "key_encryptions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cryptProperty, ColumnMetadata.named("crypt_property").withIndex(5).ofType(Types.VARBINARY).withSize(2147483647));
        addMetadata(cryptType, ColumnMetadata.named("crypt_type").withIndex(3).ofType(Types.CHAR).withSize(4).notNull());
        addMetadata(cryptTypeDesc, ColumnMetadata.named("crypt_type_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(keyId, ColumnMetadata.named("key_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(thumbprint, ColumnMetadata.named("thumbprint").withIndex(2).ofType(Types.VARBINARY).withSize(32));
    }

}

