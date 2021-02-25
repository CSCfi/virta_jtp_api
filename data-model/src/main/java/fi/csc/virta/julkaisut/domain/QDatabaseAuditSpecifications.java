package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseAuditSpecifications is a Querydsl query type for QDatabaseAuditSpecifications
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseAuditSpecifications extends com.querydsl.sql.RelationalPathBase<QDatabaseAuditSpecifications> {

    private static final long serialVersionUID = 11367699;

    public static final QDatabaseAuditSpecifications databaseAuditSpecifications = new QDatabaseAuditSpecifications("database_audit_specifications");

    public final StringPath auditGuid = createString("auditGuid");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> databaseSpecificationId = createNumber("databaseSpecificationId", Integer.class);

    public final BooleanPath isStateEnabled = createBoolean("isStateEnabled");

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public QDatabaseAuditSpecifications(String variable) {
        super(QDatabaseAuditSpecifications.class, forVariable(variable), "sys", "database_audit_specifications");
        addMetadata();
    }

    public QDatabaseAuditSpecifications(String variable, String schema, String table) {
        super(QDatabaseAuditSpecifications.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseAuditSpecifications(Path<? extends QDatabaseAuditSpecifications> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_audit_specifications");
        addMetadata();
    }

    public QDatabaseAuditSpecifications(PathMetadata metadata) {
        super(QDatabaseAuditSpecifications.class, metadata, "sys", "database_audit_specifications");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(auditGuid, ColumnMetadata.named("audit_guid").withIndex(5).ofType(Types.CHAR).withSize(36));
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(databaseSpecificationId, ColumnMetadata.named("database_specification_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isStateEnabled, ColumnMetadata.named("is_state_enabled").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

