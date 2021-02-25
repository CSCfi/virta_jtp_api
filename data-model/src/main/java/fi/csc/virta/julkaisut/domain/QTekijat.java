package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTekijat is a Querydsl query type for QTekijat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTekijat extends com.querydsl.sql.RelationalPathBase<QTekijat> {

    private static final long serialVersionUID = 882362801;

    public static final QTekijat Tekijat = new QTekijat("Tekijat");

    public final StringPath etunimet = createString("etunimet");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final StringPath orcid = createString("orcid");

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath sukuNimi = createString("sukuNimi");

    public final NumberPath<Long> tekijaID = createNumber("tekijaID", Long.class);

    public final com.querydsl.sql.PrimaryKey<QTekijat> tekijatDTekijaIDPK = createPrimaryKey(tekijaID);

    public final com.querydsl.sql.ForeignKey<QJulkaisut> tekijatJulkaisuFK = createForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QTekijanOrgYksikko> _tekijanOrgYksikkoTekijaIDFK = createInvForeignKey(tekijaID, "TekijaID");

    public QTekijat(String variable) {
        super(QTekijat.class, forVariable(variable), "dbo", "Tekijat");
        addMetadata();
    }

    public QTekijat(String variable, String schema, String table) {
        super(QTekijat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTekijat(Path<? extends QTekijat> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Tekijat");
        addMetadata();
    }

    public QTekijat(PathMetadata metadata) {
        super(QTekijat.class, metadata, "dbo", "Tekijat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(etunimet, ColumnMetadata.named("Etunimet").withIndex(4).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(2).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(6).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(7).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(orcid, ColumnMetadata.named("ORCID").withIndex(5).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(8).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(9).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(sukuNimi, ColumnMetadata.named("SukuNimi").withIndex(3).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(tekijaID, ColumnMetadata.named("TekijaID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

