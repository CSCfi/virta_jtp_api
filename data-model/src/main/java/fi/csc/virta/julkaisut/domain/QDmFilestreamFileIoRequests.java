package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFilestreamFileIoRequests is a Querydsl query type for QDmFilestreamFileIoRequests
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFilestreamFileIoRequests extends com.querydsl.sql.RelationalPathBase<QDmFilestreamFileIoRequests> {

    private static final long serialVersionUID = -1607011320;

    public static final QDmFilestreamFileIoRequests dmFilestreamFileIoRequests = new QDmFilestreamFileIoRequests("dm_filestream_file_io_requests");

    public final SimplePath<byte[]> clientProcessId = createSimple("clientProcessId", byte[].class);

    public final SimplePath<byte[]> clientThreadId = createSimple("clientThreadId", byte[].class);

    public final NumberPath<Short> currentSpid = createNumber("currentSpid", Short.class);

    public final SimplePath<byte[]> filestreamTransactionId = createSimple("filestreamTransactionId", byte[].class);

    public final SimplePath<byte[]> handleContextAddress = createSimple("handleContextAddress", byte[].class);

    public final NumberPath<Integer> handleId = createNumber("handleId", Integer.class);

    public final NumberPath<Integer> irpId = createNumber("irpId", Integer.class);

    public final SimplePath<byte[]> requestContextAddress = createSimple("requestContextAddress", byte[].class);

    public final NumberPath<Integer> requestId = createNumber("requestId", Integer.class);

    public final StringPath requestState = createString("requestState");

    public final StringPath requestType = createString("requestType");

    public QDmFilestreamFileIoRequests(String variable) {
        super(QDmFilestreamFileIoRequests.class, forVariable(variable), "sys", "dm_filestream_file_io_requests");
        addMetadata();
    }

    public QDmFilestreamFileIoRequests(String variable, String schema, String table) {
        super(QDmFilestreamFileIoRequests.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFilestreamFileIoRequests(Path<? extends QDmFilestreamFileIoRequests> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_filestream_file_io_requests");
        addMetadata();
    }

    public QDmFilestreamFileIoRequests(PathMetadata metadata) {
        super(QDmFilestreamFileIoRequests.class, metadata, "sys", "dm_filestream_file_io_requests");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clientProcessId, ColumnMetadata.named("client_process_id").withIndex(9).ofType(Types.VARBINARY).withSize(8));
        addMetadata(clientThreadId, ColumnMetadata.named("client_thread_id").withIndex(8).ofType(Types.VARBINARY).withSize(8));
        addMetadata(currentSpid, ColumnMetadata.named("current_spid").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(filestreamTransactionId, ColumnMetadata.named("filestream_transaction_id").withIndex(11).ofType(Types.VARBINARY).withSize(128));
        addMetadata(handleContextAddress, ColumnMetadata.named("handle_context_address").withIndex(10).ofType(Types.VARBINARY).withSize(8));
        addMetadata(handleId, ColumnMetadata.named("handle_id").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(irpId, ColumnMetadata.named("irp_id").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestContextAddress, ColumnMetadata.named("request_context_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(requestId, ColumnMetadata.named("request_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(requestState, ColumnMetadata.named("request_state").withIndex(4).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(requestType, ColumnMetadata.named("request_type").withIndex(3).ofType(Types.NVARCHAR).withSize(60).notNull());
    }

}

