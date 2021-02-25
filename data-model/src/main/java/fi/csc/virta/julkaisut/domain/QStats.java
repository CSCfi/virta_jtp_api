package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QStats is a Querydsl query type for QStats
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QStats extends com.querydsl.sql.RelationalPathBase<QStats> {

    private static final long serialVersionUID = -1849845022;

    public static final QStats stats = new QStats("stats");

    public final BooleanPath autoCreated = createBoolean("autoCreated");

    public final StringPath filterDefinition = createString("filterDefinition");

    public final BooleanPath hasFilter = createBoolean("hasFilter");

    public final BooleanPath isTemporary = createBoolean("isTemporary");

    public final StringPath name = createString("name");

    public final BooleanPath noRecompute = createBoolean("noRecompute");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Integer> statsId = createNumber("statsId", Integer.class);

    public final BooleanPath userCreated = createBoolean("userCreated");

    public QStats(String variable) {
        super(QStats.class, forVariable(variable), "sys", "stats");
        addMetadata();
    }

    public QStats(String variable, String schema, String table) {
        super(QStats.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QStats(Path<? extends QStats> path) {
        super(path.getType(), path.getMetadata(), "sys", "stats");
        addMetadata();
    }

    public QStats(PathMetadata metadata) {
        super(QStats.class, metadata, "sys", "stats");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(autoCreated, ColumnMetadata.named("auto_created").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(filterDefinition, ColumnMetadata.named("filter_definition").withIndex(8).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(hasFilter, ColumnMetadata.named("has_filter").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(isTemporary, ColumnMetadata.named("is_temporary").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(noRecompute, ColumnMetadata.named("no_recompute").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(statsId, ColumnMetadata.named("stats_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userCreated, ColumnMetadata.named("user_created").withIndex(5).ofType(Types.BIT).withSize(1));
    }

}

