package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPartitions is a Querydsl query type for QPartitions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPartitions extends com.querydsl.sql.RelationalPathBase<QPartitions> {

    private static final long serialVersionUID = 1172366950;

    public static final QPartitions partitions = new QPartitions("partitions");

    public final NumberPath<Byte> dataCompression = createNumber("dataCompression", Byte.class);

    public final StringPath dataCompressionDesc = createString("dataCompressionDesc");

    public final NumberPath<Short> filestreamFilegroupId = createNumber("filestreamFilegroupId", Short.class);

    public final NumberPath<Long> hobtId = createNumber("hobtId", Long.class);

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Integer> partitionNumber = createNumber("partitionNumber", Integer.class);

    public final NumberPath<Long> rows = createNumber("rows", Long.class);

    public QPartitions(String variable) {
        super(QPartitions.class, forVariable(variable), "sys", "partitions");
        addMetadata();
    }

    public QPartitions(String variable, String schema, String table) {
        super(QPartitions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPartitions(Path<? extends QPartitions> path) {
        super(path.getType(), path.getMetadata(), "sys", "partitions");
        addMetadata();
    }

    public QPartitions(PathMetadata metadata) {
        super(QPartitions.class, metadata, "sys", "partitions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataCompression, ColumnMetadata.named("data_compression").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(dataCompressionDesc, ColumnMetadata.named("data_compression_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(filestreamFilegroupId, ColumnMetadata.named("filestream_filegroup_id").withIndex(7).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(hobtId, ColumnMetadata.named("hobt_id").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionNumber, ColumnMetadata.named("partition_number").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rows, ColumnMetadata.named("rows").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

