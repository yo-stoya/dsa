package queue;

public class MyQueue {
    private Node first;
    private Node last;
    private int length;

    public MyQueue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length++;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return  null;
        }

        length--;
        if (length == 0) {
            last = null;
        }

        Node temp = first;
        first = first.next;
        temp.next = null;

        return temp;
    }

    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
