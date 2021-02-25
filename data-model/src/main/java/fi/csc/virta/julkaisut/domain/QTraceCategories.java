package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTraceCategories is a Querydsl query type for QTraceCategories
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTraceCategories extends com.querydsl.sql.RelationalPathBase<QTraceCategories> {

    private static final long serialVersionUID = 30810052;

    public static final QTraceCategories traceCategories = new QTraceCategories("trace_categories");

    public final NumberPath<Short> categoryId = createNumber("categoryId", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public QTraceCategories(String variable) {
        super(QTraceCategories.class, forVariable(variable), "sys", "trace_categories");
        addMetadata();
    }

    public QTraceCategories(String variable, String schema, String table) {
        super(QTraceCategories.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTraceCategories(Path<? extends QTraceCategories> path) {
        super(path.getType(), path.getMetadata(), "sys", "trace_categories");
        addMetadata();
    }

    public QTraceCategories(PathMetadata metadata) {
        super(QTraceCategories.class, metadata, "sys", "trace_categories");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(categoryId, ColumnMetadata.named("category_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(type, ColumnMetadata.named("type").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

