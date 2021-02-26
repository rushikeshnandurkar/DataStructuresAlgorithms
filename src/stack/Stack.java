package stack;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        top = null;
    }

    public void push (T obj) {
        Node<T> node = new Node<>(obj);
        node.setNext(top);
        top = node;
    }

    public T pop () throws NullPointerException{
        if (top == null) {
            throw new NullPointerException();
        }
        Node<T> node = top;
        top = top.getNext();
        return node.getNodeData();
    }

    public T peek () throws NullPointerException {
        if (top == null) {
            throw new NullPointerException();
        }
        return top.getNodeData();
    }
}
