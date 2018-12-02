package Singleton;

public class MySingleton {
    private static MySingleton instance;
    private int numOfInstance = 0;

    /*Declare private constructor, should be empty but for the examples initialises some variables */
    private MySingleton()  {
        System.out.println("MySingleton Constructor");
        this.numOfInstance += 1;
    }

    public int getNumOfInstance() { return numOfInstance; }

    public static MySingleton getInstance(){
        if (instance == null) instance = new MySingleton();
        return instance;
    }

}
