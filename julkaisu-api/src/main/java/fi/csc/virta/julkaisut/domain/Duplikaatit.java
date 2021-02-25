package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "duplikaatit")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)

public class Duplikaatit implements DTO {

    private Long duplikaattiID;
    private String organisaatiotunnus;
    private String organisaationimi;
    private String julkaisuntunnus;
    private String kuvaus;
    private String julkaisunorgtunnus;
    private String duplikaattijulkaisunorgtunnus;
    private String julkaisunnimi;
    private String duplikaattijulkaisunnimi;
    private String julkaisutyyppikoodi;
    private Integer tila;
    private Integer tarkistusID;
    private String luontipaivamaara;
    private Integer ilmoitusvuosi;
    private Integer julkaisuvuosi;

    public Long getduplikaattiID() {
        return duplikaattiID;
    }

    public String getorganisaatiotunnus() {
        return organisaatiotunnus;
    }

    public String getorganisaationimi() {
        return organisaationimi;
    }

    public String getjulkaisuntunnus() {
        return julkaisuntunnus;
    }

    public String getkuvaus() {
        return kuvaus;
    }

    public String getjulkaisunorgtunnus() {
        return julkaisunorgtunnus;
    }

    public String getduplikaattijulkaisunorgtunnus() {
        return duplikaattijulkaisunorgtunnus;
    }

    public String getjulkaisunnimi() {
        return julkaisunnimi;
    }

    public String getduplikaattijulkaisunnimi() {
        return duplikaattijulkaisunnimi;
    }

    public String getjulkaisutyyppikoodi() {
        return julkaisutyyppikoodi;
    }

    public Integer gettila() {
        return tila;
    }

    public Integer gettarkistusID() {
        return tarkistusID;
    }

    public String getluontipaivamaara() {
        return luontipaivamaara;
    }

    public Integer getilmoitusvuosi() {
        return ilmoitusvuosi;
    }

    public Integer getjulkaisuvuosi() {
        return julkaisuvuosi;
    }

    public void setduplikaattiID(Long duplikaattiID) {
        this.duplikaattiID = duplikaattiID;
    }

    public void setorganisaatiotunnus(String organisaatiotunnus) {
        this.organisaatiotunnus = organisaatiotunnus;
    }

    public void setorganisaationimi(String organisaationimi) {
        this.organisaationimi = organisaationimi;
    }

    public void setjulkaisuntunnus(String julkaisuntunnus) {
        this.julkaisuntunnus = julkaisuntunnus;
    }

    public void setkuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    public void setjulkaisunorgtunnus(String julkaisunorgtunnus) {
        this.julkaisunorgtunnus = julkaisunorgtunnus;
    }

    public void setduplikaattijulkaisunorgtunnus(String duplikaattijulkaisunorgtunnus) {
        this.duplikaattijulkaisunorgtunnus = duplikaattijulkaisunorgtunnus;
    }

    public void setjulkaisunnimi(String julkaisunnimi) {
        this.julkaisunnimi = julkaisunnimi;
    }

    public void setduplikaattijulkaisunnimi(String duplikaattijulkaisunnimi) {
        this.duplikaattijulkaisunnimi = duplikaattijulkaisunnimi;
    }

    public void setjulkaisutyyppikoodi(String julkaisutyyppikoodi) {
        this.julkaisutyyppikoodi = julkaisutyyppikoodi;
    }

    public void settila(Integer tila) {
        this.tila = tila;
    }

    public void settarkistusID(Integer tarkistusID) {
        this.tarkistusID = tarkistusID;
    }

    public void setluontipaivamaara(String luontipaivamaara) {
        this.luontipaivamaara = luontipaivamaara;
    }

    public void setilmoitusvuosi(Integer ilmoitusvuosi) {
        this.ilmoitusvuosi = ilmoitusvuosi;
    }

    public void setjulkaisuvuosi(Integer julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }


    @Override
    public Long keySelector() {
        return duplikaattiID;
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
