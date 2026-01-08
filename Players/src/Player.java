import java.io.FileWriter;
import java.io.IOException;

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
}