package _03_MineField_game;

import java.util.Random;
import java.util.Scanner;

public class MineFieldGame {
   int rowNumber,colNumber,size;
   int [][] map;
   int[][] board;
   boolean game=true;
   Random rand=new Random();
    Scanner scan=new Scanner(System.in);



    MineFieldGame(int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.map=new int[rowNumber][colNumber];
        this.board=new int[rowNumber][colNumber];
        this.size=(rowNumber*colNumber);


    }
    public void run(){
        int GirilenRow,GirilenCol,succes=0;
        prepareGame();
        print(map);
        System.out.println("Game started");
        while (game){
            print(board);
            System.out.println("Row: ");
            GirilenRow=scan.nextInt();
            System.out.println("Col: ");
            GirilenCol=scan.nextInt();
            if(GirilenRow<0||GirilenRow>=rowNumber|| (GirilenCol<0||GirilenCol>=colNumber)){
                System.out.println("gecersiz koordinat");
                continue;

            }
            if (map[GirilenRow][GirilenCol]!=-1) {
                checkMayin(GirilenRow, GirilenCol);
                succes++;
                if (succes==(size-(size/4))){
                    System.out.println("Bashardiniz hic bir mayina basmadiniz");
                    game=false;
                }
            }else {
                game=false;
                System.out.println("Game over");
            }


        }



    }
    public void checkMayin(int row,int col){
        if (map[row][col]==0){
            if ((col<colNumber-1)&& (map[row][col+1]==-1)){
                board[row][col]++;
            }
            if((row<rowNumber-1)&&(map[row+1][col]==-1)){
                board[row][col]++;
            }
            if ((row>0)&& (map[row-1][col]==-1)){
                board[row][col]++;
            }
            if (board[row][col]==0){
                board[row][col]=-2;
            }

        }


    }
    public void prepareGame(){
        int randRow,randCol,count=0;

        while (count!=(size/4)){
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);
            if(map[randRow][randCol]!=-1){
                map[randRow][randCol]=-1;
                count++;
            }
        }



    }
    public void print(int[][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]>=0)
                    System.out.print(" ");
                System.out.print(array[i][j]+" ");
            }
            System.out.println();


        }

    }
}
