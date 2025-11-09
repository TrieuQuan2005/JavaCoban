package hvktmm.khoaattt.at20;

public class XuatData {

    public void Main(String[] args) {
        System.out.print("Xin chào ");
        System.out.print("Java!");
        // Kết quả: Xin chào Java!

        int n=20, m=30;
        System.out.print(n + m + " = Tong, Ghep = " + n + m); // Kết quả: 50 = Tong, Ghep = 2030
        System.out.print("So = " + n*2 + 30); // Kết quả: So = 4030
        //System.out.print("So = " + n - 2  + 30); // Báo lỗi
        System.out.print("So = " + (n - 2  + 30)); // Kết quả: So = 48
        System.out.print( " n > m =" + (n > m)); // Kết quả: n > m = false
        System.out.print(n + m - 10); // Kết quả: 40
        System.out.print("Tên\tTuổiAge\nMinh\t20");
                //Kết quả: 	Ten	Tuoi
                //          Minh	20
        // Để in ra các ký tự: ‘ , “ , \ , thì phải viết: \‘ , \“ , \\
        System.out.print("It\'s a nice day!"); // KQ: It's a nice day!
        System.out.print("He said: \"Hello World!\"");// KQ: He said: "Hello World!"
        System.out.print("C:\\Program Files\\Java"); // KQ: C:\Program Files\Java


    }
}
