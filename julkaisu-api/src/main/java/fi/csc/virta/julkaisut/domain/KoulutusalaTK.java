package fi.csc.virta.julkaisut.domain;

public class KoulutusalaTK extends BaseTK {

    private Integer koulutusala;
    private Integer jNro;

    public Integer getKoulutusala() {
        return koulutusala;
    }

    public void setKoulutusala(Integer koulutusala) {
        this.koulutusala = koulutusala;
    }

    public Integer getjNro() {
        return jNro;
    }

    public void setjNro(Integer jNro) {
        this.jNro = jNro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        KoulutusalaTK that = (KoulutusalaTK) o;

        if (koulutusala != null ? !koulutusala.equals(that.koulutusala) : that.koulutusala != null) return false;
        return !(jNro != null ? !jNro.equals(that.jNro) : that.jNro != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (koulutusala != null ? koulutusala.hashCode() : 0);
        result = 31 * result + (jNro != null ? jNro.hashCode() : 0);
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
