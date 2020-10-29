import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter frame width: ");
        MyFrame.width=in.nextInt();
        System.out.println("Enter frame height: ");
        MyFrame.height=in.nextInt();
        MyFrame frame = new MyFrame();
        Dimension d=new Dimension(MyFrame.width,MyFrame.height);
        draw e2= new draw();
        e2.setPreferredSize(d);
        frame.add(e2);
        frame.pack();
    }

    public static class draw extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawLine(0,0,MyFrame.width,MyFrame.height);
            g2d.drawLine(0,MyFrame.height,MyFrame.width,0);
            g2d.drawLine(0,MyFrame.height/2,MyFrame.width,MyFrame.height/2);
            g2d.drawLine(MyFrame.width/2,0,MyFrame.width/2,MyFrame.height);
        }
}
}