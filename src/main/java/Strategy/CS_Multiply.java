package Strategy;

public class CS_Multiply implements IStrategy {
    public int execute(int a, int b) {
        System.out.println("Called CS_Multiply execute()" );
        return a * b; // Do a multiplication with a and b
    }
}
