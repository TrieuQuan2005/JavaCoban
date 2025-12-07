package hvktmm.khoaattt.at20.viDu.Chuong2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập số n = ");
            int n = sc.nextInt();

            // Kiểm tra n < 2 (không phải số nguyên tố)
            if (n < 2) {
                System.out.println(n + " không phải là số nguyên tố.");
                return;
            }

            boolean laNguyenTo = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break;
                }
            }

            if (laNguyenTo)
                System.out.println(n + " là số nguyên tố.");
            else
                System.out.println(n + " không phải là số nguyên tố.");

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập vào một số nguyên!");
        }
    }
}
