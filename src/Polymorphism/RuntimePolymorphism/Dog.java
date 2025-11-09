package Polymorphism.RuntimePolymorphism;

public class Dog extends Mammal{
    private String breed;

    void makeSound() {
        System.out.println(breed + "is making sound");
    }

    @Override
    void run() {
        System.out.println(breed + " is running");
    }

    @Override
    void walk() {
        System.out.println(breed + " is waking");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
