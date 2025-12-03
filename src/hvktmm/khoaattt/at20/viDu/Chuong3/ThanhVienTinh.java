package hvktmm.khoaattt.at20.viDu.Chuong3;

class ThanhVienTinh {
    // Thuộc tĩnh: Đếm số lượng sinh viên
    private static int count = 0;
    private String name;

    public ThanhVienTinh(String name) {
        this.name = name;
        count++; // Tăng số lượng sinh viên mỗi khi một đối tượng mới được tạo
    }

    // Phương thức tĩnh để lấy số lượng SV
    public static int getStudentCount() {
        return count; // Trả về số lượng sinh viên đã tạo
    }

    public static void main(String[] args) {
        ThanhVienTinh s1 = new ThanhVienTinh("Trung");
                ThanhVienTinh s2 = new ThanhVienTinh("Kiên");
                ThanhVienTinh s3 = new ThanhVienTinh("Cường");
                // Gọi phương thức tĩnh thông qua tên lớp để lấy số lượng sinh viên
                System.out.println("Total students: " + ThanhVienTinh.getStudentCount()); // K.quả: 3
        // Có thể gọi phương thức tĩnh thông qua tên đối tượng
        System.out.println("Total students: " + s2.getStudentCount()); // K.quả: 3
    }
}