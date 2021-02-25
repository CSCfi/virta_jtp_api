package fi.csc.virta.julkaisut.domain;

public class OrgYksikkoTK extends BaseTK {

    private String organisaatioTunnus;
    private String julkaisuYksikko;
    private String tekijaYksikko;

    public String getOrganisaatioTunnus() {
        return organisaatioTunnus;
    }

    public void setOrganisaatioTunnus(String organisaatioTunnus) {
        this.organisaatioTunnus = organisaatioTunnus;
    }

    public String getJulkaisuYksikko() {
        return julkaisuYksikko;
    }

    public void setJulkaisuYksikko(String julkaisuYksikko) {
        this.julkaisuYksikko = julkaisuYksikko;
    }

    public String getTekijaYksikko() {
        return tekijaYksikko;
    }

    public void setTekijaYksikko(String tekijaYksikko) {
        this.tekijaYksikko = tekijaYksikko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OrgYksikkoTK that = (OrgYksikkoTK) o;

        if (organisaatioTunnus != null ? !organisaatioTunnus.equals(that.organisaatioTunnus) : that.organisaatioTunnus != null)
            return false;
        if (julkaisuYksikko != null ? !julkaisuYksikko.equals(that.julkaisuYksikko) : that.julkaisuYksikko != null)
            return false;
        return !(tekijaYksikko != null ? !tekijaYksikko.equals(that.tekijaYksikko) : that.tekijaYksikko != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (organisaatioTunnus != null ? organisaatioTunnus.hashCode() : 0);
        result = 31 * result + (julkaisuYksikko != null ? julkaisuYksikko.hashCode() : 0);
        result = 31 * result + (tekijaYksikko != null ? tekijaYksikko.hashCode() : 0);
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
