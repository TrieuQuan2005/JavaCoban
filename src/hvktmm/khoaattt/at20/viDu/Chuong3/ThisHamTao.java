package hvktmm.khoaattt.at20.viDu.Chuong3;

public class ThisHamTao {
}
class Logger {
    public Logger(Student3 s) {
        System.out.println("Tạo logger cho sinh viên: " + s.getName());
    }}
class Student3 {
    private String name;
    public Student3(String name) {
        this.name = name;
        new Logger(this);
    }
    public String getName() {
        return name;
    }
}
class Main3 {
    public static void main(String[] args) {
        Student3 s = new Student3("An");
    }
}
