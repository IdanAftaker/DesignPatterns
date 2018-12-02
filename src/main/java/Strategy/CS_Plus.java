package Strategy;

public class CS_Plus implements IStrategy {
    public int execute(int a, int b) {
        System.out.println("Called CS_Plus execute()" );
        return a + b; // Do an addition with a and b
    }
}
