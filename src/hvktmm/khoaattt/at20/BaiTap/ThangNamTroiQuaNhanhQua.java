package hvktmm.khoaattt.at20.BaiTap;

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

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        int days = getDaysInMonth(month, year);

        if (days != 0) System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
        else System.out.println("Tháng không hợp lệ.");

    }
}

