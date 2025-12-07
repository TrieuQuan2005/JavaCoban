package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeIfSwitch;

import java.util.InputMismatchException;
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

        // Trường hợp đặc biệt
        if (n == 0) return "Không";

        int tram = n / 100;
        int chuc = (n % 100) / 10;
        int donvi = n % 10;

        String result = "";

        if (tram != 0) result += HangTram[tram] + " ";

        if (chuc == 0 && donvi != 0 && tram != 0) result += "Lẻ ";
        if (chuc != 0) result += HangChuc[chuc] + " ";

        if (donvi != 0) {
            if (chuc == 1 && donvi == 5) {
                result += "Lăm ";            // Mười lăm
            }
            else if (chuc > 1 && donvi == 1) {
                result += "Mốt ";            // Hai mươi mốt
            }
            else if (chuc >= 1 && donvi == 5) {
                result += "Lăm ";            // Hai mươi lăm
            }
            else {
                result += DonVi[donvi] + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Nhập số (0–999): ");
                n = sc.nextInt();

                if (!isValid(n)) {
                    System.out.println("Số phải nằm trong khoảng 0–999. Nhập lại.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập số nguyên.");
                sc.nextLine(); // Xóa buffer lỗi
            }
        }

        System.out.println("Cách đọc: " + docSo(n));
    }
}
