package _01_Day_1;

import java.util.Scanner;

public class OverloadingMethods {
    static int add(int a, int b){
        System.out.println("1-ci metodumuz");
        return  (a+b);
    }

    static int add(int a, int b,int c) {
        System.out.println("2-ci metodumuz");
        return a + b + c;
    }
    static double add(int a, double b,int c) {
        System.out.println("3-ci metodumuz");
        return a + b+c;
    }
    // bu o demekki ayni isimli metod ola bilir fakat deyerleri farkli olmali
    // deyerler misal(int a,intb,....doublec) bu parantez icinde olanlar farkli olucak

    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.println("Sayi 1 giriniz=");
        int a= reader.nextInt();
        System.out.println("Sayi 2 giriniz=");
        int b= reader.nextInt();
        System.out.println("sayi 3 giriniz=");
        int c= reader.nextInt();
        System.out.println("sayi4 giriniz double olsun=");
        double c1= reader.nextDouble();

        System.out.println(add(a,b));
        System.out.println(add(a,b,c));
        System.out.println(add(a,c1,b));



    }
}
