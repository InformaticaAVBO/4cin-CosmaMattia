// Classe principale
public class App {
    public static void main(String[] args) {
        // Creiamo alcuni giocatori
        Player p1 = new Player("Giannino", 67);
        Player p2 = new Player("Luca", 96);
        Player p3 = new Player("Marzò", 78);
        p2.setValore(100);
        System.out.println("Il valore di " + p2.getNome() + " è ora: " + p2.getValore());
        // Salviamo i valori di tutti i giocatori su file
        p1.salvaValoreSuFile();
        p2.salvaValoreSuFile();
        p3.salvaValoreSuFile();
        // Salviamo i valori dei giocatori nel formato .dat
        p1.load();
        p1.save();
    }
}