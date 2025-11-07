package introOOPS;

import javax.xml.namespace.QName;

public class Students {
    int id;
    public String name;
    protected int age;
    private int salary;


    public Students() {
        id = 1;
        name = "MANI";
        age = 21;
        salary = 7000;
    }

    public Students(String newName, int newAge) {
        name = newName;
        age = newAge;
        salary = 3000;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if(newSalary < 500) {
            System.out.println("salary is to low");
            return;
        }
        salary = newSalary;
    }

    public

    void addAttendClass() {
        System.out.println(name + " attending the class");
    }
}
