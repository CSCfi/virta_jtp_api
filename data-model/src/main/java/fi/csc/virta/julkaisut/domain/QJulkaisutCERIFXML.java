package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJulkaisutCERIFXML is a Querydsl query type for QJulkaisutCERIFXML
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisutCERIFXML extends com.querydsl.sql.RelationalPathBase<QJulkaisutCERIFXML> {

    private static final long serialVersionUID = 1632492788;

    public static final QJulkaisutCERIFXML JulkaisutCERIFXML = new QJulkaisutCERIFXML("JulkaisutCERIFXML");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final NumberPath<Long> julkaisuCERIFXMLid = createNumber("julkaisuCERIFXMLid", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath xmldata = createString("xmldata");

    public final com.querydsl.sql.PrimaryKey<QJulkaisutCERIFXML> julkaisutCERIFXMLJulkaisuCERIFXMLidPK = createPrimaryKey(julkaisuCERIFXMLid);

    public QJulkaisutCERIFXML(String variable) {
        super(QJulkaisutCERIFXML.class, forVariable(variable), "dbo", "JulkaisutCERIFXML");
        addMetadata();
    }

    public QJulkaisutCERIFXML(String variable, String schema, String table) {
        super(QJulkaisutCERIFXML.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisutCERIFXML(Path<? extends QJulkaisutCERIFXML> path) {
        super(path.getType(), path.getMetadata(), "dbo", "JulkaisutCERIFXML");
        addMetadata();
    }

    public QJulkaisutCERIFXML(PathMetadata metadata) {
        super(QJulkaisutCERIFXML.class, metadata, "dbo", "JulkaisutCERIFXML");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuCERIFXMLid, ColumnMetadata.named("JulkaisuCERIFXMLid").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(4).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(5).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(6).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(xmldata, ColumnMetadata.named("xmldata").withIndex(3).ofType(Types.LONGNVARCHAR).withSize(2147483647));
    }

}


