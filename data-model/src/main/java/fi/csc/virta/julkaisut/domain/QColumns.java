package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QColumns is a Querydsl query type for QColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumns extends com.querydsl.sql.RelationalPathBase<QColumns> {

    private static final long serialVersionUID = -1032722080;

    public static final QColumns columns = new QColumns("columns");

    public final StringPath collationName = createString("collationName");

    public final NumberPath<Integer> columnId = createNumber("columnId", Integer.class);

    public final NumberPath<Integer> defaultObjectId = createNumber("defaultObjectId", Integer.class);

    public final BooleanPath isAnsiPadded = createBoolean("isAnsiPadded");

    public final BooleanPath isColumnSet = createBoolean("isColumnSet");

    public final BooleanPath isComputed = createBoolean("isComputed");

    public final BooleanPath isDtsReplicated = createBoolean("isDtsReplicated");

    public final BooleanPath isFilestream = createBoolean("isFilestream");

    public final BooleanPath isIdentity = createBoolean("isIdentity");

    public final BooleanPath isMergePublished = createBoolean("isMergePublished");

    public final BooleanPath isNonSqlSubscribed = createBoolean("isNonSqlSubscribed");

    public final BooleanPath isNullable = createBoolean("isNullable");

    public final BooleanPath isReplicated = createBoolean("isReplicated");

    public final BooleanPath isRowguidcol = createBoolean("isRowguidcol");

    public final BooleanPath isSparse = createBoolean("isSparse");

    public final BooleanPath isXmlDocument = createBoolean("isXmlDocument");

    public final NumberPath<Short> maxLength = createNumber("maxLength", Short.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> objectId = createNumber("objectId", Integer.class);

    public final NumberPath<Byte> precision = createNumber("precision", Byte.class);

    public final NumberPath<Integer> ruleObjectId = createNumber("ruleObjectId", Integer.class);

    public final NumberPath<Byte> scale = createNumber("scale", Byte.class);

    public final NumberPath<Byte> systemTypeId = createNumber("systemTypeId", Byte.class);

    public final NumberPath<Integer> userTypeId = createNumber("userTypeId", Integer.class);

    public final NumberPath<Integer> xmlCollectionId = createNumber("xmlCollectionId", Integer.class);

    public QColumns(String variable) {
        super(QColumns.class, forVariable(variable), "sys", "columns");
        addMetadata();
    }

    public QColumns(String variable, String schema, String table) {
        super(QColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumns(Path<? extends QColumns> path) {
        super(path.getType(), path.getMetadata(), "sys", "columns");
        addMetadata();
    }

    public QColumns(PathMetadata metadata) {
        super(QColumns.class, metadata, "sys", "columns");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationName, ColumnMetadata.named("collation_name").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(columnId, ColumnMetadata.named("column_id").withIndex(3).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(defaultObjectId, ColumnMetadata.named("default_object_id").withIndex(22).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isAnsiPadded, ColumnMetadata.named("is_ansi_padded").withIndex(11).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isColumnSet, ColumnMetadata.named("is_column_set").withIndex(25).ofType(Types.BIT).withSize(1));
        addMetadata(isComputed, ColumnMetadata.named("is_computed").withIndex(14).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isDtsReplicated, ColumnMetadata.named("is_dts_replicated").withIndex(19).ofType(Types.BIT).withSize(1));
        addMetadata(isFilestream, ColumnMetadata.named("is_filestream").withIndex(15).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isIdentity, ColumnMetadata.named("is_identity").withIndex(13).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isMergePublished, ColumnMetadata.named("is_merge_published").withIndex(18).ofType(Types.BIT).withSize(1));
        addMetadata(isNonSqlSubscribed, ColumnMetadata.named("is_non_sql_subscribed").withIndex(17).ofType(Types.BIT).withSize(1));
        addMetadata(isNullable, ColumnMetadata.named("is_nullable").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isReplicated, ColumnMetadata.named("is_replicated").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(isRowguidcol, ColumnMetadata.named("is_rowguidcol").withIndex(12).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(isSparse, ColumnMetadata.named("is_sparse").withIndex(24).ofType(Types.BIT).withSize(1));
        addMetadata(isXmlDocument, ColumnMetadata.named("is_xml_document").withIndex(20).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(maxLength, ColumnMetadata.named("max_length").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(precision, ColumnMetadata.named("precision").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(ruleObjectId, ColumnMetadata.named("rule_object_id").withIndex(23).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(scale, ColumnMetadata.named("scale").withIndex(8).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(systemTypeId, ColumnMetadata.named("system_type_id").withIndex(4).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(userTypeId, ColumnMetadata.named("user_type_id").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(xmlCollectionId, ColumnMetadata.named("xml_collection_id").withIndex(21).ofType(Types.INTEGER).withSize(10).notNull());
    }

}

