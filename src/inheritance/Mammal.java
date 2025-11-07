package inheritance;

public class Mammal extends Animal{

    private int legCount;

    void run() {
        System.out.println("mammal is running");
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
