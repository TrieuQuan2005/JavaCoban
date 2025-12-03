package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyBanHangTrucTuyen;
import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Sellable> items = new ArrayList<Sellable>();

    public void AddItem(Sellable item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Sellable item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void showItems() {
        for (Sellable item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: " + item.getPrice());
            System.out.println("-----------------------");
        }
    }
}
