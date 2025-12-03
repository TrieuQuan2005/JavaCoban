package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyTbDienTu;

public class Program {
    public static void main(String[] args) {
        Router router = new Router("102.168.1.3", "1032.24");
        router.Connect();
        router.reboot();
        router.Disconnect();

        NetworkDevice[] networkDevices = new NetworkDevice[2];
        Restartable[]  restartables = new Restartable[2];

        networkDevices[0] = router;
        restartables[0] = router;

    }
}
