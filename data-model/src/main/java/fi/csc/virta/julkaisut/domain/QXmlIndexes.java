package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QXmlIndexes is a Querydsl query type for QXmlIndexes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QXmlIndexes extends com.querydsl.sql.RelationalPathBase<QXmlIndexes> {

    private static final long serialVersionUID = -1860979578;

    public static final QXmlIndexes xmlIndexes = new QXmlIndexes("xml_indexes");

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

    public final NumberPath<Integer> pathId = createNumber("pathId", Integer.class);

    public final StringPath secondaryType = createString("secondaryType");

    public final StringPath secondaryTypeDesc = createString("secondaryTypeDesc");

    public final NumberPath<Byte> type = createNumber("type", Byte.class);

    public final StringPath typeDesc = createString("typeDesc");

    public final NumberPath<Integer> usingXmlIndexId = createNumber("usingXmlIndexId", Integer.class);

    public final NumberPath<Byte> xmlIndexType = createNumber("xmlIndexType", Byte.class);

    public final StringPath xmlIndexTypeDescription = createString("xmlIndexTypeDescription");

    public QXmlIndexes(String variable) {
        super(QXmlIndexes.class, forVariable(variable), "sys", "xml_indexes");
        addMetadata();
    }

    public QXmlIndexes(String variable, String schema, String table) {
        super(QXmlIndexes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QXmlIndexes(Path<? extends QXmlIndexes> path) {
        super(path.getType(), path.getMetadata(), "sys", "xml_indexes");
        addMetadata();
    }

    public QXmlIndexes(PathMetadata metadata) {
        super(QXmlIndexes.class, metadata, "sys", "xml_indexes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(allowPageLocks, ColumnMetadata.named("allow_page_locks").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(allowRowLocks, ColumnMetadata.named("allow_row_locks").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(dataSpaceId, ColumnMetadata.named("data_space_id").withIndex(7).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(fillFactor, ColumnMetadata.named("fill_factor").withIndex(11).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(filterDefinition, ColumnMetadata.named("filter_definition").withIndex(21).ofType(Types.NVARCHAR).withSize(2147483647));
        addMetadata(hasFilter, ColumnMetadata.named("has_filter").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
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
        addMetadata(pathId, ColumnMetadata.named("path_id").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(secondaryType, ColumnMetadata.named("secondary_type").withIndex(18).ofType(Types.CHAR).withSize(1));
        addMetadata(secondaryTypeDesc, ColumnMetadata.named("secondary_type_desc").withIndex(19).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(type, ColumnMetadata.named("type").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(typeDesc, ColumnMetadata.named("type_desc").withIndex(5).ofType(Types.NVARCHAR).withSize(60));
        addMetadata(usingXmlIndexId, ColumnMetadata.named("using_xml_index_id").withIndex(17).ofType(Types.INTEGER).withSize(10));
        addMetadata(xmlIndexType, ColumnMetadata.named("xml_index_type").withIndex(22).ofType(Types.TINYINT).withSize(3));
        addMetadata(xmlIndexTypeDescription, ColumnMetadata.named("xml_index_type_description").withIndex(23).ofType(Types.NVARCHAR).withSize(60));
    }

}

