package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFilestreamFileIoHandles is a Querydsl query type for QDmFilestreamFileIoHandles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFilestreamFileIoHandles extends com.querydsl.sql.RelationalPathBase<QDmFilestreamFileIoHandles> {

    private static final long serialVersionUID = 1207839367;

    public static final QDmFilestreamFileIoHandles dmFilestreamFileIoHandles = new QDmFilestreamFileIoHandles("dm_filestream_file_io_handles");

    public final StringPath accessType = createString("accessType");

    public final SimplePath<byte[]> creationClientProcessId = createSimple("creationClientProcessId", byte[].class);

    public final SimplePath<byte[]> creationClientThreadId = createSimple("creationClientThreadId", byte[].class);

    public final NumberPath<Integer> creationIrpId = createNumber("creationIrpId", Integer.class);

    public final NumberPath<Integer> creationRequestId = createNumber("creationRequestId", Integer.class);

    public final SimplePath<byte[]> filestreamTransactionId = createSimple("filestreamTransactionId", byte[].class);

    public final SimplePath<byte[]> handleContextAddress = createSimple("handleContextAddress", byte[].class);

    public final NumberPath<Integer> handleId = createNumber("handleId", Integer.class);

    public final StringPath logicalPath = createString("logicalPath");

    public final StringPath physicalPath = createString("physicalPath");

    public QDmFilestreamFileIoHandles(String variable) {
        super(QDmFilestreamFileIoHandles.class, forVariable(variable), "sys", "dm_filestream_file_io_handles");
        addMetadata();
    }

    public QDmFilestreamFileIoHandles(String variable, String schema, String table) {
        super(QDmFilestreamFileIoHandles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFilestreamFileIoHandles(Path<? extends QDmFilestreamFileIoHandles> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_filestream_file_io_handles");
        addMetadata();
    }

    public QDmFilestreamFileIoHandles(PathMetadata metadata) {
        super(QDmFilestreamFileIoHandles.class, metadata, "sys", "dm_filestream_file_io_handles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accessType, ColumnMetadata.named("access_type").withIndex(8).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(creationClientProcessId, ColumnMetadata.named("creation_client_process_id").withIndex(6).ofType(Types.VARBINARY).withSize(8));
        addMetadata(creationClientThreadId, ColumnMetadata.named("creation_client_thread_id").withIndex(5).ofType(Types.VARBINARY).withSize(8));
        addMetadata(creationIrpId, ColumnMetadata.named("creation_irp_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(creationRequestId, ColumnMetadata.named("creation_request_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(filestreamTransactionId, ColumnMetadata.named("filestream_transaction_id").withIndex(7).ofType(Types.VARBINARY).withSize(128));
        addMetadata(handleContextAddress, ColumnMetadata.named("handle_context_address").withIndex(1).ofType(Types.VARBINARY).withSize(8));
        addMetadata(handleId, ColumnMetadata.named("handle_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(logicalPath, ColumnMetadata.named("logical_path").withIndex(9).ofType(Types.NVARCHAR).withSize(256));
        addMetadata(physicalPath, ColumnMetadata.named("physical_path").withIndex(10).ofType(Types.NVARCHAR).withSize(256));
    }

}

