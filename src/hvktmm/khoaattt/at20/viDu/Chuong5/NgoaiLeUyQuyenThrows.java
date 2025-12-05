package hvktmm.khoaattt.at20.viDu.Chuong5;

public class NgoaiLeUyQuyenThrows {
}
class Calculator1 {
    // Ủy quyền xử lý lỗi chia cho 0
    int divide(int a, int b) throws ArithmeticException {
        return a / b;  // Lỗi tự phát sinh nếu b = 0
    }
}

class MathService1 {
    Calculator1 calculator = new Calculator1();
    // Tiếp tục ủy quyền lên cấp trên
    int compute(int a, int b) throws ArithmeticException {
        return calculator.divide(a, b);
    }
} // Hàm main gọi: int result = service.compute(10, 0);

class Main6 {
    public static void main(String[] args) {
        MathService1 service = new MathService1();
        try {
            int result = service.compute(10, 0); // Lỗi chia 0 sẽ xảy ra
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Bắt lỗi ở main: " + e.getMessage());
        }
        System.out.println("Chương trình vẫn tiếp tục chạy...");
    }
}
class Validator { // Phương thức này có thể ném lỗi → dùng throws để ủy quyền
    void checkAge(int age) throws IllegalArgumentException {
        try {
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Tuổi không hợp lệ: " + age);
            }
            System.out.println("Tuổi hợp lệ!");
        } catch (IllegalArgumentException e) {
            // Giả lập ghi log
            System.out.println("[LOG] Validator phát hiện lỗi: " + e.getMessage());
            throw e; // Ném lỗi tiếp lên tầng trên
        }
    }
}
class UserService {
    Validator validator = new Validator();
    // Ủy quyền xử lý lỗi tiếp lên tầng trên
    void processUser(int age) throws IllegalArgumentException {
        System.out.println("Đang xử lý người dùng...");
        validator.checkAge(age);  // Có thể ném lỗi lên đây
        System.out.println("Xử lý người dùng hoàn tất!");
    }}
class Main7 {
    public static void main(String[] args) {
        UserService service = new UserService();
        try {
            service.processUser(-10);   // Dữ liệu sai
        } catch (IllegalArgumentException e) {
            System.out.println("Main bắt lỗi cuối cùng: " + e.getMessage());
        }
        System.out.println("Chương trình vẫn chạy tiếp bình thường!");}}
