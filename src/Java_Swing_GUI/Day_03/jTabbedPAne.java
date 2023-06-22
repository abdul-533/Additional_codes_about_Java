package Java_Swing_GUI.Day_03;

import javax.swing.*;

public class jTabbedPAne {
    public static void main(String[] args) {

        JFrame frame = new JFrame();


        JLabel label = new JLabel("First area");
        JPanel panel = new JPanel();
        panel.add(label);

        JLabel label1 = new JLabel("Second area");
        JPanel panel1 = new JPanel();
        panel1.add(label1);

        JLabel label2 = new JLabel("Third area");
        JPanel panel2 = new JPanel();
        panel2.add(label2);

        JTabbedPane tabbedPane=new JTabbedPane();
        tabbedPane.setBounds(20,20,150,150);
        tabbedPane.add("1",panel);
        tabbedPane.add("2",panel1);
        tabbedPane.add("3",panel2);


        frame.add(tabbedPane);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
