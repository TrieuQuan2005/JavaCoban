package hvktmm.khoaattt.at20.BaiTap.Chuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaTranVuong {
    private int n;
    private int[][] MaTran;

    public MaTranVuong(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Kích thước ma trận phải > 0");
        }
        this.n = n;
        this.MaTran = new int[n][n];
    }

    // ========================= Nhập ma trận =============================
    public void NhapMaTran() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ma trận " + n + "x" + n + ":");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    try {
                        System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                        MaTran[i][j] = sc.nextInt();
                        break; // nhập đúng thì thoát vòng lặp
                    } catch (InputMismatchException e) {
                        System.out.println("Lỗi: Vui lòng nhập số nguyên!");
                        sc.nextLine(); // clear buffer
                    }
                }
            }
        }
    }

    // ========================= In ma trận =============================
    public void Display() {
        System.out.println("Ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(MaTran[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ========================= Cộng ma trận =============================
    public MaTranVuong congMaTran(MaTranVuong Matrix) {
        if (Matrix.n != this.n) {
            throw new IllegalArgumentException("Hai ma trận phải cùng kích thước để cộng.");
        }

        MaTranVuong result = new MaTranVuong(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result.MaTran[i][j] = this.MaTran[i][j] + Matrix.MaTran[i][j];
            }
        }
        return result;
    }

    // ========================= Nhân ma trận =============================
    public MaTranVuong nhanMaTran(MaTranVuong Matrix) {
        if (Matrix.n != this.n) {
            throw new IllegalArgumentException("Hai ma trận phải cùng kích thước để nhân.");
        }

        MaTranVuong result = new MaTranVuong(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += this.MaTran[i][k] * Matrix.MaTran[k][j];
                }
                result.MaTran[i][j] = sum;
            }
        }
        return result;
    }
}
