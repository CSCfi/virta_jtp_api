package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Yhteisjulkaisut")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class YhteisjulkaisutRistiriitaiset implements DTO {

    private Long rrID;
    private String yhteisjulkaisunTunnus;
    private String julkaisunTunnus;
    private String organisaatioNimi;
    private String organisaatioTunnus;
    private Integer julkaisuVuosi;
    private Integer ilmoitusVuosi;
    private String julkaisunNimi;
    private String julkaisutyyppi;
    private String julkaisunOrgTunnus;
    private String liittyvaJulkaisunOrgTunnus;
    private String luontipaivamaara;
    private Integer tila;
    private String kuvaus;

    public Long getRrID() {
        return rrID;
    }

    public String getYhteisjulkaisunTunnus() {
        return yhteisjulkaisunTunnus;
    }

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public String getOrganisaatioNimi() {
        return organisaatioNimi;
    }

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public Integer getJulkaisuVuosi() {
        return julkaisuVuosi;
    }

    public Integer getIlmoitusVuosi() {
        return ilmoitusVuosi;
    }

    public String getJulkaisunNimi() {
        return julkaisunNimi;
    }

    public String getJulkaisutyyppi() {
        return julkaisutyyppi;
    }

    public String getJulkaisunOrgTunnus() {
        return julkaisunOrgTunnus;
    }
    
    public String getLiittyvaJulkaisunOrgTunnus() {
        return liittyvaJulkaisunOrgTunnus;
    }

    public String getLuontipaivamaara() {
        return luontipaivamaara;
    }

    public Integer getTila() {
        return tila;
    }

    public String getKuvaus() {
        return kuvaus;
    }


    public void setRrID(Long rrID) {
        this.rrID = rrID;
    }

    public void setYhteisjulkaisunTunnus(String yhteisjulkaisunTunnus) {
        this.yhteisjulkaisunTunnus = yhteisjulkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public void setOrganisaatioNimi(String organisaatioNimi) {
        this.organisaatioNimi = organisaatioNimi;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public void setJulkaisuVuosi(Integer julkaisuVuosi) {
        this.julkaisuVuosi = julkaisuVuosi;
    }

    public void setIlmoitusVuosi(Integer ilmoitusVuosi) {
        this.ilmoitusVuosi = ilmoitusVuosi;
    }

    public void setJulkaisunNimi(String julkaisunNimi) {
        this.julkaisunNimi = julkaisunNimi;
    }

    public void setJulkaisutyyppi(String julkaisutyyppi) {
        this.julkaisutyyppi = julkaisutyyppi;
    }

    public void setJulkaisunOrgTunnus(String julkaisunOrgTunnus) {
        this.julkaisunOrgTunnus = julkaisunOrgTunnus;
    }
    
    public void setLiittyvaJulkaisunOrgTunnus(String liittyvaJulkaisunOrgTunnus) {
        this.liittyvaJulkaisunOrgTunnus = liittyvaJulkaisunOrgTunnus;
    }

    public void setLuontipaivamaara(String luontipaivamaara) {
        this.luontipaivamaara = luontipaivamaara;
    }

    public void setTila(Integer tila) {
        this.tila = tila;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }


    @Override
    public Long keySelector() {
        return rrID;
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
