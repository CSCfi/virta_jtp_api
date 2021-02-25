package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmIoPendingIoRequests is a Querydsl query type for QDmIoPendingIoRequests
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmIoPendingIoRequests extends com.querydsl.sql.RelationalPathBase<QDmIoPendingIoRequests> {

    private static final long serialVersionUID = 1667573877;

    public static final QDmIoPendingIoRequests dmIoPendingIoRequests = new QDmIoPendingIoRequests("dm_io_pending_io_requests");

    public final SimplePath<byte[]> ioCompletionRequestAddress = createSimple("ioCompletionRequestAddress", byte[].class);

    public final SimplePath<byte[]> ioCompletionRoutineAddress = createSimple("ioCompletionRoutineAddress", byte[].class);

    public final SimplePath<byte[]> ioHandle = createSimple("ioHandle", byte[].class);

    public final NumberPath<Long> ioOffset = createNumber("ioOffset", Long.class);

    public final NumberPath<Integer> ioPending = createNumber("ioPending", Integer.class);

    public final NumberPath<Long> ioPendingMsTicks = createNumber("ioPendingMsTicks", Long.class);

    public final StringPath ioType = createString("ioType");

    public final SimplePath<byte[]> ioUserDataAddress = createSimple("ioUserDataAddress", byte[].class);

    public final SimplePath<byte[]> schedulerAddress = createSimple("schedulerAddress", byte[].class);

    public QDmIoPendingIoRequests(String variable) {
        super(QDmIoPendingIoRequests.class, forVariable(variable), "sys", "dm_io_pending_io_requests");
        addMetadata();
    }

    public QDmIoPendingIoRequests(String variable, String schema, String table) {
        super(QDmIoPendingIoRequests.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmIoPendingIoRequests(Path<? extends QDmIoPendingIoRequests> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_io_pending_io_requests");
        addMetadata();
    }

    public QDmIoPendingIoRequests(PathMetadata metadata) {
        super(QDmIoPendingIoRequests.class, metadata, "sys", "dm_io_pending_io_requests");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(ioCompletionRequestAddress, ColumnMetadata.named("io_completion_request_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(ioCompletionRoutineAddress, ColumnMetadata.named("io_completion_routine_address").withIndex(5).ofType(Types.VARBINARY).withSize(8));
        addMetadata(ioHandle, ColumnMetadata.named("io_handle").withIndex(8).ofType(Types.VARBINARY).withSize(8));
        addMetadata(ioOffset, ColumnMetadata.named("io_offset").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(ioPending, ColumnMetadata.named("io_pending").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(ioPendingMsTicks, ColumnMetadata.named("io_pending_ms_ticks").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(ioType, ColumnMetadata.named("io_type").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(ioUserDataAddress, ColumnMetadata.named("io_user_data_address").withIndex(6).ofType(Types.VARBINARY).withSize(8));
        addMetadata(schedulerAddress, ColumnMetadata.named("scheduler_address").withIndex(7).ofType(Types.VARBINARY).withSize(8).notNull());
    }

}

