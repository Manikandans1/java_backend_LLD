package ShallowVsDeepCopy;

public class Batch {
    private int id = 1;
    public String name;



    public Batch(Batch original) {
        if(original != null) {
            this.id = original.id;
            this.name = original.name;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
