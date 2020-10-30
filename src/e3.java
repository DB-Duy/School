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
                double j=frame.getContentPane().getWidth()/(double)frame.getContentPane().getHeight();
                double y=i*((double)frame.getContentPane().getWidth()/15);
                double x=-j*y+(double)frame.getContentPane().getHeight();
                g.drawLine(0,0,(int)y,(int)x);
                if(c.equalsIgnoreCase("b")){
                    g.drawLine(this.getWidth(),this.getHeight(),(int)y,(int)x);
                    g.drawLine(this.getWidth(),0,(int)x,(int)x);
                    g.drawLine(0,this.getHeight(),(int)x,(int)x);
                }
            }
        }
    }
}
