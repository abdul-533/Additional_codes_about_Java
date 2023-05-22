package _02_Day_2_Inheritance._01_Example;

public class İnformationProsessing extends Officials{
    private String task;


    public void scanning(){

    }
    public İnformationProsessing(String name, String phoneNumber, String ePost, String department, String queueHours,String task) {
        super(name, phoneNumber, ePost, department, queueHours);
        setTask(task);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
