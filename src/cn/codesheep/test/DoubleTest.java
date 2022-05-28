package cn.codesheep.test;

public class DoubleTest {
    public static void main(String[] args) {
        Double a = -1.0/0.0;
        Double b = 0.0 /0.0;
        Double c = Math.sqrt(-1);
        System.out.println(a+"="+a.isNaN());
        System.out.println(b+"="+b.isNaN());
        System.out.println(c+"="+c.isNaN());

    }
}
