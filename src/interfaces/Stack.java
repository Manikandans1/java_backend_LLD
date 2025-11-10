package interfaces;

public interface Stack {
    int x = 20;

    void push(int x);
    void pop();
    void top();

    default int size() {
        return x;
    }
}
