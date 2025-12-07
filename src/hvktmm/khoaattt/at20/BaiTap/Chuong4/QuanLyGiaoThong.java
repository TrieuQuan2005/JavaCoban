package hvktmm.khoaattt.at20.BaiTap.Chuong4;

public class QuanLyGiaoThong {
    public static void main(String[] args){
        PhuongTien[] pts = new PhuongTien[3];
        pts[0] = new Oto("Oto", "Lexus", 1999, 1000, 4, "Xang E95");
        pts[1] = new XeMay("XeMay", "Honda", 1999, 1000, 400);
        pts[2] = new Oto("Oto", "Lexus", 2000, 1500, 5, "Dau Diesel");

        for(PhuongTien pt : pts){
            System.out.println("-----");
            pt.hienThiThongTin();
        }
    }
}

abstract class PhuongTien {
    String Ten, HangSX;
    int namSX;
    double MaxSpd;

    public PhuongTien(String Ten, String HangSX, int namSX, double MaxSpd) {
        this.Ten = Ten;
        this.HangSX = HangSX;
        this.namSX = namSX;
        this.MaxSpd = MaxSpd;
    }

    public void hienThiThongTin(){
        System.out.println("Ten: " + this.Ten);
        System.out.println("HangSX: " + this.HangSX);
        System.out.println("NamSX: " + this.namSX);
        System.out.println("MaxSpd: " + this.MaxSpd);
    }
}

class Oto extends PhuongTien {
    int SoChoNgoi;
    String LoaiNhienLieu;

    public Oto(String Ten, String HangSX, int namSX, double MaxSpd, int SoChoNgoi, String LoaiNhienLieu) {
        super(Ten, HangSX, namSX, MaxSpd);
        this.SoChoNgoi = SoChoNgoi;
        this.LoaiNhienLieu = LoaiNhienLieu;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("So cho ngoi: " + this.SoChoNgoi);
        System.out.println("Loai nhien lieu: " + this.LoaiNhienLieu);
    }
}

class XeMay extends PhuongTien {
    double congSuatDongCo;

    public XeMay(String Ten, String HangSX, int namSX, double MaxSpd, double congSuatDongCo){
        super(Ten, HangSX, namSX, MaxSpd);
        this.congSuatDongCo = congSuatDongCo;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cong suat dong co: " + this.congSuatDongCo);
    }
}
