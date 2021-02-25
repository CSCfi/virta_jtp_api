package fi.csc.virta.julkaisut.domain;

public class IsbnTK extends BaseTK {

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IsbnTK isbnTK = (IsbnTK) o;

        return !(isbn != null ? !isbn.equals(isbnTK.isbn) : isbnTK.isbn != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
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
