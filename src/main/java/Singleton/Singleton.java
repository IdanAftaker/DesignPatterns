package Singleton;

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
