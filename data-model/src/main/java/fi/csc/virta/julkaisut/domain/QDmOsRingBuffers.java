package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmOsRingBuffers is a Querydsl query type for QDmOsRingBuffers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmOsRingBuffers extends com.querydsl.sql.RelationalPathBase<QDmOsRingBuffers> {

    private static final long serialVersionUID = 59488217;

    public static final QDmOsRingBuffers dmOsRingBuffers = new QDmOsRingBuffers("dm_os_ring_buffers");

    public final StringPath record = createString("record");

    public final SimplePath<byte[]> ringBufferAddress = createSimple("ringBufferAddress", byte[].class);

    public final StringPath ringBufferType = createString("ringBufferType");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QDmOsRingBuffers(String variable) {
        super(QDmOsRingBuffers.class, forVariable(variable), "sys", "dm_os_ring_buffers");
        addMetadata();
    }

    public QDmOsRingBuffers(String variable, String schema, String table) {
        super(QDmOsRingBuffers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmOsRingBuffers(Path<? extends QDmOsRingBuffers> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_os_ring_buffers");
        addMetadata();
    }

    public QDmOsRingBuffers(PathMetadata metadata) {
        super(QDmOsRingBuffers.class, metadata, "sys", "dm_os_ring_buffers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(record, ColumnMetadata.named("record").withIndex(4).ofType(Types.NVARCHAR).withSize(3072));
        addMetadata(ringBufferAddress, ColumnMetadata.named("ring_buffer_address").withIndex(1).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(ringBufferType, ColumnMetadata.named("ring_buffer_type").withIndex(2).ofType(Types.NVARCHAR).withSize(60).notNull());
        addMetadata(timestamp, ColumnMetadata.named("timestamp").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

