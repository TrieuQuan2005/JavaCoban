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
        rutGon();
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

    // GCD iterative version
    private int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private int LCM(int a, int b) {
        return Math.abs(a / GCD(a, b) * b);
    }

    private void rutGon() {
        int gcd = GCD(tu, mau);
        tu /= gcd;
        mau /= gcd;

        // chuẩn hóa mẫu số luôn dương
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
        if (ps.tu == 0) throw new ArithmeticException("Không thể chia cho phân số có tử = 0");
        return new PhanSo(this.tu * ps.mau, this.mau * ps.tu);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    public void HienThiPhanSo() {
        System.out.println(toString());
    }
}

class MainClass {
    public static void main(String[] args) {

        try {
            PhanSo ps = new PhanSo(4, 5);
            PhanSo ps2 = new PhanSo(8, 5);

            ps.Mul(ps2).HienThiPhanSo();
            ps.Sub(ps2).HienThiPhanSo();
            ps.Div(ps2).HienThiPhanSo();
            ps.Sum(ps2).HienThiPhanSo();



        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

    }
}
