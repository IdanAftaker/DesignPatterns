package Proxy;

public class Proxy {
    public static void main(String[] args) {
        IMath p = new MathProxy();

        System.out.println("4 + 2 = " + p.plus(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}
