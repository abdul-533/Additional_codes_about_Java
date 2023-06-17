package Java_Swing_GUI.Day_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jList {

    public static void main(String[] args) {
        JFrame frame = new JFrame("About JList");

        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Hello");
        l1.addElement("Hi");
        l1.addElement("How are you");
        l1.addElement("How do you do");

        JList<String> list = new JList<>(l1);
        list.setBounds(30, 50, 80, 80);

        // birtanesini secmek icin kullaniyoruz
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        DefaultListModel<Integer> l2 = new DefaultListModel<>();
        l2.addElement(1);
        l2.addElement(2);
        l2.addElement(3);
        l2.addElement(4);

        JList<Integer> list2 = new JList<>(l2);
        list2.setBounds(120, 50, 80, 80);

        ButtonGroup g1 = new ButtonGroup();

        JButton b1 = new JButton("send");
        b1.setBounds(200, 80, 80, 30);

        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1) {
                    System.out.println(list.getSelectedValue() + " Secildi!");
                }
                if (list2.getSelectedIndex() != -1) {
                    for (Object i:list2.getSelectedValuesList()){
                        System.out.println("Secilen deyer="+i);

                    }
                }

            }
        });


        frame.add(b1);
        frame.add(list2);
        frame.add(list);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
