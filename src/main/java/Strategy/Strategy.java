package Strategy;

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
