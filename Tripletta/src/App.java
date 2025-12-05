import java.lang.reflect.Array;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Tripletta<String,Integer,Double> t = new Tripletta<>("Ciao", 5, 3.14);
        Tripletta<String,String,String> amico = new Tripletta("Marco", "Luca", "Anna");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Primo");
        System.out.println( t );
        System.out.println( amico );
        System.out.println( lista );
    }
}
