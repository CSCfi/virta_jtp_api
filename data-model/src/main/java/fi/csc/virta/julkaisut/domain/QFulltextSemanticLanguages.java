package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextSemanticLanguages is a Querydsl query type for QFulltextSemanticLanguages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextSemanticLanguages extends com.querydsl.sql.RelationalPathBase<QFulltextSemanticLanguages> {

    private static final long serialVersionUID = -253200676;

    public static final QFulltextSemanticLanguages fulltextSemanticLanguages = new QFulltextSemanticLanguages("fulltext_semantic_languages");

    public final NumberPath<Integer> lcid = createNumber("lcid", Integer.class);

    public final StringPath name = createString("name");

    public QFulltextSemanticLanguages(String variable) {
        super(QFulltextSemanticLanguages.class, forVariable(variable), "sys", "fulltext_semantic_languages");
        addMetadata();
    }

    public QFulltextSemanticLanguages(String variable, String schema, String table) {
        super(QFulltextSemanticLanguages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextSemanticLanguages(Path<? extends QFulltextSemanticLanguages> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_semantic_languages");
        addMetadata();
    }

    public QFulltextSemanticLanguages(PathMetadata metadata) {
        super(QFulltextSemanticLanguages.class, metadata, "sys", "fulltext_semantic_languages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lcid, ColumnMetadata.named("lcid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

