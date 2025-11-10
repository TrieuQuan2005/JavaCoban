package hvktmm.khoaattt.at20;
import java.util.Scanner;

public class NhapInMaTran2 {
    public static void main(String[] args) {
        int n, m, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: "); n = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: "); m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Nhập các phần tử của ma trận A:");
        for (i = 0; i < n; i++)
            for (j = 0; j < m; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                        a[i][j] = sc.nextInt();
            }

        System.out.println("Ma trận A vừa nhập là:");
        for (int[] row : a) { // duyệt từng hàng
            for (int pt : row)  // duyệt từng phần tử trong hàng
                System.out.print(pt + "  ");
            System.out.println();
        }
    }
}
