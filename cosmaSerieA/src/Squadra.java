public class Squadra {

    // Attributi
    protected String squadra;
    protected int posizione;
    protected int partiteGiocate;
    protected int partiteVinte;
    protected int partitePareggiate;
    protected int partitePerse;
    protected int punteggioTotale;


    // Costruttore parametrico completo
    public Squadra(int posizione, String squadra, int partiteGiocate, int partiteVinte, int partitePareggiate, int partitePerse, int punteggioTotale) {
        this.posizione = posizione;
        this.squadra = squadra;
        this.punteggioTotale = (partiteVinte*3) + partitePareggiate;
        this.partiteGiocate = partiteVinte + partitePareggiate + partitePerse;
        this.partiteVinte = partiteVinte;
        this.partitePareggiate = partitePareggiate;
        this.partitePerse = partitePerse;
    }

    // Getter e Setter
    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public int getPartiteGiocate() {
        return partiteGiocate;
    }

    public void setPartiteGiocate(int partiteGiocate) {
        this.partiteGiocate = partiteGiocate;
    }

    public int getPartiteVinte() {
        return partiteVinte;
    }

    public void setPartiteVinte(int partiteVinte) {
        this.partiteVinte = partiteVinte;
    }

    public int getPartitePareggiate() {
        return partitePareggiate;
    }

    public void setPartitePareggiate(int partitePareggiate) {
        this.partitePareggiate = partitePareggiate;
    }

    public int getPartitePerse() {
        return partitePerse;
    }

    public void setPartitePerse(int partitePerse) {
        this.partitePerse = partitePerse;
    }

    public int getPunteggioTotale() {
        return punteggioTotale;
    }

    public void setPunteggioTotale(int punteggioTotale) {
        this.punteggioTotale = punteggioTotale;
    }
    
    @Override
    public String toString() {
        return posizione + ") " + squadra + ": Partite giocate = " + partiteGiocate + ", Partite vinte = " + partiteVinte + ", Partite pareggiate = " + partitePareggiate + ", Partite perse = " + partitePerse + ", Punteggio totale = " + punteggioTotale;
    }
}
