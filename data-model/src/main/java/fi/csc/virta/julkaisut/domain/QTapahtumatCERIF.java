package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTapahtumatCERIF is a Querydsl query type for QTapahtumatCERIF
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTapahtumatCERIF extends com.querydsl.sql.RelationalPathBase<QTapahtumatCERIF> {

    private static final long serialVersionUID = 163212345;

    public static final QTapahtumatCERIF TapahtumatCERIF = new QTapahtumatCERIF("TapahtumatCERIF");

    public final StringPath tapahtumaID = createString("tapahtumaID");
    
    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final NumberPath<Long> tapahtumaCERIFid = createNumber("tapahtumaCERIFid", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath xmldata = createString("xmldata");
    
    public final StringPath identifier = createString("identifier");

    public final com.querydsl.sql.PrimaryKey<QTapahtumatCERIF> tapahtumatCERIFTapahtumaCERIFidPK = createPrimaryKey(tapahtumaCERIFid);

    public QTapahtumatCERIF(String variable) {
        super(QTapahtumatCERIF.class, forVariable(variable), "dbo", "TapahtumatCERIF");
        addMetadata();
    }

    public QTapahtumatCERIF(String variable, String schema, String table) {
        super(QTapahtumatCERIF.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTapahtumatCERIF(Path<? extends QTapahtumatCERIF> path) {
        super(path.getType(), path.getMetadata(), "dbo", "TapahtumatCERIF");
        addMetadata();
    }

    public QTapahtumatCERIF(PathMetadata metadata) {
        super(QTapahtumatCERIF.class, metadata, "dbo", "TapahtumatCERIF");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(tapahtumaID, ColumnMetadata.named("TapahtumaID").withIndex(2).ofType(Types.NVARCHAR).withSize(1000).notNull());
        addMetadata(tapahtumaCERIFid, ColumnMetadata.named("TapahtumaCERIFid").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(3).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(5).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(6).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(7).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(8).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(xmldata, ColumnMetadata.named("xmldata").withIndex(4).ofType(Types.LONGNVARCHAR).withSize(2147483647));
        addMetadata(identifier, ColumnMetadata.named("Identifier").withIndex(9).ofType(Types.LONGNVARCHAR).withSize(1000));
    }

}


