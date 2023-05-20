package _01_Day_1;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        // Fibonatci serisi =0,1,1,2,3,5,8,13,21,34.....

        // bunu birtane for dongusu ile kac fibonatci istediyini kullanicidan alarak yapiyoruz

        Scanner reader=new Scanner(System.in);
        System.out.println("Sinir giriniz=");
        int sinir= reader.nextInt();

        int s1=0;
        int s2=1;
        int toplam=0;

        System.out.println(sinir+" lik Fibonetci serisi:");

        for (int i = 1; i <=sinir; i++) {
            System.out.print(s1+" ,");
            toplam=s1+s2;
            s1=s2;
            s2=toplam;

        }



    }
}
