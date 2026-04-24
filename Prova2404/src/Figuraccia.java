public class Figuraccia extends Figura implements Camaleonte{
    public Figuraccia(String forma, int perimetro) {
        super("viola", forma, perimetro);
    }
    @Override
    public void cambiaColore(String nuovoColore) {
        this.colore = nuovoColore;
    }
}
