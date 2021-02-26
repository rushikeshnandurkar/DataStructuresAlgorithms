package stack;

public class Node<T> {
    private T nodeData;
    private Node<T> next;

    public Node(T nodeData) {
        this.nodeData = nodeData;
        this.next = null;
    }

    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
