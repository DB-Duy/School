import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class e3 {
    public static String c="b";
    public static void run(){
        draw.start();
    }
    public static class draw extends JPanel {
        public static int width=800;
        public static int height=800;
        public static JFrame frame = new JFrame();
        
        public static void start(){
            Scanner in = new Scanner(System.in);
            /*System.out.println("Exercise 3 a or b: ");
            c=in.nextLine();
            System.out.println("Enter width: ");
            width=in.nextInt();
            System.out.println("Enter height: ");
            height=in.nextInt();*/
            draw e3=new draw();
            frame.setPreferredSize(new Dimension(width,height));
            e3.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
            frame.getContentPane().add(e3);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for(int i=0;i<15;i++){
                int midW=this.getWidth()/2;
                int midH=this.getHeight()/2;
                int increW=(int)(i*(double)this.getWidth()/15);
                int increH=(int)(i*(double)this.getHeight()/15);
                g.drawLine(0,0,midW+increW,midH-increH);
                g.drawLine(0,0,midW-increW,midH+increH);
                g.drawLine(this.getWidth(),this.getHeight(),midW+increW,midH-increH);
                g.drawLine(this.getWidth(),this.getHeight(),midW-increW,midH+increH);
                if(c.equalsIgnoreCase("b")){
                    g.drawLine(0,this.getHeight(),midW+increW,midH+increH);
                    g.drawLine(0,this.getHeight(),midW-increW,midH-increH);
                    g.drawLine(this.getWidth(),0,midW-increW,midH-increH);
                    g.drawLine(this.getWidth(),0,midW+increW,midH+increH);
                }
            }
        }
    }
}
