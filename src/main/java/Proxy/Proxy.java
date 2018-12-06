package Proxy;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * In proxy pattern, a class represents functionality of another class.
 * This type of design pattern comes under structural pattern.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 */
public class Proxy {
    public static void main(String[] args) {
        IMath p = new MathProxy();

        System.out.println("4 + 2 = " + p.plus(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}
