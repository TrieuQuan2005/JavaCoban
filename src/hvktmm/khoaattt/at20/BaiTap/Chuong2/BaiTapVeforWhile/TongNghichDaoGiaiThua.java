package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;
import java.util.Scanner;

public class TongNghichDaoGiaiThua {
    static double tongNghichDaoGiaiThua(int n){
        double sum = 0;
        double temp =1;
        for(int i =1; i<=n ; i++){
            temp *= 1.0/i;
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double result = tongNghichDaoGiaiThua(n);
        System.out.printf("Tổng nghịch đảo giai thừa từ 1 đến %d là: %.6f\n", n, result);
    }
}
