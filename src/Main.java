public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(1);
        // System.out.println(myLinkedList.removeLast().value); // remove test
        // System.out.println(myLinkedList.removeLast());  // remove test returns null when list is empty
        myLinkedList.prepend(10);     // prepend test

        myLinkedList.printList();
    }
}
