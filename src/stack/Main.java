package stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);

        // myStack.push(10);        // => 10,4
        // System.out.println(myStack.pop().value);
        myStack.printStack();
    }
}
