package Strategy;

/**
 * @author Idan Aftaker on 02/12/2018
 * @project DesignPatterns
 *
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 */
public class Strategy {
    public static void main(String[] args) {
        Context context;
        IStrategy strategy;

        int a = 3;
        int b = 4;
        System.out.println("a = 3, b = 4");

        strategy = new CS_Plus();
        context = new Context(strategy);
        System.out.println("resultA = "+context.executeStrategy(a,b));

        strategy = new CS_Minus();
        context = new Context(strategy);
        System.out.println("resultB = "+context.executeStrategy(a,b));

        strategy = new CS_Multiply();
        context = new Context(strategy);
        System.out.println("resultC = "+context.executeStrategy(a,b));
    }
}
