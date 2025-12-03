package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;

import java.util.Scanner;

public class Polimonyal {

    static boolean CheckInteger(double x) {
        return x == (int) x;
    }

    static double[] nhapHeSo(int bac) {
        double[] heSo = new double[bac + 1];
        Scanner sc = new Scanner(System.in);

        for (int i = bac; i >= 0; i--) {
            System.out.print("Nhập hệ số bậc " + i + ": ");
            heSo[i] = sc.nextDouble();
        }
        return heSo;
    }

    static double tinhGiaTri(double[] heSo, double x) {
        double ketQua = 0;
        for (int i = heSo.length - 1; i >= 0; i--) {
            ketQua = ketQua * x + heSo[i];
        }
        return ketQua;
    }

    static void inDaThuc(double[] heSo) {
        int bac = heSo.length - 1;
        StringBuilder daThuc = new StringBuilder();

        for (int i = bac; i >= 0; i--) {
            double hs = heSo[i];
            if (hs == 0) continue;

            // Dấu
            if (!daThuc.isEmpty()) daThuc.append(hs > 0 ? " + " : " - ");
            else if (hs < 0) daThuc.append("-");

            double absHs = Math.abs(hs);

            // In hệ số (bỏ nếu =1 và không phải bậc 0)
            if (absHs != 1 || i == 0) {
                if (CheckInteger(absHs)) daThuc.append((int) absHs);
                else daThuc.append(absHs);
            }

            // In biến và mũ
            if (i >= 1) {
                daThuc.append("x");
                if (i > 1) daThuc.append("^").append(i);
            }
        }

        System.out.println("Đa thức: " + daThuc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bậc của đa thức: ");
        int bac = sc.nextInt();

        double[] heSo = nhapHeSo(bac);
        inDaThuc(heSo);

        System.out.print("Nhập giá trị x để tính đa thức: ");
        double x = sc.nextDouble();

        double ketQua = tinhGiaTri(heSo, x);
        System.out.println("Giá trị của đa thức tại x = " + x + " là: " + ketQua);
    }
}
