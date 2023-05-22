package _02_Day_2_Inheritance._01_Example;

public class Security extends  Officials{
    private String region;


    public void shift(){

    }

    public Security(String name, String phoneNumber, String ePost, String department, String queueHours,String region) {
        super(name, phoneNumber, ePost, department, queueHours);
        setRegion(region);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}
