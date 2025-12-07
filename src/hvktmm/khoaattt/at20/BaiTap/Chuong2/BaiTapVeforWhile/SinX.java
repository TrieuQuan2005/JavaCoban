package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;

import java.util.Scanner;

public class SinX {

    // Tính sin(x) bằng chuỗi Taylor với sai số eps
    public static double SinX(double x, double eps) {
        double term = x;  // Biểu thức đầu tiên trong chuỗi Taylor
        double sinx = term;
        int i = 0;

        while (Math.abs(term) > eps) {
            i++;
            term *= -1 * x * x / ((2*i) * (2*i + 1));  // Công thức truy hồi
            sinx += term;
        }

        return sinx;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x (do): ");
        double x = sc.nextDouble();

        System.out.print("Nhap eps: ");
        double eps = sc.nextDouble();

        double rad = Math.toRadians(x);  // đổi sang radian
        double result = SinX(rad, eps);

        System.out.println("Sin(" + x + ") = " + result);
        System.out.println("Math.sin   = " + Math.sin(rad));
    }
}
