import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Creazione di una lista di stringhe
        ArrayList<String> list = new ArrayList<>();
        // Aggiunta di messaggi alla lista
        list.add("Hello, World!");
        list.add("ciaoooo");
        // Stampa dei messaggi nella lista
        // Questo è un for each, che aggiunge ogni elemento della lista alla variabile message
        for (String message : list) {
            // Stampa del messaggio corrente
            System.out.println(message);
        }
    }
}
