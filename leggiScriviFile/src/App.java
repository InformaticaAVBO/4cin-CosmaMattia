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
        
        //Creo il file 
        FileWriter myWriter = new FileWriter(nomeInput); 

        // Scrivo sul file 
        for(int i = 0; i < 100; i++) { 
            myWriter.write("Questa è una prima frase scritta in un file. \n"); 
        } 
        myWriter.close();

        // Apro il file di input per leggere
        File fileInput = new File(nomeInput);
        Scanner leggi = new Scanner(fileInput);

        // Creo il file di output per scrivere
        FileWriter fileOutput = new FileWriter(nomeOutput);

        // Copio ogni riga
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            fileOutput.write(s + "\n");
        }
        fileOutput.close();

        System.out.println("Ok, ho scritto sul file!");

        // Chiudo tutto
        leggi.close();
        input.close();
    }
}


