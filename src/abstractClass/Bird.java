package abstractClass;

public abstract class Bird {

    public Bird() {
        System.out.println("Bird is created");
    }

    void fly() {
        System.out.println("Bird is fly");
    }

    abstract void eat();
}
