package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextSemanticLanguageStatisticsDatabase is a Querydsl query type for QFulltextSemanticLanguageStatisticsDatabase
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextSemanticLanguageStatisticsDatabase extends com.querydsl.sql.RelationalPathBase<QFulltextSemanticLanguageStatisticsDatabase> {

    private static final long serialVersionUID = 719722645;

    public static final QFulltextSemanticLanguageStatisticsDatabase fulltextSemanticLanguageStatisticsDatabase = new QFulltextSemanticLanguageStatisticsDatabase("fulltext_semantic_language_statistics_database");

    public final NumberPath<Integer> databaseId = createNumber("databaseId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> registerDate = createDateTime("registerDate", java.sql.Timestamp.class);

    public final NumberPath<Integer> registeredBy = createNumber("registeredBy", Integer.class);

    public final StringPath version = createString("version");

    public QFulltextSemanticLanguageStatisticsDatabase(String variable) {
        super(QFulltextSemanticLanguageStatisticsDatabase.class, forVariable(variable), "sys", "fulltext_semantic_language_statistics_database");
        addMetadata();
    }

    public QFulltextSemanticLanguageStatisticsDatabase(String variable, String schema, String table) {
        super(QFulltextSemanticLanguageStatisticsDatabase.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextSemanticLanguageStatisticsDatabase(Path<? extends QFulltextSemanticLanguageStatisticsDatabase> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_semantic_language_statistics_database");
        addMetadata();
    }

    public QFulltextSemanticLanguageStatisticsDatabase(PathMetadata metadata) {
        super(QFulltextSemanticLanguageStatisticsDatabase.class, metadata, "sys", "fulltext_semantic_language_statistics_database");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(databaseId, ColumnMetadata.named("database_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(registerDate, ColumnMetadata.named("register_date").withIndex(2).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(registeredBy, ColumnMetadata.named("registered_by").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(version, ColumnMetadata.named("version").withIndex(4).ofType(Types.NVARCHAR).withSize(128).notNull());
    }

}

