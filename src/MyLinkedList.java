public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }
}
