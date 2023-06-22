package Java_Swing_GUI.Day_03;


import javax.swing.*;
import java.awt.*;

public class gridLayout {
    public static void main(String[] args) {
/*
Layout design is the process of arranging visual and
textual elements on-screen or on-paper in order to grab
 a reader's attention and communicate information in a visually appealing way
 */

        JFrame frame = new JFrame("Layout");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);


        frame.setSize(500, 500);


        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

