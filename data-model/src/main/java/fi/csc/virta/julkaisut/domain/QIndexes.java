package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QIndexes is a Querydsl query type for QIndexes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIndexes extends com.querydsl.sql.RelationalPathBase<QIndexes> {

    private static final long serialVersionUID = -39150973;

    public static final QIndexes indexes = new QIndexes("indexes");

    public final BooleanPath allowPageLocks = createBoolean("allowPageLocks");

    public final BooleanPath allowRowLocks = createBoolean("allowRowLocks");

    public final NumberPath<Integer> dataSpaceId = createNumber("dataSpaceId", Integer.class);

    public final NumberPath<Byte> fillFactor = createNumber("fillFactor", Byte.class);

    public final StringPath filterDefinition = createString("filterDefinition");

    public final BooleanPath hasFilter = createBoolean("hasFilter");

    public final BooleanPath ignoreDupKey = createBoolean("ignoreDupKey");

    public final NumberPath<Integer> indexId = createNumber("indexId", Integer.class);

    public final BooleanPath isDisabled = createBoolean("isDisabled");

    public final BooleanPath isHypothetical = createBoolean("isHypothetical");

    public final BooleanPath isPadded = createBoolean("isPadded");

    public final BooleanPath isPrimaryKey = createBoolean("isPrimaryKey");

    public final BooleanPath isUnique = createBoolean("isUnique");

    public final BooleanPath isUniqueConstraint = createBoolean("isUniqueConstraint");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public QIndexes(String variable) {
        super(QIndexes.class, forVariable(variable), "sys", "indexes");
        addMetadata();
    }

    public QIndexes(String variable, String schema, String table) {
        super(QIndexes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIndexes(Path<? extends QIndexes> path) {
        super(path.getType(), path.getMetadata(), "sys", "indexes");
        addMetadata();
    }

    public QIndexes(PathMetadata metadata) {
        super(QIndexes.class, metadata, "sys", "indexes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowPageLocks, ColumnMetadata.named("allow_page_locks").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(allowRowLocks, ColumnMetadata.named("allow_row_locks").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(fillFactor, ColumnMetadata.named("fill_factor").withIndex(11).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(filterDefinition, ColumnMetadata.named("filter_definition").withIndex(18).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(hasFilter, ColumnMetadata.named("has_filter").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(ignoreDupKey, ColumnMetadata.named("ignore_dup_key").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(indexId, ColumnMetadata.named("index_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isDisabled, ColumnMetadata.named("is_disabled").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isHypothetical, ColumnMetadata.named("is_hypothetical").withIndex(14).ofType(Types.BIT).withSize(1));
        addMetadata(isPadded, ColumnMetadata.named("is_padded").withIndex(12).ofType(Types.BIT).withSize(1));
        addMetadata(isPrimaryKey, ColumnMetadata.named("is_primary_key").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(isUnique, ColumnMetadata.named("is_unique").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isUniqueConstraint, ColumnMetadata.named("is_unique_constraint").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
    }

}

