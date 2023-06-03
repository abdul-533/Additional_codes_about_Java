package Java_Swing_GUI.Day_02;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class jPasswordField {
    public static void main(String[] args) {
        //how to use JPasswordFiled?

        JFrame frame = new JFrame("Using Password");

        JLabel l1 = new JLabel("Write password: ");
        l1.setBounds(0, 0, 150, 40);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(0, 30, 150, 40);

        JButton button=new JButton("Send");
        button.setBounds(350,50,100,30);
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String password=new String(passwordField.getPassword()); boylede kullanila bilir
                l1.setText(l1.getText()+String.valueOf(passwordField.getPassword()));
            }
        });


        frame.add(button);
        frame.add(l1);
        frame.add(passwordField);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
