package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextIndexFragments is a Querydsl query type for QFulltextIndexFragments
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextIndexFragments extends com.querydsl.sql.RelationalPathBase<QFulltextIndexFragments> {

    private static final long serialVersionUID = 1229487850;

    public static final QFulltextIndexFragments fulltextIndexFragments = new QFulltextIndexFragments("fulltext_index_fragments");

    public final NumberPath<Long> dataSize = createNumber("dataSize", Long.class);

    public final NumberPath<Integer> fragmentId = createNumber("fragmentId", Integer.class);

    public final NumberPath<Integer> fragmentObjectId = createNumber("fragmentObjectId", Integer.class);

    public final NumberPath<Long> rowCount = createNumber("rowCount", Long.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Integer> tableId = createNumber("tableId", Integer.class);

    public final SimplePath<byte[]> timestamp = createSimple("timestamp", byte[].class);

    public QFulltextIndexFragments(String variable) {
        super(QFulltextIndexFragments.class, forVariable(variable), "sys", "fulltext_index_fragments");
        addMetadata();
    }

    public QFulltextIndexFragments(String variable, String schema, String table) {
        super(QFulltextIndexFragments.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextIndexFragments(Path<? extends QFulltextIndexFragments> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_index_fragments");
        addMetadata();
    }

    public QFulltextIndexFragments(PathMetadata metadata) {
        super(QFulltextIndexFragments.class, metadata, "sys", "fulltext_index_fragments");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(dataSize, ColumnMetadata.named("data_size").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(fragmentId, ColumnMetadata.named("fragment_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fragmentObjectId, ColumnMetadata.named("fragment_object_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(rowCount, ColumnMetadata.named("row_count").withIndex(7).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(status, ColumnMetadata.named("status").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tableId, ColumnMetadata.named("table_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(timestamp, ColumnMetadata.named("timestamp").withIndex(4).ofType(Types.BINARY).withSize(8).notNull());
    }

}

