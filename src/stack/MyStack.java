package stack;

public class MyStack {
    private Node top;
    private int height;

    public MyStack(int value) {
        this.top = new Node(value);
        height++;
    }

    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
