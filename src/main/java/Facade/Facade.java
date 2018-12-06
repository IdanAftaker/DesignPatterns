package Facade;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
 * This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
 * This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
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
