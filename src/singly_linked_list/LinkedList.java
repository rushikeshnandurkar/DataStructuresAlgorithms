package singly_linked_list;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public int insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return head.getData();
        }

        Node n = head;
        Node node = new Node(data);
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(node);
        return n.getNext().getData();
    }

    public int deleteNode(int data) {
        /*
        *
        * This method returns:
        *  1 if the element is successfully deleted
        *  0 if elements is not present in the linked list
        *
        *
        * */
        if (head == null)
            return 0;

        if (head.getData() == data) {
            head = head.getNext();
            return 1;
        }

        Node ptr = head;
        while (ptr.getNext() != null && ptr.getNext().getData() != data) {
            ptr = ptr.getNext();
        }

        if (ptr.getNext() == null)
            return 0;

        ptr.setNext(ptr.getNext().getNext());
        return 1;

    }

    public int searchByNumber(int number) {
        Node ptr = head;
        int searchIndex = 0;
        while (true) {
            if (ptr == null)
                return -1;
            if (ptr.getData() == number) {
                return searchIndex;
            } else {
                searchIndex += 1;
                ptr = ptr.getNext();
            }
        }
    }



    public void printLL() {
        Node node = head;
        while (node != null) {
            System.out.print(" " + node.getData());
            node = node.getNext();
        }
        System.out.println("\nFinished printing");
    }
}
