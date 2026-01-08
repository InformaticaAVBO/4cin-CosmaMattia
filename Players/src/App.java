// Classe principale
public class App {
    public static void main(String[] args) {
        // Creiamo alcuni giocatori
        Player p1 = new Player("Giannino", 67);
        Player p2 = new Player("Luca", 96);
        Player p3 = new Player("Marzò", 78);

        // Salviamo i valori di tutti i giocatori su file
        p1.salvaValoreSuFile();
        p2.salvaValoreSuFile();
        p3.salvaValoreSuFile();
    }
}