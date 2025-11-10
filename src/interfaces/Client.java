package interfaces;

public class Client {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        stack.push(10);

        stack = new LinkedListStack();
        stack.pop();
        stack.size();

        stack = new QueueStack();
        stack.top();

        System.out.println("");
    }
}
