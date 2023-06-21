package Java_Swing_GUI.Day_03;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class jMenu {
    public static void main(String[] args) {

        JFrame frame = new JFrame("For menu");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("First menu");
        JMenu SubMenu = new JMenu("Sub Menu");


        JMenuItem jMenuItem = new JMenuItem("Number1");

        jMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Click to Menu");
            }
        });
        JMenuItem jMenuItem2 = new JMenuItem("Number2");
        JMenuItem jMenuItem3 = new JMenuItem("Number3");
        JMenuItem jMenuItem4 = new JMenuItem("Number4");


        JMenuItem jMenuItemS1 = new JMenuItem("Sub 1");
        JMenuItem jMenuItemS2 = new JMenuItem("Sub 2");
        JMenuItem jMenuItemS3 = new JMenuItem("Sub 3");

        SubMenu.add(jMenuItemS1);
        SubMenu.add(jMenuItemS2);
        SubMenu.add(jMenuItemS3);

        menu.add(jMenuItem);
        menu.add(jMenuItem2);
        menu.add(jMenuItem3);
        menu.add(jMenuItem4);
        menu.add(SubMenu);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
