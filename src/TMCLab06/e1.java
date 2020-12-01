package TMCLab06;
import java.text.*;
import java.math.*;

public class e1 {

        // Function to find the product term
        static double proterm(int i, double value, double x[])
        {
            double pro = 1;
            for (int j = 0; j < i; j++) {
                pro = pro * (value - x[j]);
            }
            return pro;
        }

        // Function for calculating
        // divided difference table
        static void dividedDiffTable(double x[], double y[][], int n)
        {
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    y[j][i] = (y[j][i - 1] - y[j + 1][i - 1]) / (x[j] - x[i + j]);
                }
            }
        }

        // Function for applying Newton's
        // divided difference formula
        static double applyFormula(double value, double x[],
                                  double y[][], int n)
        {
            double sum = y[0][0];

            for (int i = 1; i < n; i++) {
                sum = sum + (proterm(i, value, x) * y[0][i]);
            }
            return sum;
        }

        // Function for displaying
        // divided difference table
        static void printDiffTable(double y[][],int n)
        {
            DecimalFormat df = new DecimalFormat("#.####");
            df.setRoundingMode(RoundingMode.HALF_UP);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    String str1 = df.format(y[i][j]);
                    System.out.print(str1+"\t ");
                }
                System.out.println("");
            }
        }

        public static void main(String[] args)
        {
            // number of inputs given
            int n = 7;
            double value, sum;
            double y[][]=new double[10][10];
            double x[] = { 0, 1,2.5,3,4.5,5,6 };

            // y[][] is used for divided difference
            // table where y[][0] is used for input
            y[0][0] = 2;
            y[1][0] = 5.4375;
            y[2][0] = 7.3516;
            y[3][0] = 7.5625;
            y[4][0] = 8.4453;
            y[5][0] = 9.1875;
            y[6][0] = 12;

            // calculating divided difference table
            dividedDiffTable(x, y, n);

            // displaying divided difference table
            //printDiffTable(y,n);

            // value to be interpolated
            value = 3.5;

            // printing the value
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.HALF_UP);

            System.out.println("\nValue at "+df.format(value)+" is "
                    +df.format(applyFormula(value, x, y, n)));
        }
    }

