package hvktmm.khoaattt.at20.BaiTap.Chuong3;

import java.util.Scanner;

public class SinhVien {
    private String maSo;
    private String hoTen;
    private double diemM1, diemM2, diemM3;

    // GET/SET
    public String getMaSo() { return maSo; }
    public void setMaSo(String maSo) { this.maSo = maSo; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public double getDiemM1() { return diemM1; }
    public void setDiemM1(double diemM1) {
        if (diemM1 < 0 || diemM1 > 10)
            throw new IllegalArgumentException("Điểm môn 1 phải từ 0 đến 10");
        this.diemM1 = diemM1;
    }

    public double getDiemM2() { return diemM2; }
    public void setDiemM2(double diemM2) {
        if (diemM2 < 0 || diemM2 > 10)
            throw new IllegalArgumentException("Điểm môn 2 phải từ 0 đến 10");
        this.diemM2 = diemM2;
    }

    public double getDiemM3() { return diemM3; }
    public void setDiemM3(double diemM3) {
        if (diemM3 < 0 || diemM3 > 10)
            throw new IllegalArgumentException("Điểm môn 3 phải từ 0 đến 10");
        this.diemM3 = diemM3;
    }

    // Constructor đầy đủ
    public SinhVien(String maSo, String hoTen, double diemM1, double diemM2, double diemM3) {
        setMaSo(maSo);
        setHoTen(hoTen);
        setDiemM1(diemM1);
        setDiemM2(diemM2);
        setDiemM3(diemM3);
    }

    // Constructor không tham số
    public SinhVien() { }

    // Hàm nhập chuẩn
    public void input(Scanner sc) {
        System.out.print("Nhập mã số: ");
        this.maSo = sc.nextLine().trim();

        System.out.print("Nhập họ tên: ");
        this.hoTen = sc.nextLine().trim();

        try {
            System.out.print("Nhập điểm môn 1: ");
            setDiemM1(Double.parseDouble(sc.nextLine()));

            System.out.print("Nhập điểm môn 2: ");
            setDiemM2(Double.parseDouble(sc.nextLine()));

            System.out.print("Nhập điểm môn 3: ");
            setDiemM3(Double.parseDouble(sc.nextLine()));

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Điểm phải là số!");
        }
    }

    public void printInfo() {
        System.out.println("Mã số: " + maSo);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm M1: " + diemM1);
        System.out.println("Điểm M2: " + diemM2);
        System.out.println("Điểm M3: " + diemM3);
    }

    public double avgPoint() {
        return (diemM1 + diemM2 + diemM3) / 3.0;
    }

    public String classify() {
        double avg = avgPoint();
        if (avg >= 8) return "Giỏi";
        else if (avg >= 6.5) return "Khá";
        else if (avg >= 5) return "Trung Bình";
        else return "Yếu";
    }
}

class MainSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv = new SinhVien();
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        try {
            sv.input(sc);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return;
        }

        System.out.println("\n=== THÔNG TIN SINH VIÊN ===");
        sv.printInfo();
        System.out.printf("Điểm trung bình: %.2f\n", sv.avgPoint());
        System.out.println("Xếp loại: " + sv.classify());
    }
}
