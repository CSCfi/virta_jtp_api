package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsOutstandingBatches is a Querydsl query type for QDmFtsOutstandingBatches
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsOutstandingBatches extends com.querydsl.sql.RelationalPathBase<QDmFtsOutstandingBatches> {

    private static final long serialVersionUID = 2109103917;

    public static final QDmFtsOutstandingBatches dmFtsOutstandingBatches = new QDmFtsOutstandingBatches("dm_fts_outstanding_batches");

    public final NumberPath<Integer> batchId = createNumber("batchId", Integer.class);

    public final SimplePath<byte[]> batchTimestamp = createSimple("batchTimestamp", byte[].class);

    public final NumberPath<Integer> catalogId = createNumber("catalogId", Integer.class);

    public final SimplePath<byte[]> crawlMemoryAddress = createSimple("crawlMemoryAddress", byte[].class);

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> docFailed = createNumber("docFailed", Long.class);

    public final NumberPath<Integer> hrBatch = createNumber("hrBatch", Integer.class);

    public final BooleanPath isRetryBatch = createBoolean("isRetryBatch");

    public final SimplePath<byte[]> memoryAddress = createSimple("memoryAddress", byte[].class);

    public final SimplePath<byte[]> memregionMemoryAddress = createSimple("memregionMemoryAddress", byte[].class);

    public final NumberPath<Integer> retryHints = createNumber("retryHints", Integer.class);

    public final StringPath retryHintsDescription = createString("retryHintsDescription");

    public final NumberPath<Integer> tableId = createNumber("tableId", Integer.class);

    public QDmFtsOutstandingBatches(String variable) {
        super(QDmFtsOutstandingBatches.class, forVariable(variable), "sys", "dm_fts_outstanding_batches");
        addMetadata();
    }

    public QDmFtsOutstandingBatches(String variable, String schema, String table) {
        super(QDmFtsOutstandingBatches.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsOutstandingBatches(Path<? extends QDmFtsOutstandingBatches> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_outstanding_batches");
        addMetadata();
    }

    public QDmFtsOutstandingBatches(PathMetadata metadata) {
        super(QDmFtsOutstandingBatches.class, metadata, "sys", "dm_fts_outstanding_batches");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(batchId, ColumnMetadata.named("batch_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(batchTimestamp, ColumnMetadata.named("batch_timestamp").withIndex(13).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(catalogId, ColumnMetadata.named("catalog_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(crawlMemoryAddress, ColumnMetadata.named("crawl_memory_address").withIndex(6).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(docFailed, ColumnMetadata.named("doc_failed").withIndex(12).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(hrBatch, ColumnMetadata.named("hr_batch").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isRetryBatch, ColumnMetadata.named("is_retry_batch").withIndex(9).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memoryAddress, ColumnMetadata.named("memory_address").withIndex(5).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(memregionMemoryAddress, ColumnMetadata.named("memregion_memory_address").withIndex(7).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(retryHints, ColumnMetadata.named("retry_hints").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(retryHintsDescription, ColumnMetadata.named("retry_hints_description").withIndex(11).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(tableId, ColumnMetadata.named("table_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

