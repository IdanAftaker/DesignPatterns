package AbstractFactory;

import java.util.Scanner;

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
