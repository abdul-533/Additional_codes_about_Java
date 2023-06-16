package Java_Swing_GUI.Day_02;

import javax.swing.*;

public class jTabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("For tabel");

        String data[][] = {
                {"1", "Mersedes", "E3000"},
                {"2", "BMW", "E550",},
                {"3", "Audi", "A6000"}
        };
        String[] starting = {"Id", "Araba", "Marka"};

        JTable table = new JTable(data, starting);
        table.setBounds(50, 50, 250, 250);

        JScrollPane scrollPane = new JScrollPane(table);



        frame.add(scrollPane);
        frame.setSize(400, 400);
        //frame.setLayout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
