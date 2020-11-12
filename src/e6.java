import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class e6 {
    public static void run() {
        e6.draw.start();
    }

    public static class draw extends JPanel {
        public static int width = 800;
        public static int height = 800;
        public static JFrame frame = new JFrame();

        public static void start() {
            String n;
            n=JOptionPane.showInputDialog("How many bars: ");
            int i=Integer.parseInt(n);
            int[] numbers= new int[i];
            for(int k=0;k<i;k++){
                String u;
                u=JOptionPane.showInputDialog("Input bar "+(k+1));
                numbers[k]=Integer.parseInt(u);
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

        }
    }
}
