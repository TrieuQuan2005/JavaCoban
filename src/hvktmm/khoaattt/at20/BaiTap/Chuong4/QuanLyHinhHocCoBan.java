package hvktmm.khoaattt.at20.BaiTap.Chuong4;

public class QuanLyHinhHocCoBan {
    HinhChuNhat hcn = new HinhChuNhat(4,5);
    HinhTron ht = new HinhTron(4);
    HinhTamGiac tg = new HinhTamGiac(3,4,5);


    public void main(String[] args){
        hcn.TinhChuVi();
        tg.TinhChuVi();
        ht.TinhChuVi();

        hcn.TinhDienTich();
        tg.TinhDienTich();
        ht.TinhDienTich();
    }
}
abstract class HinhHoc{
    String TenHinh;
    public String getTenHinh() {
        return TenHinh;
    }
    public void setTenHinh(String TenHinh) {
        this.TenHinh = TenHinh;
    }

    public HinhHoc(String TenHinh) {
        this.TenHinh = TenHinh;
    }

    double ChuVi, DienTich;

    public abstract void TinhChuVi();
    public abstract void TinhDienTich();

}

class HinhTron extends HinhHoc{
    double BanKinh;

    public HinhTron(double BanKinh) {
        super("Hinh Tron");
        this.BanKinh = BanKinh;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = (double)Math.PI *2*BanKinh;
        System.out.println("Tinh Chu Vi" + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        this.DienTich = (double)Math.acos(BanKinh);
        System.out.println("Tinh DienTich" + this.DienTich);
    }
}

class HinhChuNhat extends HinhHoc{
    double ChieuDai, ChieuRong;

    public HinhChuNhat(double ChieuDai, double ChieuRong) {
        super("Hinh Chu Nhat");
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = (ChieuDai + ChieuRong)*2;
        System.out.println("Tinh Chu Vi" + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        this.DienTich = ChieuDai * ChieuRong;
        System.out.println("Tinh DienTich" + this.DienTich);
    }
}

class HinhTamGiac extends HinhHoc{
    double a,b,c;

    public HinhTamGiac(double a, double b, double c) {
        super("Hinh Tron");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = a + b+ c;
        System.out.println("Tinh Chu Vi" + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        double p = (a+b+c)/2;
        this.DienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Tinh DienTich" + this.DienTich);
    }
}