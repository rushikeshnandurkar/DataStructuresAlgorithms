package queue;

public class Queue<T> {

    class Node<T> {
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

    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        front = rear = null;
    }

    public void enque(T obj) {
        Node<T> ptr = new Node<>(obj);
        if (front == null) {
            front = rear = ptr;
        } else {
            rear.setNext(ptr);
            rear = ptr;
        }
    }

    public T dequeue () {
        if (front == null) {
            return null;
        }
        T obj = front.getNodeData();
        front = front.getNext();
        return obj;
    }

    public T peek () {
        if (front == null) {
            return null;
        }

        return front.getNodeData();
    }
}
