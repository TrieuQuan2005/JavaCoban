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
    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = 0;
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

    public static boolean addProduct(String productId, String name, double price){
        if(InventoryManager.productCount == MAX_PRODUCTS) return  false;
        for(int j = 0; j <  productCount; j++) {
            if(inventory[j].getProductID().equals(productId)) return false;
        }

        Product product = new Product(productId, name, price);
        inventory[productCount++] = product;
        return true;
    }

    public static Product getProductById(String productID){
        for(int j = 0; j <  productCount; j++) {
            if(inventory[j].getProductID().equals(productID)) return inventory[j];
        }
      return null;
    }
    public static void updateProductQuantity(String productId, int change){
        Product product = getProductById(productId);
        if(product == null) return;
        product.updateQuantity(change, "+");
    }

    public static void DisplayInventory(){
        for(int j = 0; j <  productCount; j++) {
            inventory[j].toString1();
        }
    }

}

class Store{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        for(int i =0; i<n; i++ ){
            InventoryManager.addProduct(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        InventoryManager.DisplayInventory();
        InventoryManager.updateProductQuantity(sc.nextLine(), sc.nextInt());
        Product product = InventoryManager.getProductById(sc.nextLine());
        product.toString1();
        InventoryManager.updateProductQuantity(sc.nextLine(), sc.nextInt());
    }
}