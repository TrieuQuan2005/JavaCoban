package hvktmm.khoaattt.at20.viDu.Chuong3.CarAndEngine;

public class Engine { // Lớp mô tả động cơ
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Động cơ " + type +
                " khởi động với " +
                horsepower + " mã lực.");
    }
}

