package hvktmm.khoaattt.at20.viDu.Chuong3.Student;

public class MainClass {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.setAge(30);
        sv.setName("Bình");
        System.out.println("Sinh viên: " + sv.getName() + ", tuổi: " + sv.getAge());
    }
}
