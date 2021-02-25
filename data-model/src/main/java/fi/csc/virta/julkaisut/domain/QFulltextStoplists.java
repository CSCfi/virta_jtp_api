package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFulltextStoplists is a Querydsl query type for QFulltextStoplists
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFulltextStoplists extends com.querydsl.sql.RelationalPathBase<QFulltextStoplists> {

    private static final long serialVersionUID = 598061498;

    public static final QFulltextStoplists fulltextStoplists = new QFulltextStoplists("fulltext_stoplists");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> modifyDate = createDateTime("modifyDate", java.sql.Timestamp.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> principalId = createNumber("principalId", Integer.class);

    public final NumberPath<Integer> stoplistId = createNumber("stoplistId", Integer.class);

    public QFulltextStoplists(String variable) {
        super(QFulltextStoplists.class, forVariable(variable), "sys", "fulltext_stoplists");
        addMetadata();
    }

    public QFulltextStoplists(String variable, String schema, String table) {
        super(QFulltextStoplists.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFulltextStoplists(Path<? extends QFulltextStoplists> path) {
        super(path.getType(), path.getMetadata(), "sys", "fulltext_stoplists");
        addMetadata();
    }

    public QFulltextStoplists(PathMetadata metadata) {
        super(QFulltextStoplists.class, metadata, "sys", "fulltext_stoplists");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(3).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(modifyDate, ColumnMetadata.named("modify_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(principalId, ColumnMetadata.named("principal_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(stoplistId, ColumnMetadata.named("stoplist_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

