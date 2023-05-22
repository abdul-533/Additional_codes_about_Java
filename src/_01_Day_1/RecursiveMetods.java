package _01_Day_1;

public class RecursiveMetods {
    // yani onizlemeli metodlar kendi icinden caqirilan metodlar

    static  int f(int x){
        if(x==1)
            return 1;

        return (x+f(x-1)); // 10 dan bashlayarak 1 e kadar gitdi ve x==1 gorduyu andan return 1 yapdi
    }

    public static void main(String[] args) {

      int a= f(3);
        System.out.println("a = " + a);
        //f(1)=1;
        //f(2)=f(1)+2;
        // f(3)=f(2)+3;
        //.....
        //f(7)=f(6)+7;


    }
}
