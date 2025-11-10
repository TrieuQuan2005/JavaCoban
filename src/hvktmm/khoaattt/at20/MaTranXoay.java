package hvktmm.khoaattt.at20;
import java.util.Scanner;
public class MaTranXoay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
