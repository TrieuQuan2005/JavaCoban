package hvktmm.khoaattt.at20.viDu.Chuong3.CarAndEngine;

public class MainClass {
    public static void main(String[] args) {
        Engine engine = new Engine("VF 8", 402);
        Car car = new Car("VinFast", engine);
        car.startCar();
    }
}
