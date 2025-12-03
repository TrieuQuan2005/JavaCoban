package hvktmm.khoaattt.at20.BaiTap.Chuong3;
import  java.util.Scanner;

public class MaTranVuong {
    private int n ;
    private int[][] MaTran;

    public MaTranVuong(int n){
        this.n = n;
        this.MaTran = new int[n][n];
    }

    public void NhapMaTran(){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n ; i++){
            for(int j =0; j< n; j++){
                System.out.print("Input row i column j factor: ");
                MaTran[i][j] = sc.nextInt();
            }
        }
    }

    public void Display(){
        for(int i =0; i<n ; i++){
            for(int j =0; j< n; j++){
                System.out.print(MaTran[i][j] + "   ");
            }
            System.out.println();
        }
    }


    public MaTranVuong congMaTran(MaTranVuong Matrix){
        MaTranVuong result = new MaTranVuong(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result.MaTran[i][j] = this.MaTran[i][j] + Matrix.MaTran[i][j];
            }
        }
        return result;
    }



    public MaTranVuong nhanMaTran(MaTranVuong Matrix){
        MaTranVuong result = new MaTranVuong(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += this.MaTran[i][k] * Matrix.MaTran[k][j];
                }
                result.MaTran[i][j] = sum;
            }
        }
        return result;
    }
}