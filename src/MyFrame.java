import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyFrame extends JFrame{
    public static int width,height;

    public MyFrame(){
        this.setSize(width,height);
        this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
