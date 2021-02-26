package doubly_linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public boolean add(T obj) {
        if (head == null) {
            head = new Node<>(obj);
            return true;
        }

        Node<T> ptr = head;
        while (ptr.getNext() != null) {
            ptr = ptr.getNext();
        }
        ptr.setNext(new Node<>(obj));
        ptr.getNext().setPrev(ptr);
        return true;
    }

    public void printDll() {
        Node<T> ptr = head;
        ptr = head;
        while (ptr != null) {
            System.out.println("Node = " + ptr.getNodeData().toString());
            ptr = ptr.getNext();
        }
    }


}
