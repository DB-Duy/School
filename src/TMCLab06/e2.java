package TMCLab06;

import java.math.RoundingMode;
import java.text.DecimalFormat;

    public class e2 {

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
            double sum=y[0][0];
            for (int i = 1; i < n; i++) {
                sum = sum + (proterm(i, value, x) * y[0][i]);
                if(i==n-1) {
                    System.out.println("f(2.8) using newton's order " + i + ": " + sum);
                }
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
            double value, sum;
            double y[][]=new double[10][10];
            double x[] = { 2.5,3.2 };
            int n=x.length;
            // y[][] is used for divided difference
            // table where y[][0] is used for input
            y[0][0] = 14;
            y[1][0] = 15;


            // calculating divided difference table
            dividedDiffTable(x, y, n);

            // displaying divided difference table
            //printDiffTable(y,n);

            // value to be interpolated
            value = 2.8;

            applyFormula(value,x,y,n);
            double x2[]={2,2.5,3.2};
            y[0][0]=8;
            y[1][0]=14;
            y[2][0]=15;
            dividedDiffTable(x2,y,x2.length);
            applyFormula(value,x2,y,x2.length);
            double x3[]={2,2.5,3.2,4};
            y[0][0]=8;
            y[1][0]=14;
            y[2][0]=15;
            y[3][0]=8;
            dividedDiffTable(x3,y,x3.length);
            applyFormula(value,x3,y,x3.length);
            System.out.println("We use the values closest to 2.8 for best accuracy");
        }
    }



