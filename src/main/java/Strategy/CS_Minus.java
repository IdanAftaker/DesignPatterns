package Strategy;

public class CS_Minus implements IStrategy {
    public int execute(int a, int b) {
        System.out.println("Called CS_Minus execute()" );
        return a - b; // Do a subtraction with a and b
    }
}
