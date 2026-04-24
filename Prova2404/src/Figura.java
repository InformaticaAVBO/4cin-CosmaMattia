import java.io.File;

public class Figura implements Comparable {
    String colore;
    String forma;
    int perimetro;
    public Figura(String colore, String forma, int perimetro) {
        this.colore = colore;
        this.forma = forma;
        this.perimetro = perimetro;
    }
    public String getColore() {
        return colore;
    }
    public String getForma() {
        return forma;
    }
    public int getPerimetro() {
        return perimetro;
    }

    public String toString() {
        return "Figura: " + forma + " di colore " + colore + " e di perimetro " + perimetro;
    }
    
    @Override
    public int compareTo(Object o) {
        Figura f = (Figura) o;
        if(perimetro<f.getPerimetro()) {
            return -1;
        }
        if(perimetro>f.getPerimetro()) {
            return 1;
        }
        return 0;
    }
}
