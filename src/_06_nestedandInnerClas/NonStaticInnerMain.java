package _06_nestedandInnerClas;

public class NonStaticInnerMain {
    public static void main(String[] args) {

        NonScaticInnerClas n1=new NonScaticInnerClas();
        NonScaticInnerClas.Inner inner=n1.new Inner();
        inner.run();

        //************************************************??// Staticlercin
        System.out.println("*******************************");

        Static.Inner static1=new Static.Inner();
        static1.run();



    }
}
