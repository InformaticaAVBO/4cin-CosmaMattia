public class Coppia {
    private Integer primo;
    private Integer secondo;

    public Coppia( Integer primo, Integer secondo ) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public Integer getPrimo() {
        return primo;
    }

    public Integer getSecondo() {
        return secondo;
    }

    public void setPrimo( Integer primo ) {
        this.primo = primo;
    }

    public void setSecondo( Integer secondo ) {
        this.secondo = secondo;
    }

    @Override
    public String toString() {
        return "Coppia: (" + primo + ", " + secondo + ")\n";
    }
}
