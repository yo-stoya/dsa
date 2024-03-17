package queue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(10);        // 4,10

        myQueue.printQueue();
    }
}
