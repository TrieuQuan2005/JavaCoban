package hvktmm.khoaattt.at20.BaiTap;

public class QuanLyNhanSu {
    public void main(String[] args){
        Employee nv =  new Employee("Quan", 21,true,"adsa" , 4.3,"AT200147",3.0);
        Manager mn = new Manager("Quan", 21,true,"adsa" , "AT200147",3.0, 10 , 4);


        System.out.println("Luong Nhan Vien" + nv.name+  " la: " + Math.round(nv.getLuong()) + " Trieu VND");
        System.out.println("Luong Quan Ly" + mn.name+  " la: " + Math.round(mn.getLuong())+ " Trieu VND");
    }
}

abstract class Person{
    String name;
    int age;
    boolean gioiTinh;
    String diaChi;

    public Person(String name, int age, boolean gioiTinh, String diaChi){
        this.name = name;
        this.age = age;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
}

class Employee extends Person{
    String MaNV;
    double HSL, luongCoBan;

    public Employee(String name, int age, boolean gioiTinh, String diaChi, double luongCoBan, String MaNV, double HSL){
        super(name, age, gioiTinh, diaChi);
        this.MaNV = MaNV;
        this.HSL = HSL;
        this.luongCoBan = luongCoBan;
    }

    public Double getLuong() {
        return luongCoBan * HSL;
    }
}

class Manager extends Employee{
    double PhuCap;

    public Manager(String name,int age, boolean gioitinh, String DiaChi, String MaNV, double HSL, double luongCoBan, double PhuCap){
        super(name,age,gioitinh,DiaChi,luongCoBan,MaNV,HSL);
        this.PhuCap = PhuCap;
    }

    @Override
    public Double getLuong() {
        return super.getLuong() + PhuCap;
    }
}
