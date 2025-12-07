package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeIfSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThangNamTroiQuaNhanhQua {

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0, year = 0;

        try {
            System.out.print("Nhập tháng: ");
            month = sc.nextInt();

            System.out.print("Nhập năm: ");
            year = sc.nextInt();

            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Tháng phải từ 1 đến 12!");
            }
            if (year <= 0) {
                throw new IllegalArgumentException("Năm phải lớn hơn 0!");
            }

            int days = getDaysInMonth(month, year);
            System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");

        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
