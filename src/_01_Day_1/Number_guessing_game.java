package _01_Day_1;

import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] args) {

        int tahmin, randomSayi = 0, deneme = 5,hatacounter=0;
//        Random rand=new Random();
//        int sayi=(int)(rand.nextInt(4));  farkli yolla random sayi uretme
//        System.out.println("sayi = " + sayi);



        Scanner reader = new Scanner(System.in);


        System.out.println("*****************Tehis is number finder game****************");

        boolean a=true;
        while (a) {
            System.out.println("If you don't know the rules, press the \"1\" key. If you know, press the \"0\" key: ");
            int  girilen2=reader.nextInt();
            switch (girilen2) {
                case 1:
                    System.out.println("RULES: ");
                    System.out.println("You have the right to enter a number between 0 and the limit you will specify");
                    System.out.println("When entered incorrectly, there is no loss of life for the first time, then your life is reduced by one");
                    a=false;
                    break;
                case 0: a=false;break;
                default: System.out.println("Please enter the operations specified on the screen"); break;

            }
        }


        System.out.println("Enter the limit, that is, if you want to find the numbers you want to find, between 0 and which digit? :");
        int sinir=reader.nextInt();
        System.out.println("If you want to determine your life yourself, enter \"Y\" If no, enter \"N\",");
        String girilen=reader.next();
        if (girilen.equalsIgnoreCase("Y")){
            System.out.println("How many souls do you have?: ");
            deneme=reader.nextInt();
            System.out.println(" You have "+deneme+" life, good games)");
        }else
            System.out.println("You have 5 lives determined by the computer , Good games");
        while (deneme>0){

            System.out.println("Write number: ");
            tahmin=reader.nextInt();
            if (tahmin<0|| tahmin>sinir){

                if(hatacounter==0) {

                    System.out.println("Wrong guess! If your sorry is entered incorrectly, you will not lose your life on the first try."+" your estimation should be between 0 and "+sinir);
                    hatacounter++;
                    continue;

                }else if (hatacounter>0) {
                    System.out.println("Please enter correctly, your guess must be between 0-20 guesses");
                    System.out.println("You did not follow the rules for your life, you made more than one wrong entry, you lost your life ,Your life= "+(--deneme));
                    continue;
                }
            }
            randomSayi=(int)(Math.random()*(sinir+1));
            if (tahmin==randomSayi){
                System.out.println("Congratulations, you found it)) Your number: "+randomSayi);
                break;

            }else{
                System.out.println("Try again(( Number doesn't finding ***Searched number= "+randomSayi);
                --deneme;
                if (deneme==0) {
                    System.out.println("Your trial period is over");
                    continue;
                }
                System.out.println("You have "+deneme+" attempts left");

            }
        }
        System.out.println("The program is finished, thank you "+" If you want to try it, you can run it again))");



    }
}
