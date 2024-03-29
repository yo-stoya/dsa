package linkedlist;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }

        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node removed = head;
        head = head.next;
        removed.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }

        return removed;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp == null) {
            return false;
        }

        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode = new Node(value);
            Node prev = get(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            length++;
        }
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node prev = get(index - 1);
            Node target = prev.next;
            prev.next = target.next;
            target.next = null;
            length--;
            return target;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
