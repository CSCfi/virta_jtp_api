package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmCryptographicProviderProperties is a Querydsl query type for QDmCryptographicProviderProperties
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmCryptographicProviderProperties extends com.querydsl.sql.RelationalPathBase<QDmCryptographicProviderProperties> {

    private static final long serialVersionUID = -669781147;

    public static final QDmCryptographicProviderProperties dmCryptographicProviderProperties = new QDmCryptographicProviderProperties("dm_cryptographic_provider_properties");

    public final NumberPath<Byte> asymmetricKeyExport = createNumber("asymmetricKeyExport", Byte.class);

    public final NumberPath<Byte> asymmetricKeyImport = createNumber("asymmetricKeyImport", Byte.class);

    public final NumberPath<Byte> asymmetricKeyPersistance = createNumber("asymmetricKeyPersistance", Byte.class);

    public final NumberPath<Byte> asymmetricKeySupport = createNumber("asymmetricKeySupport", Byte.class);

    public final StringPath authenticationType = createString("authenticationType");

    public final StringPath friendlyName = createString("friendlyName");

    public final StringPath guid = createString("guid");

    public final NumberPath<Integer> providerId = createNumber("providerId", Integer.class);

    public final StringPath providerVersion = createString("providerVersion");

    public final StringPath sqlcryptVersion = createString("sqlcryptVersion");

    public final NumberPath<Byte> symmetricKeyExport = createNumber("symmetricKeyExport", Byte.class);

    public final NumberPath<Byte> symmetricKeyImport = createNumber("symmetricKeyImport", Byte.class);

    public final NumberPath<Byte> symmetricKeyPersistance = createNumber("symmetricKeyPersistance", Byte.class);

    public final NumberPath<Byte> symmetricKeySupport = createNumber("symmetricKeySupport", Byte.class);

    public QDmCryptographicProviderProperties(String variable) {
        super(QDmCryptographicProviderProperties.class, forVariable(variable), "sys", "dm_cryptographic_provider_properties");
        addMetadata();
    }

    public QDmCryptographicProviderProperties(String variable, String schema, String table) {
        super(QDmCryptographicProviderProperties.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmCryptographicProviderProperties(Path<? extends QDmCryptographicProviderProperties> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_cryptographic_provider_properties");
        addMetadata();
    }

    public QDmCryptographicProviderProperties(PathMetadata metadata) {
        super(QDmCryptographicProviderProperties.class, metadata, "sys", "dm_cryptographic_provider_properties");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(asymmetricKeyExport, ColumnMetadata.named("asymmetric_key_export").withIndex(13).ofType(Types.TINYINT).withSize(3));
        addMetadata(asymmetricKeyImport, ColumnMetadata.named("asymmetric_key_import").withIndex(14).ofType(Types.TINYINT).withSize(3));
        addMetadata(asymmetricKeyPersistance, ColumnMetadata.named("asymmetric_key_persistance").withIndex(12).ofType(Types.TINYINT).withSize(3));
        addMetadata(asymmetricKeySupport, ColumnMetadata.named("asymmetric_key_support").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(authenticationType, ColumnMetadata.named("authentication_type").withIndex(6).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(friendlyName, ColumnMetadata.named("friendly_name").withIndex(5).ofType(Types.NVARCHAR).withSize(1024));
        addMetadata(guid, ColumnMetadata.named("guid").withIndex(2).ofType(Types.CHAR).withSize(36));
        addMetadata(providerId, ColumnMetadata.named("provider_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(providerVersion, ColumnMetadata.named("provider_version").withIndex(3).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sqlcryptVersion, ColumnMetadata.named("sqlcrypt_version").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(symmetricKeyExport, ColumnMetadata.named("symmetric_key_export").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(symmetricKeyImport, ColumnMetadata.named("symmetric_key_import").withIndex(10).ofType(Types.TINYINT).withSize(3));
        addMetadata(symmetricKeyPersistance, ColumnMetadata.named("symmetric_key_persistance").withIndex(8).ofType(Types.TINYINT).withSize(3));
        addMetadata(symmetricKeySupport, ColumnMetadata.named("symmetric_key_support").withIndex(7).ofType(Types.TINYINT).withSize(3));
    }

}

