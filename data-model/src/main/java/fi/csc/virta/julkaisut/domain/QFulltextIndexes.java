package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextIndexes is a Querydsl query type for QFulltextIndexes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextIndexes extends com.querydsl.sql.RelationalPathBase<QFulltextIndexes> {

    private static final long serialVersionUID = 29359015;

    public static final QFulltextIndexes fulltextIndexes = new QFulltextIndexes("fulltext_indexes");

    public final StringPath changeTrackingState = createString("changeTrackingState");

    public final StringPath changeTrackingStateDesc = createString("changeTrackingStateDesc");

    public final DateTimePath<java.sql.Timestamp> crawlEndDate = createDateTime("crawlEndDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> crawlStartDate = createDateTime("crawlStartDate", java.sql.Timestamp.class);

    public final StringPath crawlType = createString("crawlType");

    public final StringPath crawlTypeDesc = createString("crawlTypeDesc");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Integer> fulltextCatalogId = createNumber("fulltextCatalogId", Integer.class);

    public final BooleanPath hasCrawlCompleted = createBoolean("hasCrawlCompleted");

    public final SimplePath<byte[]> incrementalTimestamp = createSimple("incrementalTimestamp", byte[].class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> propertyListId = createNumber("propertyListId", Integer.class);

    public final NumberPath<Integer> stoplistId = createNumber("stoplistId", Integer.class);

    public final NumberPath<Integer> uniqueIndexId = createNumber("uniqueIndexId", Integer.class);

    public QFulltextIndexes(String variable) {
        super(QFulltextIndexes.class, forVariable(variable), "sys", "fulltext_indexes");
        addMetadata();
    }

    public QFulltextIndexes(String variable, String schema, String table) {
        super(QFulltextIndexes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextIndexes(Path<? extends QFulltextIndexes> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_indexes");
        addMetadata();
    }

    public QFulltextIndexes(PathMetadata metadata) {
        super(QFulltextIndexes.class, metadata, "sys", "fulltext_indexes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(changeTrackingState, ColumnMetadata.named("change_tracking_state").withIndex(5).ofType(Types.CHAR).withSize(1));
        addMetadata(changeTrackingStateDesc, ColumnMetadata.named("change_tracking_state_desc").withIndex(6).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(crawlEndDate, ColumnMetadata.named("crawl_end_date").withIndex(11).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(crawlStartDate, ColumnMetadata.named("crawl_start_date").withIndex(10).ofType(Types.TIMESTAMP).withSize(23).withDigits(3));
        addMetadata(crawlType, ColumnMetadata.named("crawl_type").withIndex(8).ofType(Types.CHAR).withSize(1).notNull());
        addMetadata(crawlTypeDesc, ColumnMetadata.named("crawl_type_desc").withIndex(9).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(15).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fulltextCatalogId, ColumnMetadata.named("fulltext_catalog_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(hasCrawlCompleted, ColumnMetadata.named("has_crawl_completed").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(incrementalTimestamp, ColumnMetadata.named("incremental_timestamp").withIndex(12).ofType(Types.BINARY).withSize(8));
        addMetadata(isEnabled, ColumnMetadata.named("is_enabled").withIndex(4).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(propertyListId, ColumnMetadata.named("property_list_id").withIndex(14).ofType(Types.INTEGER).withSize(10));
        addMetadata(stoplistId, ColumnMetadata.named("stoplist_id").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(uniqueIndexId, ColumnMetadata.named("unique_index_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

