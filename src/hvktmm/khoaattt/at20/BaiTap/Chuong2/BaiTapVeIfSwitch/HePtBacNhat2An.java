package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeIfSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HePtBacNhat2An {

    // Hàm nhập số thực an toàn
    private static double inputDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(" Dữ liệu không hợp lệ! Vui lòng nhập số thực.");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Giải hệ phương trình bậc nhất 2 ẩn ===");
        System.out.println("Hệ phương trình dạng:");
        System.out.println("  a*x + b*y = c");
        System.out.println("  d*x + e*y = f");

        // Nhập dữ liệu
        double a = inputDouble(sc, "Nhập a: ");
        double b = inputDouble(sc, "Nhập b: ");
        double c = inputDouble(sc, "Nhập c: ");
        double d = inputDouble(sc, "Nhập d: ");
        double e = inputDouble(sc, "Nhập e: ");
        double f = inputDouble(sc, "Nhập f: ");

        // Tính định thức
        double D  = a * e - b * d;
        double Dx = c * e - b * f;
        double Dy = a * f - c * d;

        System.out.println("\n=== Kết quả ===");

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Hệ phương trình có nghiệm duy nhất:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }
    }
}
