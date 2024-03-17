package linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        // System.out.println(myLinkedList.removeLast().value);     // => 1
        // System.out.println(myLinkedList.removeLast());           // => null

        // myLinkedList.prepend(10);                                // => 10, 1

        // System.out.println(myLinkedList.removeFirst().value);    // => 1

        // System.out.println(myLinkedList.get(0).value);           // => 1

        // myLinkedList.set(0, 10);                                 // => 10

        // myLinkedList.insert(0, 10);                              // => true
        myLinkedList.printList();
    }
}
