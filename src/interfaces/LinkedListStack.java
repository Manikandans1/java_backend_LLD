package interfaces;

public class LinkedListStack implements Stack{
    @Override
    public void push(int x) {

    }

    @Override
    public void pop() {
        System.out.println("LinkedListStack pop");
    }

    @Override
    public void top() {
        System.out.println("LinkedListStack top");
    }

    @Override
    public int size() {
        return Stack.super.size();
    }
}
