package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmIoBackupTapes is a Querydsl query type for QDmIoBackupTapes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmIoBackupTapes extends com.querydsl.sql.RelationalPathBase<QDmIoBackupTapes> {

    private static final long serialVersionUID = 503710307;

    public static final QDmIoBackupTapes dmIoBackupTapes = new QDmIoBackupTapes("dm_io_backup_tapes");

    public final NumberPath<Integer> command = createNumber("command", Integer.class);

    public final StringPath commandDesc = createString("commandDesc");

    public final StringPath databaseName = createString("databaseName");

    public final StringPath logicalDeviceName = createString("logicalDeviceName");

    public final NumberPath<Integer> mediaFamilyId = createNumber("mediaFamilyId", Integer.class);

    public final NumberPath<Integer> mediaSequenceNumber = createNumber("mediaSequenceNumber", Integer.class);

    public final StringPath mediaSetGuid = createString("mediaSetGuid");

    public final StringPath mediaSetName = createString("mediaSetName");

    public final DateTimePath<java.sql.Timestamp> mountExpirationTime = createDateTime("mountExpirationTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> mountRequestTime = createDateTime("mountRequestTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> mountRequestType = createNumber("mountRequestType", Integer.class);

    public final StringPath mountRequestTypeDesc = createString("mountRequestTypeDesc");

    public final StringPath physicalDeviceName = createString("physicalDeviceName");

    public final NumberPath<Integer> spid = createNumber("spid", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDesc = createString("statusDesc");

    public final NumberPath<Integer> tapeOperation = createNumber("tapeOperation", Integer.class);

    public final StringPath tapeOperationDesc = createString("tapeOperationDesc");

    public QDmIoBackupTapes(String variable) {
        super(QDmIoBackupTapes.class, forVariable(variable), "sys", "dm_io_backup_tapes");
        addMetadata();
    }

    public QDmIoBackupTapes(String variable, String schema, String table) {
        super(QDmIoBackupTapes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmIoBackupTapes(Path<? extends QDmIoBackupTapes> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_io_backup_tapes");
        addMetadata();
    }

    public QDmIoBackupTapes(PathMetadata metadata) {
        super(QDmIoBackupTapes.class, metadata, "sys", "dm_io_backup_tapes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(command, ColumnMetadata.named("command").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(commandDesc, ColumnMetadata.named("command_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(databaseName, ColumnMetadata.named("database_name").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(logicalDeviceName, ColumnMetadata.named("logical_device_name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(mediaFamilyId, ColumnMetadata.named("media_family_id").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(mediaSequenceNumber, ColumnMetadata.named("media_sequence_number").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(mediaSetGuid, ColumnMetadata.named("media_set_guid").withIndex(13).ofType(Types.CHAR).withSize(36));
        addMetadata(mediaSetName, ColumnMetadata.named("media_set_name").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(mountExpirationTime, ColumnMetadata.named("mount_expiration_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(mountRequestTime, ColumnMetadata.named("mount_request_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(mountRequestType, ColumnMetadata.named("mount_request_type").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(mountRequestTypeDesc, ColumnMetadata.named("mount_request_type_desc").withIndex(18).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(physicalDeviceName, ColumnMetadata.named("physical_device_name").withIndex(1).ofType(Types.NVARCHAR).withSize(260).notNull());
        addMetadata(spid, ColumnMetadata.named("spid").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(status, ColumnMetadata.named("status").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statusDesc, ColumnMetadata.named("status_desc").withIndex(4).ofType(Types.NVARCHAR).withSize(260).notNull());
        addMetadata(tapeOperation, ColumnMetadata.named("tape_operation").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(tapeOperationDesc, ColumnMetadata.named("tape_operation_desc").withIndex(16).ofType(Types.NVARCHAR).withSize(60));
    }

}

