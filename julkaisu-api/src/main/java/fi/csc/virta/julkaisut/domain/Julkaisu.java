package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Julkaisu")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Julkaisu implements DTO {
    
    /* testikommentti */

    @JsonIgnore
    private Long julkaisuID;
    private String julkaisunTunnus;
    private String julkaisunNimi;
    private String tekijat;
    private Integer julkaisuVuosi;
    private String julkaisuTyyppi;
    private String lehdenNimi;
    private String kustantajanNimi;
    private String isbn;
    private String issn;
    @ApiModelProperty(value = "Date ISO-8601 format")
    private Date muutospvm;
    @ApiModelProperty(value = "Date ISO-8601 format")
    private Date luontipvm;
    private Integer julkaisunTila;
    private String doi;
    private String julkaisunOrgTunnus;
    private String yhteisJulkaisunTunnus;
    private String jufoTunnus;
    private String organisaatioTunnus;
    private Integer ilmoitusVuosi;
    private String konferenssinNimi;
    private String emojulkaisunNimi;
    private String pysyvaOsoiteTeksti;
    private String jufoTunnusJaadytys;
    private String jufoLuokkaJaadytys;
    
    public Julkaisu() {
    }

    public Long getJulkaisuID() {
        return julkaisuID;
    }

    public void setJulkaisuID(Long julkaisuID) {
        this.julkaisuID = julkaisuID;
    }

    @XmlElement(name = "JulkaisunNimi")
    public String getJulkaisunNimi() {
        return julkaisunNimi;
    }

    public void setJulkaisunNimi(String julkaisunNimi) {
        this.julkaisunNimi = julkaisunNimi;
    }

    @XmlElement(name = "JulkaisunTunnus")
    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    @XmlElement(name = "TekijatiedotTeksti")
    public String getTekijat() {
        return tekijat;
    }

    public void setTekijat(String tekijat) {
        this.tekijat = tekijat;
    }

    @XmlElement(name = "JulkaisuVuosi")
    public Integer getJulkaisuVuosi() {
        return julkaisuVuosi;
    }

    public void setJulkaisuVuosi(Integer julkaisuVuosi) {
        this.julkaisuVuosi = julkaisuVuosi;
    }

    @XmlElement(name = "JulkaisutyyppiKoodi")
    public String getJulkaisuTyyppi() {
        return julkaisuTyyppi;
    }

    public void setJulkaisuTyyppi(String julkaisuTyyppi) {
        this.julkaisuTyyppi = julkaisuTyyppi;
    }

    @XmlElement(name = "LehdenNimi")
    public String getLehdenNimi() {
        return lehdenNimi;
    }

    public void setLehdenNimi(String lehdenNimi) {
        this.lehdenNimi = lehdenNimi;
    }

    @XmlElement(name = "KustantajanNimi")
    public String getKustantajanNimi() {
        return kustantajanNimi;
    }

    public void setKustantajanNimi(String kustantajanNimi) {
        this.kustantajanNimi = kustantajanNimi;
    }

    public Date getMuutospvm() {
        return muutospvm;
    }

    public void setMuutospvm(Date muutospvm) {
        this.muutospvm = muutospvm;
    }

    public Date getLuontipvm() {
        return luontipvm;
    }

    public void setLuontipvm(Date luontipvm) {
        this.luontipvm = luontipvm;
    }

    @XmlElement(name = "JulkaisunTilaKoodi")
    public Integer getJulkaisunTila() {
        return julkaisunTila;
    }

    public void setJulkaisunTila(Integer julkaisunTila) {
        this.julkaisunTila = julkaisunTila;
    }

    @XmlElement(name = "ISBN")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @XmlElement(name = "ISSN")
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @XmlElement(name = "DOI")
    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @XmlElement(name = "JulkaisunOrgTunnus")
    public String getJulkaisunOrgTunnus() {
        return julkaisunOrgTunnus;
    }

    public void setJulkaisunOrgTunnus(String julkaisunOrgTunnus) {
        this.julkaisunOrgTunnus = julkaisunOrgTunnus;
    }

    @XmlElement(name = "YhteisjulkaisunTunnus")
    public String getYhteisJulkaisunTunnus() {
        return yhteisJulkaisunTunnus;
    }

    public void setYhteisJulkaisunTunnus(String yhteisJulkaisunTunnus) {
        this.yhteisJulkaisunTunnus = yhteisJulkaisunTunnus;
    }

    @XmlElement(name = "JufoTunnus")
    public String getJufoTunnus() {
        return jufoTunnus;
    }

    public void setJufoTunnus(String jufoTunnus) {
        this.jufoTunnus = jufoTunnus;
    }

    @XmlElement(name = "OrganisaatioTunnus")
    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    @XmlElement(name = "IlmoitusVuosi")
    public Integer getIlmoitusVuosi() {
        return ilmoitusVuosi;
    }

    public void setIlmoitusVuosi(Integer ilmoitusVuosi) {
        this.ilmoitusVuosi = ilmoitusVuosi;
    }

    @XmlElement(name = "KonferenssinNimi")
    public String getKonferenssinNimi() {
        return konferenssinNimi;
    }

    public void setKonferenssinNimi(String konferenssinNimi) {
        this.konferenssinNimi = konferenssinNimi;
    }

    @XmlElement(name = "EmojulkaisunNimi")
    public String getEmojulkaisunNimi() {
        return emojulkaisunNimi;
    }

    public void setEmojulkaisunNimi(String emojulkaisunNimi) {
        this.emojulkaisunNimi = emojulkaisunNimi;
    }

    @XmlElement(name = "PysyvaOsoiteTeksti")
    public String getPysyvaOsoiteTeksti() {
        return pysyvaOsoiteTeksti;
    }

    public void setPysyvaOsoiteTeksti(String pysyvaOsoiteTeksti) {
        this.pysyvaOsoiteTeksti = pysyvaOsoiteTeksti;
    }
    
    @XmlElement(name = "JufoTunnusJaadytys")
    public String getJufoTunnusJaadytys() {
        return jufoTunnusJaadytys;
    }

    public void setJufoTunnusJaadytys(String jufoTunnusJaadytys) {
        this.jufoTunnusJaadytys = jufoTunnusJaadytys;
    }

    @XmlElement(name = "JufoLuokkaJaadytys")
    public String getJufoLuokkaJaadytys() {
        return jufoLuokkaJaadytys;
    }

    public void setJufoLuokkaJaadytys(String jufoLuokkaJaadytys) {
        this.jufoLuokkaJaadytys = jufoLuokkaJaadytys;
    }
    
    @Override
    public Long keySelector() {
        return julkaisuID;
    }

    @Override
    public void setId(Long id) {
        setJulkaisuID(id);
    }
}
