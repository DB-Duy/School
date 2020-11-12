import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class e6 {
    public static void run() {
        e6.draw.start();
    }
    public static ArrayList<Integer> number=new ArrayList<Integer>();
    public static class draw extends JPanel {
        public static int width = 800;
        public static int height = 800;
        public static JFrame frame = new JFrame();

        public static void start() {
            for(int k=0;k<5;k++){
                number.add(Integer.parseInt(JOptionPane.showInputDialog("Input number "+(k+1))));
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Enter width: ");
            width = in.nextInt();
            System.out.println("Enter height: ");
            height = in.nextInt();
            e6.draw e6 = new e6.draw();
            frame.setPreferredSize(new Dimension(width, height));
            e6.setPreferredSize(new Dimension(frame.getWidth(), frame.getHeight()));
            frame.getContentPane().add(e6);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int y=this.getHeight()/15;
            for(int i=0;i<5;i++){
                if(i==0){
                    g.setColor(Color.BLACK);
                }
                else if(i==1){
                    g.setColor(Color.GRAY);
                }
                else if(i==2){
                    g.setColor(Color.MAGENTA);
                }
                else if(i==3){
                    g.setColor(Color.green);
                }
                else if(i==4){
                    g.setColor(Color.CYAN);
                }
                g.fillRect(0,y*2*(i+1), number.get(i)*10,50);
            }
        }
    }
}
