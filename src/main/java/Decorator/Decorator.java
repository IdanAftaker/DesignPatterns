package Decorator;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
 * This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
 */
public class Decorator {
    public static void main(String args[]) {
        Computer computer = new Computer();
        System.out.println("You're getting a " + computer.description() + ".");
        computer = new Disk(computer);
        System.out.println("You're getting a " + computer.description() + ".");
        computer = new Monitor(computer);
        System.out.println("You're getting a " + computer.description() + ".");
        computer = new CD(computer);
        System.out.println("You're getting a " + computer.description() + ".");
    }
}
