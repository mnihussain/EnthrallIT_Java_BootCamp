package design;

public enum Grades {

    APlus("A+"), A("A"), B("B"), C("C"), D("D"), F("Fail");

    private final String gradeValue;

    Grades(String gradeValue){
        this.gradeValue = gradeValue;
    }

    public String getGradeValue(){
        return gradeValue;
    }

}
