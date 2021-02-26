package singly_linked_list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(101);
        ll.insertNode(102);
        ll.insertNode(103);
        ll.insertNode(104);
        ll.insertNode(105);
        ll.printLL();
        ll.deleteNode(104);

        System.out.println("The number is found at position " + ll.searchByNumber(100));

    }
}
