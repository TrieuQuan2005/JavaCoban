package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyTbDienTu;

public class Router extends NetworkDevice implements Restartable {

    public Router(String ipAddress, String name) {
        super(ipAddress, name);
    }

    @Override
    public void Connect() {
        System.out.println("Router Connect");
    }
    @Override
    public void Disconnect() {
        System.out.println("Router Disconnect");
    }

    @Override
    public void reboot() {
        System.out.println("Router Reboot");
    }
}
