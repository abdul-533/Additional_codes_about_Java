package Java_Swing_GUI.Day_02;

import javax.swing.*;

public class jOptionPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello)))");
       // JOptionPane.showMessageDialog(frame, "Hello world");
        String a = "Click ok";
        JOptionPane.showMessageDialog(frame, a, " Stoop", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showConfirmDialog(frame,"Do you want to continue?");

        String name=
        JOptionPane.showInputDialog(frame,"Name:");
        System.out.println("name = " + name);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
