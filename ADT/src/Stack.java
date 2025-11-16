public class Stack {
    private Vettore<Object> pila;

    public Stack() {
        pila = new Vettore<Object>(10, 10);
    }
    public void push(Object o) {
        pila.add(o);
    }
    public Object pop() {
        if (pila.get(0)==null) return null;
        Object o = pila.get(pila.n-1);
        pila.n--;
        return o;
    }
    public String isEmpty() {
        if(pila.n==0) 
        return "Lo stack è vuoto";
        else 
        return "Lo stack non è vuoto";
    }

}
