package Polymorphism.RuntimePolymorphism;

public class Mammal extends Animal{
    private int legCount;

    void run() {
        System.out.println("Mammal is running");
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
