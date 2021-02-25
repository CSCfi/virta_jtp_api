package fi.csc.virta.julkaisut.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public abstract class BaseTK {

    protected String julkaisunTunnus;
    protected String latausId;

    public abstract String getJulkaisunTunnus();

    public abstract void setJulkaisunTunnus(String julkaisunTunnus);

    public abstract String getLatausId();

    public abstract void setLatausId(String latausId);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseTK baseTK = (BaseTK) o;

        if (julkaisunTunnus != null ? !julkaisunTunnus.equals(baseTK.julkaisunTunnus) : baseTK.julkaisunTunnus != null)
            return false;
        return !(latausId != null ? !latausId.equals(baseTK.latausId) : baseTK.latausId != null);

    }

    @Override
    public int hashCode() {
        int result = julkaisunTunnus != null ? julkaisunTunnus.hashCode() : 0;
        result = 31 * result + (latausId != null ? latausId.hashCode() : 0);
        return result;
    }
}
