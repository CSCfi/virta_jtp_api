package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTekijatCERIF is a Querydsl query type for QTekijatCERIF
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTekijatCERIF extends com.querydsl.sql.RelationalPathBase<QTekijatCERIF> {

    private static final long serialVersionUID = 1632444444;

    public static final QTekijatCERIF TekijatCERIF = new QTekijatCERIF("TekijatCERIF");

    public final StringPath tekijaID = createString("tekijaID");
    
    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final NumberPath<Long> tekijaCERIFid = createNumber("tekijaCERIFid", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath xmldata = createString("xmldata");
    
    public final StringPath identifier = createString("identifier");

    public final com.querydsl.sql.PrimaryKey<QTekijatCERIF> tekijatCERIFTekijaCERIFidPK = createPrimaryKey(tekijaCERIFid);

    public QTekijatCERIF(String variable) {
        super(QTekijatCERIF.class, forVariable(variable), "dbo", "TekijatCERIF");
        addMetadata();
    }

    public QTekijatCERIF(String variable, String schema, String table) {
        super(QTekijatCERIF.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTekijatCERIF(Path<? extends QTekijatCERIF> path) {
        super(path.getType(), path.getMetadata(), "dbo", "TekijatCERIF");
        addMetadata();
    }

    public QTekijatCERIF(PathMetadata metadata) {
        super(QTekijatCERIF.class, metadata, "dbo", "TekijatCERIF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tekijaID, ColumnMetadata.named("TekijaID").withIndex(2).ofType(Types.NVARCHAR).withSize(1000).notNull());
        addMetadata(tekijaCERIFid, ColumnMetadata.named("TekijaCERIFid").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(xmldata, ColumnMetadata.named("xmldata").withIndex(4).ofType(Types.LONGNVARCHAR).withSize(2147483647));
        addMetadata(identifier, ColumnMetadata.named("Identifier").withIndex(9).ofType(Types.LONGNVARCHAR).withSize(1000));
    }

}


