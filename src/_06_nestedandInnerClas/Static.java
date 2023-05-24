package _06_nestedandInnerClas;

public class Static {
    private int a=10;
    private static int b=2;

    public static class Inner{

        int a=1;
        
        public void run(){

            System.out.println("a = " + a);
            System.out.println("this = " + this.a);
          //System.out.println("Static.this.a = " + Static.this.a); statikde boyle alinmaz
            // cunki bu sinif bir statik sinif ondan nesne uretilmez
            // Statik claslarda ust sinifindaki deyishene ulashmak olmaz
            System.out.println("b = " + b); // yukardaki static olduqu icin statik icinde statik kullanimi rahat

        }
        

    }
}
