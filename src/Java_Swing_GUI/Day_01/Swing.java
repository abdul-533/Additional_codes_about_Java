package Java_Swing_GUI.Day_01;

import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        //Graphical User Interface (GUI)
        //Swing: Sum Microsoft Systems tarafindan piyasaya surulen Java GUI aracidi
        //Swing, günümüz uygulamalarınca kullanılan kullanıcı arabirimini (GUI – Graphical User Interface) tanımlayan sınıflar ve
        // arabirimler koleksiyonudur.Aynı amaçla kullanılan Abstract Window Toolkit (AWT)'nin yetersizliklerini gidermek için 1997
        // yılında kullanılmaya başlanmıştır.

        JFrame frame=new JFrame();
        frame.setSize(500,500);
        //genelde frame ozel syeler boyle yazilir


        //panel kullanimi
        JPanel p1=new JPanel();

        JButton bt1=new JButton("Let's go");
        p1.add(bt1);
        frame.add(p1);




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
