package fi.csc.virta.julkaisut.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTKJulkaisut is a Querydsl query type for QTKJulkaisut
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTKJulkaisut extends com.querydsl.sql.RelationalPathBase<QTKJulkaisut> {

    private static final long serialVersionUID = -1752006964;

    public static final QTKJulkaisut TKJulkaisut = new QTKJulkaisut("TK_Julkaisut");

    public final StringPath artikkelinumero = createString("artikkelinumero");

    public final StringPath avoinSaatavuusKoodi = createString("avoinSaatavuusKoodi");

    public final StringPath doi = createString("doi");

    public final StringPath emojulkaisunNimi = createString("emojulkaisunNimi");

    public final StringPath emojulkaisunToimittajatTeksti = createString("emojulkaisunToimittajatTeksti");

    public final StringPath eVOjulkaisuKytkin = createString("eVOjulkaisuKytkin");

    public final NumberPath<Integer> ilmoitusVuosi = createNumber("ilmoitusVuosi", Integer.class);

    public final StringPath isbn = createString("isbn");

    public final StringPath issn = createString("issn");

    public final StringPath jufoID = createString("jufoID");

    public final StringPath jufoLuokkaKoodi = createString("jufoLuokkaKoodi");

    public final StringPath jufoTunnus = createString("jufoTunnus");

    public final StringPath julkaisumaaKoodi = createString("julkaisumaaKoodi");

    public final StringPath julkaisunKansainvalisyysKytkin = createString("julkaisunKansainvalisyysKytkin");

    public final StringPath julkaisunKieliKoodi = createString("julkaisunKieliKoodi");

    public final StringPath julkaisunNimi = createString("julkaisunNimi");

    public final StringPath julkaisunOrgTunnus = createString("julkaisunOrgTunnus");

    public final NumberPath<Integer> julkaisunTilaKoodi = createNumber("julkaisunTilaKoodi", Integer.class);

    public final StringPath julkaisunTunnus = createString("julkaisunTunnus");

    public final StringPath julkaisutyyppiKoodi = createString("julkaisutyyppiKoodi");

    public final NumberPath<Integer> julkaisuVuosi = createNumber("julkaisuVuosi", Integer.class);

    public final StringPath juuliOsoiteTeksti = createString("juuliOsoiteTeksti");

    public final StringPath konferenssinNimi = createString("konferenssinNimi");

    public final StringPath kustannuspaikkaTeksti = createString("kustannuspaikkaTeksti");

    public final StringPath kustantajanNimi = createString("kustantajanNimi");

    public final StringPath lahdetietokannanTunnus = createString("lahdetietokannanTunnus");

    public final StringPath latausID = createString("latausID");

    public final StringPath lehdenNimi = createString("lehdenNimi");

    public final StringPath lehdenNumeroTeksti = createString("lehdenNumeroTeksti");

    public final StringPath organisaatioTunnus = createString("organisaatioTunnus");

    public final StringPath pysyvaOsoiteTeksti = createString("pysyvaOsoiteTeksti");

    public final StringPath rinnakkaistallenettuKytkin = createString("rinnakkaistallenettuKytkin");

    public final StringPath sivunumeroTeksti = createString("sivunumeroTeksti");

    public final StringPath tekijatiedotTeksti = createString("tekijatiedotTeksti");

    public final NumberPath<Integer> tekijoidenLkm = createNumber("tekijoidenLkm", Integer.class);

    public final StringPath volyymiTeksti = createString("volyymiTeksti");

    public final StringPath yhteisjulkaisuId = createString("yhteisjulkaisuId");

    public final StringPath yhteisjulkaisuKVKytkin = createString("yhteisjulkaisuKVKytkin");

    public final StringPath yhteisjulkaisuMuuKytkin = createString("yhteisjulkaisuMuuKytkin");

    public final StringPath yhteisjulkaisunTunnus = createString("yhteisjulkaisunTunnus");

    public final StringPath yhteisjulkaisuSHPKytkin = createString("yhteisjulkaisuSHPKytkin");

    public final StringPath yhteisjulkaisuTutkimuslaitosKytkin = createString("yhteisjulkaisuTutkimuslaitosKytkin");

    public final StringPath yhteisjulkaisuYritysKytkin = createString("yhteisjulkaisuYritysKytkin");

    //
    public final NumberPath<Integer> orgSektori = createNumber("orgSektori", Integer.class);
    //
    
    public final StringPath kasvatusalat_1  = createString("kasvatusalat_1");
    public final StringPath taiteet_ja_kulttuurialat_2  = createString("taiteet_ja_kulttuurialat_2");
    public final StringPath humanistiset_alat_3  = createString("humanistiset_alat_3");
    public final StringPath yhteiskunnalliset_alat_4  = createString("yhteiskunnalliset_alat_4");
    public final StringPath kauppa_hallinto_ja_oikeustieteet_5  = createString("kauppa_hallinto_ja_oikeustieteet_5");
    public final StringPath luonnontieteet_6  = createString("luonnontieteet_6");
    public final StringPath tietojenkasittely_ja_tietoliikenne_7  = createString("tietojenkasittely_ja_tietoliikenne_7");
    public final StringPath tekniikan_alat_8  = createString("tekniikan_alat_8");
    public final StringPath maa_ja_metsatalousalat_9  = createString("maa_ja_metsatalousalat_9");
    public final StringPath laaketieteet_10  = createString("laaketieteet_10");
    public final StringPath terveys_ja_hyvinvointialat_11  = createString("terveys_ja_hyvinvointialat_11");
    public final StringPath palvelualat_12  = createString("palvelualat_12");

    public final StringPath jufoLuokkaVanha = createString("jufoLuokkaVanha");
    public final StringPath jufoLuokkaUusi = createString("jufoLuokkaUusi");
    
    public final StringPath alayksikko = createString("alayksikko");
        
    public QTKJulkaisut(String variable) {
        super(QTKJulkaisut.class, forVariable(variable), "web", "TK_Julkaisut");
        addMetadata();
    }

    public QTKJulkaisut(String variable, String schema, String table) {
        super(QTKJulkaisut.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTKJulkaisut(Path<? extends QTKJulkaisut> path) {
        super(path.getType(), path.getMetadata(), "web", "TK_Julkaisut");
        addMetadata();
    }

    public QTKJulkaisut(PathMetadata metadata) {
        super(QTKJulkaisut.class, metadata, "web", "TK_Julkaisut");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(artikkelinumero, ColumnMetadata.named("Artikkelinumero").withIndex(11).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(avoinSaatavuusKoodi, ColumnMetadata.named("AvoinSaatavuusKoodi").withIndex(32).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(doi, ColumnMetadata.named("DOI").withIndex(34).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(emojulkaisunNimi, ColumnMetadata.named("EmojulkaisunNimi").withIndex(23).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(emojulkaisunToimittajatTeksti, ColumnMetadata.named("EmojulkaisunToimittajatTeksti").withIndex(24).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(eVOjulkaisuKytkin, ColumnMetadata.named("EVOjulkaisuKytkin").withIndex(33).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(ilmoitusVuosi, ColumnMetadata.named("IlmoitusVuosi").withIndex(2).ofType(Types.INTEGER).withSize(10));
        addMetadata(isbn, ColumnMetadata.named("ISBN").withIndex(12).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(issn, ColumnMetadata.named("ISSN").withIndex(17).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(jufoID, ColumnMetadata.named("Jufo_ID").withIndex(43).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(jufoLuokkaKoodi, ColumnMetadata.named("JufoLuokkaKoodi").withIndex(14).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(jufoTunnus, ColumnMetadata.named("JufoTunnus").withIndex(13).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(julkaisumaaKoodi, ColumnMetadata.named("JulkaisumaaKoodi").withIndex(15).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(julkaisunKansainvalisyysKytkin, ColumnMetadata.named("JulkaisunKansainvalisyysKytkin").withIndex(30).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(julkaisunKieliKoodi, ColumnMetadata.named("JulkaisunKieliKoodi").withIndex(31).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(julkaisunNimi, ColumnMetadata.named("JulkaisunNimi").withIndex(7).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(julkaisunOrgTunnus, ColumnMetadata.named("JulkaisunOrgTunnus").withIndex(5).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(julkaisunTilaKoodi, ColumnMetadata.named("JulkaisunTilaKoodi").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(julkaisunTunnus, ColumnMetadata.named("JulkaisunTunnus").withIndex(3).ofType(Types.NVARCHAR).withSize(500).notNull());
        addMetadata(julkaisutyyppiKoodi, ColumnMetadata.named("JulkaisutyyppiKoodi").withIndex(25).ofType(Types.NVARCHAR).withSize(2));
        addMetadata(julkaisuVuosi, ColumnMetadata.named("JulkaisuVuosi").withIndex(6).ofType(Types.INTEGER).withSize(10));
        addMetadata(juuliOsoiteTeksti, ColumnMetadata.named("JuuliOsoiteTeksti").withIndex(41).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(konferenssinNimi, ColumnMetadata.named("KonferenssinNimi").withIndex(20).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(kustannuspaikkaTeksti, ColumnMetadata.named("KustannuspaikkaTeksti").withIndex(22).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(kustantajanNimi, ColumnMetadata.named("KustantajanNimi").withIndex(21).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(lahdetietokannanTunnus, ColumnMetadata.named("LahdetietokannanTunnus").withIndex(36).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(latausID, ColumnMetadata.named("Lataus_ID").withIndex(37).ofType(Types.NVARCHAR).withSize(255).notNull());
        addMetadata(lehdenNimi, ColumnMetadata.named("LehdenNimi").withIndex(16).ofType(Types.NVARCHAR).withSize(500));
        addMetadata(lehdenNumeroTeksti, ColumnMetadata.named("LehdenNumeroTeksti").withIndex(19).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(organisaatioTunnus, ColumnMetadata.named("OrganisaatioTunnus").withIndex(1).ofType(Types.NVARCHAR).withSize(20));
        addMetadata(pysyvaOsoiteTeksti, ColumnMetadata.named("PysyvaOsoiteTeksti").withIndex(35).ofType(Types.NVARCHAR).withSize(400));
        addMetadata(rinnakkaistallenettuKytkin, ColumnMetadata.named("RinnakkaistallenettuKytkin").withIndex(39).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(sivunumeroTeksti, ColumnMetadata.named("SivunumeroTeksti").withIndex(10).ofType(Types.NVARCHAR).withSize(100));
        addMetadata(tekijatiedotTeksti, ColumnMetadata.named("TekijatiedotTeksti").withIndex(8).ofType(Types.NVARCHAR).withSize(800));
        addMetadata(tekijoidenLkm, ColumnMetadata.named("TekijoidenLkm").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(volyymiTeksti, ColumnMetadata.named("VolyymiTeksti").withIndex(18).ofType(Types.NVARCHAR).withSize(200));
        addMetadata(yhteisjulkaisuId, ColumnMetadata.named("Yhteisjulkaisu_Id").withIndex(38).ofType(Types.NVARCHAR).withSize(20).notNull());
        addMetadata(yhteisjulkaisuKVKytkin, ColumnMetadata.named("YhteisjulkaisuKVKytkin").withIndex(26).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(yhteisjulkaisuMuuKytkin, ColumnMetadata.named("YhteisjulkaisuMuuKytkin").withIndex(29).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(yhteisjulkaisunTunnus, ColumnMetadata.named("YhteisjulkaisunTunnus").withIndex(40).ofType(Types.NVARCHAR).withSize(50));
        addMetadata(yhteisjulkaisuSHPKytkin, ColumnMetadata.named("YhteisjulkaisuSHPKytkin").withIndex(27).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(yhteisjulkaisuTutkimuslaitosKytkin, ColumnMetadata.named("YhteisjulkaisuTutkimuslaitosKytkin").withIndex(28).ofType(Types.NVARCHAR).withSize(1));
        addMetadata(yhteisjulkaisuYritysKytkin, ColumnMetadata.named("YhteisjulkaisuYritysKytkin").withIndex(42).ofType(Types.NVARCHAR).withSize(1));
	addMetadata(orgSektori, ColumnMetadata.named("OrgSektori").withIndex(44).ofType(Types.INTEGER).withSize(5));
        addMetadata(kasvatusalat_1, ColumnMetadata.named("kasvatusalat_1").withIndex(45).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(taiteet_ja_kulttuurialat_2, ColumnMetadata.named("taiteet_ja_kulttuurialat_2").withIndex(46).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(humanistiset_alat_3, ColumnMetadata.named("humanistiset_alat_3").withIndex(47).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(yhteiskunnalliset_alat_4, ColumnMetadata.named("yhteiskunnalliset_alat_4").withIndex(48).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(kauppa_hallinto_ja_oikeustieteet_5, ColumnMetadata.named("kauppa_hallinto_ja_oikeustieteet_5").withIndex(49).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(luonnontieteet_6, ColumnMetadata.named("luonnontieteet_6").withIndex(50).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(tietojenkasittely_ja_tietoliikenne_7, ColumnMetadata.named("tietojenkasittely_ja_tietoliikenne_7").withIndex(51).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(tekniikan_alat_8, ColumnMetadata.named("tekniikan_alat_8").withIndex(52).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(maa_ja_metsatalousalat_9, ColumnMetadata.named("maa_ja_metsatalousalat_9").withIndex(53).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(laaketieteet_10, ColumnMetadata.named("laaketieteet_10").withIndex(54).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(terveys_ja_hyvinvointialat_11, ColumnMetadata.named("terveys_ja_hyvinvointialat_11").withIndex(55).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(palvelualat_12, ColumnMetadata.named("palvelualat_12").withIndex(56).ofType(Types.NVARCHAR).withSize(10));
        addMetadata(jufoLuokkaVanha, ColumnMetadata.named("JufoLuokkaVanha").withIndex(57).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(jufoLuokkaUusi, ColumnMetadata.named("JufoLuokkaUusi").withIndex(58).ofType(Types.NVARCHAR).withSize(5));
        addMetadata(alayksikko, ColumnMetadata.named("Alayksikko").withIndex(59).ofType(Types.NVARCHAR).withSize(500));
    }

}

