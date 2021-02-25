package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmFtsSemanticSimilarityPopulation is a Querydsl query type for QDmFtsSemanticSimilarityPopulation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmFtsSemanticSimilarityPopulation extends com.querydsl.sql.RelationalPathBase<QDmFtsSemanticSimilarityPopulation> {

    private static final long serialVersionUID = 932302709;

    public static final QDmFtsSemanticSimilarityPopulation dmFtsSemanticSimilarityPopulation = new QDmFtsSemanticSimilarityPopulation("dm_fts_semantic_similarity_population");

    public final NumberPath<Integer> catalogId = createNumber("catalogId", Integer.class);

    public final NumberPath<Integer> completionType = createNumber("completionType", Integer.class);

    public final StringPath completionTypeDescription = createString("completionTypeDescription");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final NumberPath<Long> documentCount = createNumber("documentCount", Long.class);

    public final NumberPath<Long> documentProcessedCount = createNumber("documentProcessedCount", Long.class);

    public final SimplePath<byte[]> incrementalTimestamp = createSimple("incrementalTimestamp", byte[].class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath statusDescription = createString("statusDescription");

    public final NumberPath<Integer> tableId = createNumber("tableId", Integer.class);

    public final NumberPath<Integer> workerCount = createNumber("workerCount", Integer.class);

    public QDmFtsSemanticSimilarityPopulation(String variable) {
        super(QDmFtsSemanticSimilarityPopulation.class, forVariable(variable), "sys", "dm_fts_semantic_similarity_population");
        addMetadata();
    }

    public QDmFtsSemanticSimilarityPopulation(String variable, String schema, String table) {
        super(QDmFtsSemanticSimilarityPopulation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmFtsSemanticSimilarityPopulation(Path<? extends QDmFtsSemanticSimilarityPopulation> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_fts_semantic_similarity_population");
        addMetadata();
    }

    public QDmFtsSemanticSimilarityPopulation(PathMetadata metadata) {
        super(QDmFtsSemanticSimilarityPopulation.class, metadata, "sys", "dm_fts_semantic_similarity_population");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalogId, ColumnMetadata.named("catalog_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(completionType, ColumnMetadata.named("completion_type").withIndex(6).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(completionTypeDescription, ColumnMetadata.named("completion_type_description").withIndex(7).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(documentCount, ColumnMetadata.named("document_count").withIndex(4).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(documentProcessedCount, ColumnMetadata.named("document_processed_count").withIndex(5).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(incrementalTimestamp, ColumnMetadata.named("incremental_timestamp").withIndex(12).ofType(Types.BINARY).withSize(8).notNull());
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(9).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statusDescription, ColumnMetadata.named("status_description").withIndex(10).ofType(Types.NVARCHAR).withSize(64));
        addMetadata(tableId, ColumnMetadata.named("table_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(workerCount, ColumnMetadata.named("worker_count").withIndex(8).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

