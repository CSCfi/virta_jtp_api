package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QServerFileAudits is a Querydsl query type for QServerFileAudits
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServerFileAudits extends com.querydsl.sql.RelationalPathBase<QServerFileAudits> {

    private static final long serialVersionUID = -855803372;

    public static final QServerFileAudits serverFileAudits = new QServerFileAudits("server_file_audits");

    public final StringPath auditGuid = createString("auditGuid");

    public final NumberPath<Integer> auditId = createNumber("auditId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final BooleanPath isStateEnabled = createBoolean("isStateEnabled");

    public final StringPath logFileName = createString("logFileName");

    public final StringPath logFilePath = createString("logFilePath");

    public final NumberPath<Integer> maxFiles = createNumber("maxFiles", Integer.class);

    public final NumberPath<Long> maxFileSize = createNumber("maxFileSize", Long.class);

    public final NumberPath<Integer> maxRolloverFiles = createNumber("maxRolloverFiles", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> onFailure = createNumber("onFailure", Byte.class);

    public final StringPath onFailureDesc = createString("onFailureDesc");

    public final StringPath predicate = createString("predicate");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> queueDelay = createNumber("queueDelay", Integer.class);

    public final BooleanPath reserveDiskSpace = createBoolean("reserveDiskSpace");

    public final StringPath type = createString("type");

    public final StringPath typeDesc = createString("typeDesc");

    public QServerFileAudits(String variable) {
        super(QServerFileAudits.class, forVariable(variable), "sys", "server_file_audits");
        addMetadata();
    }

    public QServerFileAudits(String variable, String schema, String table) {
        super(QServerFileAudits.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServerFileAudits(Path<? extends QServerFileAudits> path) {
        super(path.getType(), path.getMetadata(), "sys", "server_file_audits");
        addMetadata();
    }

    public QServerFileAudits(PathMetadata metadata) {
        super(QServerFileAudits.class, metadata, "sys", "server_file_audits");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(auditGuid, ColumnMetadata.named("audit_guid").withIndex(3).ofType(Types.CHAR).withSize(36));
        addMetadata(auditId, ColumnMetadata.named("audit_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(isStateEnabled, ColumnMetadata.named("is_state_enabled").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(logFileName, ColumnMetadata.named("log_file_name").withIndex(19).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(logFilePath, ColumnMetadata.named("log_file_path").withIndex(18).ofType(Types.NVARCHAR).withSize(260));
        addMetadata(maxFiles, ColumnMetadata.named("max_files").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(maxFileSize, ColumnMetadata.named("max_file_size").withIndex(14).ofType(Types.BIGINT).withSize(19));
        addMetadata(maxRolloverFiles, ColumnMetadata.named("max_rollover_files").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(onFailure, ColumnMetadata.named("on_failure").withIndex(9).ofType(Types.TINYINT).withSize(3));
        addMetadata(onFailureDesc, ColumnMetadata.named("on_failure_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(predicate, ColumnMetadata.named("predicate").withIndex(13).ofType(Types.NVARCHAR).withSize(3000));
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(queueDelay, ColumnMetadata.named("queue_delay").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(reserveDiskSpace, ColumnMetadata.named("reserve_disk_space").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(type, ColumnMetadata.named("type").withIndex(7).ofType(Types.CHAR).withSize(2).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(8).ofType(Types.NVARCHAR).withSize(60));
    }

}

