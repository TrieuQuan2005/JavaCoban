package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyBanHangTrucTuyen;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop Dell XPS 13", "Laptop cao cấp", 1500.0);
        Product product2 = new Product("Smartphone Samsung Galaxy S21", "Điện thoại thông minh", 800.0);
        Service service1 = new Service("Dịch vụ giao hàng nhanh", "Giao hàng trong vòng 2 giờ", 20.0);
        Service service2 = new Service("Dịch vụ lắp đặt tại nhà", "Lắp đặt thiết bị tại nhà khách hàng", 50.0);
        ShoppingCart cart = new ShoppingCart();
        cart.AddItem(product1);
        cart.AddItem(service1);
        cart.AddItem(product2);
        cart.AddItem(service2);
        cart.showItems();
    }
}
