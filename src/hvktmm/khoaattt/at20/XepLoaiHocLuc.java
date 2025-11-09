package hvktmm.khoaattt.at20;
import java.util.Scanner;

public class XepLoaiHocLuc {
    static void xepLoai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm (0 - 10): ");
        int diem = sc.nextInt();
        switch (diem) {
            case 9:
            case 10:
                System.out.println("Xếp loại: Giỏi");
                break;
            case 7:
            case 8:
                System.out.println("Xếp loại: Khá");
                break;
            case 5:
            case 6:
                System.out.println("Xếp loại: Trung bình");
                break;
            default:
                System.out.println("Xếp loại: Yếu");
        }
    }

    static void xepLoai2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm (0 - 10): ");
        int diem = sc.nextInt();
        switch (diem) {
            case 9, 10:
                System.out.println("Xếp loại: Giỏi");
                break;
            case 8, 7:
                System.out.println("Xếp loại: Khá");
                break;
            case 5, 6:
                System.out.println("Xếp loại: Trung bình");
                break;
            default:
                System.out.println("Xếp loại: Yếu");

        }
    }

    static void XepLoai3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm (0 - 10): ");
        int diem = sc.nextInt();
        switch (diem) {
            case 9, 10 -> System.out.println("Xếp loại: Giỏi");
            case 8, 7 -> System.out.println("Xếp loại: Khá");
            case 5, 6 -> System.out.println("Xếp loại: Trung bình");
            default -> System.out.println("Xếp loại: Yếu");

        }
    }

    static void XepLoai4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm (0 - 10): ");
        int diem = sc.nextInt();
        String rank = switch (diem) {
            case 9, 10 -> "Giỏi";
            case 7, 8 -> "Khá";
            case 5, 6 -> "Trung bình";
            default -> "Yếu";
        };
        System.out.println("Xếp loại: " + rank);

    }

    public static void main(String[] args) {

    }
}
