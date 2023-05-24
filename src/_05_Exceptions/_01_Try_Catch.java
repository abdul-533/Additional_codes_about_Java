package _05_Exceptions;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Scanner;

public class _01_Try_Catch {
    public static void main(String[] args) {
        System.out.println("Program started");
        Scanner scan=new Scanner(System.in);
        
        int a=0;
        int b;
        int[] arr = new int[2]; //hata yonetimi
      
         try {
             a=2/1;
             b=scan.nextInt();
           arr[10]=1;

             System.out.println("arr[10] = " + arr[10]);
             
         }catch ( ExceptionHasMessage e){
             System.out.println("e.getFaultMessage() = " + e.getFaultMessage());
         }catch (Exception c){

             System.out.println("c.toString() = " + c.getMessage());
         }
    }
}
