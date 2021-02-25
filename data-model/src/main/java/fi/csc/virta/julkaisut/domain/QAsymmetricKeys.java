package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAsymmetricKeys is a Querydsl query type for QAsymmetricKeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAsymmetricKeys extends com.querydsl.sql.RelationalPathBase<QAsymmetricKeys> {

    private static final long serialVersionUID = -559260633;

    public static final QAsymmetricKeys asymmetricKeys = new QAsymmetricKeys("asymmetric_keys");

    public final StringPath algorithm = createString("algorithm");

    public final StringPath algorithmDesc = createString("algorithmDesc");

    public final NumberPath<Integer> asymmetricKeyId = createNumber("asymmetricKeyId", Integer.class);

    public final StringPath attestedBy = createString("attestedBy");

    public final SimplePath<Object> cryptographicProviderAlgid = createSimple("cryptographicProviderAlgid", Object.class);

    public final StringPath cryptographicProviderGuid = createString("cryptographicProviderGuid");

    public final NumberPath<Integer> keyLength = createNumber("keyLength", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath providerType = createString("providerType");

    public final SimplePath<byte[]> publicKey = createSimple("publicKey", byte[].class);

    public final StringPath pvtKeyEncryptionType = createString("pvtKeyEncryptionType");

    public final StringPath pvtKeyEncryptionTypeDesc = createString("pvtKeyEncryptionTypeDesc");

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final StringPath stringSid = createString("stringSid");

    public final SimplePath<byte[]> thumbprint = createSimple("thumbprint", byte[].class);

    public QAsymmetricKeys(String variable) {
        super(QAsymmetricKeys.class, forVariable(variable), "sys", "asymmetric_keys");
        addMetadata();
    }

    public QAsymmetricKeys(String variable, String schema, String table) {
        super(QAsymmetricKeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAsymmetricKeys(Path<? extends QAsymmetricKeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "asymmetric_keys");
        addMetadata();
    }

    public QAsymmetricKeys(PathMetadata metadata) {
        super(QAsymmetricKeys.class, metadata, "sys", "asymmetric_keys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(algorithm, ColumnMetadata.named("algorithm").withIndex(7).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(algorithmDesc, ColumnMetadata.named("algorithm_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(asymmetricKeyId, ColumnMetadata.named("asymmetric_key_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(attestedBy, ColumnMetadata.named("attested_by").withIndex(13).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(cryptographicProviderAlgid, ColumnMetadata.named("cryptographic_provider_algid").withIndex(16).ofType(-150).withSize(2147483647));
        addMetadata(cryptographicProviderGuid, ColumnMetadata.named("cryptographic_provider_guid").withIndex(15).ofType(Types.CHAR).withSize(36));
        addMetadata(keyLength, ColumnMetadata.named("key_length").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(providerType, ColumnMetadata.named("provider_type").withIndex(14).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(publicKey, ColumnMetadata.named("public_key").withIndex(12).ofType(Types.VARBINARY).withSize(2147483647).notNull());
        addMetadata(pvtKeyEncryptionType, ColumnMetadata.named("pvt_key_encryption_type").withIndex(4).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(pvtKeyEncryptionTypeDesc, ColumnMetadata.named("pvt_key_encryption_type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(10).ofType(Types.VARBINARY).withSize(85));
        addMetadata(stringSid, ColumnMetadata.named("string_sid").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(thumbprint, ColumnMetadata.named("thumbprint").withIndex(6).ofType(Types.VARBINARY).withSize(32).notNull());
    }

}

