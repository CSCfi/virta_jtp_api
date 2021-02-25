package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextSystemStopwords is a Querydsl query type for QFulltextSystemStopwords
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextSystemStopwords extends com.querydsl.sql.RelationalPathBase<QFulltextSystemStopwords> {

    private static final long serialVersionUID = 485069343;

    public static final QFulltextSystemStopwords fulltextSystemStopwords = new QFulltextSystemStopwords("fulltext_system_stopwords");

    public final NumberPath<Integer> languageId = createNumber("languageId", Integer.class);

    public final StringPath stopword = createString("stopword");

    public QFulltextSystemStopwords(String variable) {
        super(QFulltextSystemStopwords.class, forVariable(variable), "sys", "fulltext_system_stopwords");
        addMetadata();
    }

    public QFulltextSystemStopwords(String variable, String schema, String table) {
        super(QFulltextSystemStopwords.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextSystemStopwords(Path<? extends QFulltextSystemStopwords> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_system_stopwords");
        addMetadata();
    }

    public QFulltextSystemStopwords(PathMetadata metadata) {
        super(QFulltextSystemStopwords.class, metadata, "sys", "fulltext_system_stopwords");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stopword, ColumnMetadata.named("stopword").withIndex(1).ofType(Types.NVARCHAR).withSize(64));
    }

}

