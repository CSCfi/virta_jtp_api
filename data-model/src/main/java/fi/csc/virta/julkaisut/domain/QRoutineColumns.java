package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRoutineColumns is a Querydsl query type for QRoutineColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRoutineColumns extends com.querydsl.sql.RelationalPathBase<QRoutineColumns> {

    private static final long serialVersionUID = -1150439530;

    public static final QRoutineColumns routineColumns = new QRoutineColumns("ROUTINE_COLUMNS");

    public final NumberPath<Integer> characterMaximumLength = createNumber("characterMaximumLength", Integer.class);

    public final NumberPath<Integer> characterOctetLength = createNumber("characterOctetLength", Integer.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath columnDefault = createString("columnDefault");

    public final StringPath columnName = createString("columnName");

    public final StringPath dataType = createString("dataType");

    public final NumberPath<Short> datetimePrecision = createNumber("datetimePrecision", Short.class);

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final StringPath isNullable = createString("isNullable");

    public final NumberPath<Byte> numericPrecision = createNumber("numericPrecision", Byte.class);

    public final NumberPath<Short> numericPrecisionRadix = createNumber("numericPrecisionRadix", Short.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public QRoutineColumns(String variable) {
        super(QRoutineColumns.class, forVariable(variable), "INFORMATION_SCHEMA", "ROUTINE_COLUMNS");
        addMetadata();
    }

    public QRoutineColumns(String variable, String schema, String table) {
        super(QRoutineColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRoutineColumns(Path<? extends QRoutineColumns> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ROUTINE_COLUMNS");
        addMetadata();
    }

    public QRoutineColumns(PathMetadata metadata) {
        super(QRoutineColumns.class, metadata, "INFORMATION_SCHEMA", "ROUTINE_COLUMNS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(15).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(17).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(16).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(18).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(20).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(19).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(columnDefault, ColumnMetadata.named("COLUMN_DEFAULT").withIndex(6).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(21).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(23).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(22).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(isNullable, ColumnMetadata.named("IS_NULLABLE").withIndex(7).ofType(Types.VARCHAR).withSize(3));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(11).ofType(Types.TINYINT).withSize(3));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(12).ofType(Types.SMALLINT).withSize(5));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(13).ofType(Types.INTEGER).withSize(10));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(5).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
    }

}

