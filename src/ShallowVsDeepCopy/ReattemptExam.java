package ShallowVsDeepCopy;

public class ReattemptExam {
    private int noOfReattemptReaming = 1;

    public ReattemptExam(ReattemptExam original) {
        if(original != null) {
            this.noOfReattemptReaming = original.noOfReattemptReaming;
        }
    }
}
