package hvktmm.khoaattt.at20.viDu.Chuong3.CarAndEngine;

public class Car { // Lớp mô tả xe hơi
    private String brand;
    private Engine engine; // T.tính là đối tượng
    public Car(String brand_, Engine engine_){
        brand = brand_;
        engine = engine_;
    }
    public void startCar() {
        System.out.println("Xe " + brand + " đang khởi động...");
        engine.start(); //gọi P.thức của ĐT Engine
    }
}


