package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSymmetricKeys is a Querydsl query type for QSymmetricKeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSymmetricKeys extends com.querydsl.sql.RelationalPathBase<QSymmetricKeys> {

    private static final long serialVersionUID = 1152406798;

    public static final QSymmetricKeys symmetricKeys = new QSymmetricKeys("symmetric_keys");

    public final StringPath algorithmDesc = createString("algorithmDesc");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final SimplePath<Object> cryptographicProviderAlgid = createSimple("cryptographicProviderAlgid", Object.class);

    public final StringPath cryptographicProviderGuid = createString("cryptographicProviderGuid");

    public final StringPath keyAlgorithm = createString("keyAlgorithm");

    public final StringPath keyGuid = createString("keyGuid");

    public final NumberPath<Integer> keyLength = createNumber("keyLength", Integer.class);

    public final SimplePath<Object> keyThumbprint = createSimple("keyThumbprint", Object.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath providerType = createString("providerType");

    public final NumberPath<Integer> symmetricKeyId = createNumber("symmetricKeyId", Integer.class);

    public QSymmetricKeys(String variable) {
        super(QSymmetricKeys.class, forVariable(variable), "sys", "symmetric_keys");
        addMetadata();
    }

    public QSymmetricKeys(String variable, String schema, String table) {
        super(QSymmetricKeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSymmetricKeys(Path<? extends QSymmetricKeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "symmetric_keys");
        addMetadata();
    }

    public QSymmetricKeys(PathMetadata metadata) {
        super(QSymmetricKeys.class, metadata, "sys", "symmetric_keys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(algorithmDesc, ColumnMetadata.named("algorithm_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(cryptographicProviderAlgid, ColumnMetadata.named("cryptographic_provider_algid").withIndex(13).ofType(-150).withSize(2147483647));
        addMetadata(cryptographicProviderGuid, ColumnMetadata.named("cryptographic_provider_guid").withIndex(12).ofType(Types.CHAR).withSize(36));
        addMetadata(keyAlgorithm, ColumnMetadata.named("key_algorithm").withIndex(5).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(keyGuid, ColumnMetadata.named("key_guid").withIndex(9).ofType(Types.CHAR).withSize(36));
        addMetadata(keyLength, ColumnMetadata.named("key_length").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(keyThumbprint, ColumnMetadata.named("key_thumbprint").withIndex(10).ofType(-150).withSize(2147483647));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(providerType, ColumnMetadata.named("provider_type").withIndex(11).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(symmetricKeyId, ColumnMetadata.named("symmetric_key_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

