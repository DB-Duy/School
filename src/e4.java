import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class e4 {
    public static void run() {
        draw.start();
    }
    public static class draw extends JPanel {
        public static int width=800;
        public static int height=800;
        public static JFrame frame = new JFrame();
        public static void start(){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter width: ");
            width=in.nextInt();
            System.out.println("Enter height: ");
            height=in.nextInt();
            draw e4 =new draw();
            frame.setPreferredSize(new Dimension(width,height));
            e4.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
            frame.getContentPane().add(e4);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for(int i=0;i<15;i++){
                int increW=(int)(i*(double)this.getWidth()/15);
                int increH=(int)(i*(double)this.getHeight()/15);
                g.drawLine(0,this.getHeight()-increH,increW,0);
                g.drawLine(0,increH,increW,this.getHeight());
                g.drawLine(increW,0,this.getWidth(),increH);
                g.drawLine(increW,this.getHeight(),this.getWidth(),this.getHeight()-increH);
            }
        }
    }
}
