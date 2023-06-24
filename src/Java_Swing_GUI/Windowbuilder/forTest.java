package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;
import java.awt.*;

public class forTest extends JFrame {

    private JPanel panel1;

    public forTest() {
        setTitle("For testing");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);


    }

    public static void main(String[] args) {
        new forTest();
    }
}
