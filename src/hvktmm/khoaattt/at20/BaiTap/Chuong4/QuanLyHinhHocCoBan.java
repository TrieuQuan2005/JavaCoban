package hvktmm.khoaattt.at20.BaiTap.Chuong4;

public class QuanLyHinhHocCoBan {
    public static void main(String[] args){
        try {
            HinhChuNhat hcn = new HinhChuNhat(4,5);
            HinhTron ht = new HinhTron(4);
            HinhTamGiac tg = new HinhTamGiac(3,4,5);

            hcn.TinhChuVi();
            hcn.TinhDienTich();

            ht.TinhChuVi();
            ht.TinhDienTich();

            tg.TinhChuVi();
            tg.TinhDienTich();

        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}

abstract class HinhHoc{
    String TenHinh;
    double ChuVi, DienTich;

    public HinhHoc(String TenHinh) {
        this.TenHinh = TenHinh;
    }

    public abstract void TinhChuVi();
    public abstract void TinhDienTich();
}

class HinhTron extends HinhHoc{
    double BanKinh;

    public HinhTron(double BanKinh) {
        super("Hinh Tron");
        if (BanKinh <= 0)
            throw new IllegalArgumentException("Bán kính phải > 0 !");
        this.BanKinh = BanKinh;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = 2 * Math.PI * BanKinh;
        System.out.println("Chu vi hinh tron: " + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        this.DienTich = Math.PI * BanKinh * BanKinh;
        System.out.println("Dien tich hinh tron: " + this.DienTich);
    }
}

class HinhChuNhat extends HinhHoc{
    double ChieuDai, ChieuRong;

    public HinhChuNhat(double ChieuDai, double ChieuRong) {
        super("Hinh Chu Nhat");

        if (ChieuDai <= 0 || ChieuRong <= 0)
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải > 0!");

        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = 2 * (ChieuDai + ChieuRong);
        System.out.println("Chu vi hinh chu nhat: " + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        this.DienTich = ChieuDai * ChieuRong;
        System.out.println("Dien tich hinh chu nhat: " + this.DienTich);
    }
}

class HinhTamGiac extends HinhHoc{
    double a,b,c;

    public HinhTamGiac(double a, double b, double c) {
        super("Hinh Tam Giac");

        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Ba cạnh phải > 0!");

        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Ba cạnh không tạo thành tam giác hợp lệ!");

        this.a = a; this.b = b; this.c = c;
    }

    @Override
    public void TinhChuVi() {
        this.ChuVi = a + b + c;
        System.out.println("Chu vi hinh tam giac: " + this.ChuVi);
    }

    @Override
    public void TinhDienTich() {
        double p = this.ChuVi / 2;
        this.DienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Dien tich hinh tam giac: " + this.DienTich);
    }
}
