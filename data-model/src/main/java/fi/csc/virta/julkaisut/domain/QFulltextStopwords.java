package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextStopwords is a Querydsl query type for QFulltextStopwords
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextStopwords extends com.querydsl.sql.RelationalPathBase<QFulltextStopwords> {

    private static final long serialVersionUID = 608397518;

    public static final QFulltextStopwords fulltextStopwords = new QFulltextStopwords("fulltext_stopwords");

    public final StringPath language = createString("language");

    public final NumberPath<Integer> languageId = createNumber("languageId", Integer.class);

    public final NumberPath<Integer> stoplistId = createNumber("stoplistId", Integer.class);

    public final StringPath stopword = createString("stopword");

    public QFulltextStopwords(String variable) {
        super(QFulltextStopwords.class, forVariable(variable), "sys", "fulltext_stopwords");
        addMetadata();
    }

    public QFulltextStopwords(String variable, String schema, String table) {
        super(QFulltextStopwords.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextStopwords(Path<? extends QFulltextStopwords> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_stopwords");
        addMetadata();
    }

    public QFulltextStopwords(PathMetadata metadata) {
        super(QFulltextStopwords.class, metadata, "sys", "fulltext_stopwords");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(language, ColumnMetadata.named("language").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stoplistId, ColumnMetadata.named("stoplist_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stopword, ColumnMetadata.named("stopword").withIndex(2).ofType(Types.NVARCHAR).withSize(64).notNull());
    }

}

