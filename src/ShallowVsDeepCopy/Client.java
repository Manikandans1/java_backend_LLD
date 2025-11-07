package ShallowVsDeepCopy;

public class Client {

    public static void main(String[] args) {

        Student st = new Student();
        st.id = 1;
        st.name = "Mani";
        st.age = 21;
        st.setSalary(1200);
        st.exam = new Exam();

        Student stCopy = new Student();
        stCopy.id = st.id;
        stCopy.name = st.name;
        stCopy.age = st.age;
        stCopy.setSalary(st.getSalary());


        Student stCopyCopy = new Student(st);

        System.out.println("");
    }

}
