import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        // Creazione oggetto Campionato
        Campionato campionato = new Campionato ("data/seriea.csv");
        
        System.out.println(campionato);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome squadra: ");
        String s = scanner.nextLine();
        campionato.stampaInfoSquadra(s);
        
    }
    
}
