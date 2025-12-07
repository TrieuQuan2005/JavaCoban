package hvktmm.khoaattt.at20.BaiTap.Chuong3;
import java.util.Scanner;

class Product {
    private final String productID;
    private String name;
    private double price;
    private int quantity = 0;

    public String getProductID() { return productID; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Giá sản phẩm không được âm!");
        }
        this.price = price;
    }

    public Product(String productID) {
        if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("Product ID không hợp lệ!");
        }
        this.productID = productID;
    }

    public Product(String productID, String name, double price) {
        if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("Product ID không hợp lệ!");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Giá sản phẩm không được âm!");
        }

        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public void updateQuantity(int change) {
        if (this.quantity + change < 0) {
            throw new IllegalArgumentException("Số lượng không đủ để trừ!");
        }
        this.quantity += change;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nQuantity: " + quantity + "\n";
    }
}


class InventoryManager {
    private static final int MAX_PRODUCTS = 20;
    private static Product[] inventory = new Product[MAX_PRODUCTS];
    private static int productCount = 0;

    public static boolean addProduct(String productId, String name, double price) {
        try {
            if (productCount >= MAX_PRODUCTS) {
                throw new Exception("Kho đã đầy, không thể thêm sản phẩm mới!");
            }

            for (int j = 0; j < productCount; j++) {
                if (inventory[j].getProductID().equals(productId)) {
                    throw new Exception("Product ID " + productId + " đã tồn tại!");
                }
            }

            inventory[productCount++] = new Product(productId, name, price);
            System.out.println("Đã thêm sản phẩm: " + productId);
            return true;

        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
            return false;
        }
    }

    public static Product getProductById(String productID) {
        for (int j = 0; j < productCount; j++) {
            if (inventory[j].getProductID().equals(productID))
                return inventory[j];
        }
        return null;
    }

    public static void updateProductQuantity(String productId, int change) {
        try {
            Product product = getProductById(productId);
            if (product == null)
                throw new Exception("Không tìm thấy sản phẩm!");

            product.updateQuantity(change);
            System.out.println("Cập nhật số lượng thành công.");

        } catch (Exception e) {
            System.out.println("Lỗi cập nhật số lượng: " + e.getMessage());
        }
    }

    public static void DisplayInventory() {
        System.out.println("\n===== INVENTORY =====");
        for (int j = 0; j < productCount; j++) {
            System.out.println(inventory[j].toString());
        }
    }
}


class Store {
    public static void main(String[] args) {

        try {
            InventoryManager.addProduct("P001", "Laptop", 1500.0);
            InventoryManager.addProduct("P002", "Smartphone", 800.0);
            InventoryManager.addProduct("P003", "Tablet", 400.0);

            InventoryManager.DisplayInventory();

            InventoryManager.updateProductQuantity("P003", 6);

            Product product = InventoryManager.getProductById("P003");
            if (product != null)
                System.out.println(product.toString());

            // Thêm sản phẩm trùng ID
            InventoryManager.addProduct("P003", "Tablet", 400.0);

            InventoryManager.DisplayInventory();

        } catch (Exception e) {
            System.out.println("Lỗi chương trình: " + e.getMessage());
        }
    }
}
