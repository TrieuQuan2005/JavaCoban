package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeIfSwitch;

import java.util.*;

public class KiemTraTamGiac {

    static boolean nearlyEqual(double x, double y) {
        return Math.abs(x - y) < 1e-9;
    }

    static boolean isTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return a + b > c && a + c > b && b + c > a;
    }

    static boolean isSquareTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) return false;
        return nearlyEqual(a * a, b * b + c * c) ||
                nearlyEqual(b * b, a * a + c * c) ||
                nearlyEqual(c * c, a * a + b * b);
    }

    static boolean isBalanceTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) return false;
        return nearlyEqual(a, b) || nearlyEqual(b, c) || nearlyEqual(a, c);
    }

    static boolean isSquareBalanceTriangle(double a, double b, double c) {
        return isSquareTriangle(a, b, c) && isBalanceTriangle(a, b, c);
    }

    static boolean isFullBalanceTriangle(double a, double b, double c) {
        if (!isTriangle(a, b, c)) return false;
        return nearlyEqual(a, b) && nearlyEqual(b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0;

        try {
            System.out.print("Nhập 3 cạnh tam giác: ");

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            // Kiểm tra giá trị âm hoặc 0
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Cạnh tam giác phải lớn hơn 0!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập số! (VD: 3 4 5)");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
            return;
        }

        // Xử lý phân loại tam giác
        if (!isTriangle(a, b, c)) {
            System.out.println("Not Triangle (Không phải tam giác)");
            return;
        }

        if (isFullBalanceTriangle(a, b, c))
            System.out.println("Full Balance Triangle (Tam giác đều)");
        else if (isSquareBalanceTriangle(a, b, c))
            System.out.println("Square Balance Triangle (Vuông cân)");
        else if (isSquareTriangle(a, b, c))
            System.out.println("Square Triangle (Vuông)");
        else if (isBalanceTriangle(a, b, c))
            System.out.println("Balance Triangle (Cân)");
        else
            System.out.println("Triangle (Thường)");
    }
}
