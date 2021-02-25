package fi.csc.virta.julkaisut.domain;

public class AvainsanaTK extends BaseTK {

    private String avainsana;

    public String getAvainsana() {
        return avainsana;
    }

    public void setAvainsana(String avainsana) {
        this.avainsana = avainsana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AvainsanaTK that = (AvainsanaTK) o;

        return !(avainsana != null ? !avainsana.equals(that.avainsana) : that.avainsana != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avainsana != null ? avainsana.hashCode() : 0);
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
