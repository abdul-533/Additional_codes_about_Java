package Java_Swing_GUI.Day_02;

import javax.swing.*;

public class JCombobox {

    public static void main(String[] args) {

        JFrame frame = new JFrame("About Combo");

        String tablo[] = {"C", "C#", "C++", "Java", "Selenium", "Cucumber"};
        JComboBox comboBox = new JComboBox<>(tablo);

        comboBox.setBounds(50, 100, 100, 30);


        JButton button = new JButton("send");
        button.setBounds(50, 160, 100, 30);

        frame.add(button);
        frame.add(comboBox);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
