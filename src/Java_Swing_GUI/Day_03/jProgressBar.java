package Java_Swing_GUI.Day_03;

import javax.swing.*;

public class jProgressBar {
    public static void main(String[] args) {

        JFrame frame=new JFrame();

        JProgressBar pBar=new JProgressBar(0,100);
        pBar.setBounds(40,40,300,30);
        pBar.setValue(0);
        pBar.setStringPainted(true);


        frame.add(pBar);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int a=0;
        while (a<=100){
            pBar.setValue(a);
           a++;

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }



        }










    }
}
