import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter frame width: ");
        MyFrame.width=in.nextInt();
        System.out.println("Enter frame height: ");
        MyFrame.height=in.nextInt();
        MyFrame frame= new MyFrame();
        draw e3=new draw();
        frame.add(e3);
    }
    public static class draw extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            
        }
    }
}
