package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JPasswordField pfPAssword;
    private JPasswordField pfPasswordConfirm;
    private JButton btnRegister;
    private JButton btnCancel;
    private JLabel registerPanel;
    private JPanel MainPanel;


    public RegistrationForm(JFrame parent) {
        super(parent);
        setTitle("Create new account");
        setContentPane(MainPanel);
        setMinimumSize(new Dimension(700, 720));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);

    }

    public static void main(String[] args) {
                RegistrationForm myReg=new RegistrationForm(null);

    }
}
