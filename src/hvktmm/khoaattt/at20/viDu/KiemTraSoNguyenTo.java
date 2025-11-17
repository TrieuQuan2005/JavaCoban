package hvktmm.khoaattt.at20.viDu;

import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean laNguyenTo = true; // giả sử ban đầu là số nguyên tố
        System.out.print("Nhập số n = ");
        n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                laNguyenTo = false;
                break; // gặp ước số thì thoát khỏi vòng lặp
            }
        }
        if (laNguyenTo)
            System.out.println(n + " là số nguyên tố.");
        else
            System.out.println(n + " không phải là số nguyên tố.");
    }
}
