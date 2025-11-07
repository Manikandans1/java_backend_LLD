package inheritance;

public class Dog extends Mammal{

    private String breed;


    void makeSound() {
        System.out.println("Dog is barking");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void setName() {
        setName("cat ");
    }
}
