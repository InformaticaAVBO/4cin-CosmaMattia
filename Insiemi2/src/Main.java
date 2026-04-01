import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Coppia<Integer, String> c = new Coppia<>(17, "Ciao");
        Coppia<Double, Character> c1 = new Coppia<>(6.7, 'C');
        System.out.println(c);
        System.out.println(c1);

        ArrayList<Personcina> persone = new ArrayList<>();
        Timido t = new Timido();
        Maranza m = new Maranza();
        persone.add(t);
        persone.add(m);
        for (Personcina p : persone) {
            p.offenditi();
        }
    
    }
}
