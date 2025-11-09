package hvktmm.khoaattt.at20;

import java.util.Scanner;

public class DocSo {
    public static String[] DonVi = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    public static String[] HangChuc = {"", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi"};
    public static String[] HangTram = {"", "Một Trăm", "Hai Trăm", "Ba Trăm", "Bốn Trăm", "Năm Trăm", "Sáu Trăm", "Bảy Trăm", "Tám Trăm", "Chín Trăm"};

    static boolean isValid(int n) {
        return (n >= 0 && n <= 999);
    }

    static String docSo(int n) {
        if (!isValid(n)) return "Số không hợp lệ!";

        int tram = n / 100;
        int chuc = (n % 100) / 10;
        int donvi = n % 10;

        String result = "";
        if (tram != 0) result += HangTram[tram] + " ";

        if (chuc == 0 && donvi != 0 && tram != 0) result += "Lẻ ";
        if (chuc != 0) result += HangChuc[chuc] + " ";

        if (donvi != 0) {
            if (chuc > 1 && donvi == 1) result += "Mốt ";
            else if (chuc >= 1 && donvi == 5) result += "Lăm ";
            else result += DonVi[donvi] + " ";
        }

        return result.trim();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số (0–999): ");
        int n = sc.nextInt();
        System.out.println("Cách đọc: " + docSo(n));
    }
}
