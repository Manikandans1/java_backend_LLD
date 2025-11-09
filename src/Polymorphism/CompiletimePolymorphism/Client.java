package Polymorphism.CompiletimePolymorphism;

public class Client {
    public static void main(String[] args) {
        User user = new User();

        user.userLogin("test11@gmail.com", "test@123");
        user.userLogin("test12@gmail.com",12);
        user.userLogin(13,"test13@gmail.com");

    }
}
