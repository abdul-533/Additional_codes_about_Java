package Java_Swing_GUI.Day_01;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class jTextField {
    public static void main(String[] args) {
        // JTextField and // obj.setBounds(x,y, width,height); text area

//        JFrame fr1=new JFrame("metin alanim");
//        JTextField textf1=new JTextField();
//        textf1.setBounds(0,0,300,50);  // girilen verileri kisitlama kismida var genelde daha cok kullanilir
//
//        fr1.add(textf1);
//        fr1.setSize(600,600);
//        fr1.setLayout(null);
//        fr1.setVisible(true);


        JFrame fr1=new JFrame("metin alanim");

        JLabel l1,l2, l3;
        JTextField t1,t2,t3;
        JButton bt1;

        l1=new JLabel("First number");
        l1.setBounds(50,0,100,25);
        t1=new JTextField();
        t1.setBounds(50,30,200,25);

        l2=new JLabel("Second number");
        l2.setBounds(350,0,100,25);
        t2=new JTextField();
        t2.setBounds(350,30,200,25);

        l3=new JLabel("Sum");
        l3.setBounds(200,120,100,25);
        t3=new JTextField();
        t3.setBounds(200,150,200,25);
        t3.setEditable(false);  // boyleleikle bu kismi duzenlenemez yapildi

        bt1=new JButton("* Get *");
        bt1.setBounds(450,150,100,30);
        bt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                String sum=String.valueOf(c);
                t3.setText(sum);



            }
        });





        fr1.add(bt1);

        fr1.add(l1);
        fr1.add(t1);

        fr1.add(l2);
        fr1.add(t2);

        fr1.add(l3);
        fr1.add(t3);

        fr1.setSize(600,600);
        fr1.setLayout(null);
        fr1.setVisible(true);
    }
}
