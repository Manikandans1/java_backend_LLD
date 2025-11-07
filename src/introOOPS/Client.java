package introOOPS;

public class Client {
    public static void main(String[] args) {
        Students students1 = new Students();
        students1.id = 1;
        students1.name = "Mani";
        students1.age = 21;
        students1.setSalary(2000);

        Students students2 = new Students();
        students2.age = 20;

        Students students3 = new Students("Manikandan", 25);


        System.out.println(students1.getSalary());
        System.out.println(students2.age);
    }
}
