package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsIndexPopulation is a Querydsl query type for QDmFtsIndexPopulation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsIndexPopulation extends com.querydsl.sql.RelationalPathBase<QDmFtsIndexPopulation> {

    private static final long serialVersionUID = -1142603424;

    public static final QDmFtsIndexPopulation dmFtsIndexPopulation = new QDmFtsIndexPopulation("dm_fts_index_population");

    public final NumberPath<Integer> catalogId = createNumber("catalogId", Integer.class);

    public final NumberPath<Integer> completedRangeCount = createNumber("completedRangeCount", Integer.class);

    public final NumberPath<Integer> completionType = createNumber("completionType", Integer.class);

    public final StringPath completionTypeDescription = createString("completionTypeDescription");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final SimplePath<byte[]> incrementalTimestamp = createSimple("incrementalTimestamp", byte[].class);

    public final BooleanPath isClusteredIndexScan = createBoolean("isClusteredIndexScan");

    public final SimplePath<byte[]> memoryAddress = createSimple("memoryAddress", byte[].class);

    public final NumberPath<Integer> outstandingBatchCount = createNumber("outstandingBatchCount", Integer.class);

    public final NumberPath<Integer> populationType = createNumber("populationType", Integer.class);

    public final StringPath populationTypeDescription = createString("populationTypeDescription");

    public final NumberPath<Integer> queuedPopulationType = createNumber("queuedPopulationType", Integer.class);

    public final StringPath queuedPopulationTypeDescription = createString("queuedPopulationTypeDescription");

    public final NumberPath<Integer> rangeCount = createNumber("rangeCount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDescription = createString("statusDescription");

    public final NumberPath<Integer> tableId = createNumber("tableId", Integer.class);

    public final NumberPath<Integer> workerCount = createNumber("workerCount", Integer.class);

    public QDmFtsIndexPopulation(String variable) {
        super(QDmFtsIndexPopulation.class, forVariable(variable), "sys", "dm_fts_index_population");
        addMetadata();
    }

    public QDmFtsIndexPopulation(String variable, String schema, String table) {
        super(QDmFtsIndexPopulation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsIndexPopulation(Path<? extends QDmFtsIndexPopulation> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_index_population");
        addMetadata();
    }

    public QDmFtsIndexPopulation(PathMetadata metadata) {
        super(QDmFtsIndexPopulation.class, metadata, "sys", "dm_fts_index_population");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalogId, ColumnMetadata.named("catalog_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(completedRangeCount, ColumnMetadata.named("completed_range_count").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(completionType, ColumnMetadata.named("completion_type").withIndex(13).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(completionTypeDescription, ColumnMetadata.named("completion_type_description").withIndex(14).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(incrementalTimestamp, ColumnMetadata.named("incremental_timestamp").withIndex(19).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(isClusteredIndexScan, ColumnMetadata.named("is_clustered_index_scan").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(memoryAddress, ColumnMetadata.named("memory_address").withIndex(4).ofType(Types.VARBINARY).withSize(8).notNull());
        addMetadata(outstandingBatchCount, ColumnMetadata.named("outstanding_batch_count").withIndex(10).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(populationType, ColumnMetadata.named("population_type").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(populationTypeDescription, ColumnMetadata.named("population_type_description").withIndex(6).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(queuedPopulationType, ColumnMetadata.named("queued_population_type").withIndex(16).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(queuedPopulationTypeDescription, ColumnMetadata.named("queued_population_type_description").withIndex(17).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(rangeCount, ColumnMetadata.named("range_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(18).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(11).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statusDescription, ColumnMetadata.named("status_description").withIndex(12).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(tableId, ColumnMetadata.named("table_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(workerCount, ColumnMetadata.named("worker_count").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

