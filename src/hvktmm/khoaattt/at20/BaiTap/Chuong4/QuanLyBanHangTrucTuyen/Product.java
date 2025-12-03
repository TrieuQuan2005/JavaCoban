package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyBanHangTrucTuyen;

public class Product implements Sellable {
    private String name;
    private String description;
    private double price;
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
