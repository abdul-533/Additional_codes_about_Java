package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JButton a1Button;
    private JButton a3Button1;
    private JButton a6Button1;
    private JButton a4Button;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button1;
    private JButton xButton;
    private JTextField textField1;
    private JButton a00Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
