package hvktmm.khoaattt.at20.BaiTap.Chuong4;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        try {
            Employee nv = new Employee("Quan", 21, true, "HN",
                    4.3, "AT200147", 3.0);

            Manager mn = new Manager("Quan", 21, true, "HN",
                    "AT200147", 3.0, 4.3, 10);

            System.out.println("Luong Nhan Vien " + nv.name + ": "
                    + Math.round(nv.getLuong()) + " Trieu VND");

            System.out.println("Luong Quan Ly " + mn.name + ": "
                    + Math.round(mn.getLuong()) + " Trieu VND");

        } catch (IllegalArgumentException ex) {
            System.err.println("Lỗi dữ liệu đầu vào: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Lỗi không xác định: " + ex.getMessage());
        }
    }
}

abstract class Person {
    String name;
    int age;
    boolean gioiTinh;
    String diaChi;

    public Person(String name, int age, boolean gioiTinh, String diaChi) {

        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Ten khong duoc de trong!");

        if (age <= 0)
            throw new IllegalArgumentException("Tuoi phai > 0!");

        this.name = name;
        this.age = age;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
}



class Employee extends Person {
    String MaNV;
    double HSL, luongCoBan;

    public Employee(String name, int age, boolean gioiTinh, String diaChi,
                    double luongCoBan, String MaNV, double HSL) {

        super(name, age, gioiTinh, diaChi);

        if (luongCoBan <= 0)
            throw new IllegalArgumentException("Luong co ban phai > 0!");

        if (HSL <= 0)
            throw new IllegalArgumentException("He so luong phai > 0!");

        this.MaNV = MaNV;
        this.HSL = HSL;
        this.luongCoBan = luongCoBan;
    }

    public Double getLuong() {
        return luongCoBan * HSL;
    }
}


class Manager extends Employee {
    double PhuCap;

    public Manager(String name, int age, boolean gioitinh, String diaChi,
                   String MaNV, double HSL, double luongCoBan, double PhuCap) {

        super(name, age, gioitinh, diaChi, luongCoBan, MaNV, HSL);

        if (PhuCap < 0)
            throw new IllegalArgumentException("Phu cap khong duoc am!");

        this.PhuCap = PhuCap;
    }

    @Override
    public Double getLuong() {
        return super.getLuong() + PhuCap;
    }
}
