package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QDomains is a Querydsl query type for QDomains
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDomains extends com.querydsl.sql.RelationalPathBase<QDomains> {

    private static final long serialVersionUID = -144894542;

    public static final QDomains domains = new QDomains("DOMAINS");

    public final NumberPath<Integer> characterMaximumLength = createNumber("characterMaximumLength", Integer.class);

    public final NumberPath<Integer> characterOctetLength = createNumber("characterOctetLength", Integer.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath dataType = createString("dataType");

    public final NumberPath<Short> datetimePrecision = createNumber("datetimePrecision", Short.class);

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainDefault = createString("domainDefault");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final NumberPath<Byte> numericPrecision = createNumber("numericPrecision", Byte.class);

    public final NumberPath<Short> numericPrecisionRadix = createNumber("numericPrecisionRadix", Short.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public QDomains(String variable) {
        super(QDomains.class, forVariable(variable), "INFORMATION_SCHEMA", "DOMAINS");
        addMetadata();
    }

    public QDomains(String variable, String schema, String table) {
        super(QDomains.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDomains(Path<? extends QDomains> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "DOMAINS");
        addMetadata();
    }

    public QDomains(PathMetadata metadata) {
        super(QDomains.class, metadata, "INFORMATION_SCHEMA", "DOMAINS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(10).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(12).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(11).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(7).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(9).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(8).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(4).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(16).ofType(Types.SMALLINT).withSize(5));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(1).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(domainDefault, ColumnMetadata.named("DOMAIN_DEFAULT").withIndex(17).ofType(Types.NVARCHAR).withSize(4000));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(3).ofType(Types.NVARCHAR).withSize(128).notNull());
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(2).ofType(Types.NVARCHAR).withSize(128));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(13).ofType(Types.TINYINT).withSize(3));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(14).ofType(Types.SMALLINT).withSize(5));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(15).ofType(Types.INTEGER).withSize(10));
    }

}

