package AbstractFactory;

import java.util.Scanner;


/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
 * Each generated factory can give the objects as per the Factory pattern.
 */
public class AbstractFactory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Computer Type: ");
        String t = sc.next();

        ComputerType type = new ComputerType(t);
        Computer computer = null;
        try {
            computer = type.getComputer();
        } catch (Exception e) {
            System.out.println("Type not recognize!");
            System.exit(1);
        }
        System.out.println("Monitor: "+computer.getMonitor().getSpecification());
        System.out.println("RAM: "+computer.getRAM().getSpecification());
        System.out.println("Processor: "+computer.getProcessor().getSpecification());
        sc.close();
    }
}
