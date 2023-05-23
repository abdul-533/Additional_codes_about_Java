package _03_MineField_game;

import java.util.Scanner;

public class MineFieldMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("**********Welcome to mine field game*****");
        System.out.println("Pleace write the size which you want to play ");
        System.out.println("Row number: ");
        row=scan.nextInt();
        System.out.println("Column number: ");
        column=scan.nextInt();
        MineFieldGame m1=new MineFieldGame(row,column);

        m1.run();



    }
}
