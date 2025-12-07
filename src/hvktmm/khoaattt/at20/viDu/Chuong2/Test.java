package hvktmm.khoaattt.at20.viDu.Chuong2;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);
        System.out.print("Nhap m= ");
        int n, m = banPhim.nextInt();
        System.out.print("Nhap n= ");
        n = banPhim.nextInt();
        System.out.println("Tong = " + (n + m));
    }
}
