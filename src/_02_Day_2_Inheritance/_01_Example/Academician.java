package _02_Day_2_Inheritance._01_Example;
public class Academician extends Employee{
    private String sector;
    private String task;
    private String [] lessons;

    public void enterLessons(){
        System.out.println("0");


    }


    public Academician(String name, String phoneNumber, String ePost,String sector,String task,String[]lessons) {
        super(name, phoneNumber, ePost);
        setSector(sector);
        setTask(task);
        setLessons(lessons);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

}
