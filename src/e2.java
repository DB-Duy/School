import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class e2 {
    public static void run() {
        draw.start();
    }
    public static class draw extends JPanel{
        public static int width=800;
        public static int height=800;
        public static JFrame frame = new JFrame();
        public static void start(){
            /*Scanner in=new Scanner(System.in);
            System.out.println("Enter width: ");
            width=in.nextInt();
            System.out.println("Enter height: ");
            height=in.nextInt();*/
            draw e2=new draw();
            frame.setPreferredSize(new Dimension(width,height));
            e2.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
            frame.getContentPane().add(e2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
                g.drawLine(0, 0, this.getWidth() , this.getHeight());
                g.drawLine(0, this.getHeight(), this.getWidth(), 0);
                g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
                g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        }
        
}
}