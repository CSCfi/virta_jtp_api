package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRoutines is a Querydsl query type for QRoutines
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRoutines extends com.querydsl.sql.RelationalPathBase<QRoutines> {

    private static final long serialVersionUID = -1320642804;

    public static final QRoutines routines = new QRoutines("ROUTINES");

    public final NumberPath<Integer> characterMaximumLength = createNumber("characterMaximumLength", Integer.class);

    public final NumberPath<Integer> characterOctetLength = createNumber("characterOctetLength", Integer.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath dataType = createString("dataType");

    public final NumberPath<Short> datetimePrecision = createNumber("datetimePrecision", Short.class);

    public final StringPath dtdIdentifier = createString("dtdIdentifier");

    public final StringPath externalLanguage = createString("externalLanguage");

    public final StringPath externalName = createString("externalName");

    public final NumberPath<Short> intervalPrecision = createNumber("intervalPrecision", Short.class);

    public final StringPath intervalType = createString("intervalType");

    public final StringPath isDeterministic = createString("isDeterministic");

    public final StringPath isImplicitlyInvocable = createString("isImplicitlyInvocable");

    public final StringPath isNullCall = createString("isNullCall");

    public final StringPath isUserDefinedCast = createString("isUserDefinedCast");

    public final DateTimePath<java.sql.Timestamp> lastAltered = createDateTime("lastAltered", java.sql.Timestamp.class);

    public final NumberPath<Short> maxDynamicResultSets = createNumber("maxDynamicResultSets", Short.class);

    public final NumberPath<Long> maximumCardinality = createNumber("maximumCardinality", Long.class);

    public final StringPath moduleCatalog = createString("moduleCatalog");

    public final StringPath moduleName = createString("moduleName");

    public final StringPath moduleSchema = createString("moduleSchema");

    public final NumberPath<Byte> numericPrecision = createNumber("numericPrecision", Byte.class);

    public final NumberPath<Short> numericPrecisionRadix = createNumber("numericPrecisionRadix", Short.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final StringPath parameterStyle = createString("parameterStyle");

    public final StringPath routineBody = createString("routineBody");

    public final StringPath routineCatalog = createString("routineCatalog");

    public final StringPath routineDefinition = createString("routineDefinition");

    public final StringPath routineName = createString("routineName");

    public final StringPath routineSchema = createString("routineSchema");

    public final StringPath routineType = createString("routineType");

    public final StringPath schemaLevelRoutine = createString("schemaLevelRoutine");

    public final StringPath scopeCatalog = createString("scopeCatalog");

    public final StringPath scopeName = createString("scopeName");

    public final StringPath scopeSchema = createString("scopeSchema");

    public final StringPath specificCatalog = createString("specificCatalog");

    public final StringPath specificName = createString("specificName");

    public final StringPath specificSchema = createString("specificSchema");

    public final StringPath sqlDataAccess = createString("sqlDataAccess");

    public final StringPath sqlPath = createString("sqlPath");

    public final StringPath typeUdtCatalog = createString("typeUdtCatalog");

    public final StringPath typeUdtName = createString("typeUdtName");

    public final StringPath typeUdtSchema = createString("typeUdtSchema");

    public final StringPath udtCatalog = createString("udtCatalog");

    public final StringPath udtName = createString("udtName");

    public final StringPath udtSchema = createString("udtSchema");

    public QRoutines(String variable) {
        super(QRoutines.class, forVariable(variable), "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public QRoutines(String variable, String schema, String table) {
        super(QRoutines.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRoutines(Path<? extends QRoutines> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public QRoutines(PathMetadata metadata) {
        super(QRoutines.class, metadata, "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(15).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(16).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(20).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(22).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(21).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(17).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(19).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(18).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(50).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(14).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(26).ofType(Types.SMALLINT).withSize(5));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(36).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(externalLanguage, ColumnMetadata.named("EXTERNAL_LANGUAGE").withIndex(40).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(externalName, ColumnMetadata.named("EXTERNAL_NAME").withIndex(39).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(28).ofType(Types.SMALLINT).withSize(5));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(27).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(isDeterministic, ColumnMetadata.named("IS_DETERMINISTIC").withIndex(42).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(isImplicitlyInvocable, ColumnMetadata.named("IS_IMPLICITLY_INVOCABLE").withIndex(49).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(isNullCall, ColumnMetadata.named("IS_NULL_CALL").withIndex(44).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(isUserDefinedCast, ColumnMetadata.named("IS_USER_DEFINED_CAST").withIndex(48).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(lastAltered, ColumnMetadata.named("LAST_ALTERED").withIndex(51).ofType(Types.TIMESTAMP).withSize(23).withDigits(3).notNull());
        addMetadata(maxDynamicResultSets, ColumnMetadata.named("MAX_DYNAMIC_RESULT_SETS").withIndex(47).ofType(Types.SMALLINT).withSize(5));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(35).ofType(Types.BIGINT).withSize(19));
        addMetadata(moduleCatalog, ColumnMetadata.named("MODULE_CATALOG").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(moduleName, ColumnMetadata.named("MODULE_NAME").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(moduleSchema, ColumnMetadata.named("MODULE_SCHEMA").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(23).ofType(Types.TINYINT).withSize(3));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(24).ofType(Types.SMALLINT).withSize(5));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(25).ofType(Types.INTEGER).withSize(10));
        addMetadata(parameterStyle, ColumnMetadata.named("PARAMETER_STYLE").withIndex(41).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(routineBody, ColumnMetadata.named("ROUTINE_BODY").withIndex(37).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(routineCatalog, ColumnMetadata.named("ROUTINE_CATALOG").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(routineDefinition, ColumnMetadata.named("ROUTINE_DEFINITION").withIndex(38).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(routineName, ColumnMetadata.named("ROUTINE_NAME").withIndex(6).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(routineSchema, ColumnMetadata.named("ROUTINE_SCHEMA").withIndex(5).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(routineType, ColumnMetadata.named("ROUTINE_TYPE").withIndex(7).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(schemaLevelRoutine, ColumnMetadata.named("SCHEMA_LEVEL_ROUTINE").withIndex(46).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(scopeCatalog, ColumnMetadata.named("SCOPE_CATALOG").withIndex(32).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(scopeName, ColumnMetadata.named("SCOPE_NAME").withIndex(34).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(scopeSchema, ColumnMetadata.named("SCOPE_SCHEMA").withIndex(33).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(specificCatalog, ColumnMetadata.named("SPECIFIC_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(specificName, ColumnMetadata.named("SPECIFIC_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(specificSchema, ColumnMetadata.named("SPECIFIC_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(sqlDataAccess, ColumnMetadata.named("SQL_DATA_ACCESS").withIndex(43).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(sqlPath, ColumnMetadata.named("SQL_PATH").withIndex(45).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(typeUdtCatalog, ColumnMetadata.named("TYPE_UDT_CATALOG").withIndex(29).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(typeUdtName, ColumnMetadata.named("TYPE_UDT_NAME").withIndex(31).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(typeUdtSchema, ColumnMetadata.named("TYPE_UDT_SCHEMA").withIndex(30).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(udtCatalog, ColumnMetadata.named("UDT_CATALOG").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(udtName, ColumnMetadata.named("UDT_NAME").withIndex(13).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(udtSchema, ColumnMetadata.named("UDT_SCHEMA").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
    }

}

