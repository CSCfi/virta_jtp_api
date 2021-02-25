package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFilestreamNonTransactedHandles is a Querydsl query type for QDmFilestreamNonTransactedHandles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFilestreamNonTransactedHandles extends com.querydsl.sql.RelationalPathBase<QDmFilestreamNonTransactedHandles> {

    private static final long serialVersionUID = -159834729;

    public static final QDmFilestreamNonTransactedHandles dmFilestreamNonTransactedHandles = new QDmFilestreamNonTransactedHandles("dm_filestream_non_transacted_handles");

    public final SimplePath<byte[]> correlationProcessId = createSimple("correlationProcessId", byte[].class);

    public final SimplePath<byte[]> correlationThreadId = createSimple("correlationThreadId", byte[].class);

    public final NumberPath<Integer> createDisposition = createNumber("createDisposition", Integer.class);

    public final NumberPath<Integer> currentWorkitemType = createNumber("currentWorkitemType", Integer.class);

    public final StringPath currentWorkitemTypeDesc = createString("currentWorkitemTypeDesc");

    public final StringPath databaseDirectoryName = createString("databaseDirectoryName");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final BooleanPath deleteAccess = createBoolean("deleteAccess");

    public final NumberPath<Long> fcbId = createNumber("fcbId", Long.class);

    public final SimplePath<byte[]> fileContext = createSimple("fileContext", byte[].class);

    public final NumberPath<Integer> fileObjectType = createNumber("fileObjectType", Integer.class);

    public final StringPath fileObjectTypeDesc = createString("fileObjectTypeDesc");

    public final NumberPath<Integer> flags = createNumber("flags", Integer.class);

    public final NumberPath<Integer> handleId = createNumber("handleId", Integer.class);

    public final BooleanPath isDirectory = createBoolean("isDirectory");

    public final SimplePath<byte[]> itemId = createSimple("itemId", byte[].class);

    public final StringPath itemName = createString("itemName");

    public final NumberPath<Integer> loginId = createNumber("loginId", Integer.class);

    public final StringPath loginName = createString("loginName");

    public final SimplePath<byte[]> loginSid = createSimple("loginSid", byte[].class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final StringPath openedFileName = createString("openedFileName");

    public final DateTimePath<java.sql.Timestamp> openTime = createDateTime("openTime", java.sql.Timestamp.class);

    public final BooleanPath readAccess = createBoolean("readAccess");

    public final StringPath remainingFileName = createString("remainingFileName");

    public final BooleanPath shareDelete = createBoolean("shareDelete");

    public final BooleanPath shareRead = createBoolean("shareRead");

    public final BooleanPath shareWrite = createBoolean("shareWrite");

    public final NumberPath<Integer> state = createNumber("state", Integer.class);

    public final StringPath stateDesc = createString("stateDesc");

    public final StringPath tableDirectoryName = createString("tableDirectoryName");

    public final BooleanPath writeAccess = createBoolean("writeAccess");

    public QDmFilestreamNonTransactedHandles(String variable) {
        super(QDmFilestreamNonTransactedHandles.class, forVariable(variable), "sys", "dm_filestream_non_transacted_handles");
        addMetadata();
    }

    public QDmFilestreamNonTransactedHandles(String variable, String schema, String table) {
        super(QDmFilestreamNonTransactedHandles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFilestreamNonTransactedHandles(Path<? extends QDmFilestreamNonTransactedHandles> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_filestream_non_transacted_handles");
        addMetadata();
    }

    public QDmFilestreamNonTransactedHandles(PathMetadata metadata) {
        super(QDmFilestreamNonTransactedHandles.class, metadata, "sys", "dm_filestream_non_transacted_handles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(correlationProcessId, ColumnMetadata.named("correlation_process_id").withIndex(6).ofType(Types.VARBINARY).withSize(8));
        addMetadata(correlationThreadId, ColumnMetadata.named("correlation_thread_id").withIndex(7).ofType(Types.VARBINARY).withSize(8));
        addMetadata(createDisposition, ColumnMetadata.named("create_disposition").withIndex(32).ofType(Types.INTEGER).withSize(10));
        addMetadata(currentWorkitemType, ColumnMetadata.named("current_workitem_type").withIndex(11).ofType(Types.INTEGER).withSize(10));
        addMetadata(currentWorkitemTypeDesc, ColumnMetadata.named("current_workitem_type_desc").withIndex(12).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(databaseDirectoryName, ColumnMetadata.named("database_directory_name").withIndex(18).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(deleteAccess, ColumnMetadata.named("delete_access").withIndex(28).ofType(Types.BIT).withSize(1));
        addMetadata(fcbId, ColumnMetadata.named("fcb_id").withIndex(13).ofType(Types.BIGINT).withSize(19));
        addMetadata(fileContext, ColumnMetadata.named("file_context").withIndex(8).ofType(Types.VARBINARY).withSize(8));
        addMetadata(fileObjectType, ColumnMetadata.named("file_object_type").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(fileObjectTypeDesc, ColumnMetadata.named("file_object_type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(flags, ColumnMetadata.named("flags").withIndex(22).ofType(Types.INTEGER).withSize(10));
        addMetadata(handleId, ColumnMetadata.named("handle_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(isDirectory, ColumnMetadata.named("is_directory").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(itemId, ColumnMetadata.named("item_id").withIndex(14).ofType(Types.VARBINARY).withSize(892));
        addMetadata(itemName, ColumnMetadata.named("item_name").withIndex(16).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(loginId, ColumnMetadata.named("login_id").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(loginName, ColumnMetadata.named("login_name").withIndex(24).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(loginSid, ColumnMetadata.named("login_sid").withIndex(25).ofType(Types.VARBINARY).withSize(85));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(openedFileName, ColumnMetadata.named("opened_file_name").withIndex(17).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(openTime, ColumnMetadata.named("open_time").withIndex(21).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(readAccess, ColumnMetadata.named("read_access").withIndex(26).ofType(Types.BIT).withSize(1));
        addMetadata(remainingFileName, ColumnMetadata.named("remaining_file_name").withIndex(20).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(shareDelete, ColumnMetadata.named("share_delete").withIndex(31).ofType(Types.BIT).withSize(1));
        addMetadata(shareRead, ColumnMetadata.named("share_read").withIndex(29).ofType(Types.BIT).withSize(1));
        addMetadata(shareWrite, ColumnMetadata.named("share_write").withIndex(30).ofType(Types.BIT).withSize(1));
        addMetadata(state, ColumnMetadata.named("state").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(stateDesc, ColumnMetadata.named("state_desc").withIndex(10).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(tableDirectoryName, ColumnMetadata.named("table_directory_name").withIndex(19).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(writeAccess, ColumnMetadata.named("write_access").withIndex(27).ofType(Types.BIT).withSize(1));
    }

}

