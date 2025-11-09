package hvktmm.khoaattt.at20;

public class DeclareVariable {
    public static void main(String[] args) {
        // Khai báo biến nguyên
        int a,b,c =10;

        // Khai báo biến thực
        float x,y = 10.5f;

        // Khai báo biến ký tự
        char kyTu = 'A';

        // Khai báo biến chuỗi
        String ch = "Xin chào!";

        // Khai báo biến boolean
        boolean dungSai = true;

        // Khai baso hằng số
        final int MAX = 200, MIN = 100;

        // Khai báo chuỗi
        String greeting = "Hello java!";
        String message = new String("Xin chào");

        //Khai báo mảng
        int[] day ;
        day = new int[10];

        int[] day1 = new int[10];
        double[ ][ ] maTran = new double[2][3];

        int[] day2 = {10, 20, 15};
        Double maTran2[ ][ ] = {
                {7.5, 40.0, 5.0},
                {6.5, 96.0, 8.0}
        };
        String thu[] = {"", "", "hai", "ba", "tư", "năm", "sáu", "bảy", "CN"};

        //Truy nhập đến các phần tử mảng
        System.out.println("Phần tử thứ 2 của mảng day2: " + day2[1]); //20
        System.out.println("Phần tử hàng 2 cột 3 của maTran2: " + maTran2[1][2]); //8.0
        System.out.println("Thứ 2 trong tuần là: " + thu[2]); //"hai"


    }
}
