package fi.csc.virta.julkaisut.domain;

public class TaiteenalaTK extends BaseTK {
    
    private Integer taiteenala;
    private Integer jNro;

    public Integer getTaiteenala() {
        return taiteenala;
    }

    public void setTaiteenala(Integer taiteenala) {
        this.taiteenala = taiteenala;
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

        TaiteenalaTK that = (TaiteenalaTK) o;

        if (taiteenala != null ? !taiteenala.equals(that.taiteenala) : that.taiteenala != null) return false;
        return !(jNro != null ? !jNro.equals(that.jNro) : that.jNro != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (taiteenala != null ? taiteenala.hashCode() : 0);
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
