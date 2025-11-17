package hvktmm.khoaattt.at20.BaiTap;
import java.util.Scanner;

public class QuanLySV {
    private String maSo;
    private String hoTen;
    private double diem;
    public static int soLuongSV = 0;

    public String getMaSo() {
        return maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getDiem() {
        return diem;
    }
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiem(double diem) {
        if (diem >= 0 && diem <= 10) {
            this.diem = diem;
        } else {
            this.diem = 0;
        }
    }
    public QuanLySV() {
        soLuongSV++;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap diem: ");
        this.diem = sc.nextDouble();
    }
}

class QLSinhVien {
    public static QuanLySV[] svList = new QuanLySV[100];
    public static final int MAX_SV = 100;

    public static double tinhDiemTB() {
        int n = QuanLySV.soLuongSV;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=svList[i].getDiem();
        }
        return sum/n;
    }

    public static double timMAX() {
        double diem[] = new double[100];
        double max_diem = 0;
        for (int i = 0; i < QuanLySV.soLuongSV; i++) {
            diem[i] = svList[i].getDiem();
        }
        for (int i = 0; i < QuanLySV.soLuongSV; i++) {
            if (diem[i] > max_diem) {
                max_diem = diem[i];
            }
        }
        return max_diem;
    }

    public static void timSVMAX() {
        System.out.println("SV co diem cao nhat: ");
        int n = QuanLySV.soLuongSV;
        double maxDiem = timMAX();
        for (int i = 0; i < n; i++) {
            if (QLSinhVien.svList[i].getDiem() == maxDiem) {
                System.out.println("MSV: " + QLSinhVien.svList[i].getMaSo() + "      Hoten: " + QLSinhVien.svList[i].getHoTen());
            }
        }
    }

}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sv: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sv thu " + (i+1) + " :");
            QuanLySV sv = new QuanLySV();
            sv.Nhap();
            QLSinhVien.svList[i]=sv;
        }
        System.out.println("Diem tb: " + QLSinhVien.tinhDiemTB());
        System.out.println("max diem: " + QLSinhVien.timMAX());
        QLSinhVien.timSVMAX();
    }
}