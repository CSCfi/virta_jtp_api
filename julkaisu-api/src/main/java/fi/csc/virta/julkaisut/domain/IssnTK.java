package fi.csc.virta.julkaisut.domain;

public class IssnTK extends BaseTK {

    private String issn;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IssnTK issnTK = (IssnTK) o;

        return !(issn != null ? !issn.equals(issnTK.issn) : issnTK.issn != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
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
