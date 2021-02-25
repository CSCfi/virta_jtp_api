package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextLanguages is a Querydsl query type for QFulltextLanguages
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextLanguages extends com.querydsl.sql.RelationalPathBase<QFulltextLanguages> {

    private static final long serialVersionUID = 474578178;

    public static final QFulltextLanguages fulltextLanguages = new QFulltextLanguages("fulltext_languages");

    public final NumberPath<Integer> lcid = createNumber("lcid", Integer.class);

    public final StringPath name = createString("name");

    public QFulltextLanguages(String variable) {
        super(QFulltextLanguages.class, forVariable(variable), "sys", "fulltext_languages");
        addMetadata();
    }

    public QFulltextLanguages(String variable, String schema, String table) {
        super(QFulltextLanguages.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextLanguages(Path<? extends QFulltextLanguages> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_languages");
        addMetadata();
    }

    public QFulltextLanguages(PathMetadata metadata) {
        super(QFulltextLanguages.class, metadata, "sys", "fulltext_languages");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lcid, ColumnMetadata.named("lcid").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

