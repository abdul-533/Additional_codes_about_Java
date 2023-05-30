package Java_Swing_GUI.Day_01;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class jTextArea {
    public static void main(String[] args) {
        JFrame fr1 = new JFrame("Next example");
        //JTextArea tar1=new JTextArea();
        // tar1.setBounds(0,0,300,200);

        JButton b1 = new JButton("Set");
        b1.setBounds(500, 350, 80, 25);

        JLabel l1, l2;

        l1 = new JLabel();
        l1.setBounds(100, 30, 150, 20);

        JTextField f1=new JTextField();
        f1.setBounds(0,360,120,25);
        f1.setEditable(false);





        l2 = new JLabel();
        l2.setBounds(300, 30, 150, 20);

        JTextArea ta1 = new JTextArea();
        ta1.setBounds(100, 150, 350, 200);

        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myText = ta1.getText();
                String words[] = myText.split("\\s");
                l1.setText("Kelime sayisi: " + words.length);
                l2.setText("Karakter sayisi: " + myText.length());

                String m=myText.replaceAll(" ","");
                f1.setText("Genel harf sayisi: "+String.valueOf(m.length()));
            }
        });


        fr1.add(f1);
        fr1.add(b1);
        fr1.add(ta1);
        fr1.add(l1);
        fr1.add(l2);

        // fr1.add(tar1);
        fr1.setSize(600, 600);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setLayout(null);
        fr1.setVisible(true);


    }
}
