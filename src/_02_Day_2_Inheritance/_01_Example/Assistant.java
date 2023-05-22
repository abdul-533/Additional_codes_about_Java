package _02_Day_2_Inheritance._01_Example;

public class Assistant extends Academician {
    private String graduateDegree;

    public Assistant(String name, String phoneNumber, String ePost, String sector, String task, String[] lessons,String graduateDegree) {
        super(name, phoneNumber, ePost, sector, task, lessons);
        setGraduateDegree(graduateDegree);
    }

    public String getGraduateDegree() {
        return graduateDegree;
    }

    public void setGraduateDegree(String graduateDegree) {
        this.graduateDegree = graduateDegree;
    }
    public void enterLaboratory(){

    }
    public void readQuizzes(){

    }

    @Override
    public void enterLessons() {
        System.out.println("lessons entered"); // metodun buraya overloadingi
    }
}
