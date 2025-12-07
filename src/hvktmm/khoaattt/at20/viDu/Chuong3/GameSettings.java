package hvktmm.khoaattt.at20.viDu.Chuong3;

public class GameSettings { // Lớp chứa quy tắc game (GameSettings)
    public static final int MAX_LEVEL = 50; // Cấp độ tối đa
    public static final int MAX_HP = 100; // HP - Health Points, máu tối đa
    public static final double CRIT_RATE = 0.15; // CRIT - Critical Hit, tỷ lệ chí mạng
    // Phương thức final để tính điểm, lớp kế thừa (lớp con) không được sửa
    public final int tinhDiem(int level, int hp) {
        return level * 10 + hp;
    }
}

class MainGame{
    public static void main(String[] args) {
        GameSettings settings = new GameSettings();
        int score = settings.tinhDiem(10, 80);
        System.out.println("Điểm của người chơi: " + score);
        System.out.println("Cấp độ tối đa: " + GameSettings.MAX_LEVEL);
        System.out.println("Máu tối đa: " + GameSettings.MAX_HP);
        System.out.println("Tỷ lệ chí mạng: " + GameSettings.CRIT_RATE);
    }
}

