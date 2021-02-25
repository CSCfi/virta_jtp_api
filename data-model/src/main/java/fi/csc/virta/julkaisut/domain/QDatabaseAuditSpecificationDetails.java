package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDatabaseAuditSpecificationDetails is a Querydsl query type for QDatabaseAuditSpecificationDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDatabaseAuditSpecificationDetails extends com.querydsl.sql.RelationalPathBase<QDatabaseAuditSpecificationDetails> {

    private static final long serialVersionUID = 767362754;

    public static final QDatabaseAuditSpecificationDetails databaseAuditSpecificationDetails = new QDatabaseAuditSpecificationDetails("database_audit_specification_details");

    public final StringPath auditActionId = createString("auditActionId");

    public final StringPath auditActionName = createString("auditActionName");

    public final NumberPath<Integer> auditedPrincipalId = createNumber("auditedPrincipalId", Integer.class);

    public final StringPath auditedResult = createString("auditedResult");

    public final NumberPath<Byte> classCol = createNumber("classCol", Byte.class);

    public final StringPath classDesc = createString("classDesc");

    public final NumberPath<Integer> databaseSpecificationId = createNumber("databaseSpecificationId", Integer.class);

    public final BooleanPath isGroup = createBoolean("isGroup");

    public final NumberPath<Integer> majorId = createNumber("majorId", Integer.class);

    public final NumberPath<Integer> minorId = createNumber("minorId", Integer.class);

    public QDatabaseAuditSpecificationDetails(String variable) {
        super(QDatabaseAuditSpecificationDetails.class, forVariable(variable), "sys", "database_audit_specification_details");
        addMetadata();
    }

    public QDatabaseAuditSpecificationDetails(String variable, String schema, String table) {
        super(QDatabaseAuditSpecificationDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDatabaseAuditSpecificationDetails(Path<? extends QDatabaseAuditSpecificationDetails> path) {
        super(path.getType(), path.getMetadata(), "sys", "database_audit_specification_details");
        addMetadata();
    }

    public QDatabaseAuditSpecificationDetails(PathMetadata metadata) {
        super(QDatabaseAuditSpecificationDetails.class, metadata, "sys", "database_audit_specification_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(auditActionId, ColumnMetadata.named("audit_action_id").withIndex(2).ofType(Types.CHAR).withSize(4).notNull());
        addMetadata(auditActionName, ColumnMetadata.named("audit_action_name").withIndex(3).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(auditedPrincipalId, ColumnMetadata.named("audited_principal_id").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(auditedResult, ColumnMetadata.named("audited_result").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(classCol, ColumnMetadata.named("class").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(classDesc, ColumnMetadata.named("class_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(databaseSpecificationId, ColumnMetadata.named("database_specification_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isGroup, ColumnMetadata.named("is_group").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(majorId, ColumnMetadata.named("major_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(minorId, ColumnMetadata.named("minor_id").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

