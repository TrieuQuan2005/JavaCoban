package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;

import java.util.Scanner;

public class GDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập GDP năm 2020 (tỷ USD): ");
        double initGDP = sc.nextDouble();

        System.out.print("Nhập tốc độ tăng trưởng trung bình (%): ");
        double growthRate = sc.nextDouble() / 100;

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
