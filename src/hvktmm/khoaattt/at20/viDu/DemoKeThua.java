package hvktmm.khoaattt.at20.viDu;

public class DemoKeThua {
    public static void main(String[] args) {
        NVienKDoanh nv1 = new NVienKDoanh("Nguyễn Văn Bình", 101, 100, 1000);
        System.out.println("--- Thông tin Nhân viên Kinh doanh ---");
        nv1.hienThiThongTin(); // Gọi phương thức đã ghi đè
        nv1.tinhLuongThucTe(); // Gọi phương thức riêng của lớp con
        System.out.println("\n--- Thông tin Nhân viên (dùng đối tượng NhanVien) ---");
        // Lớp con có thể được gán cho biến kiểu lớp cha
        NVien nv2 = new NVien("Trần Minh Hiếu", 102, 850);
        nv2.hienThiThongTin();
    }

}
class NVien {
    protected String ten;
    protected int maNV;
    protected float luongCoBan;

    public NVien(String ten, int maNV, float luongCoBan) {
        this.ten = ten;
        this.maNV = maNV;
        this.luongCoBan = luongCoBan;
    }
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Mã NV: " + maNV);
        System.out.println("Lương CB: " + luongCoBan);
    }
}

// Lớp con kế thừa từ NhanVien
class NVienKDoanh extends NVien {
    private float hoaHong; // Thuộc tính riêng của NhanVienKinhDoanh

    public NVienKDoanh(String ten, int maNV, float luongCoBan, float hoaHong) {
        // Gọi constructor của lớp cha bằng từ khóa super
        super(ten, maNV, luongCoBan);
        this.hoaHong = hoaHong;
    }

    // Phương thức ghi đè (override) phương thức của lớp cha
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Gọi lại phương thức của lớp cha
        System.out.println("Hoa hồng: " + hoaHong);
    }
    public void tinhLuongThucTe() {
        float luongThucTe = luongCoBan + hoaHong;
        System.out.println("Lương thực tế của " + ten + ": " + luongThucTe);
    }

}