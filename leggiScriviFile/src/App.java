import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Chiede i nomi dei file
        System.out.println("Inserisci il nome del file di input: ");
        String nomeInput = input.nextLine();

        System.out.println("Inserisci il nome del file di output: ");
        String nomeOutput = input.nextLine();

        // Apre il file di input per leggere
        File fileInput = new File(nomeInput);
        Scanner lettore = new Scanner(fileInput);
        
        // Prima scrivo su un file
        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i = 0; i < 10; i++) {
            myWriter.write("Questa è una prova\n");
        }
        myWriter.close();
        System.out.println("Ok, ho scritto su file");
        // Ora leggo dal file
        File f = new File("filename.txt");
        Scanner leggi = new Scanner (f);
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            System.out.println(s);
        }
        leggi.close();
    }
}

