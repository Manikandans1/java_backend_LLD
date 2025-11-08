package ConstructorChain;

public class C extends B{
    public C() {
        super(10);
        System.out.println("Constructor From Chain C");
    }
}

//super() must be the first statement in a constructor if it is used.