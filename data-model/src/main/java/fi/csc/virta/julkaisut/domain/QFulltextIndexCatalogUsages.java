package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextIndexCatalogUsages is a Querydsl query type for QFulltextIndexCatalogUsages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextIndexCatalogUsages extends com.querydsl.sql.RelationalPathBase<QFulltextIndexCatalogUsages> {

    private static final long serialVersionUID = 975808434;

    public static final QFulltextIndexCatalogUsages fulltextIndexCatalogUsages = new QFulltextIndexCatalogUsages("fulltext_index_catalog_usages");

    public final NumberPath<Integer> fulltextCatalogId = createNumber("fulltextCatalogId", Integer.class);

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public QFulltextIndexCatalogUsages(String variable) {
        super(QFulltextIndexCatalogUsages.class, forVariable(variable), "sys", "fulltext_index_catalog_usages");
        addMetadata();
    }

    public QFulltextIndexCatalogUsages(String variable, String schema, String table) {
        super(QFulltextIndexCatalogUsages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextIndexCatalogUsages(Path<? extends QFulltextIndexCatalogUsages> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_index_catalog_usages");
        addMetadata();
    }

    public QFulltextIndexCatalogUsages(PathMetadata metadata) {
        super(QFulltextIndexCatalogUsages.class, metadata, "sys", "fulltext_index_catalog_usages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fulltextCatalogId, ColumnMetadata.named("fulltext_catalog_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

