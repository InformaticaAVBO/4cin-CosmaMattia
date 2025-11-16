public class App {
    public static void main(String[] args) throws Exception {
        
        Coppia<String, Persona> p = new Coppia<>("Mario", new Persona("Mario", "Rossi"));
        System.out.println(p);
        Coppia<String, Persona> q = new Coppia<>("Luigi", new Persona("Luigi", "Verdi"));
        System.out.println(q);
        System.out.println(p.getSecondo().getClass());
        System.out.println(q.getSecondo().getClass());
        
        Vettore<String> x = new Vettore<>(0, 0);
        for (int i=0; i<23; i++)
            x.add("Juve_" + i);
        System.out.println(x);
        
        System.out.println(x.get(3));
        System.out.println(x.get(3).getClass());

        Vettore<Persona> elenco = new Vettore<Persona>(10, 5);

        Stack s = new Stack();
        s.push(new Persona("Mattia", "Cosma"));
        s.push(new Persona("Gianni", "Morandi"));
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        
    }

}
