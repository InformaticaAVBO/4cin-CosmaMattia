public class Tree<T extends Comparable<T>> {
    private Nodo<T> root;

    Tree() {
        this.root = null;
    }
    public void add(T x) {
        Nodo<T> newNode = new Nodo<T>(x);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Nodo<T> current = this.root;
            while (true) {
                if (x.compareTo(current.getInfo()) < 0) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        break;
                    } else {
                        current = current.getLeft();
                    }
                } else {
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        break;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
    }
}
