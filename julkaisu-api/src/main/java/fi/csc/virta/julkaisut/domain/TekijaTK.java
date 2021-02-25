package fi.csc.virta.julkaisut.domain;

public class TekijaTK extends BaseTK {

    private String etunimet;
    private String sukunimi;
    private String orcid;
    private String yksikko;
    private String rooli;

    public String getEtunimet() {
        return etunimet;
    }

    public void setEtunimet(String etunimet) {
        this.etunimet = etunimet;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
    
    public String getRooli() {
        return rooli;
    }

    public void setRooli(String rooli) {
        this.rooli = rooli;
    }

    public String getYksikko() {
        return yksikko;
    }

    public void setYksikko(String yksikko) {
        this.yksikko = yksikko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TekijaTK tekijaTK = (TekijaTK) o;

        if (etunimet != null ? !etunimet.equals(tekijaTK.etunimet) : tekijaTK.etunimet != null) return false;
        if (sukunimi != null ? !sukunimi.equals(tekijaTK.sukunimi) : tekijaTK.sukunimi != null) return false;
        if (orcid != null ? !orcid.equals(tekijaTK.orcid) : tekijaTK.orcid != null) return false;
        if (rooli != null ? !rooli.equals(tekijaTK.rooli) : tekijaTK.rooli != null) return false;
        return !(yksikko != null ? !yksikko.equals(tekijaTK.yksikko) : tekijaTK.yksikko != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (etunimet != null ? etunimet.hashCode() : 0);
        result = 31 * result + (sukunimi != null ? sukunimi.hashCode() : 0);
        result = 31 * result + (orcid != null ? orcid.hashCode() : 0);
        result = 31 * result + (rooli != null ? rooli.hashCode() : 0);
        result = 31 * result + (yksikko != null ? yksikko.hashCode() : 0);
        
        return result;
    }

    public String getJulkaisunTunnus() {
        return julkaisunTunnus;
    }

    public void setJulkaisunTunnus(String julkaisunTunnus) {
        this.julkaisunTunnus = julkaisunTunnus;
    }

    public String getLatausId() {
        return latausId;
    }

    public void setLatausId(String latausId) {
        this.latausId = latausId;
    }
}
