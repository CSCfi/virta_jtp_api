package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextIndexColumns is a Querydsl query type for QFulltextIndexColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextIndexColumns extends com.querydsl.sql.RelationalPathBase<QFulltextIndexColumns> {

    private static final long serialVersionUID = -1547717532;

    public static final QFulltextIndexColumns fulltextIndexColumns = new QFulltextIndexColumns("fulltext_index_columns");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> languageId = createNumber("languageId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> statisticalSemantics = createNumber("statisticalSemantics", Integer.class);

    public final NumberPath<Integer> typeColumnId = createNumber("typeColumnId", Integer.class);

    public QFulltextIndexColumns(String variable) {
        super(QFulltextIndexColumns.class, forVariable(variable), "sys", "fulltext_index_columns");
        addMetadata();
    }

    public QFulltextIndexColumns(String variable, String schema, String table) {
        super(QFulltextIndexColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextIndexColumns(Path<? extends QFulltextIndexColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_index_columns");
        addMetadata();
    }

    public QFulltextIndexColumns(PathMetadata metadata) {
        super(QFulltextIndexColumns.class, metadata, "sys", "fulltext_index_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(4).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statisticalSemantics, ColumnMetadata.named("statistical_semantics").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(typeColumnId, ColumnMetadata.named("type_column_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

