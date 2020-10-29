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
        Dimension d=new Dimension(MyFrame.width,MyFrame.height);
        draw e3=new draw();
        e3.setPreferredSize(d);
        frame.add(e3);
        frame.pack();
    }
    public static class draw extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for(int i=0;i<15;i++){
                double x=-((double)MyFrame.width/(double)MyFrame.height)*i*((double)MyFrame.width/15)+(double)MyFrame.width;
                double y=i*((double)MyFrame.width/15);
                g.drawLine(0,0,(int)x,(int)y);
            }
        }
    }
}
