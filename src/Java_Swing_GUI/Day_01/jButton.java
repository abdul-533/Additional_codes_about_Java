package Java_Swing_GUI.Day_01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jButton {
    public static void main(String[] args) {
        //JButton kullanimi

//        JFrame fr1=new JFrame("For Button");
//        JButton b1=new JButton("Hello world");
//
//        fr1.add(b1);              // Layout olmadiqindan button gozukmek asaqinda layout= null ondan

//        fr1.setSize(600,500);
//        fr1.setLayout(null);
//        fr1.setVisible(true);

        JFrame fr1=new JFrame("For Button");
        JButton b1=new JButton("Hello world");
        b1.setText("Send");  // butonun ismini deyishtirdik

        b1.setBounds(0,0,90,20); // boyle olunca buttonun yerini verdik nerede olacaqi
        // butona tiklandiqi anda olan ishlemi almakcin ise
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // burasi butona tiklama annindaki yer
                System.out.println("Butona tikladim boom!!");
            }
        });

        fr1.add(b1);



        fr1.setSize(600,500);
        fr1.setLayout(null);
        fr1.setVisible(true);


    }
}
