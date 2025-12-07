package hvktmm.khoaattt.at20.viDu.Chuong2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GiaiPTBac2CaiTien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();

            if (a == 0) {
                // Phương trình trở thành b·x + c = 0
                if (b == 0) {
                    if (c == 0) System.out.println("Phương trình vô số nghiệm.");
                    else System.out.println("Phương trình vô nghiệm.");
                } else {
                    double x = -c / b;
                    System.out.println("Phương trình bậc nhất có nghiệm: x = " + x);
                }
                return;
            }

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng chỉ nhập số!");
        }
    }
}
