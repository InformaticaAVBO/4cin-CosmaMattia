import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File myObj = new File("data/colori.txt");

        Figuraccia figuraccia = new Figuraccia("cerchio", 23);
        figuraccia.cambiaColore("blue");
        System.out.println(figuraccia);

        ArrayList<Figura>figure = new ArrayList<>();
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] flds = data.split(",");
            Figura fig = new Figura(flds[0], flds[1], Integer.parseInt(flds[2]));
            figure.add(fig);
        }
        myReader.close();
        for(Figura f : figure) {
            System.out.println(f);
        }
        System.out.println(figure.get(0).compareTo(figure.get(1)));
    }
}
