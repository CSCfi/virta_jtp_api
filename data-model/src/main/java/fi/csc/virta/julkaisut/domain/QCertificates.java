package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCertificates is a Querydsl query type for QCertificates
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCertificates extends com.querydsl.sql.RelationalPathBase<QCertificates> {

    private static final long serialVersionUID = 1535646233;

    public static final QCertificates certificates = new QCertificates("certificates");

    public final StringPath attestedBy = createString("attestedBy");

    public final NumberPath<Integer> certificateId = createNumber("certificateId", Integer.class);

    public final StringPath certSerialNumber = createString("certSerialNumber");

    public final DateTimePath<java.sql.Timestamp> expiryDate = createDateTime("expiryDate", java.sql.Timestamp.class);

    public final BooleanPath isActiveForBeginDialog = createBoolean("isActiveForBeginDialog");

    public final StringPath issuerName = createString("issuerName");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final StringPath pvtKeyEncryptionType = createString("pvtKeyEncryptionType");

    public final StringPath pvtKeyEncryptionTypeDesc = createString("pvtKeyEncryptionTypeDesc");

    public final DateTimePath<java.sql.Timestamp> pvtKeyLastBackupDate = createDateTime("pvtKeyLastBackupDate", java.sql.Timestamp.class);

    public final SimplePath<byte[]> sid = createSimple("sid", byte[].class);

    public final DateTimePath<java.sql.Timestamp> startDate = createDateTime("startDate", java.sql.Timestamp.class);

    public final StringPath stringSid = createString("stringSid");

    public final StringPath subject = createString("subject");

    public final SimplePath<byte[]> thumbprint = createSimple("thumbprint", byte[].class);

    public QCertificates(String variable) {
        super(QCertificates.class, forVariable(variable), "sys", "certificates");
        addMetadata();
    }

    public QCertificates(String variable, String schema, String table) {
        super(QCertificates.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCertificates(Path<? extends QCertificates> path) {
        super(path.getType(), path.getMetadata(), "sys", "certificates");
        addMetadata();
    }

    public QCertificates(PathMetadata metadata) {
        super(QCertificates.class, metadata, "sys", "certificates");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attestedBy, ColumnMetadata.named("attested_by").withIndex(15).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(certificateId, ColumnMetadata.named("certificate_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(certSerialNumber, ColumnMetadata.named("cert_serial_number").withIndex(8).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(expiryDate, ColumnMetadata.named("expiry_date").withIndex(12).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(isActiveForBeginDialog, ColumnMetadata.named("is_active_for_begin_dialog").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(issuerName, ColumnMetadata.named("issuer_name").withIndex(7).ofType(Types.NVARCHAR).withSize(442));
        addMetadata(name, ColumnMetadata.named("name").withIndex(1).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(pvtKeyEncryptionType, ColumnMetadata.named("pvt_key_encryption_type").withIndex(4).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(pvtKeyEncryptionTypeDesc, ColumnMetadata.named("pvt_key_encryption_type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(pvtKeyLastBackupDate, ColumnMetadata.named("pvt_key_last_backup_date").withIndex(16).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(sid, ColumnMetadata.named("sid").withIndex(9).ofType(Types.VARBINARY).withSize(85));
        addMetadata(startDate, ColumnMetadata.named("start_date").withIndex(13).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(stringSid, ColumnMetadata.named("string_sid").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(subject, ColumnMetadata.named("subject").withIndex(11).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(thumbprint, ColumnMetadata.named("thumbprint").withIndex(14).ofType(Types.VARBINARY).withSize(32).notNull());
    }

}

