package hvktmm.khoaattt.at20.viDu.Chuong3.BankAccount;

public class MainClass {
    public static void main(String[] args) {
        BankAccount tkMinh = new BankAccount(1000);
        tkMinh.deposit(500);
        tkMinh.withdraw(800);
        System.out.println("Số dư là: " + tkMinh.getBalance());
    }
}
