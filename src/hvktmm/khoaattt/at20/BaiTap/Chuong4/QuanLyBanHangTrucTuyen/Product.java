package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyBanHangTrucTuyen;

public class Product implements Sellable {
    private String name;
    private String description;
    private double price;
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.price = 0;
        }
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
