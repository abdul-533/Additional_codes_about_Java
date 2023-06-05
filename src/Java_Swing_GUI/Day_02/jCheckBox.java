package Java_Swing_GUI.Day_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class jCheckBox {
    public static void main(String[] args) {

        JFrame j1 = new JFrame("About Check box");
        JCheckBox box1 = new JCheckBox("To days work");

        JLabel l1=new JLabel("Hello");
        l1.setBounds(0,0,200,100);
        box1.setBounds(50, 50, 250, 80);
        JCheckBox box2 = new JCheckBox("about second Check box");
        box2.setBounds(300, 50, 200, 100);

        ButtonGroup bg = new ButtonGroup();
        bg.add(box1);
        bg.add(box2);

        JButton bt1 = new JButton("Send");
        bt1.setBounds(100,350,100,50);
        bt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (box1.isSelected()) {
                    System.out.println(box1.getText() + "is selected");
                } else if (box2.isSelected()) {
                    System.out.println(box2.getText() + " is selected");
                }
            }
        });
        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("Secim bolumu "+(e.getStateChange()==1? "secildi" : "secilmedi"));
            }
        });



        j1.add(l1);
        j1.add(bt1);
        j1.add(box2);
        j1.add(box1);
        j1.setSize(500, 500);
        j1.setLayout(null);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setVisible(true);


    }
}
