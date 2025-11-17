package hvktmm.khoaattt.at20.BaiTap;
import java.util.Scanner;
public class SinX {
    public static double Exp(double x, int n) {
        double res = 1;
        for(int i =1; i<= n; i++) {
            res *= x;
        }
        return res;
    }

    public static double Factorial(int n) {
        double res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static double SinFactor(double x, int n) {
        double sign = Exp(-1,n);
        double exp = Exp(x, 2*n + 1);
        double fact = Factorial(2*n + 1);
        return sign * exp / fact;
    }

    public static double SinX(double x, double eps) {
        double sinx = 0;
        int i =0;
        do{
            sinx += SinFactor(x, i);
            i++;

        }while(Math.abs(SinFactor(x,i)) > eps);

        return sinx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        double x = sc.nextDouble();

        System.out.print("Nhap eps: ");
        double eps = sc.nextDouble();

        double result = SinX(Math.toRadians(x), eps);

        System.out.println("Sin(" + x + ") = " + result);
    }
}
