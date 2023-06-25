package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JButton a1;
    private JButton a3;
    private JButton a4;
    private JButton a6;
    private JButton ACButton;
    private JButton aPlusMinus;
    private JButton a7;
    private JButton aMulti;
    private JTextField Display;
    private JButton a00;
    private JButton a8;
    private JButton a9;
    private JButton a5;
    private JButton a2;
    private JButton a0;
    private JButton aDot;
    private JButton aEquals;
    private JButton aMinus;
    private JButton aPlus;
    private JButton aDivide;
    private JButton aDelete;

    double a, b, result;
    String op;

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("");
            }
        });
        a7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a7.getText());
            }
        });
        a8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a8.getText());
            }
        });
        a9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a9.getText());
            }
        });
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a4.getText());
            }
        });
        a5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a5.getText());
            }
        });
        a6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a6.getText());
            }
        });
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a1.getText());
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a2.getText());
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a3.getText());
            }
        });
        a00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a00.getText());
            }
        });
        a0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a0.getText());
            }
        });

        aPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Display.getText().contains(".")) {
                    double pm = Double.parseDouble(Display.getText());
                    pm = pm * -1;
                    Display.setText(String.valueOf(pm));
                } else {
                    long Pm = Long.parseLong(Display.getText());
                    Pm = Pm * -1;
                    Display.setText(String.valueOf(Pm));
                }
            }
        });
        aDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Display.getText().contains(".")) {
                    Display.setText(Display.getText() + aDot.getText());
                }

            }
        });
        aMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "*";
                Display.setText("");
            }
        });
        aPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "+";
                Display.setText("");
            }
        });
        aMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "-";
                Display.setText("");
            }
        });
        aDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "/";
                Display.setText("");
            }
        });
        aDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String delete = null;
                if (Display.getText().length() > 0) {
                    StringBuilder strb = new StringBuilder(Display.getText());
                    strb.deleteCharAt(Display.getText().length() - 1);
                    delete = String.valueOf(strb);
                    Display.setText(delete);
                }
            }
        });
        aEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(Display.getText());

                if (op == "+") {
                    result = a + b;
                    Display.setText(String.valueOf(result));
                } else if (op == "-") {
                    result = a - b;
                    Display.setText(String.valueOf(result));

                } else if (op == "*") {
                    result = a * b;
                    Display.setText(String.valueOf(result));
                } else if (op == "/") {
                    result = a / b;
                    Display.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}