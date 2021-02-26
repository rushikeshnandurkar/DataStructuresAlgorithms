package doubly_linked_list;

public class DllTest {
    public static void main(String[] args) {
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();
        dll.add("Hello");
        dll.add("World");
        dll.add("It's 21st century");
        dll.printDll();


        System.out.println("_________________________________");
        DoublyLinkedList<Dog> dogDll = new DoublyLinkedList<>();
        dogDll.add(new Dog("Tommy", 5));
        dogDll.add(new Dog("Rover", 20));
        dogDll.add(new Dog("Shera", 25));
        dogDll.printDll();

    }
}
