package OOPLab06;

import javax.swing.*;
import java.awt.*;

public class managementGUI extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JList ProductList;
    private JPanel panel;
    private JButton addButton;
    private JButton deleteButton;

    public managementGUI(){
        super("Product Management");
        this.getContentPane().add(panel);
        this.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }
}
