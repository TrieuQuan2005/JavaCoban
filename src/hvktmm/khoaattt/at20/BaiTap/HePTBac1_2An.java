package hvktmm.khoaattt.at20.BaiTap;

import java.util.Scanner;

public class HePTBac1_2An {
    // Giải hệ phương trình bậc nhất 2 ẩn
    public static void main(String[] args) {
        // Hệ phương trình:
        //  a11*x + a12*y = b1
        //  a21*x + a22*y = b2

        double a , b , c;
        double d , e , f;
        Scanner sc = new Scanner(System.in);
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        d= sc.nextDouble();
        e= sc.nextDouble();
        f= sc.nextDouble();

        double D = a * d - b * c;
        double Dx = a * f - b * c;
        double Dy = a * e - d * b;

        if(D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Nghiệm của hệ phương trình là:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            if(Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }

    }
}
