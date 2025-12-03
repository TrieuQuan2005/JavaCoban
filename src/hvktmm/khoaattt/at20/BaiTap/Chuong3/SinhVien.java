package hvktmm.khoaattt.at20.BaiTap.Chuong3;
import java.util.Scanner;
public class SinhVien {
    private String maSo;
    private String hoTen;
    private double diemM1,diemM2,diemM3;

    public String getMaSo(){
        return maSo;
    }
    public void setMaSo(String maSo){
        this.maSo = maSo;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public double getDiemM1(){
        return diemM1;
    }
    public void setDiemM1(double diemM1){
        this.diemM1 = diemM1;
    }
    public double getDiemM2(){
        return diemM2;
    }
    public void setDiemM2(double diemM2){
        this.diemM2 = diemM2;
    }
    public double getDiemM3(){
        return diemM3;
    }
    public void setDiemM3(double diemM3){
        this.diemM3 = diemM3;
    }

    public SinhVien(String maSo, String hoTen, double diemM1, double diemM2,  double diemM3){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemM1 = diemM1;
        this.diemM2 = diemM2;
        this.diemM3 = diemM3;
    }

    public SinhVien(){}

    public void input(){
        Scanner sc = new Scanner(System.in);
        this.maSo = sc.nextLine();
        this.hoTen = sc.nextLine();
        this.diemM1 = sc.nextDouble();
        this.diemM2 = sc.nextDouble();
        this.diemM3 = sc.nextDouble();
    }

    public void print(){
        System.out.println(this.maSo);
        System.out.println(this.hoTen);
        System.out.println(this.diemM1);
        System.out.println(this.diemM2);
        System.out.println(this.diemM3);
    }

    public double AvgPoint(){
        return (this.diemM1 + this.diemM2 + this.diemM3)/3;
    }

    public String Classify(){
        double avg = AvgPoint();
        if(avg >= 8.0) return "Gioi";
        else if(avg >= 6.5) return "Kha";
        else if(avg >= 5) return "Trung Binh";
        else return "Yeu";
    }
}
