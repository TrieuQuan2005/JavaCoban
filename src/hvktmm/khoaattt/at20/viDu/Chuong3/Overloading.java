package hvktmm.khoaattt.at20.viDu.Chuong3;

public class Overloading {
    static class Calculator {
        int cong(int a, int b) {
            return a + b;
        }

        double cong(double a, double b) {
            return a + b;
        }

        int cong(int a, int b, int c) {
            return a + b + c;
        }

        void show(int a, String b) {
            System.out.println("Kiểu: int, String");
        }

        void show(String b, int a) {
            System.out.println("Kiểu: String, int");
        }

    }

}
