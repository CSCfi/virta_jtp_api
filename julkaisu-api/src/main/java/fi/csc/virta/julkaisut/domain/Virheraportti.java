package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Virheraportti")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Virheraportti implements DTO {

    private String organisaatioTunnus;
    private String nimi;
    private String kuvaus;
    private String julkaisunOrgTunnus;
    private String julkaisunNimi;
    private String julkaisutyyppikoodi;
    private String koodi;
    private String virheviesti;
    private Long virheraporttiID;
    private Integer tila;
    private Integer tarkistusID;
    private Integer ilmoitusVuosi;
    private Integer julkaisuVuosi;

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public String getnimi() {
        return nimi;
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public String getJulkaisunOrgTunnus() {
        return julkaisunOrgTunnus;
    }

    public String getJulkaisunNimi() {
        return julkaisunNimi;
    }

    public String getJulkaisutyyppikoodi() {
        return julkaisutyyppikoodi;
    }

    public String getKoodi() {
        return koodi;
    }

    public String getVirheviesti() {
        return virheviesti;
    }

    public Long getVirheraporttiID() {
        return virheraporttiID;
    }

    public Integer getTila() {
        return tila;
    }

    public Integer getTarkistusID() {
        return tarkistusID;
    }

    public Integer getIlmoitusVuosi() {
        return ilmoitusVuosi;
    }

    public Integer getJulkaisuVuosi() {
        return julkaisuVuosi;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public void setnimi(String nimi) {
        this.nimi = nimi;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public void setJulkaisunOrgTunnus(String julkaisunOrgTunnus) {
        this.julkaisunOrgTunnus = julkaisunOrgTunnus;
    }

    public void setJulkaisunNimi(String julkaisunNimi) {
        this.julkaisunNimi = julkaisunNimi;
    }

    public void setJulkaisutyyppikoodi(String julkaisutyyppikoodi) {
        this.julkaisutyyppikoodi = julkaisutyyppikoodi;
    }

    public void setKoodi(String Koodi) {
        this.koodi = Koodi;
    }

    public void setvirheviesti(String virheviesti) {
        this.virheviesti = virheviesti;
    }

    public void setvirheraporttiID(Long virheraporttiID) {
        this.virheraporttiID = virheraporttiID;
    }

    public void setTila(Integer Tila) {
        this.tila = Tila;
    }

    public void setTarkistusID(Integer tarkistusID) {
        this.tarkistusID = tarkistusID;
    }

    public void setIlmoitusVuosi(Integer ilmoitusVuosi) {
        this.ilmoitusVuosi = ilmoitusVuosi;
    }

    public void setJulkaisuVuosi(Integer julkaisuVuosi) {
        this.julkaisuVuosi = julkaisuVuosi;
    }


    @Override
    public Long keySelector() {
        return virheraporttiID;
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
