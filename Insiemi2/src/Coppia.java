public class Coppia <T1, T2> {
    private T1 x;
    private T2 s;

    public Coppia() {
    }

    public Coppia(T1 x, T2 s) {
        this.x = x;
        this.s = s;
    }

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getS() {
        return s;
    }

    public void setS(T2 s) {
        this.s = s;
    }

    public String toString() {
        return "Coppia: " + x + ", " + s;
    }
}
