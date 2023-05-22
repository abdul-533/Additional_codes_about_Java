package _02_Day_2_Inheritance._01_Example;

public class EducationPerson extends Academician {
    private String adress;


    public EducationPerson(String name, String phoneNumber, String ePost, String sector, String task, String[] lessons,String adress) {
        super(name, phoneNumber, ePost, sector, task, lessons);
        setAdress(adress);
    }
    public void enterMeetings(){

    }
    public void enterTests(){

    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
