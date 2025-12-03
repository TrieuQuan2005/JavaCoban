package hvktmm.khoaattt.at20.viDu.Chuong3;

public class Car {
    private final String VIN_NUMBER; // Phải được gán trong hàm tạo
    private final int MAX_SPEED = 250; // Khởi tạo ngay

    public Car(String vin) {
        this.VIN_NUMBER = vin; // Gán giá trị final trong constructor
    }

    public void getDetails() {
        System.out.println("VIN: " + this.VIN_NUMBER);
        System.out.println(MAX_SPEED);

        // MAX_SPEED = 260;  //  Lỗi vì final không thể thay đổi
    }
}
