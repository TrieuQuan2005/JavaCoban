package hvktmm.khoaattt.at20.BaiTap;
import java.util.Scanner;

class Product {
    private final String productID;
    private String name;
    private double price;
    private int quantity = 0;

    public String getProductID() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String productID) {
        this.productID = productID;
    }
    public Product(String productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateQuantity (int change, String act) {
        if (act.equals("+"))    this.quantity += change;
        else if (act.equals("-"))    this.quantity -= change;
        else System.out.println("ERROR");
    }

    public void toString1() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class InventoryManager {
    private static final int MAX_PRODUCTS = 20;
    private static Product[] inventory = new Product[MAX_PRODUCTS];
    private static int productCount = 0;

    public void NhapTT() {
        for  (int i = 0; i < MAX_PRODUCTS; i++) {}
    }

    public static boolean addProduct(String productId, String name, double price) {

    }
}