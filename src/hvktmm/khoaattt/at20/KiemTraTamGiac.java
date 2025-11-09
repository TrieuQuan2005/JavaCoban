package hvktmm.khoaattt.at20;

import java.util.*;

public class KiemTraTamGiac {

    static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    static boolean nearlyEqual(double x, double y) {
        return Math.abs(x - y) < 1e-9;
    }

    static boolean isSquareTriangle(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            return nearlyEqual(a * a, b * b + c * c)
                    || nearlyEqual(b * b, a * a + c * c)
                    || nearlyEqual(c * c, a * a + b * b);
        }
        return false;
    }

    static boolean isBalanceTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && (a == b || b == c || a == c);
    }

    static boolean isSquareBalanceTriangle(double a, double b, double c) {
        return isTriangle(a, b, c)
                && isSquareTriangle(a, b, c)
                && isBalanceTriangle(a, b, c);
    }

    static boolean isFullBalanceTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && (a == b && b == c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 3 cạnh tam giác: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (isFullBalanceTriangle(a, b, c))
            System.out.println("Full Balance Triangle (Tam giác đều)");
        else if (isSquareBalanceTriangle(a, b, c))
            System.out.println("Square Balance Triangle (Vuông cân)");
        else if (isSquareTriangle(a, b, c))
            System.out.println("Square Triangle (Vuông)");
        else if (isBalanceTriangle(a, b, c))
            System.out.println("Balance Triangle (Cân)");
        else if (isTriangle(a, b, c))
            System.out.println("Triangle (Thường)");
        else
            System.out.println("Not Triangle (Không phải tam giác)");
    }
}
