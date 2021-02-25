package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import fi.csc.virta.julkaisut.annotation.TKRelation;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@XmlRootElement(name = "JulkaisuTK")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class JulkaisuTK implements DTO {

    private String organisaatioTunnus;
    private Integer ilmoitusVuosi;
    private String julkaisunTunnus;
    private Integer julkaisunTilakoodi;
    private String julkaisunOrgTunnus;
    private Integer julkaisuVuosi;
    private String julkaisunNimi;
    private String tekijatiedotTeksti;
    private Integer tekijoidenLkm;
    private String sivunumeroTeksti;
    private String artikkelinumero;
    private String isbn;
    private String jufoTunnus;
    private String jufoLuokkaKoodi;
    private String julkaisumaaKoodi;
    private String lehdenNimi;
    private String issn;
    private String volyymiTeksti;
    private String lehdenNumeroTeksti;
    private String konferenssinNimi;
    private String kustantajanNimi;
    private String kustannuspaikkaTeksti;
    private String emojulkaisunNimi;
    private String emojulkaisunToimittajatTeksti;
    private String julkaisutyyppiKoodi;
    private String yhteisjulkaisuKVKytkin;
    private String yhteisjulkaisuSHPKytkin;
    private String yhteisjulkaisuTutkimuslaitosKytkin;
    private String yhteisjulkaisuMuuKytkin;
    private String julkaisunKansainvalisyysKytkin;
    private String julkaisunKieliKoodi;
    private String avoinSaatavuusKoodi;
    private String evoJulkaisunKytkin;
    private String doi;
    private String pysyvaOsoiteTeksti;
    private String lahdetietokannanTunnus;
    private String latausId;
    private String yhteisjulkaisuId;
    private String rinnakkaistallennusKytkin;
    private String yhteisjulkaisunTunnus;
    private String juuliOsoiteTeksti;
    private String yhteisjulkaisuYritysKytkin;
    private String jufoId;
    private Integer orgSektori;
    private Set<HankeTK> hankeTKs = new LinkedHashSet<>();
    private Set<AvainsanaTK> avainsanaTKs = new LinkedHashSet<>();
    private Set<IsbnTK> isbnTKs = new LinkedHashSet<>();
    private Set<IssnTK> issnTKs = new LinkedHashSet<>();
    private Set<KoulutusalaTK> koulutusalaTKs = new LinkedHashSet<>();
    private Set<OrgYksikkoTK> orgYksikkoTKs = new LinkedHashSet<>();
    private Set<TekijaTK> tekijaTKs = new LinkedHashSet<>();
    private Set<TieteenalaTK> tieteenalaTKs = new LinkedHashSet<>();
    private Set<TaiteenalaTK> taiteenalaTKs = new LinkedHashSet<>();
    private String kasvatusalat_1;
    private String taiteet_ja_kulttuurialat_2;
    private String humanistiset_alat_3;
    private String yhteiskunnalliset_alat_4;
    private String kauppa_hallinto_ja_oikeustieteet_5;
    private String luonnontieteet_6;
    private String tietojenkasittely_ja_tietoliikenne_7;
    private String tekniikan_alat_8;
    private String maa_ja_metsatalousalat_9;
    private String laaketieteet_10;
    private String terveys_ja_hyvinvointialat_11;
    private String palvelualat_12;
    private String jufoLuokkaVanha;
    private String jufoLuokkaUusi;
    private String alayksikko;

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public Integer getIlmoitusVuosi() {
        return ilmoitusVuosi;
    }

    public void setIlmoitusVuosi(Integer ilmoitusVuosi) {
        this.ilmoitusVuosi = ilmoitusVuosi;
    }

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public Integer getJulkaisunTilakoodi() {
        return julkaisunTilakoodi;
    }

    public void setJulkaisunTilakoodi(Integer julkaisunTilakoodi) {
        this.julkaisunTilakoodi = julkaisunTilakoodi;
    }

    public String getJulkaisunOrgTunnus() {
        return julkaisunOrgTunnus;
    }

    public void setJulkaisunOrgTunnus(String julkaisunOrgTunnus) {
        this.julkaisunOrgTunnus = julkaisunOrgTunnus;
    }

    public Integer getJulkaisuVuosi() {
        return julkaisuVuosi;
    }

    public void setJulkaisuVuosi(Integer julkaisuVuosi) {
        this.julkaisuVuosi = julkaisuVuosi;
    }

    public String getJulkaisunNimi() {
        return julkaisunNimi;
    }

    public void setJulkaisunNimi(String julkaisunNimi) {
        this.julkaisunNimi = julkaisunNimi;
    }

    public String getTekijatiedotTeksti() {
        return tekijatiedotTeksti;
    }

    public void setTekijatiedotTeksti(String tekijatiedotTeksti) {
        this.tekijatiedotTeksti = tekijatiedotTeksti;
    }

    public Integer getTekijoidenLkm() {
        return tekijoidenLkm;
    }

    public void setTekijoidenLkm(Integer tekijoidenLkm) {
        this.tekijoidenLkm = tekijoidenLkm;
    }

    public String getSivunumeroTeksti() {
        return sivunumeroTeksti;
    }

    public void setSivunumeroTeksti(String sivunumeroTeksti) {
        this.sivunumeroTeksti = sivunumeroTeksti;
    }

    public String getArtikkelinumero() {
        return artikkelinumero;
    }

    public void setArtikkelinumero(String artikkelinumero) {
        this.artikkelinumero = artikkelinumero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJufoTunnus() {
        return jufoTunnus;
    }

    public void setJufoTunnus(String jufoTunnus) {
        this.jufoTunnus = jufoTunnus;
    }

    public String getJufoLuokkaKoodi() {
        return jufoLuokkaKoodi;
    }

    public void setJufoLuokkaKoodi(String jufoLuokkaKoodi) {
        this.jufoLuokkaKoodi = jufoLuokkaKoodi;
    }

    public String getJulkaisumaaKoodi() {
        return julkaisumaaKoodi;
    }

    public void setJulkaisumaaKoodi(String julkaisumaaKoodi) {
        this.julkaisumaaKoodi = julkaisumaaKoodi;
    }

    public String getLehdenNimi() {
        return lehdenNimi;
    }

    public void setLehdenNimi(String lehdenNimi) {
        this.lehdenNimi = lehdenNimi;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getVolyymiTeksti() {
        return volyymiTeksti;
    }

    public void setVolyymiTeksti(String volyymiTeksti) {
        this.volyymiTeksti = volyymiTeksti;
    }

    public String getLehdenNumeroTeksti() {
        return lehdenNumeroTeksti;
    }

    public void setLehdenNumeroTeksti(String lehdenNumeroTeksti) {
        this.lehdenNumeroTeksti = lehdenNumeroTeksti;
    }

    public String getKonferenssinNimi() {
        return konferenssinNimi;
    }

    public void setKonferenssinNimi(String konferenssinNimi) {
        this.konferenssinNimi = konferenssinNimi;
    }

    public String getKustantajanNimi() {
        return kustantajanNimi;
    }

    public void setKustantajanNimi(String kustantajanNimi) {
        this.kustantajanNimi = kustantajanNimi;
    }

    public String getKustannuspaikkaTeksti() {
        return kustannuspaikkaTeksti;
    }

    public void setKustannuspaikkaTeksti(String kustannuspaikkaTeksti) {
        this.kustannuspaikkaTeksti = kustannuspaikkaTeksti;
    }

    public String getEmojulkaisunNimi() {
        return emojulkaisunNimi;
    }

    public void setEmojulkaisunNimi(String emojulkaisunNimi) {
        this.emojulkaisunNimi = emojulkaisunNimi;
    }

    public String getEmojulkaisunToimittajatTeksti() {
        return emojulkaisunToimittajatTeksti;
    }

    public void setEmojulkaisunToimittajatTeksti(String emojulkaisunToimittajatTeksti) {
        this.emojulkaisunToimittajatTeksti = emojulkaisunToimittajatTeksti;
    }

    public String getJulkaisutyyppiKoodi() {
        return julkaisutyyppiKoodi;
    }

    public void setJulkaisutyyppiKoodi(String julkaisutyyppiKoodi) {
        this.julkaisutyyppiKoodi = julkaisutyyppiKoodi;
    }

    public String getYhteisjulkaisuKVKytkin() {
        return yhteisjulkaisuKVKytkin;
    }

    public void setYhteisjulkaisuKVKytkin(String yhteisjulkaisuKVKytkin) {
        this.yhteisjulkaisuKVKytkin = yhteisjulkaisuKVKytkin;
    }

    public String getYhteisjulkaisuSHPKytkin() {
        return yhteisjulkaisuSHPKytkin;
    }

    public void setYhteisjulkaisuSHPKytkin(String yhteisjulkaisuSHPKytkin) {
        this.yhteisjulkaisuSHPKytkin = yhteisjulkaisuSHPKytkin;
    }

    public String getYhteisjulkaisuTutkimuslaitosKytkin() {
        return yhteisjulkaisuTutkimuslaitosKytkin;
    }

    public void setYhteisjulkaisuTutkimuslaitosKytkin(String yhteisjulkaisuTutkimuslaitosKytkin) {
        this.yhteisjulkaisuTutkimuslaitosKytkin = yhteisjulkaisuTutkimuslaitosKytkin;
    }

    public String getYhteisjulkaisuMuuKytkin() {
        return yhteisjulkaisuMuuKytkin;
    }

    public void setYhteisjulkaisuMuuKytkin(String yhteisjulkaisuMuuKytkin) {
        this.yhteisjulkaisuMuuKytkin = yhteisjulkaisuMuuKytkin;
    }

    public String getJulkaisunKansainvalisyysKytkin() {
        return julkaisunKansainvalisyysKytkin;
    }

    public void setJulkaisunKansainvalisyysKytkin(String julkaisunKansainvalisyysKytkin) {
        this.julkaisunKansainvalisyysKytkin = julkaisunKansainvalisyysKytkin;
    }

    public String getJulkaisunKieliKoodi() {
        return julkaisunKieliKoodi;
    }

    public void setJulkaisunKieliKoodi(String julkaisunKieliKoodi) {
        this.julkaisunKieliKoodi = julkaisunKieliKoodi;
    }

    public String getAvoinSaatavuusKoodi() {
        return avoinSaatavuusKoodi;
    }

    public void setAvoinSaatavuusKoodi(String avoinSaatavuusKoodi) {
        this.avoinSaatavuusKoodi = avoinSaatavuusKoodi;
    }

    public String getEvoJulkaisunKytkin() {
        return evoJulkaisunKytkin;
    }

    public void setEvoJulkaisunKytkin(String evoJulkaisunKytkin) {
        this.evoJulkaisunKytkin = evoJulkaisunKytkin;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPysyvaOsoiteTeksti() {
        return pysyvaOsoiteTeksti;
    }

    public void setPysyvaOsoiteTeksti(String pysyvaOsoiteTeksti) {
        this.pysyvaOsoiteTeksti = pysyvaOsoiteTeksti;
    }

    public String getLahdetietokannanTunnus() {
        return lahdetietokannanTunnus;
    }

    public void setLahdetietokannanTunnus(String lahdetietokannanTunnus) {
        this.lahdetietokannanTunnus = lahdetietokannanTunnus;
    }

    public String getLatausId() {
        return latausId;
    }

    public void setLatausId(String latausId) {
        this.latausId = latausId;
    }

    public String getYhteisjulkaisuId() {
        return yhteisjulkaisuId;
    }

    public void setYhteisjulkaisuId(String yhteisjulkaisuId) {
        this.yhteisjulkaisuId = yhteisjulkaisuId;
    }

    public String getRinnakkaistallennusKytkin() {
        return rinnakkaistallennusKytkin;
    }

    public void setRinnakkaistallennusKytkin(String rinnakkaistallennusKytkin) {
        this.rinnakkaistallennusKytkin = rinnakkaistallennusKytkin;
    }

    public String getYhteisjulkaisunTunnus() {
        return yhteisjulkaisunTunnus;
    }

    public void setYhteisjulkaisunTunnus(String yhteisjulkaisunTunnus) {
        this.yhteisjulkaisunTunnus = yhteisjulkaisunTunnus;
    }

    public String getJuuliOsoiteTeksti() {
        return juuliOsoiteTeksti;
    }

    public void setJuuliOsoiteTeksti(String juuliOsoiteTeksti) {
        this.juuliOsoiteTeksti = juuliOsoiteTeksti;
    }

    public String getYhteisjulkaisuYritysKytkin() {
        return yhteisjulkaisuYritysKytkin;
    }

    public void setYhteisjulkaisuYritysKytkin(String yhteisjulkaisuYritysKytkin) {
        this.yhteisjulkaisuYritysKytkin = yhteisjulkaisuYritysKytkin;
    }

    public String getJufoId() {
        return jufoId;
    }

    public void setJufoId(String jufoId) {
        this.jufoId = jufoId;
    }

    //      
    public Integer getOrgSektori() {
        return orgSektori;
    }

    public void setOrgSektori(Integer orgSektori) {
        this.orgSektori = orgSektori;
    }


    public String getkasvatusalat_1() {
        return kasvatusalat_1;
    }

    public void setkasvatusalat_1(String kasvatusalat_1) {
        this.kasvatusalat_1 = kasvatusalat_1;
    }

    public String gettaiteet_ja_kulttuurialat_2() {
        return taiteet_ja_kulttuurialat_2;
    }

    public void settaiteet_ja_kulttuurialat_2(String taiteet_ja_kulttuurialat_2) {
        this.taiteet_ja_kulttuurialat_2 = taiteet_ja_kulttuurialat_2;
    }

    public String gethumanistiset_alat_3() {
        return humanistiset_alat_3;
    }

    public void sethumanistiset_alat_3(String humanistiset_alat_3) {
        this.humanistiset_alat_3 = humanistiset_alat_3;
    }

    public String getyhteiskunnalliset_alat_4() {
        return yhteiskunnalliset_alat_4;
    }

    public void setyhteiskunnalliset_alat_4(String yhteiskunnalliset_alat_4) {
        this.yhteiskunnalliset_alat_4 = yhteiskunnalliset_alat_4;
    }

    public String getkauppa_hallinto_ja_oikeustieteet_5() {
        return kauppa_hallinto_ja_oikeustieteet_5;
    }

    public void setkauppa_hallinto_ja_oikeustieteet_5(String kauppa_hallinto_ja_oikeustieteet_5) {
        this.kauppa_hallinto_ja_oikeustieteet_5 = kauppa_hallinto_ja_oikeustieteet_5;
    }

    public String getluonnontieteet_6() {
        return luonnontieteet_6;
    }

    public void setluonnontieteet_6(String luonnontieteet_6) {
        this.luonnontieteet_6 = luonnontieteet_6;
    }

    public String gettietojenkasittely_ja_tietoliikenne_7() {
        return tietojenkasittely_ja_tietoliikenne_7;
    }

    public void settietojenkasittely_ja_tietoliikenne_7(String tietojenkasittely_ja_tietoliikenne_7) {
        this.tietojenkasittely_ja_tietoliikenne_7 = tietojenkasittely_ja_tietoliikenne_7;
    }

    public String gettekniikan_alat_8() {
        return tekniikan_alat_8;
    }

    public void settekniikan_alat_8(String tekniikan_alat_8) {
        this.tekniikan_alat_8 = tekniikan_alat_8;
    }

    public String getmaa_ja_metsatalousalat_9() {
        return maa_ja_metsatalousalat_9;
    }

    public void setmaa_ja_metsatalousalat_9(String maa_ja_metsatalousalat_9) {
        this.maa_ja_metsatalousalat_9 = maa_ja_metsatalousalat_9;
    }

    public String getlaaketieteet_10() {
        return laaketieteet_10;
    }

    public void setlaaketieteet_10(String laaketieteet_10) {
        this.laaketieteet_10 = laaketieteet_10;
    }

    public String getterveys_ja_hyvinvointialat_11() {
        return terveys_ja_hyvinvointialat_11;
    }

    public void setterveys_ja_hyvinvointialat_11(String terveys_ja_hyvinvointialat_11) {
        this.terveys_ja_hyvinvointialat_11 = terveys_ja_hyvinvointialat_11;
    }

    public String getpalvelualat_12() {
        return palvelualat_12;
    }

    public void setpalvelualat_12(String palvelualat_12) {
        this.palvelualat_12 = palvelualat_12;
    }
    
    public String getJufoLuokkaVanha() {
        return jufoLuokkaVanha;
    }
    
    public void setJufoLuokkaVanha(String jufoLuokkaVanha) {
        this.jufoLuokkaVanha = jufoLuokkaVanha;
    }
    
    public String getJufoLuokkaUusi() {
        return jufoLuokkaUusi;
    }    
    
    public void setJufoLuokkaUusi(String jufoLuokkaUusi) {
        this.jufoLuokkaUusi = jufoLuokkaUusi;
    }
    
    public String getAlayksikko() {
        return alayksikko;
    }
    
    public void setAlayksikko(String alayksikko) {
        this.alayksikko = alayksikko;
    }
    
    @TKRelation(type = HankeTK.class)
    public Set<HankeTK> getHankeTKs() {
        return hankeTKs;
    }

    public void setHankeTKs(Set<HankeTK> hankeTKs) {
        this.hankeTKs = hankeTKs;
    }

    @TKRelation(type = AvainsanaTK.class)
    public Set<AvainsanaTK> getAvainsanaTKs() {
        return avainsanaTKs;
    }

    public void setAvainsanaTKs(Set<AvainsanaTK> avainsanaTKs) {
        this.avainsanaTKs = avainsanaTKs;
    }

    @TKRelation(type = IsbnTK.class)
    public Set<IsbnTK> getIsbnTKs() {
        return isbnTKs;
    }

    public void setIsbnTKs(Set<IsbnTK> isbnTKs) {
        this.isbnTKs = isbnTKs;
    }

    @TKRelation(type = IssnTK.class)
    public Set<IssnTK> getIssnTKs() {
        return issnTKs;
    }

    public void setIssnTKs(Set<IssnTK> issnTKs) {
        this.issnTKs = issnTKs;
    }

    @TKRelation(type = KoulutusalaTK.class)
    public Set<KoulutusalaTK> getKoulutusalaTKs() {
        return koulutusalaTKs;
    }

    public void setKoulutusalaTKs(Set<KoulutusalaTK> koulutusalaTKs) {
        this.koulutusalaTKs = koulutusalaTKs;
    }

    @TKRelation(type = OrgYksikkoTK.class)
    public Set<OrgYksikkoTK> getOrgYksikkoTKs() {
        return orgYksikkoTKs;
    }

    public void setOrgYksikkoTKs(Set<OrgYksikkoTK> orgYksikkoTKs) {
        this.orgYksikkoTKs = orgYksikkoTKs;
    }

    @TKRelation(type = TekijaTK.class)
    public Set<TekijaTK> getTekijaTKs() {
        return tekijaTKs;
    }

    public void setTekijaTKs(Set<TekijaTK> tekijaTKs) {
        this.tekijaTKs = tekijaTKs;
    }

    @TKRelation(type = TieteenalaTK.class)
    public Set<TieteenalaTK> getTieteenalaTKs() {
        return tieteenalaTKs;
    }

    public void setTieteenalaTKs(Set<TieteenalaTK> tieteenalaTKs) {
        this.tieteenalaTKs = tieteenalaTKs;
    }
    
    @TKRelation(type = TaiteenalaTK.class)
    public Set<TaiteenalaTK> getTaiteenalaTKs() {
        return taiteenalaTKs;
    }

    public void setTaiteenalaTKs(Set<TaiteenalaTK> taiteenalaTKs) {
        this.taiteenalaTKs = taiteenalaTKs;
    }

    @Override
    public Long keySelector() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public void setMuutospvm(Date muutospvm) {

    }

    @Override
    public void setLuontipvm(Date luontipvm) {

    }
}
