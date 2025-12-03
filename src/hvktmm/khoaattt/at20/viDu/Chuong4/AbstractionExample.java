package hvktmm.khoaattt.at20.viDu.Chuong4;

public class AbstractionExample {
    public static void main(String[] args) {
        // Không thể làm điều này: Shape s = new Shape("Red");
        Circle circle = new Circle("Đỏ", 5.0);
        circle.displayColor();
        System.out.println("Diện tích hình tròn: " + circle.tinhDienTich());
        Rectangle rectangle = new Rectangle("Xanh", 4.0, 6.0);
        rectangle.displayColor();
        System.out.println("Diện tích hình chữ nhật: " + rectangle.tinhDienTich());
    }

}
// Lớp trừu tượng Shape
abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
    // Phương thức cụ thể
    public void displayColor() {
        System.out.println("Màu sắc của hình là: " + color);
    }
    // Phương thức trừu tượng: phải được triển khai bởi lớp con
    public abstract double tinhDienTich();
}
// Lớp con Circle kế thừa Shape
class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    // Triển khai phương thức trừu tượng
    @Override
    public double tinhDienTich() {
        return Math.PI * radius * radius;
    }
}
// Lớp con Rectangle kế thừa Shape
class Rectangle extends Shape {
    double width, height;
    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    // Triển khai phương thức trừu tượng
    @Override
    public double tinhDienTich() {
        return width * height;
    }
}