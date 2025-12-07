package hvktmm.khoaattt.at20.BaiTap.Chuong3;
import java.util.Scanner;

class SinhVien1 {
    private String maSo;
    private String hoTen;
    private double diem;

    public SinhVien1() { }

    public SinhVien1(String maSo, String hoTen, double diem) {
        if (maSo == null || maSo.isEmpty())
            throw new IllegalArgumentException("Mã số sinh viên không hợp lệ!");

        if (hoTen == null || hoTen.isEmpty())
            throw new IllegalArgumentException("Họ tên không hợp lệ!");

        if (diem < 0 || diem > 10)
            throw new IllegalArgumentException("Điểm phải nằm trong khoảng 0 - 10!");

        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getMaSo() { return maSo; }
    public String getHoTen() { return hoTen; }
    public double getDiem() { return diem; }

    public void PrintStudentInformation(){
        System.out.println("Mã số: " + maSo);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm: " + diem);
        System.out.println();
    }
}

class QLSinhVien {
    public static final int MAX_SV = 100;
    public static SinhVien1[] svList = new SinhVien1[MAX_SV];
    public static int soLuongSV = 0;

    public static void InsertStudent() {
        Scanner sc = new Scanner(System.in);

        try {
            if (soLuongSV >= MAX_SV)
                throw new Exception("Danh sách sinh viên đã đầy!");

            System.out.print("Nhập mã số sinh viên: ");
            String maSo = sc.nextLine().trim();

            System.out.print("Nhập họ tên: ");
            String hoTen = sc.nextLine().trim();

            System.out.print("Nhập điểm: ");
            double diem = Double.parseDouble(sc.nextLine().trim());

            SinhVien1 sv = new SinhVien1(maSo, hoTen, diem);
            svList[soLuongSV++] = sv;

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Điểm phải là số!");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static double tinhDiemTB() {
        if (soLuongSV == 0) return 0;
        double sum = 0;
        for (int i = 0; i < soLuongSV; i++) {
            sum += svList[i].getDiem();
        }
        return sum / soLuongSV;
    }

    public static void tim_SVMax() {
        if (soLuongSV == 0) {
            System.out.println("Không có sinh viên nào!");
            return;
        }

        SinhVien1 svMax = svList[0];
        for (int i = 1; i < soLuongSV; i++) {
            if (svList[i].getDiem() > svMax.getDiem())
                svMax = svList[i];
        }

        System.out.println("\nSinh viên có điểm cao nhất:");
        svMax.PrintStudentInformation();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập số lượng sinh viên: ");
            int n = sc.nextInt();
            sc.nextLine(); // clear buffer

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                InsertStudent();
            }

            tim_SVMax();
            System.out.println("Điểm trung bình lớp: " + tinhDiemTB());

        } catch (Exception e) {
            System.out.println("Lỗi nhập số lượng sinh viên!");
        }
    }
}
