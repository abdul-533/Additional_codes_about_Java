package Java_Swing_GUI.Day_03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class jPoupMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("About Pop Menu");
        JPopupMenu popupMenu = new JPopupMenu("MENU");

        JMenuItem cut = new JMenuItem("CUT");
        JMenuItem copy = new JMenuItem("COPY");
        JMenuItem paste = new JMenuItem("PASTE");


        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        //framemisin sa] tiklama ozelliyine bakicaz ve bununcun mausu dinle

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                popupMenu.show(frame, event.getX(), event.getY());
            }
        });
        cut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Clicked cut button");
            }
        });



        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
