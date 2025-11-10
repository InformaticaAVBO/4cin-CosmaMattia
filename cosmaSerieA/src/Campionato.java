import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Campionato {

    // Array di squadre
    private Squadra[] squadre;
    int numSquadre;

    // Costruttore
    public Campionato(String seriea) {
        squadre = new Squadra[20]; // inizializzo array
        try {
            // Creo oggetto file e scanner dentro il costruttore
            File file = new File("data/seriea.csv");
            Scanner sc = new Scanner(file);
            int i = 0;

            // Leggo e stampo le righe del file
            System.out.println("=== CLASSIFICA SERIE A ===");
            while (sc.hasNextLine()) {
                String riga = sc.nextLine();
                String[] informazioniSquadraSingola = riga.split(",");
                Squadra squadraSingola = new Squadra(Integer.parseInt(informazioniSquadraSingola[0]), informazioniSquadraSingola[1], Integer.parseInt(informazioniSquadraSingola[2]), Integer.parseInt(informazioniSquadraSingola[3]), Integer.parseInt(informazioniSquadraSingola[4]), Integer.parseInt(informazioniSquadraSingola[5]), Integer.parseInt(informazioniSquadraSingola[6]));
                this.squadre[i] = squadraSingola;
                i++;
            }
            numSquadre = i;

            sc.close(); // chiudo lo scanner
        } catch (FileNotFoundException e) {
            System.out.println("Errore: file non trovato -> " + seriea);
        } 

    }
    
    public void stampaInfoSquadra (String nome) {
        for (int i = 0; i < numSquadre; i++ ) {
            if(squadre[i].getSquadra().equalsIgnoreCase(nome)) {
                System.out.println(squadre[i]);
                return;
            }
        }
        System.out.println("Squadra non trovata!");
    }
    
    @Override
    public String toString() {
        String risultato = "";
        for (int i = 0; i < squadre.length; i++) {
            risultato += squadre[i] + "\n";
        }
        return risultato;
    }

}
