package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmServerAuditStatus is a Querydsl query type for QDmServerAuditStatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmServerAuditStatus extends com.querydsl.sql.RelationalPathBase<QDmServerAuditStatus> {

    private static final long serialVersionUID = 1446511588;

    public static final QDmServerAuditStatus dmServerAuditStatus = new QDmServerAuditStatus("dm_server_audit_status");

    public final StringPath auditFilePath = createString("auditFilePath");

    public final NumberPath<Long> auditFileSize = createNumber("auditFileSize", Long.class);

    public final NumberPath<Integer> auditId = createNumber("auditId", Integer.class);

    public final SimplePath<byte[]> eventSessionAddress = createSimple("eventSessionAddress", byte[].class);

    public final StringPath name = createString("name");

    public final NumberPath<Short> status = createNumber("status", Short.class);

    public final StringPath statusDesc = createString("statusDesc");

    public final DateTimePath<java.sql.Timestamp> statusTime = createDateTime("statusTime", java.sql.Timestamp.class);

    public QDmServerAuditStatus(String variable) {
        super(QDmServerAuditStatus.class, forVariable(variable), "sys", "dm_server_audit_status");
        addMetadata();
    }

    public QDmServerAuditStatus(String variable, String schema, String table) {
        super(QDmServerAuditStatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmServerAuditStatus(Path<? extends QDmServerAuditStatus> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_server_audit_status");
        addMetadata();
    }

    public QDmServerAuditStatus(PathMetadata metadata) {
        super(QDmServerAuditStatus.class, metadata, "sys", "dm_server_audit_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(auditFilePath, ColumnMetadata.named("audit_file_path").withIndex(7).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(auditFileSize, ColumnMetadata.named("audit_file_size").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(auditId, ColumnMetadata.named("audit_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(eventSessionAddress, ColumnMetadata.named("event_session_address").withIndex(6).ofType(Types.VARBINARY).withSize(8));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(statusDesc, ColumnMetadata.named("status_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(256).notNull());
        addMetadata(statusTime, ColumnMetadata.named("status_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(27).withDigits(7).notNull());
    }

}

