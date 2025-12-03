package hvktmm.khoaattt.at20.viDu.Chuong3.BankAccount2;

public class BankAccount2 {
    private String owner;
    private double balance;

    public BankAccount2(String owner_, double balance_) {
        owner = owner_;
        balance = balance_;
    }

    class Transaction { // Lớp lồng bên trong
        private String type;
        private double amount;

        public Transaction(String type_, double amount_) {
            type = type_;
            amount = amount_;
        }

        public void process() {
            if (type.equals("deposit"))
                balance += amount;
            else if (type.equals("withdraw") && balance >= amount)
                balance -= amount;
            else {
                System.out.println("Giao dịch không hợp lệ!");
                return;
            }
            System.out.println("Thực hiện " + type + " " + amount + "₫ thành công. Số dư mới: " + balance + "₫");
        }
    }// Hết khai báo Lớp lồng bên trong
    public void showBalance() {
        System.out.println("Số dư hiện tại của " + owner + ": " + balance + "₫");}

}


