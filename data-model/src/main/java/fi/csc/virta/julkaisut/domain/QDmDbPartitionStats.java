package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbPartitionStats is a Querydsl query type for QDmDbPartitionStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbPartitionStats extends com.querydsl.sql.RelationalPathBase<QDmDbPartitionStats> {

    private static final long serialVersionUID = 842069305;

    public static final QDmDbPartitionStats dmDbPartitionStats = new QDmDbPartitionStats("dm_db_partition_stats");

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final NumberPath<Long> inRowDataPageCount = createNumber("inRowDataPageCount", Long.class);

    public final NumberPath<Long> inRowReservedPageCount = createNumber("inRowReservedPageCount", Long.class);

    public final NumberPath<Long> inRowUsedPageCount = createNumber("inRowUsedPageCount", Long.class);

    public final NumberPath<Long> lobReservedPageCount = createNumber("lobReservedPageCount", Long.class);

    public final NumberPath<Long> lobUsedPageCount = createNumber("lobUsedPageCount", Long.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Long> partitionId = createNumber("partitionId", Long.class);

    public final NumberPath<Integer> partitionNumber = createNumber("partitionNumber", Integer.class);

    public final NumberPath<Long> reservedPageCount = createNumber("reservedPageCount", Long.class);

    public final NumberPath<Long> rowCount = createNumber("rowCount", Long.class);

    public final NumberPath<Long> rowOverflowReservedPageCount = createNumber("rowOverflowReservedPageCount", Long.class);

    public final NumberPath<Long> rowOverflowUsedPageCount = createNumber("rowOverflowUsedPageCount", Long.class);

    public final NumberPath<Long> usedPageCount = createNumber("usedPageCount", Long.class);

    public QDmDbPartitionStats(String variable) {
        super(QDmDbPartitionStats.class, forVariable(variable), "sys", "dm_db_partition_stats");
        addMetadata();
    }

    public QDmDbPartitionStats(String variable, String schema, String table) {
        super(QDmDbPartitionStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbPartitionStats(Path<? extends QDmDbPartitionStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_partition_stats");
        addMetadata();
    }

    public QDmDbPartitionStats(PathMetadata metadata) {
        super(QDmDbPartitionStats.class, metadata, "sys", "dm_db_partition_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(inRowDataPageCount, ColumnMetadata.named("in_row_data_page_count").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(inRowReservedPageCount, ColumnMetadata.named("in_row_reserved_page_count").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(inRowUsedPageCount, ColumnMetadata.named("in_row_used_page_count").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lobReservedPageCount, ColumnMetadata.named("lob_reserved_page_count").withIndex(9).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(lobUsedPageCount, ColumnMetadata.named("lob_used_page_count").withIndex(8).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(partitionId, ColumnMetadata.named("partition_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(partitionNumber, ColumnMetadata.named("partition_number").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(reservedPageCount, ColumnMetadata.named("reserved_page_count").withIndex(13).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(14).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(rowOverflowReservedPageCount, ColumnMetadata.named("row_overflow_reserved_page_count").withIndex(11).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(rowOverflowUsedPageCount, ColumnMetadata.named("row_overflow_used_page_count").withIndex(10).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(usedPageCount, ColumnMetadata.named("used_page_count").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

