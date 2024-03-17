package stack;

import linkedlist.MyLinkedList;

public class MyStack {
    private Node top;
    private int height;

    public MyStack(int value) {
        this.top = new Node(value);
        height++;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }

        top = newNode;
        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
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
