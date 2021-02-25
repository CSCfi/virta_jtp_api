package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDmDbFtsIndexPhysicalStats is a Querydsl query type for QDmDbFtsIndexPhysicalStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDmDbFtsIndexPhysicalStats extends com.querydsl.sql.RelationalPathBase<QDmDbFtsIndexPhysicalStats> {

    private static final long serialVersionUID = -942776649;

    public static final QDmDbFtsIndexPhysicalStats dmDbFtsIndexPhysicalStats = new QDmDbFtsIndexPhysicalStats("dm_db_fts_index_physical_stats");

    public final NumberPath<Long> fulltextIndexPageCount = createNumber("fulltextIndexPageCount", Long.class);

    public final NumberPath<Long> keyphraseIndexPageCount = createNumber("keyphraseIndexPageCount", Long.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Long> similarityIndexPageCount = createNumber("similarityIndexPageCount", Long.class);

    public QDmDbFtsIndexPhysicalStats(String variable) {
        super(QDmDbFtsIndexPhysicalStats.class, forVariable(variable), "sys", "dm_db_fts_index_physical_stats");
        addMetadata();
    }

    public QDmDbFtsIndexPhysicalStats(String variable, String schema, String table) {
        super(QDmDbFtsIndexPhysicalStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDmDbFtsIndexPhysicalStats(Path<? extends QDmDbFtsIndexPhysicalStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "dm_db_fts_index_physical_stats");
        addMetadata();
    }

    public QDmDbFtsIndexPhysicalStats(PathMetadata metadata) {
        super(QDmDbFtsIndexPhysicalStats.class, metadata, "sys", "dm_db_fts_index_physical_stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fulltextIndexPageCount, ColumnMetadata.named("fulltext_index_page_count").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(keyphraseIndexPageCount, ColumnMetadata.named("keyphrase_index_page_count").withIndex(3).ofType(Types.BIGINT).withSize(19));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(similarityIndexPageCount, ColumnMetadata.named("similarity_index_page_count").withIndex(4).ofType(Types.BIGINT).withSize(19));
    }

}

