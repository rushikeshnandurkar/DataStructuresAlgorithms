package doubly_linked_list;

public class Node<T> {
    private T nodeData;
    private Node<T> next;
    private Node<T> prev;

    public Node(T nodeData) {
        this.nodeData = nodeData;
        this.next = null;
        this.prev = null;
    }
}
