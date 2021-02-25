package fi.csc.virta.julkaisut.domain;

public class TieteenalaTK extends BaseTK {

    private Integer tieteenala;
    private Integer jNro;

    public Integer getTieteenala() {
        return tieteenala;
    }

    public void setTieteenala(Integer tieteenala) {
        this.tieteenala = tieteenala;
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

        TieteenalaTK that = (TieteenalaTK) o;

        if (tieteenala != null ? !tieteenala.equals(that.tieteenala) : that.tieteenala != null) return false;
        return !(jNro != null ? !jNro.equals(that.jNro) : that.jNro != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (tieteenala != null ? tieteenala.hashCode() : 0);
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
