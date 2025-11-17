package hvktmm.khoaattt.at20.viDu;
import java.util.Scanner;

public class XepLoaiHocLuc4 {

    public static void main(String[] args) {
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
}
