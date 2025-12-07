package hvktmm.khoaattt.at20.viDu.Chuong3;
class Student1 {
    // Thuộc tĩnh: Đếm số lượng sinh viên
    private static int count = 0;
    private String name;
    public Student1(String name) {
        this.name = name;
        count++; // Tăng số lượng sinh viên mỗi khi một đối tượng mới được tạo
    }
    // Phương thức tĩnh để lấy số lượng SV
    public static int getStudentCount() {
        return count; // Trả về số lượng sinh viên đã tạo
    }

}
public class ThanhVienTinh {

    public static void main(String[] args) {
        Student1 s1 = new Student1("Trung");
        Student1 s2 = new Student1("Kiên");
        Student1 s3 = new Student1("Cường");
        // Gọi phương thức tĩnh thông qua tên lớp để lấy số lượng sinh viên
        System.out.println("Total students: " + Student1.getStudentCount());
        // Có thể gọi phương thức tĩnh thông qua tên đối tượng
        System.out.println("Total students: " + s2.getStudentCount());
    }
}
