package _01_Day_1;

public class Polydrome_numbers {

    static boolean isPolidrom(int number){
        int sayitersi=0;
        int sayi=number;
        while (sayi!=0){
            sayitersi=sayitersi*10+sayi%10;
            sayi/=10;

        }
        if (sayitersi==number)
            return true;

        return false;

    }
    public static void main(String[] args) {

        boolean x=isPolidrom(121);
        System.out.println("x = " + x);



    }
}
