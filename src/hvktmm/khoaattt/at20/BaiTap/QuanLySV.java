package hvktmm.khoaattt.at20.BaiTap;
import java.awt.*;
import java.util.List;
import java.util.Scanner;

class SinhVien1 {
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
        if (diem >= 0 && diem <= 10) this.diem = diem;
        else this.diem = 0;

    }
    public SinhVien1() {
        soLuongSV++;
    }
    public SinhVien1(String maSo, String hoTen, double diem) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        if(diem >= 0 && diem <= 10) this.diem = diem;
        soLuongSV++;
    }

    public void PrintStudentInformation(){
        System.out.println("Ma so: " + this.maSo);
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("Diem: " + this.diem);
    }

}

class QLSinhVien {
    public static SinhVien1[] svList = new SinhVien1[100];
    public static final int MAX_SV = 100;

    public static double tinhDiemTB() {
        int n = SinhVien1.soLuongSV;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=svList[i].getDiem();
        }
        return sum/n;
    }

    public static void InsertStudent(){
        Scanner sc = new Scanner(System.in);
        String MaSo = sc.next();
        String HoTen = sc.nextLine();
        double diem = sc.nextDouble();
        sc.nextLine();
        SinhVien1 sv = new SinhVien1(MaSo, HoTen, diem);
        svList[SinhVien1.soLuongSV++] = sv;
    }

    public static void tim_SVMax(){
        SinhVien1 sv = svList[0];
        for(int i =1; i<SinhVien1.soLuongSV; i++){
            if(sv.getDiem() < svList[i].getDiem()) sv = svList[i];
        }

        sv.PrintStudentInformation();
    }


}

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sv: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sv thu " + (i+1) + " :");
            QLSinhVien.InsertStudent();
        }

        QLSinhVien.tim_SVMax();
    }
}