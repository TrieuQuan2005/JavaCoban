package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;
import java.util.Scanner;
import java.lang.Exception;
import java.util.InputMismatchException;

public class MaTranXoay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Nhập kích thước ma trận: ");
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Kích thước phải > 0. Vui lòng nhập lại.");
                    continue;
                }

                break; // hợp lệ → thoát vòng lặp

            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập số nguyên dương.");
                sc.nextLine(); // xoá dữ liệu rác trong buffer
            }
        }


        int[][] a = new int[n][n];
        int value =1;

        int top =0, bottom = n-1, left =0, right = n-1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                a[top][i] = value++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                a[i][right] = value++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    a[bottom][i] = value++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    a[i][left] = value++;
                }
                left++;
            }
        }
        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
