package hvktmm.khoaattt.at20.viDu.Chuong2;

import java.util.Scanner;
public class TongSoDuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;
        System.out.print("Nhập số phần tử n = ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0)
                continue; // bỏ qua số âm và số 0
            tong += a[i];
        }
        System.out.println("Tổng các phần tử dương trong dãy là: " + tong);
    }
}
