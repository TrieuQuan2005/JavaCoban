package hvktmm.khoaattt.at20.viDu.Chuong2;
import java.util.Scanner;

public class TimUCLN2 {
    public static void main(String[] args) {
        int a, b, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        do {
            r = a % b;  // lấy phần dư
            a = b;         // gán lại
            b = r;
        } while (r != 0);
        System.out.println("Ước số chung lớn nhất là: " + a);
    }

}
