package Java_Swing_GUI.Day_02;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class jScrollBAr {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Scroll");
        label.setBounds(100, 50, 100, 30);

        //burda icine verdiklerimiz scrolun nerden bashlamasini gosterir
        //ve max-min cikma alanini belirlere biliyoruz
        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 100);
        scrollBar.setBounds(200, 20, 20, 250);


        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Scroll value:" + (scrollBar.getValue()/*+scrollBar.getModel().getExtent()*/));
            }
        });
        frame.add(label);
        frame.add(scrollBar);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
