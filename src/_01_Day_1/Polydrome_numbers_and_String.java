package _01_Day_1;

import java.util.Scanner;

public class Polydrome_numbers_and_String {
    public static void main(String[] args) {
        
        // yani kelime ve ya sayilarin tersi kendine esitse o polidromdur

        Scanner reader=new Scanner(System.in);
        System.out.println("Ifade giriniz: ");
        String girilen=reader.nextLine();
        String temp="";


        for (int i = girilen.length()-1; i>=0; i--) {
            temp=temp+girilen.charAt(i);
        }
        if (temp.equals(girilen))
            System.out.println("Polidromikdir");
        else
            System.out.println("Polidromik deyildir");

        System.out.println("temp = " + temp);

    }
}
