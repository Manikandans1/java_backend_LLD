package Polymorphism.RuntimePolymorphism;

public class Animal {
    private String name;

    void walk() {
        System.out.println(name + " is walking");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
