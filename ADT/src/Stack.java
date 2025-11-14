public class Stack {
    private Nodo top;

    private class Nodo {
        Object valore;
        Nodo next;

        Nodo( Object valore ) {
            this.valore = valore;
            this.next = null;
        }
    }

    public Stack() {
        top = null;
    }

    public void push( Object valore ) {
        Nodo nuovo = new Nodo(valore);
        nuovo.next = top;
        top = nuovo;
    }

    public Object pop() {
        if (top == null) return null;
        Object valore = top.valore;
        top = top.next;
        return valore;
    }

    public Object peek() {
        if (top == null) return null;
        return top.valore;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
