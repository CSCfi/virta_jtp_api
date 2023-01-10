package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Tilanneraportti")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Tilanneraportti implements DTO {


    private String organisaatioNimi;
    private String organisaatioTunnus;
    private String julkaisunNimi;
    private String julkaisuTyyppi;
    private String julkaisunTunnus;
    private String organisaationJulkaisuTunnus;
    private String luontiPaivamaara;
    private String paivitysPaivamaara;
    private Long tilanneraporttiID;
    private Integer julkaisuVuosi;
    private Integer ilmoitusVuosi;
    private Integer julkaisunTila;
    private String jufoTunnus;
    private String jufoLuokkaKoodi;	
    private String avoinSaatavuusJulkaisumaksu;
    private Integer avoinSaatavuusJulkaisumaksuVuosi;
    private String julkaisuKanavaOA;
    private String avoinSaatavuusKytkin;
    private String lisenssiKoodi;
    private String muotoKoodi;
    private String yleisoKoodi;
    private String emojulkaisuntyyppiKoodi;
    private String artikkelityyppiKoodi;
    private String vertaisarvioituKytkin;
    private String raporttiKytkin;
    private String opinnayteKoodi;
    private String taidetyyppiKoodi;
    private String avSovellusTyyppiKoodi;


    public String getOrganisaatioNimi() {
        return organisaatioNimi;
    }

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public String getJulkaisunNimi() {
        return julkaisunNimi;
    }

    public String getJulkaisuTyyppi() {
        return julkaisuTyyppi;
    }

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public String getOrganisaationJulkaisuTunnus() {
        return organisaationJulkaisuTunnus;
    }

    public String getLuontiPaivamaara() {
        return luontiPaivamaara;
    }

    public String getPaivitysPaivamaara() {
        return paivitysPaivamaara;
    }

    public Long getTilanneraporttiID() {
        return tilanneraporttiID;
    }

    public Integer getJulkaisuVuosi() {
        return julkaisuVuosi;
    }

    public Integer getIlmoitusVuosi() {
        return ilmoitusVuosi;
    }

    public Integer getJulkaisunTila() {
        return julkaisunTila;
    }
    
    public String getJufoTunnus() {
        return jufoTunnus;
    }
    
    public String getJufoLuokkaKoodi() {
        return jufoLuokkaKoodi;
    }

    public String getAvoinSaatavuusJulkaisumaksu() {
	return avoinSaatavuusJulkaisumaksu;
    }
    
    public Integer getAvoinSaatavuusJulkaisumaksuVuosi() {
	return avoinSaatavuusJulkaisumaksuVuosi;
    }
    
    public String getJulkaisuKanavaOA() {
	return julkaisuKanavaOA;
    }
    
    public String getAvoinSaatavuusKytkin() {
	return avoinSaatavuusKytkin;
    }
	
    public String getLisenssiKoodi() {
        return lisenssiKoodi;
    }
	
    public String getMuotoKoodi() {
	return muotoKoodi;
    }
	
    public String getYleisoKoodi() {
	return yleisoKoodi;
    }
    
    public String getEmojulkaisuntyyppiKoodi() {
	return emojulkaisuntyyppiKoodi;
    }
	
    public String getArtikkelityyppiKoodi() {
	return artikkelityyppiKoodi;
    }
	
    public String getVertaisarvioituKytkin() {
	return vertaisarvioituKytkin;
    }
	
    public String getRaporttiKytkin() {
	return raporttiKytkin;
    }
	
    public String getOpinnayteKoodi() {
	return opinnayteKoodi;
    }
	
    public String getTaidetyyppiKoodi() {
	return taidetyyppiKoodi;
    }
	
    public String getAVSovellusTyyppiKoodi() {
	return avSovellusTyyppiKoodi;
    }

    public void setOrganisaatioNimi(String organisaatioNimi) {
        this.organisaatioNimi = organisaatioNimi;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public void setJulkaisunNimi(String julkaisunNimi) {
        this.julkaisunNimi = julkaisunNimi;
    }

    public void setJulkaisuTyyppi(String julkaisuTyyppi) {
        this.julkaisuTyyppi = julkaisuTyyppi;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public void setOrganisaationJulkaisuTunnus(String organisaationJulkaisuTunnus) {
        this.organisaationJulkaisuTunnus = organisaationJulkaisuTunnus;
    }

    public void setLuontiPaivamaara(String luontiPaivamaara) {
        this.luontiPaivamaara = luontiPaivamaara;
    }

    public void setPaivitysPaivamaara(String paivitysPaivamaara) {
        this.paivitysPaivamaara = paivitysPaivamaara;
    }

    public void setTilanneraporttiID(Long tilanneraporttiID) {
        this.tilanneraporttiID = tilanneraporttiID;
    }

    public void setJulkaisuVuosi(Integer julkaisuVuosi) {
        this.julkaisuVuosi = julkaisuVuosi;
    }

    public void setIlmoitusVuosi(Integer ilmoitusVuosi) {
        this.ilmoitusVuosi = ilmoitusVuosi;
    }

    public void setJulkaisunTila(Integer julkaisunTila) {
        this.julkaisunTila = julkaisunTila;
    }
    
    public void setJufoTunnus(String jufoTunnus) {
        this.jufoTunnus = jufoTunnus;
    }
    
    public void setJufoLuokkaKoodi(String jufoLuokkaKoodi) {
        this.jufoLuokkaKoodi = jufoLuokkaKoodi;
    }
	
    public void setAvoinSaatavuusJulkaisumaksu(String avoinSaatavuusJulkaisumaksu) {
	this.avoinSaatavuusJulkaisumaksu = avoinSaatavuusJulkaisumaksu;
    }
    
    public void setAvoinSaatavuusJulkaisumaksuVuosi(Integer avoinSaatavuusJulkaisumaksuVuosi) {
	this.avoinSaatavuusJulkaisumaksuVuosi = avoinSaatavuusJulkaisumaksuVuosi;
    }
    
    public void setJulkaisuKanavaOA(String julkaisuKanavaOA) {
	this.julkaisuKanavaOA = julkaisuKanavaOA;
    }
	
    public void setAvoinSaatavuusKytkin(String avoinSaatavuusKytkin) {
	this.avoinSaatavuusKytkin = avoinSaatavuusKytkin;
    }
	
    public void setLisenssiKoodi(String lisenssiKoodi) {
	this.lisenssiKoodi = lisenssiKoodi;
    }
	
    public void setMuotoKoodi(String muotoKoodi) {
	this.muotoKoodi = muotoKoodi;
    }
	
    public void setYleisoKoodi(String yleisoKoodi) {
	this.yleisoKoodi = yleisoKoodi;
    }
	
    public void setEmojulkaisuntyyppiKoodi(String emojulkaisuntyyppiKoodi) {
	this.emojulkaisuntyyppiKoodi = emojulkaisuntyyppiKoodi;
    }
	
    public void setArtikkelityyppiKoodi(String artikkelityyppiKoodi) {
	this.artikkelityyppiKoodi = artikkelityyppiKoodi;
    }
	
    public void setVertaisarvioituKytkin(String vertaisarvioituKytkin) {
	this.vertaisarvioituKytkin = vertaisarvioituKytkin;
    }
	
    public void setRaporttiKytkin(String raporttiKytkin) {
	this.raporttiKytkin = raporttiKytkin;
    }

    public void setOpinnayteKoodi(String opinnayteKoodi) {
	this.opinnayteKoodi = opinnayteKoodi;
    }
	
    public void setTaidetyyppiKoodi(String taidetyyppiKoodi) {
		
        this.taidetyyppiKoodi = taidetyyppiKoodi;
    }
	
    public void setAVSovellusTyyppiKoodi(String avSovellusTyyppiKoodi) {
	this.avSovellusTyyppiKoodi = avSovellusTyyppiKoodi;
    }


    @Override
    public Long keySelector() {
        return tilanneraporttiID;
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
