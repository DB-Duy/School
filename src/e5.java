import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class e5 {
    public static String c="r";
    public static void run(){
        e5.draw.start();
    }
    public static class draw extends JPanel {
        public static int width = 800;
        public static int height = 800;
        public static JFrame frame = new JFrame();

        public static void start() {
            Scanner in = new Scanner(System.in);
            System.out.println("Exercise 5 spiral or rectangle (enter 's' or 'r'): ");
            c = in.nextLine();
            System.out.println("Enter width: ");
            width = in.nextInt();
            System.out.println("Enter height: ");
            height = in.nextInt();
            draw e5 = new e5.draw();
            frame.setPreferredSize(new Dimension(width, height));
            e5.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
            frame.getContentPane().add(e5);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            if(c.equalsIgnoreCase("r")){
                int x=this.getWidth()/15;
                int y=this.getHeight()/15;
                int a=this.getWidth()/15;
                int b=this.getHeight()/15;
                int i=1;
                while(x<this.getWidth()&&y<this.getHeight()){
                    if(i%4==1 && i!=1){

                    }
                }
            }
        }
    }
}
