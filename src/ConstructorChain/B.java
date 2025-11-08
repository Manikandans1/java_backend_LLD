package ConstructorChain;

public class B extends A{

    int x;
    public B(int x) {
        this();
        this.x = x;
        System.out.println("Parametrized Constructor From Chain B");
    }

    public B() {
        System.out.println("Constructor From Chain B");
    }
}
