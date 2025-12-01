package hvktmm.khoaattt.at20.BaiTap;

public class QuanLyTaiKhoan {
    public static void main(String[] args) {

        System.out.println("===== TAI KHOAN THUONG =====");
        TaiKhoan tk = new TaiKhoan("001", "Nguyen A", 5000);
        tk.napTien(2000);
        tk.rutTien(3000);
        tk.rutTien(5000);
        tk.kiemTraSoDu();

        System.out.println("\n===== TAI KHOAN TIET KIEM =====");
        TaiKhoanTietKiem tktk = new TaiKhoanTietKiem("002", "Tran B", 10000, 0.5);
        tktk.kiemTraSoDu();
        tktk.tinhLai();

        System.out.println("\n===== TAI KHOAN VAY =====");
        TaiKhoanVay tkv = new TaiKhoanVay("003", "Le C", 2000, 5000);
        tkv.kiemTraSoDu();
        tkv.rutTien(6000);   // được phép vì 2000 + 5000 = 7000
        tkv.rutTien(2000);   // vượt hạn mức
        tkv.kiemTraSoDu();
    }
}
class TaiKhoan {
    protected String soTaiKhoan;
    protected String tenChuTaiKhoan;
    protected double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp tiền thành công. Số dư mới: " + soDu);
        } else {
            System.out.println("Số tiền nạp phải > 0");
        }
    }

    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền rút phải > 0");
            return;
        }

        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công. Số dư mới: " + soDu);
        } else {
            System.out.println("Không đủ tiền trong tài khoản!");
        }
    }

    public void kiemTraSoDu() {
        System.out.println("Số dư tài khoản hiện tại: " + soDu);
    }
}

class TaiKhoanTietKiem extends TaiKhoan {

    private double laiSuat;  // % lãi suất hàng tháng

    public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double laiSuat) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.laiSuat = laiSuat;
    }

    public void tinhLai() {
        double tienLai = soDu * laiSuat / 100;
        soDu += tienLai;
        System.out.println("Tiền lãi đã cộng: " + tienLai + ". Số dư mới: " + soDu);
    }
}
class TaiKhoanVay extends TaiKhoan {

    private double hanMucVay;

    public TaiKhoanVay(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double hanMucVay) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.hanMucVay = hanMucVay;
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền rút phải > 0");
            return;
        }

        if (soTien <= soDu + hanMucVay) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công (cho phép vay). Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Vượt quá hạn mức vay! Không thể rút.");
        }
    }
}
