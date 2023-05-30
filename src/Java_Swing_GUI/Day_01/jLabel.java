package Java_Swing_GUI.Day_01;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class jLabel {
    public static void main(String[] args) {
//About JLabel


        JFrame f1 = new JFrame("My Jlabel");

        JLabel l1 = new JLabel("area");
        l1.setText("My writing area");
        l1.setBounds(200, 200, 250, 30);

        JButton bt1 = new JButton("Change");
        bt1.setBounds(200, 250, 200, 30);

        bt1.addActionListener(new AbstractAction() {
            int plus=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("I change my label "+ plus++ +" defa tikladin!");
               // System.out.println("bt1 = " +plus);
            }
        });



        f1.add(bt1);
        f1.add(l1);
        f1.setSize(400, 400);
        f1.setLayout(null); // simdilik null diye kullandik
        f1.setVisible(true);
    }
}
