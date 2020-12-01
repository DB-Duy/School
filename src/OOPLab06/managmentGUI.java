package OOPLab06;

import javax.swing.*;
import java.awt.*;

public class managmentGUI extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JList ProductList;
    private JPanel panel;
    private JButton addButton;
    private JButton deleteButton;

    public managmentGUI(){
        super("Product Management");
        this.getContentPane().add(panel);
        this.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        managmentGUI gui=new managmentGUI();
    }
}
