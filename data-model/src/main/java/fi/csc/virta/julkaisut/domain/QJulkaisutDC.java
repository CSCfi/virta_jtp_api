package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisutDC is a Querydsl query type for QJulkaisutDC
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisutDC extends com.querydsl.sql.RelationalPathBase<QJulkaisutDC> {

    private static final long serialVersionUID = 883944418;

    public static final QJulkaisutDC JulkaisutDC = new QJulkaisutDC("JulkaisutDC");

    public final NumberPath<Long> julkaisuDCid = createNumber("julkaisuDCid", Long.class);

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath xmldata = createString("xmldata");

    public final com.querydsl.sql.PrimaryKey<QJulkaisutDC> julkaisutXMLJulkaisuDCidPK = createPrimaryKey(julkaisuDCid);

    public QJulkaisutDC(String variable) {
        super(QJulkaisutDC.class, forVariable(variable), "dbo", "JulkaisutDC");
        addMetadata();
    }

    public QJulkaisutDC(String variable, String schema, String table) {
        super(QJulkaisutDC.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisutDC(Path<? extends QJulkaisutDC> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisutDC");
        addMetadata();
    }

    public QJulkaisutDC(PathMetadata metadata) {
        super(QJulkaisutDC.class, metadata, "dbo", "JulkaisutDC");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisuDCid, ColumnMetadata.named("JulkaisuDCid").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(xmldata, ColumnMetadata.named("xmldata").withIndex(3).ofType(Types.LONGNVARCHAR).withSize(2147483647));
    }

}

