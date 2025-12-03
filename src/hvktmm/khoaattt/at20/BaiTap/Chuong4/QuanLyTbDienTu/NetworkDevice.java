package hvktmm.khoaattt.at20.BaiTap.Chuong4.QuanLyTbDienTu;

public abstract class NetworkDevice {
    public String ipAddress;
    public String name;

    public NetworkDevice(String ipAddress, String name) {
        this.ipAddress = ipAddress;
        this.name = name;
    }

    public abstract void Connect();
    public abstract void Disconnect();

}
