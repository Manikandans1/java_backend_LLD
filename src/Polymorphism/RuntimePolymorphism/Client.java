package Polymorphism.RuntimePolymorphism;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setBreed("Dog");
        dog.setName("cat");
        dog.run();
        dog.walk();

        System.out.println("");
    }
}
