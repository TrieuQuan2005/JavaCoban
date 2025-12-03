package hvktmm.khoaattt.at20.viDu.Chuong2;
import java.util.Scanner;

public class XepLoaiHocLuc2 {
    public static void main(String[] args) {
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
}
