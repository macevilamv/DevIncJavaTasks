package by.incubator.task18;

public class InvestigatedClass {
    private final String INFO = "Private Final String Field of Investigated class";
    private String nonFinalInfo  = "Not a final String field of Investigated class";

    public InvestigatedClass() {}

    public String getNonFinalInfo() {
        return nonFinalInfo;
    }

    public void setNonFinalInfo(String nonFinalInfo) {
        this.nonFinalInfo = nonFinalInfo;
    }
}
