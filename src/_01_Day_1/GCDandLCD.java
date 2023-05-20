package _01_Day_1;

import java.util.Scanner;

public class GCDandLCD {
    public static void main(String[] args) {
// girilen sayilarin ebob ve ekobunu bulunuz


        Scanner reader=new Scanner(System.in);
        System.out.println("Sayi bir giriniz=");
        int s1= reader.nextInt();
        System.out.println("Sayi iki giriniz=");
        int s2= reader.nextInt();

        int min=(s1>s2)? s1: s2;
        int EBOB = 0;
        int EKOB;


        for (int i = min; i>0; i--) {
            
            if((s1%i==0) &&(s2%i==0)) {
                EBOB = i;
                break;
            }
        }
        System.out.println("EBOB = " + EBOB);
        System.out.println("EKOB = " +(EKOB=s1*s2/EBOB));




    }
}
