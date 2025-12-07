package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeIfSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InUocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Nhập số nguyên dương an toàn
        while (true) {
            try {
                System.out.print("Nhập một số nguyên dương: ");
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Vui lòng nhập số nguyên dương (> 0).");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập số nguyên.");
                sc.nextLine(); // xóa buffer để tránh lặp vô hạn
            }
        }

        // In các ước số
        System.out.println("\nCác ước số của " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
