package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QStatsColumns is a Querydsl query type for QStatsColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QStatsColumns extends com.querydsl.sql.RelationalPathBase<QStatsColumns> {

    private static final long serialVersionUID = 893317787;

    public static final QStatsColumns statsColumns = new QStatsColumns("stats_columns");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> statsColumnId = createNumber("statsColumnId", Integer.class);

    public final NumberPath<Integer> statsId = createNumber("statsId", Integer.class);

    public QStatsColumns(String variable) {
        super(QStatsColumns.class, forVariable(variable), "sys", "stats_columns");
        addMetadata();
    }

    public QStatsColumns(String variable, String schema, String table) {
        super(QStatsColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QStatsColumns(Path<? extends QStatsColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "stats_columns");
        addMetadata();
    }

    public QStatsColumns(PathMetadata metadata) {
        super(QStatsColumns.class, metadata, "sys", "stats_columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statsColumnId, ColumnMetadata.named("stats_column_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(statsId, ColumnMetadata.named("stats_id").withIndex(2).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

