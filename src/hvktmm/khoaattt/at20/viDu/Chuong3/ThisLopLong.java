package hvktmm.khoaattt.at20.viDu.Chuong3;

public class ThisLopLong {
}
class Outer {
    int x = 10;
    class Inner {
        int x = 20;
        void print() {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer.this.x);
        }
    }
}
class Main4 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.print();

    }
}