package Singleton;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
 * This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class
 */
public class Singleton {
    public static void main(String[] args){
        MySingleton instance1 = MySingleton.getInstance();
        System.out.println("Instance 1 <> Number of class instances: " + instance1.getNumOfInstance());

        MySingleton instance2 = MySingleton.getInstance();
        System.out.println("Instance 2 <> Number of class instances: " + instance2.getNumOfInstance());

        MySingleton instance3 = MySingleton.getInstance();
        System.out.println("Instance 3 <> Number of class instances: " + instance3.getNumOfInstance());
    }
}
