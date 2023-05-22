package _02_Day_2_Inheritance._01_Example;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee c1 = new Employee("Ali", "051-***-**-25", "********7@gmail.com");
        Academician a1 = new Academician("Orxan", "070-***-**-25", "a**********@gmail.com", "Teacher", "Atom Fizik", new String[]{"Anatomy", "Riyaziyyat"});
        Officials o1 = new Officials("Anar", "051-***-**-25", "H**********@gmail.com", "***", "8");
        Assistant asist1 = new Assistant("Samir", "050-***-**-57", "m**********@mail.ru", "Bank", "Junior Economic", new String[]{"English", "History"}, "MastersDegree");
        EducationPerson edu1 = new EducationPerson("Asim", "050-643-46-43", "A******@mail.ru", "Maliyye", "Bugalter", new String[]{"Plastation", "Mortol combat"},"H.Aslanov Ev № 22");
        Security sec1 = new Security("Babek", "-10-***-**-00", "Babek-01@mail,ru", "Tourism", "10","Arizona");
        İnformationProsessing inf1 = new İnformationProsessing("Famil", "070-***-**-77", "Fa****@mail.ru", "Menecment", "24","Seel director");

    }
}
