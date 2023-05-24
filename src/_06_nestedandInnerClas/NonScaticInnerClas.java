package _06_nestedandInnerClas;

public class NonScaticInnerClas {

    private int a=10;

    public class Inner{ // class icinde class inner claslar ve tanimlamasi
        int a=1;

        public  void run(){
            System.out.println(a);
            System.out.println("this = " + this.a);
            System.out.println(NonScaticInnerClas.this.a);
        }
    }
    public  void run(){
        System.out.println(a);
        System.out.println("this = " + this.a);
        Inner i=new Inner(); // ust siniftan alt siniftaki a ya ulashmak istersek tanimlamamiz gerek
        System.out.println(i.a);

    }
}
