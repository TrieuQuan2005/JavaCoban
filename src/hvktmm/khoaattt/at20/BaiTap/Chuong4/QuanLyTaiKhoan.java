package hvktmm.khoaattt.at20.BaiTap.Chuong4;

public class QuanLyTaiKhoan {
    public static void main(String[] args) {
        try {
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
            tkv.rutTien(6000);
            tkv.rutTien(2000);
            tkv.kiemTraSoDu();

        } catch (IllegalArgumentException ex) {
            System.err.println("LỖI DỮ LIỆU: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định: " + ex.getMessage());
        }
    }
}

class TaiKhoan {

    protected String soTaiKhoan;
    protected String tenChuTaiKhoan;
    protected double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {

        if (soTaiKhoan == null || soTaiKhoan.isEmpty())
            throw new IllegalArgumentException("Số tài khoản không được để trống!");

        if (tenChuTaiKhoan == null || tenChuTaiKhoan.isEmpty())
            throw new IllegalArgumentException("Tên chủ tài khoản không được để trống!");

        if (soDu < 0)
            throw new IllegalArgumentException("Số dư không được âm!");

        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien <= 0)
            throw new IllegalArgumentException("Số tiền nạp phải > 0!");

        soDu += soTien;
        System.out.println("Nạp tiền thành công. Số dư mới: " + soDu);
    }

    public void rutTien(double soTien) {
        if (soTien <= 0)
            throw new IllegalArgumentException("Số tiền rút phải > 0!");

        if (soTien > soDu)
            throw new IllegalArgumentException("Không đủ tiền trong tài khoản!");

        soDu -= soTien;
        System.out.println("Rút tiền thành công. Số dư mới: " + soDu);
    }

    public void kiemTraSoDu() {
        System.out.println("Số dư tài khoản hiện tại: " + soDu);
    }
}


class TaiKhoanTietKiem extends TaiKhoan {

    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double laiSuat) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);

        if (laiSuat <= 0)
            throw new IllegalArgumentException("Lãi suất phải > 0!");

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

        if (hanMucVay < 0)
            throw new IllegalArgumentException("Hạn mức vay không được âm!");

        this.hanMucVay = hanMucVay;
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien <= 0)
            throw new IllegalArgumentException("Số tiền rút phải > 0!");

        if (soTien > soDu + hanMucVay)
            throw new IllegalArgumentException("Vượt quá hạn mức vay. Không thể rút!");

        soDu -= soTien;
        System.out.println("Rút tiền thành công (có vay). Số dư hiện tại: " + soDu);
    }
}
