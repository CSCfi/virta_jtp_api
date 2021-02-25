package fi.csc.virta.julkaisut.domain;

public class HankeTK extends BaseTK {

    private String hankenumero;
    private String rahoittajaOrg;

    public String getHankenumero() {
        return hankenumero;
    }

    public void setHankenumero(String hankenumero) {
        this.hankenumero = hankenumero;
    }

    public String getRahoittajaOrg() {
        return rahoittajaOrg;
    }

    public void setRahoittajaOrg(String rahoittajaOrg) {
        this.rahoittajaOrg = rahoittajaOrg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HankeTK hankeTK = (HankeTK) o;

        if (hankenumero != null ? !hankenumero.equals(hankeTK.hankenumero) : hankeTK.hankenumero != null) return false;
        return !(rahoittajaOrg != null ? !rahoittajaOrg.equals(hankeTK.rahoittajaOrg) : hankeTK.rahoittajaOrg != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hankenumero != null ? hankenumero.hashCode() : 0);
        result = 31 * result + (rahoittajaOrg != null ? rahoittajaOrg.hashCode() : 0);
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
