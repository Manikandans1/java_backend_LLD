package Polymorphism.CompiletimePolymorphism;

public class User {
    private int id;
    public String email;
    private String password;

    void userLogin(int id, String email) {
        System.out.println(id + " and " + email + " user is login");
    }

    void userLogin(String email, String password) {
        System.out.println(email + " and " + password + " Leaner is login");
    }


    void userLogin(String email, int id) {
        System.out.println(email + " and " + id + " instructor is login");
    }

//Compiletime Polymorphism because of Ambiguous method call Both.

//    void userLogin(int id, String password) {
//        System.out.println(id + " user is login");
//    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
