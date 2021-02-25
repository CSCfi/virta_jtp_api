package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;


/**
 * QJulkaisut is a Querydsl query type for QJulkaisut
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJulkaisut extends com.querydsl.sql.RelationalPathBase<QJulkaisut> {

    private static final long serialVersionUID = 1493655587;

    public static final QJulkaisut Julkaisut = new QJulkaisut("Julkaisut");

    public final NumberPath<Integer> artikkelinumero = createNumber("artikkelinumero", Integer.class);

    public final NumberPath<Integer> avoinSaatavuusKoodi = createNumber("avoinSaatavuusKoodi", Integer.class);

    public final StringPath doi = createString("doi");

    public final StringPath emojulkaisunNimi = createString("emojulkaisunNimi");

    public final StringPath emojulkaisunToimittajat = createString("emojulkaisunToimittajat");

    public final NumberPath<Integer> eVOjulkaisu = createNumber("eVOjulkaisu", Integer.class);

    public final NumberPath<Integer> ilmoitusVuosi = createNumber("ilmoitusVuosi", Integer.class);

    public final StringPath jufoLuokka = createString("jufoLuokka");

    public final StringPath jufoTunnus = createString("jufoTunnus");

    public final NumberPath<Long> julkaisuID = createNumber("julkaisuID", Long.class);

    public final StringPath julkaisumaa = createString("julkaisumaa");

    public final NumberPath<Integer> julkaisunKansainvalisyys = createNumber("julkaisunKansainvalisyys", Integer.class);

    public final StringPath julkaisunKieli = createString("julkaisunKieli");

    public final StringPath julkaisunNimi = createString("julkaisunNimi");

    public final StringPath julkaisunOrgTunnus = createString("julkaisunOrgTunnus");

    public final NumberPath<Integer> julkaisunTila = createNumber("julkaisunTila", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final NumberPath<Integer> julkaisuRinnakkaistallennettu = createNumber("julkaisuRinnakkaistallennettu", Integer.class);

    public final StringPath julkaisuTyyppi = createString("julkaisuTyyppi");

    public final NumberPath<Integer> julkaisuVuosi = createNumber("julkaisuVuosi", Integer.class);

    public final StringPath konferenssinNimi = createString("konferenssinNimi");

    public final StringPath kustannuspaikka = createString("kustannuspaikka");

    public final StringPath kustantajanNimi = createString("kustantajanNimi");

    public final StringPath lahdetietokannanTunnus = createString("lahdetietokannanTunnus");

    public final StringPath lehdenNimi = createString("lehdenNimi");

    public final StringPath lehdenNumero = createString("lehdenNumero");

    public final StringPath luoja = createString("luoja");

    public final DateTimePath<java.sql.Timestamp> luontipaivamaara = createDateTime("luontipaivamaara", java.sql.Timestamp.class);

    public final NumberPath<Long> orgID = createNumber("orgID", Long.class);

    public final StringPath paivittaja = createString("paivittaja");

    public final DateTimePath<java.sql.Timestamp> paivityspaivamaara = createDateTime("paivityspaivamaara", java.sql.Timestamp.class);

    public final StringPath pysyvaOsoite = createString("pysyvaOsoite");

    public final StringPath sivunumero = createString("sivunumero");

    public final StringPath tekijatiedot = createString("tekijatiedot");

    public final NumberPath<Integer> tekijoidenLkm = createNumber("tekijoidenLkm", Integer.class);

    public final StringPath volyymi = createString("volyymi");

    public final NumberPath<Integer> yhteisjulkaisuKV = createNumber("yhteisjulkaisuKV", Integer.class);

    public final NumberPath<Integer> yhteisjulkaisuMuu = createNumber("yhteisjulkaisuMuu", Integer.class);

    public final NumberPath<Integer> yhteisjulkaisuSHP = createNumber("yhteisjulkaisuSHP", Integer.class);

    public final NumberPath<Integer> yhteisjulkaisuTutkimuslaitos = createNumber("yhteisjulkaisuTutkimuslaitos", Integer.class);

    public final NumberPath<Integer> yhteisjulkaisuYritys = createNumber("yhteisjulkaisuYritys", Integer.class);
    
    public final StringPath jufoTunnusJaadytys = createString("jufoTunnusJaadytys");
    public final StringPath jufoLuokkaJaadytys = createString("jufoLuokkaJaadytys");

    public final com.querydsl.sql.PrimaryKey<QJulkaisut> julkaisutFJulkaisuIDPK = createPrimaryKey(julkaisuID);

    public final com.querydsl.sql.ForeignKey<QOrganisaatio> julkaisuOrganisaatioFK = createForeignKey(orgID, "OrgID");

    public final com.querydsl.sql.ForeignKey<QAvainsanat> _avainsanatJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QIssn> _iSSNJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QHanke> _hankeJulkaisuIDFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QTekijat> _tekijatJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QIsbn> _iSBNJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QRinnakkaisOsoite> _rOSOITEJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QJulkaisunKoulutusala> _julkaisunKoulutusalaDJulkaisuIDFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QYhteisjulkaisut> _yhteisjulkaisutJulkaisuFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QJulkaisunOrgYksikko> _julkaisunOrgYksikkoJulkaisuIDFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public final com.querydsl.sql.ForeignKey<QJulkaisunTieteenala> _julkaisunTieteenalaDJulkaisuIDFK = createInvForeignKey(julkaisuID, "JulkaisuID");
    
    public final com.querydsl.sql.ForeignKey<QJulkaisunTaiteenala> _julkaisunTaiteenalaDJulkaisuIDFK = createInvForeignKey(julkaisuID, "JulkaisuID");

    public QJulkaisut(String variable) {
        super(QJulkaisut.class, forVariable(variable), "dbo", "Julkaisut");
        addMetadata();
    }

    public QJulkaisut(String variable, String schema, String table) {
        super(QJulkaisut.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJulkaisut(Path<? extends QJulkaisut> path) {
        super(path.getType(), path.getMetadata(), "dbo", "Julkaisut");
        addMetadata();
    }

    public QJulkaisut(PathMetadata metadata) {
        super(QJulkaisut.class, metadata, "dbo", "Julkaisut");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artikkelinumero, ColumnMetadata.named("Artikkelinumero").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(avoinSaatavuusKoodi, ColumnMetadata.named("AvoinSaatavuusKoodi").withIndex(25).ofType(Types.INTEGER).withSize(10));
        addMetadata(doi, ColumnMetadata.named("DOI").withIndex(27).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(emojulkaisunNimi, ColumnMetadata.named("EmojulkaisunNimi").withIndex(16).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(emojulkaisunToimittajat, ColumnMetadata.named("EmojulkaisunToimittajat").withIndex(17).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(eVOjulkaisu, ColumnMetadata.named("EVOjulkaisu").withIndex(26).ofType(Types.INTEGER).withSize(10));
        addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(jufoLuokka, ColumnMetadata.named("JufoLuokka").withIndex(32).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(jufoTunnus, ColumnMetadata.named("JufoTunnus").withIndex(31).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(julkaisuID, ColumnMetadata.named("JulkaisuID").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(julkaisumaa, ColumnMetadata.named("Julkaisumaa").withIndex(33).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(julkaisunKansainvalisyys, ColumnMetadata.named("JulkaisunKansainvalisyys").withIndex(22).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunKieli, ColumnMetadata.named("JulkaisunKieli").withIndex(37).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(8).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(julkaisunOrgTunnus, ColumnMetadata.named("JulkaisunOrgTunnus").withIndex(30).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTila, ColumnMetadata.named("JulkaisunTila").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(2).ofType(Types.NVARCHAR).withSize(50).notNull());
        addMetadata(julkaisuRinnakkaistallennettu, ColumnMetadata.named("JulkaisuRinnakkaistallennettu").withIndex(24).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisuTyyppi, ColumnMetadata.named("JulkaisuTyyppi").withIndex(4).ofType(Types.NVARCHAR).withSize(2).notNull());
        addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(konferenssinNimi, ColumnMetadata.named("KonferenssinNimi").withIndex(35).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(kustannuspaikka, ColumnMetadata.named("Kustannuspaikka").withIndex(15).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(kustantajanNimi, ColumnMetadata.named("KustantajanNimi").withIndex(36).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(lahdetietokannanTunnus, ColumnMetadata.named("LahdetietokannanTunnus").withIndex(29).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(lehdenNimi, ColumnMetadata.named("LehdenNimi").withIndex(34).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(lehdenNumero, ColumnMetadata.named("LehdenNumero").withIndex(14).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(luoja, ColumnMetadata.named("Luoja").withIndex(38).ofType(Types.NVARCHAR).withSize(30).notNull());
        addMetadata(luontipaivamaara, ColumnMetadata.named("Luontipaivamaara").withIndex(39).ofType(Types.TIMESTAMP).withSize(24).withDigits(4).notNull());
        addMetadata(orgID, ColumnMetadata.named("OrgID").withIndex(6).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(paivittaja, ColumnMetadata.named("Paivittaja").withIndex(40).ofType(Types.NVARCHAR).withSize(30));
        addMetadata(paivityspaivamaara, ColumnMetadata.named("Paivityspaivamaara").withIndex(41).ofType(Types.TIMESTAMP).withSize(24).withDigits(4));
        addMetadata(pysyvaOsoite, ColumnMetadata.named("PysyvaOsoite").withIndex(28).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(sivunumero, ColumnMetadata.named("Sivunumero").withIndex(11).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(tekijatiedot, ColumnMetadata.named("Tekijatiedot").withIndex(9).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(tekijoidenLkm, ColumnMetadata.named("TekijoidenLkm").withIndex(10).ofType(Types.INTEGER).withSize(10));
        addMetadata(volyymi, ColumnMetadata.named("Volyymi").withIndex(13).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(yhteisjulkaisuKV, ColumnMetadata.named("YhteisjulkaisuKV").withIndex(18).ofType(Types.INTEGER).withSize(10));
        addMetadata(yhteisjulkaisuMuu, ColumnMetadata.named("YhteisjulkaisuMuu").withIndex(21).ofType(Types.INTEGER).withSize(10));
        addMetadata(yhteisjulkaisuSHP, ColumnMetadata.named("YhteisjulkaisuSHP").withIndex(19).ofType(Types.INTEGER).withSize(10));
        addMetadata(yhteisjulkaisuTutkimuslaitos, ColumnMetadata.named("YhteisjulkaisuTutkimuslaitos").withIndex(20).ofType(Types.INTEGER).withSize(10));
        addMetadata(yhteisjulkaisuYritys, ColumnMetadata.named("YhteisjulkaisuYritys").withIndex(23).ofType(Types.INTEGER).withSize(10));
        addMetadata(jufoTunnusJaadytys, ColumnMetadata.named("JufoTunnusJaadytys").withIndex(42).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(jufoLuokkaJaadytys, ColumnMetadata.named("JufoLuokkaJaadytys").withIndex(43).ofType(Types.NVARCHAR).withSize(1));
    }

}

