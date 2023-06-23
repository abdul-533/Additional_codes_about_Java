package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {


    private JPanel MainPanel;
    private JLabel jsFirstNameme;
    private JButton sendButton;
    private JTextField c1;

    public Test()  {
        setContentPane(MainPanel);
        setTitle("Simple Swing App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname=c1.getText();
                JOptionPane.showMessageDialog(Test.this,"Hello my Java,Welcome "+firstname);
            }
        });
    }


    public static void main(String[] args) {
        new Test();

    }
    }

