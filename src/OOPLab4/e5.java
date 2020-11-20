package OOPLab4;

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
                int x=this.getWidth()/2;
                int y=this.getHeight()/2;
                int a=this.getWidth()/2;
                int b=this.getHeight()/2;
                int lenW=this.getWidth()/20;
                int lenH=this.getHeight()/20;
                int i=1;
                while(x<this.getWidth()&&y<this.getHeight()){
                    if(i!=1 && i%2==1){
                        lenW+=this.getWidth()/20;
                        lenH+=this.getHeight()/20;
                    }
                    if(i%4==1){
                        b=b+lenH;
                    }
                    else if(i%4==2){
                        a=a-lenW;
                    }
                    else if(i%4==3){
                        b=b-lenH;
                    }
                    else if(i%4==0){
                        a=a+lenW;
                    }
                    g2d.drawLine(x,y,a,b);
                    x=a;
                    y=b;
                    i++;
                }
            }
            if(c.equalsIgnoreCase("s")){
                int x = getSize().width / 2 - 10;
                int y = getSize().height/ 2 - 10;
                int width = 20;
                int height = 20;
                int startAngle = 0;
                int arcAngle = 180;
                int depth = 10;
                int i=0;
                while (width<this.getWidth()&&height<this.getHeight()){
                    if (i % 2 == 0) {
                        y = y - depth;
                        width = width + 2 * depth;
                        height = height + 2 * depth;
                        g.drawArc(x, y, width, height, startAngle, -arcAngle);
                    } else {
                        x = x - 2 * depth;
                        y = y - depth;
                        width = width + 2 * depth;
                        height = height + 2 * depth;
                        g.drawArc(x, y, width, height, startAngle, arcAngle);
                    }
                    i++;
                }
            }
        }
    }
}
