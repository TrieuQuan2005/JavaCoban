package hvktmm.khoaattt.at20.viDu;
import java.util.Scanner;

public class NhapInDaySo2 {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử của dãy:");
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("Dãy số vừa nhập là: ");
        for (int pt: a)
            System.out.print(pt + "  ");
    }

}
