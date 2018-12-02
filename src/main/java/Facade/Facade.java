package Facade;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 */
public class Facade {
    public static void main(String[] args) {
        FacadeClass facade = new FacadeClass();
        int x = 5;
        System.out.println("Cube of " + x + " = " + facade.cubeX(x));
        System.out.println("Cube of " + x + " multiply by 2 = " + facade.cubeXMul2(x));
        System.out.println(x + "^3 * 2 * "+x + "^3 = " + facade.xToSixthPowerMul2(x));
    }
}
