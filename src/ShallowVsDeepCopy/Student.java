package ShallowVsDeepCopy;

public class Student {
    int id;
    public String name;
    protected int age;
    private int salary;
    Exam exam;
    Batch batch;



    public Student() {
    }

    public Student(Student original) {
        id = original.id;
        name = original.name;
        age = original.age;
        salary = original.getSalary();

        // Deep Copy
        exam = new Exam(original.exam);

        // Shallow Copy
        batch = original.batch;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}


