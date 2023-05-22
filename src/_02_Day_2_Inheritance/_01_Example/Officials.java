package _02_Day_2_Inheritance._01_Example;

public class Officials extends Employee{
    private String department;
    private String queueHours;

   public void work(){

    }


    public Officials(String name, String phoneNumber, String ePost,String department,String queueHours) {
        super(name, phoneNumber, ePost);
        setDepartment(department);
        setQueueHours(queueHours);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQueueHours() {
        return queueHours;
    }

    public void setQueueHours(String queueHours) {
        this.queueHours = queueHours;
    }
}
