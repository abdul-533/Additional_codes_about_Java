package _02_Day_2_Inheritance._01_Example;

public class Employee {
    private String name;
    private String phoneNumber;
    private String ePost;
    static int enteredCount=0;

    public void enter() {

        System.out.println("Employee entered");
    }

    public void exit() {
        System.out.println("Employee exited");

    }

    public void meal() {
        System.out.println("Employee eated meal");

    }

    public Employee(String name, String phoneNumber, String ePost) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setePost(ePost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getePost() {
        return ePost;
    }

    public void setePost(String ePost) {
        this.ePost = ePost;
    }
}
