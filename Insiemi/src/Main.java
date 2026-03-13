import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //Creazione di un ArrayList di Permalosa
        ArrayList<Permalosa> lista = new ArrayList<>();
        //Aggiunta di un Timido e un Maranza alla lista
        lista.add(new Timido());
        lista.add(new Maranza());
        lista.add(new Personcina() {}); // Aggiunta di una Personcina alla lista
        //Iterazione sulla lista e chiamata del metodo offenditi() per ogni elemento
        for (Permalosa permalosa : lista) {
            permalosa.offenditi();
        }
    }
}
