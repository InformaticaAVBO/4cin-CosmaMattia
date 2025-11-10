import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Dammi il nome del file sorgente: ");
        String nomeSorgente = scanner.nextLine();
        System.out.println("Dammi il nome del file destinazione: ");
        String nomeDestinazione = scanner.nextLine();
        scanner.close();
        // Apre il file sorgente e lo legge
        File f = new File (nomeSorgente);
        Scanner leggi = new Scanner ();
    }
}
