package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDatabaseEncryptionKeys is a Querydsl query type for QDmDatabaseEncryptionKeys
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDatabaseEncryptionKeys extends com.querydsl.sql.RelationalPathBase<QDmDatabaseEncryptionKeys> {

    private static final long serialVersionUID = -505765064;

    public static final QDmDatabaseEncryptionKeys dmDatabaseEncryptionKeys = new QDmDatabaseEncryptionKeys("dm_database_encryption_keys");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Integer> encryptionState = createNumber("encryptionState", Integer.class);

    public final SimplePath<byte[]> encryptorThumbprint = createSimple("encryptorThumbprint", byte[].class);

    public final StringPath encryptorType = createString("encryptorType");

    public final StringPath keyAlgorithm = createString("keyAlgorithm");

    public final NumberPath<Integer> keyLength = createNumber("keyLength", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> openedDate = createDateTime("openedDate", java.sql.Timestamp.class);

    public final NumberPath<Float> percentComplete = createNumber("percentComplete", Float.class);

    public final DateTimePath<java.sql.Timestamp> regenerateDate = createDateTime("regenerateDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> setDate = createDateTime("setDate", java.sql.Timestamp.class);

    public QDmDatabaseEncryptionKeys(String variable) {
        super(QDmDatabaseEncryptionKeys.class, forVariable(variable), "sys", "dm_database_encryption_keys");
        addMetadata();
    }

    public QDmDatabaseEncryptionKeys(String variable, String schema, String table) {
        super(QDmDatabaseEncryptionKeys.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDatabaseEncryptionKeys(Path<? extends QDmDatabaseEncryptionKeys> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_database_encryption_keys");
        addMetadata();
    }

    public QDmDatabaseEncryptionKeys(PathMetadata metadata) {
        super(QDmDatabaseEncryptionKeys.class, metadata, "sys", "dm_database_encryption_keys");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(encryptionState, ColumnMetadata.named("encryption_state").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(encryptorThumbprint, ColumnMetadata.named("encryptor_thumbprint").withIndex(10).ofType(Types.VARBINARY).withSize(20));
        addMetadata(encryptorType, ColumnMetadata.named("encryptor_type").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(keyAlgorithm, ColumnMetadata.named("key_algorithm").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(keyLength, ColumnMetadata.named("key_length").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(openedDate, ColumnMetadata.named("opened_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(percentComplete, ColumnMetadata.named("percent_complete").withIndex(12).ofType(Types.REAL).withSize(24));
        addMetadata(regenerateDate, ColumnMetadata.named("regenerate_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(setDate, ColumnMetadata.named("set_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
    }

}

