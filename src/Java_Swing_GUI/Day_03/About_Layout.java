package Java_Swing_GUI.Day_03;

import javax.swing.*;
import java.awt.*;

public class About_Layout {
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
        panel.setLayout(new BorderLayout());
        panel.add(b1, BorderLayout.NORTH);
        panel.add(b2, BorderLayout.SOUTH);
        panel.add(b3, BorderLayout.EAST);
        panel.add(b4, BorderLayout.WEST);
        panel.add(b5, BorderLayout.CENTER);

        frame.add(panel);
        //frame.pack(); boyle olunca butonlarin boyutuna gore boshluk birakir
        frame.setSize(500,500);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
