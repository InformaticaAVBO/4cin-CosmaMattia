import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Classe che rappresenta un Player
class Player {
    private String nome;    // nome del giocatore
    private int valore;     // valore del giocatore

    // Costruttore
    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per il valore
    public int getValore() {
        return valore;
    }
    
    // Setter per il valore
    public void setValore(int valore) {
        this.valore = valore;
    }


    // Metodo per salvare il valore del player su un file
    public void salvaValoreSuFile() {
        // Il nome del file sarà il nome del player con estensione .txt
        String filename = nome + ".txt";

        try {
            // Creo un FileWriter per scrivere nel file
            FileWriter writer = new FileWriter(filename);
            
            // Scrivo il valore del player all'interno del file
            writer.write("Valore di " + nome + ": " + valore + "\n");
            
            // Chiudo il file dopo aver scritto
            writer.close();

            // Messaggio di conferma
            System.out.println("Valore di " + nome + " salvato su file " + filename);
        } catch (IOException e) {
            // Messaggio di errore in caso di problemi con il file
            System.out.println("Errore durante il salvataggio su file di " + nome);
            e.printStackTrace();
        }
    }
    // Metodo per salvare il valore del giocatore su un file
    public void save () {
        // Creiamo la cartella "data" se non esiste
        File f = new File("data/" + nome + ".dat");
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            pw.println(valore);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Metodo per caricare il valore del giocatore da un file
    public void load () {
        // Carichiamo il valore del giocatore dal file
        File f = new File("data/" + nome + ".dat");
        try {
            java.util.Scanner sc = new java.util.Scanner(f);
            if (sc.hasNextInt()) {
                valore = sc.nextInt();
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}