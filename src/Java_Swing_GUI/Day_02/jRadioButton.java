package Java_Swing_GUI.Day_02;

import javax.swing.*;

public class jRadioButton {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Radio");
        JRadioButton radioButton1=new JRadioButton("Man");
        JRadioButton radioButton2=new JRadioButton("Woman");

        radioButton1.setBounds(0,0,100,50);
        radioButton2.setBounds(100,0,100,50);

        ButtonGroup gb=new ButtonGroup();
        gb.add(radioButton1);
        gb.add(radioButton2);


        jFrame.add(radioButton2);
        jFrame.add(radioButton1);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setVisible(true);


    }
}
