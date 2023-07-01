package Java_Swing_GUI.Windowbuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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


        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void registerUser() {
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String password = String.valueOf(pfPAssword.getPassword());
        String confirmPassword = String.valueOf(pfPasswordConfirm.getPassword());

        if (name.isEmpty() || email.isEmpty() || address.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Place enter all fields", "Try again", JOptionPane.ERROR_MESSAGE);
            return;
        }
        user = addUserToDataBase(name, email, phone, address, password);
        if (user != null) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Failed to register new user",
                    "Try again", JOptionPane.ERROR_MESSAGE);
        }
    }

    public User user;

    private User addUserToDataBase(String name, String email, String phone, String address, String password) {
        User user = null;
        final String DB_Url = "jdbc:mysql://localhost/MyStore?ServerTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";
        try {
            Connection connect = DriverManager.getConnection(DB_Url, USERNAME, PASSWORD);
            Statement stat = connect.createStatement();
            String sql = "INSERT INTO users(name,email,phone,address,password)" + "VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement=connect.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,phone);
            preparedStatement.setString(4,address);
            preparedStatement.setString(5,password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        RegistrationForm myReg = new RegistrationForm(null);

    }
}
