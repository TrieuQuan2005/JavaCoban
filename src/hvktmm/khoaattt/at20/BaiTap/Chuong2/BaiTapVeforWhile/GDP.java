package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GDP {

    private static final Scanner sc = new Scanner(System.in);

    private static double AssignValue(String message) {
        while (true) {
            try {
                System.out.print(message);
                double variable = sc.nextDouble();

                if (variable < 0) {
                    throw new InputMismatchException();
                }

                return variable;

            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
                sc.nextLine();  // Xóa buffer lỗi
            }
        }
    }

    public static void main(String[] args) {
        double initGDP = AssignValue("Nhập GDP ban đầu (tỷ USD): ");
        double growthRate = AssignValue("Nhập tốc độ tăng trưởng trung bình (%): ") / 100;

        double gdp = initGDP;
        int year = 2020;

        System.out.println("Năm\tGDP (tỷ USD)");
        System.out.println("----------------------");

        while (gdp < 2 * initGDP) {
            System.out.printf("%d\t%.2f%n", year, gdp);
            gdp *= (1 + growthRate);
            year++;
        }
        System.out.printf("%d\t%.2f%n", year, gdp);
    }
}
