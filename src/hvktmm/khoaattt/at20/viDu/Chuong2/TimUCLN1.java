package hvktmm.khoaattt.at20.viDu.Chuong2;
import java.util.Scanner;

public class TimUCLN1 {
    public static void main(String[] args) {
        int a, b, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        while (b != 0) {
            r = a % b; // r là phần dư
            a = b;       // gán lại
            b = r;
        }
        System.out.println("Ước số chung lớn nhất là: " + a);
    }
}
