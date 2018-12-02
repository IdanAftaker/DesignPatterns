package Decorator;

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
