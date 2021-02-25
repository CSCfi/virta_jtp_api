package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMasterKeyPasswords is a Querydsl query type for QMasterKeyPasswords
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMasterKeyPasswords extends com.querydsl.sql.RelationalPathBase<QMasterKeyPasswords> {

    private static final long serialVersionUID = -1861779528;

    public static final QMasterKeyPasswords masterKeyPasswords = new QMasterKeyPasswords("master_key_passwords");

    public final NumberPath<Integer> credentialId = createNumber("credentialId", Integer.class);

    public final StringPath familyGuid = createString("familyGuid");

    public QMasterKeyPasswords(String variable) {
        super(QMasterKeyPasswords.class, forVariable(variable), "sys", "master_key_passwords");
        addMetadata();
    }

    public QMasterKeyPasswords(String variable, String schema, String table) {
        super(QMasterKeyPasswords.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMasterKeyPasswords(Path<? extends QMasterKeyPasswords> path) {
        super(path.getType(), path.getMetadata(), "sys", "master_key_passwords");
        addMetadata();
    }

    public QMasterKeyPasswords(PathMetadata metadata) {
        super(QMasterKeyPasswords.class, metadata, "sys", "master_key_passwords");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(credentialId, ColumnMetadata.named("credential_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(familyGuid, ColumnMetadata.named("family_guid").withIndex(2).ofType(Types.CHAR).withSize(36));
    }

}

