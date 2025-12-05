package hvktmm.khoaattt.at20.BaiTap.Chuong3;

public class PhanSo {
    private int tu;
    private int mau;

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.mau = mau;
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0) throw new IllegalArgumentException("Mẫu số không được bằng 0");
        this.tu = tu;
        this.mau = mau;
        this.rutGon();
    }

    public PhanSo() {
        this(0, 1);
    }

    private int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return b == 0 ? a : GCD(b, a % b);
    }

    private int LCM(int a, int b) {
        return Math.abs(a * b) / GCD(a, b);
    }

    private void rutGon() {
        int gcd = GCD(tu, mau);
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    public PhanSo Rutgon() {
        this.rutGon();
        return this;
    }

    public PhanSo Sum(PhanSo ps) {
        int lcm = LCM(this.mau, ps.mau);
        int tuMoi = this.tu * (lcm / this.mau) + ps.tu * (lcm / ps.mau);
        return new PhanSo(tuMoi, lcm);
    }

    public PhanSo Sub(PhanSo ps) {
        int lcm = LCM(this.mau, ps.mau);
        int tuMoi = this.tu * (lcm / this.mau) - ps.tu * (lcm / ps.mau);
        return new PhanSo(tuMoi, lcm);
    }

    public PhanSo Mul(PhanSo ps) {
        return new PhanSo(this.tu * ps.tu, this.mau * ps.mau);
    }

    public PhanSo Div(PhanSo ps) {
        if (ps.tu == 0) throw new ArithmeticException("Không thể chia cho 0");
        return new PhanSo(this.tu * ps.mau, this.mau * ps.tu);
    }

    public void HienThiPhanSo() {
        this.rutGon();
        System.out.println(this.tu + "/" + this.mau);
    }
}
class MainClass {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo(4,5);
        PhanSo ps2 = new PhanSo(8,5);
        ps.Mul(ps2).HienThiPhanSo();
        ps.Sub(ps2).HienThiPhanSo();
        ps.Div(ps2).HienThiPhanSo();
        ps.Sum(ps2).HienThiPhanSo();

        PhanSo ps3 = new PhanSo(-4,-5);
        ps3.HienThiPhanSo();
    }
}