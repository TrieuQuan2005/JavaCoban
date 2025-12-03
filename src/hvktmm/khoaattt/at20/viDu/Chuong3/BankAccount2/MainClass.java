package hvktmm.khoaattt.at20.viDu.Chuong3.BankAccount2;

public class MainClass {
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2("Nguyễn Quang Minh", 500000);
        acc.showBalance();
        // Tạo giao dịch nạp tiền
        BankAccount2.Transaction t1 = acc.new Transaction("deposit", 200000);
        t1.process();
        // Tạo giao dịch rút tiền
        BankAccount2.Transaction t2 = acc.new Transaction("withdraw", 100000);
        t2.process();
        acc.showBalance();
    }
}
